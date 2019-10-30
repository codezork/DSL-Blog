package org.xtext.vaadin.example.geo.generator

import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.StringWriter
import java.util.Properties
import java.util.regex.Pattern
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.osgi.framework.FrameworkUtil
import org.xtext.vaadin.example.geo.GeoModel
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.IContainer

class GeoDslGenerator extends JvmModelGenerator {
	var monitor = new NullProgressMonitor()
		
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		// get the model
		var model = input.contents.get(0) as GeoModel
		
		// for all projects in workspace
		for (project : ResourcesPlugin.workspace.root.getProjects) {
			// find these with xtext nature
			if (project.open && project.description.natureIds.contains("org.eclipse.xtext.ui.shared.xtextNature")) {
				// create settings
				var settings = project.getFolder(".settings");
				var prefs = settings.getFile("org.eclipse.jdt.core.prefs")
				if(prefs.exists) {
					prefs.delete(true, monitor)
				}
				prefs.create(buildJDT(), true, monitor)
				// create pom
				var pom = project.getFile("pom.xml")
				pom.delete(true, monitor)
				pom.create(project.buildOSGiPom, true, monitor)
				// create bnd file
				var bnd = project.getFile("bnd.bnd")
				bnd.delete(true, monitor)
				bnd.create(project.buildBnd, true, monitor)
				// create jetty config file
				var config = project.getFile("config.properties")
				config.delete(true, monitor)
				config.create(model.buildFelixConfig, true, monitor)
				// create all folders
				var srcFolder = project.getFolder("src")
				var mainFolder = srcFolder.getFolder("main")
				var resources = mainFolder.getFolder("resources")
				if(!resources.exists) {
					resources.create(true, true, monitor)
				}
				var metaInf = resources.getFolder("META-INF")
				if(!metaInf.exists) {
					metaInf.create(true, true, monitor)
				}
				var resources2 = metaInf.getFolder("resources")
				if(!resources2.exists) {
					resources2.create(true, true, monitor)
				} 
				// copy resources of the project, needed at runtime
				copyResources(project, "resources", "src/main/resources/META-INF/resources")
				// copy javascript frameworks
				copyResources(project, "scripts", "src/main/resources/META-INF/resources/frontend/src")
				// create our javascript file
				var frontend = resources2.getFolder("frontend")
				var src = frontend.getFolder("src")
				var topologyJS = src.getFile("topology.js")
				if(topologyJS.exists) {
					topologyJS.delete(true, monitor)
				}
				topologyJS.create(model.buildTopology, true, monitor)
			}
		}
		super.doGenerate(input, fsa)
	}

	def buildJDT() {
		var prop = new Properties()
		prop.setProperty("eclipse.preferences.version","1")
		prop.setProperty("org.eclipse.jdt.core.compiler.codegen.targetPlatform","1.8")
		prop.setProperty("org.eclipse.jdt.core.compiler.compliance","1.8")
		prop.setProperty("org.eclipse.jdt.core.compiler.source","1.8")
		prop.setProperty("org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures","disabled")
		prop.setProperty("org.eclipse.jdt.core.compiler.problem.forbiddenReference","warning")
		prop.setProperty("org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures","ignore")
		prop.setProperty("org.eclipse.jdt.core.compiler.release","disabled")
		var writer = new StringWriter()
		prop.store(writer, null)
		return new ByteArrayInputStream(writer.toString.getBytes("UTF-8"))
	}
	def buildOSGiPom(IProject prj) {
		var script = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<project xmlns="http://maven.apache.org/POM/4.0.0"
			    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
			    <modelVersion>4.0.0</modelVersion>
				<groupId>«prj.name»</groupId>
				<artifactId>«prj.name»</artifactId>
				<version>1.0.0-SNAPSHOT</version>
				<name>The Geo Sample OSGi</name>
				<packaging>jar</packaging>
			
			    <properties>
			        <maven.compiler.source>1.8</maven.compiler.source>
			        <maven.compiler.target>1.8</maven.compiler.target>
			        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
			        <vaadin.version>14.0.9</vaadin.version>
			
			        <felix.version>6.0.0</felix.version>
			        <felix.distribution>https://repo1.maven.org/maven2/org/apache/felix/org.apache.felix.main.distribution/${felix.version}/org.apache.felix.main.distribution-${felix.version}.zip</felix.distribution>
			        <felix.home>felix-framework-${felix.version}</felix.home>
			        <osgi.bundle.version>${parsedVersion.majorVersion}.${parsedVersion.minorVersion}.${parsedVersion.incrementalVersion}</osgi.bundle.version>
			    </properties>
			
			    <repositories>
			        <!-- Repository used by many Vaadin add-ons -->
			        <repository>
			            <id>Vaadin Directory</id>
			            <url>https://maven.vaadin.com/vaadin-addons</url>
			        </repository>
			        <repository>
			            <id>vaadin-prereleases</id>
			            <url>https://maven.vaadin.com/vaadin-prereleases</url>
			        </repository>
			        <repository>
			            <id>vaadin-snapshots</id>
			            <url>https://oss.sonatype.org/content/repositories/vaadin-snapshots/</url>
			        </repository>
			    </repositories>
			
			    <pluginRepositories>
			        <pluginRepository>
			            <id>vaadin-prereleases</id>
			            <url>https://maven.vaadin.com/vaadin-prereleases</url>
			        </pluginRepository>
			        <pluginRepository>
			            <id>vaadin-snapshots</id>
			            <url>https://oss.sonatype.org/content/repositories/vaadin-snapshots/</url>
			        </pluginRepository>
			    </pluginRepositories>
			
			    <dependencyManagement>
			        <dependencies>
			            <dependency>
			                <groupId>com.vaadin</groupId>
			                <artifactId>vaadin-bom</artifactId>
			                <type>pom</type>
			                <scope>import</scope>
			                <version>${vaadin.version}</version>
			            </dependency>
			        </dependencies>
			    </dependencyManagement>
			
			    <dependencies>
			        <dependency>
			            <groupId>com.vaadin</groupId>
			            <!-- Replace artifactId with vaadin-core to use only free components -->
			            <artifactId>vaadin</artifactId>
			        </dependency>
			
			        <dependency>
			            <groupId>com.vaadin</groupId>
			            <artifactId>flow-osgi</artifactId>
			        </dependency>
			
			        <dependency>
			            <groupId>org.osgi</groupId>
			            <artifactId>osgi.cmpn</artifactId>
			            <version>7.0.0</version>
			            <scope>provided</scope>
			        </dependency>
			
			        <dependency>
			            <groupId>org.osgi</groupId>
			            <artifactId>org.osgi.core</artifactId>
			            <version>6.0.0</version>
			            <scope>provided</scope>
			        </dependency>
			
			        <!-- Added to provide logging output as Flow uses -->
			        <!-- the unbound SLF4J no-operation (NOP) logger implementation -->
			        <dependency>
			            <groupId>org.slf4j</groupId>
			            <artifactId>slf4j-simple</artifactId>
			        </dependency>
			
			        <dependency>
			            <groupId>javax.servlet</groupId>
			            <artifactId>javax.servlet-api</artifactId>
			            <version>3.1.0</version>
			            <scope>provided</scope>
			        </dependency>
			
			    </dependencies>
			
			    <build>
			        <plugins>
			            <plugin>
			                <groupId>org.codehaus.mojo</groupId>
			                <artifactId>build-helper-maven-plugin</artifactId>
			                <version>3.0.0</version>
			                <executions>
			                    <execution>
			                        <id>parse-version</id>
			                        <goals>
			                            <goal>parse-version</goal>
			                        </goals>
			                    </execution>
			                    <execution>
			                        <id>add-resource</id>
			                        <phase>generate-resources</phase>
			                        <goals>
			                            <goal>add-resource</goal>
			                        </goals>
			                        <configuration>
			                            <resources>
			                                <resource>
			                                    <directory>${project.build.directory}/generated-resources</directory>
			                                    <targetPath></targetPath>
			                                </resource>
			                            </resources>
			                        </configuration>
			                    </execution>
			                </executions>
			            </plugin>
			            <plugin>
			                <groupId>biz.aQute.bnd</groupId>
			                <artifactId>bnd-maven-plugin</artifactId>
			                <version>4.1.0</version>
			                <executions>
			                    <execution>
			                        <goals>
			                            <goal>bnd-process</goal>
			                        </goals>
			                    </execution>
			                </executions>
			            </plugin>
			            <plugin>
			                <groupId>org.apache.maven.plugins</groupId>
			                <artifactId>maven-jar-plugin</artifactId>
			                <version>3.1.2</version>
			                <configuration>
			                    <archive>
			                        <manifestFile>${project.build.outputDirectory}/META-INF/MANIFEST.MF</manifestFile>
			                        <index>false</index>
			                        <manifest>
			                            <addDefaultImplementationEntries>true</addDefaultImplementationEntries>
			                        </manifest>
			                    </archive>
			                </configuration>
			            </plugin>
			
			            <plugin>
			                <groupId>org.apache.maven.plugins</groupId>
			                <artifactId>maven-dependency-plugin</artifactId>
			                <executions>
			                    <execution>
			                        <id>unpack-dependencies</id>
			                        <phase>generate-resources</phase>
			                        <goals>
			                            <goal>unpack-dependencies</goal>
			                        </goals>
			                        <configuration>
			                            <includes>**/webjars/**</includes>
			                        </configuration>
			                    </execution>
			                </executions>
			            </plugin>
			            <plugin>
			                <artifactId>maven-antrun-plugin</artifactId>
			                <version>1.7</version>
			                <executions>
			                    <execution>
			                        <id>copy-frontend</id>
			                        <phase>generate-resources</phase>
			                        <configuration>
			                            <tasks>
			                                <mkdir
			                                    dir="${project.build.directory}/generated-resources/frontend/bower_components"></mkdir>
			                                <copy
			                                    todir="${project.build.directory}/generated-resources/frontend/bower_components">
			                                    <fileset
			                                        dir="${project.build.directory}/dependency/META-INF/resources/webjars/" />
			                                </copy>
			                                <mkdir
			                                	dir="${project.build.directory}/generated-resources/frontend/src"></mkdir>
			                                <copy
			                                	todir="${project.build.directory}/generated-resources/frontend/src">
			                                	<fileset 
			                                		dir="./src/main/resources/META-INF/resources/frontend/src" />
			                                </copy>
			                                <mkdir
			                                	dir="${project.build.directory}/generated-resources/frontend/styles"></mkdir>
			                                <copy
			                                	todir="${project.build.directory}/generated-resources/frontend/styles">
			                                	<fileset 
			                                		dir="./src/main/resources/META-INF/resources/frontend/styles" />
			                                </copy>
			                            </tasks>
			                        </configuration>
			                        <goals>
			                            <goal>run</goal>
			                        </goals>
			                    </execution>
			                </executions>
			            </plugin>
			        </plugins>

			        <pluginManagement>
			            <plugins>
			                <!--This plugin's configuration is used to store Eclipse 
			                    m2e settings only. It has no influence on the Maven build itself. -->
			                <plugin>
			                    <groupId>org.eclipse.m2e</groupId>
			                    <artifactId>lifecycle-mapping</artifactId>
			                    <version>1.0.0</version>
			                    <configuration>
			                        <lifecycleMappingMetadata>
			                            <pluginExecutions>
			                                <pluginExecution>
			                                    <pluginExecutionFilter>
			                                        <groupId>
			                                            org.apache.maven.plugins
			                                        </groupId>
			                                        <artifactId>
			                                            maven-antrun-plugin
			                                        </artifactId>
			                                        <versionRange>
			                                            [1.7,)
			                                        </versionRange>
			                                        <goals>
			                                            <goal>run</goal>
			                                        </goals>
			                                    </pluginExecutionFilter>
			                                    <action>
			                                        <ignore></ignore>
			                                    </action>
			                                </pluginExecution>
			                            </pluginExecutions>
			                        </lifecycleMappingMetadata>
			                    </configuration>
			                </plugin>
			            </plugins>
			        </pluginManagement>
			    </build>
			
			    <profiles>
			        <profile>
			            <!-- Production mode is activated using -Pproduction -->
			            <id>production</id>
			            <properties>
			                <vaadin.productionMode>true</vaadin.productionMode>
			            </properties>
			
			            <dependencies>
			                <dependency>
			                    <groupId>com.vaadin</groupId>
			                    <artifactId>flow-server-production-mode</artifactId>
			                </dependency>
			            </dependencies>
			
			            <build>
			                <plugins>
			                    <plugin>
			                        <groupId>com.vaadin</groupId>
			                        <artifactId>vaadin-maven-plugin</artifactId>
			                        <version>${vaadin.version}</version>
			                        <executions>
			                            <execution>
			                                <goals>
			                                    <goal>copy-production-files</goal>
			                                    <goal>package-for-production</goal>
			                                </goals>
			                            </execution>
			                        </executions>
			                    </plugin>
			                </plugins>
			            </build>
			        </profile>
			        <profile>
			            <id>prepare-osgi-container</id>
			            <dependencies>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.scr</artifactId>
			                    <version>2.1.10</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.scr.annotations</artifactId>
			                    <version>1.12.0</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.scr.compat</artifactId>
			                    <version>1.0.4</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.scr.ds-annotations</artifactId>
			                    <version>1.2.10</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.http.servlet-api</artifactId>
			                    <version>1.1.2</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.felix</groupId>
			                    <artifactId>org.apache.felix.http.jetty</artifactId>
			                    <version>4.0.6</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <!-- Those dependencies are need for OSGi container where 
			                    this bundle will be deployed. They will be copied into the bundle folder 
			                    of OSGi container and automatically installed form there. -->
			
			                <dependency>
			                    <groupId>org.osgi</groupId>
			                    <artifactId>org.osgi.service.serviceloader</artifactId>
			                    <version>1.0.0</version>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries.spifly</groupId>
			                    <artifactId>org.apache.aries.spifly.static.bundle</artifactId>
			                    <version>1.0.12</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries.spifly</groupId>
			                    <artifactId>org.apache.aries.spifly.static.tool</artifactId>
			                    <version>1.0.12</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries.spifly</groupId>
			                    <artifactId>org.apache.aries.spifly.core-internal</artifactId>
			                    <version>1.0.12</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries.spifly</groupId>
			                    <artifactId>org.apache.aries.spifly.weaver-internal</artifactId>
			                    <version>1.0.12</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries</groupId>
			                    <artifactId>org.apache.aries.util</artifactId>
			                    <version>1.1.3</version>
			                    <scope>provided</scope>
			                </dependency>
			
			                <dependency>
			                    <groupId>org.apache.aries.spifly</groupId>
			                    <artifactId>org.apache.aries.spifly.dynamic.bundle</artifactId>
			                    <version>1.0.12</version>
			                    <scope>provided</scope>
			                </dependency>
			
			            </dependencies>
			            <build>
			                <plugins>
			                    <plugin>
			                        <groupId>org.apache.maven.plugins</groupId>
			                        <artifactId>maven-antrun-plugin</artifactId>
			                        <executions>
			                            <execution>
			                                <id>download-files</id>
			                                <phase>pre-integration-test</phase>
			                                <goals>
			                                    <goal>run</goal>
			                                </goals>
			                                <configuration>
			                                    <tasks>
			                                        <get
			                                            src="${felix.distribution}"
			                                            dest="${project.build.directory}/felix.zip"
			                                            verbose="false"
			                                            usetimestamp="true" />
			                                        <unzip
			                                            src="${project.build.directory}/felix.zip"
			                                            dest="${project.build.directory}"></unzip>
			                                    </tasks>
			                                </configuration>
			                            </execution>
			                            <execution>
			                                <id>copy-self</id>
			                                <phase>pre-integration-test</phase>
			                                <goals>
			                                    <goal>run</goal>
			                                </goals>
			                                <configuration>
			                                    <tasks>
			                                        <copy
			                                            todir="${project.build.directory}/${felix.home}/bundle"
			                                            file="${project.build.directory}/${project.artifactId}-${project.version}.jar">
			                                        </copy>
			                                    </tasks>
			                                </configuration>
			                            </execution>
			                        </executions>
			                    </plugin>
			                    <plugin>
			                        <groupId>org.apache.maven.plugins</groupId>
			                        <artifactId>maven-dependency-plugin</artifactId>
			                        <version>3.1.1</version>
			                        <executions>
			                            <execution>
			                                <id>copy-dependencies</id>
			                                <phase>pre-integration-test</phase>
			                                <goals>
			                                    <goal>copy-dependencies</goal>
			                                </goals>
			                                <configuration>
			                                    <includeScope>compile</includeScope>
			                                    <outputDirectory>${project.build.directory}/${felix.home}/bundle</outputDirectory>
			                                    <overWriteIfNewer>true</overWriteIfNewer>
			                                    <excludeGroupIds>com.google.code.findbugs,
			                                        org.seleniumhq.selenium,
			                                        javax.servlet</excludeGroupIds>
			                                    <excludeArtifactIds>osgi.cmpn</excludeArtifactIds>
			                                </configuration>
			                            </execution>
			                        </executions>
			                    </plugin>
			                </plugins>
			            </build>
			        </profile>
			        <profile>
			            <id>run-osgi-container</id>
			            <build>
			                <plugins>
			                    <plugin>
			                        <groupId>org.codehaus.mojo</groupId>
			                        <artifactId>exec-maven-plugin</artifactId>
			                        <version>1.6.0</version>
			                        <executions>
			                            <execution>
			                                <phase>pre-integration-test</phase>
			                                <goals>
			                                    <goal>exec</goal>
			                                </goals>
			                                <configuration>
			                                    <executable>java</executable>
			                                    <workingDirectory>${project.build.directory}/${felix.home}</workingDirectory>
			                                    <commandlineArgs>-Dgosh.args="--nointeractive" -Dfelix.config.properties=file:${basedir}/config.properties
			                                        -jar bin/felix.jar</commandlineArgs>
			                                </configuration>
			                            </execution>
			                        </executions>
			                    </plugin>
			                </plugins>
			            </build>
			        </profile>
			    </profiles>
			</project>
		'''
		return new ByteArrayInputStream(script.getBytes("UTF-8"))
	}
	
	def buildBnd(IProject prj) {
		var script = '''
			Bundle-SymbolicName: «prj.name»
			Bundle-Name: Geo Example
			Bundle-Version: ${osgi.bundle.version}
			Bundle-RequiredExecutionEnvironment: JavaSE-1.8
			Bundle-License: http://www.apache.org/licenses/LICENSE-2.0
			Import-Package: *
			Export-Package: !*
			Vaadin-OSGi-Extender: true
		'''
		return new ByteArrayInputStream(script.getBytes("UTF-8"))
	}

	def buildFelixConfig(GeoModel model) {
		var script = 
		'''
		felix.auto.deploy.action=install,start
		felix.log.level=1
		org.osgi.service.http.port=«model.port»
		obr.repository.url=http://felix.apache.org/obr/releases.xml
		'''
		return new ByteArrayInputStream(script.getBytes("UTF-8"))
	}

	def copyResources(IProject project, String srcPath, String dstPath) {
		var bundle = FrameworkUtil.getBundle(getClass())
		var path = bundle.getEntry(srcPath);
		if(path !== null) {
			var srcFolder = new File(FileLocator.resolve(path).toURI());
			var folders = dstPath.split(Pattern.quote("/"))
			var root = project as IContainer
			for(f:folders) {
				var fldr = root.getFolder(new Path(f))
				if(!fldr.exists) {
					fldr.create(true, true, monitor);
				}
				root = fldr
			}
			copyFiles(srcFolder, root)
		}
	}
	
	def void copyFiles (File srcFolder, IContainer destFolder) {
	    for (File f: srcFolder.listFiles()) {
	        if (f.isDirectory()) {
	            var newFolder = destFolder.getFolder(new Path(f.getName()));
	            if(!newFolder.exists) {
		            newFolder.create(true, true, monitor);
		        }
	            copyFiles(f, newFolder);
	        } else {
	            var newFile = destFolder.getFile(new Path(f.name));
	            if(!newFile.exists) {
	            	newFile.create(new FileInputStream(f), true, monitor);
	            }
	        }
	    }
	}

	def buildTopology(GeoModel model) {
		var script =
		'''
		function topology(jsonFileName, element, div, longitude, latitude, scale) {
			console.log("Topology, " + jsonFileName);
			var width = 800;
			var height = 800;
			div.innerHTML = 	
				"<div id=\"topology_div\">" + "</div>";	
			var selection = d3.select(div).select("#topology_div");
			var svg = selection.append("svg")
			   .attr("preserveAspectRatio", "xMinYMin meet")
			   .attr("viewBox", "0 0 800 800")
			   // Class to make it responsive.
			   .classed("svg-content-responsive", true)
			    .attr("width", width)
			    .attr("height", height);
			var g = svg.append("g");
			loadJSON(jsonFileName, function(response) {
				var json = JSON.parse(response);
				var projection = d3.geoMercator()
					.rotate([0, 9])
					.center([longitude, latitude])
					.scale(scale)    
					.translate([width / 2, height / 2]);
				var path = d3.geoPath().projection(projection);
				// get the 0. array's name
				var key = Object.keys(json.objects)[0];
				// create the 'parts of a country'
				g.selectAll("path")
					.data(topojson.feature(json, json.objects[key]).features)
					.enter().append("path")
					.attr("class", "states")
					.attr("d", path);
				svg.append("path")
					.attr("class", "state-borders")
					.attr("d", path(topojson.mesh(json, json.objects[key], function(a, b) { return a !== b; })));				
				g.selectAll("path").on("click", function click(d) {
					var data = this.__data__;
					element.$server.onTopoClick(data.properties.NAME_1, data.properties.TYPE_2, data.properties.NAME_2);
				});
			});
		}
		function loadJSON(name, callback) {   
			var xobj = new XMLHttpRequest();
			xobj.overrideMimeType("application/json");
			xobj.onload = function () {
				callback(xobj.responseText);
			};
			xobj.open('GET', name, true);
			xobj.send(null);  
		}
		'''
		return new ByteArrayInputStream(script.getBytes("UTF-8"))
	}
}