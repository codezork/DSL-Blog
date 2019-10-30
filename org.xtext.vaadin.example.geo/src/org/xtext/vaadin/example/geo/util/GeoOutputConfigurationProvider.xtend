package org.xtext.vaadin.example.geo.util

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration

class GeoOutputConfigurationProvider implements IContextualOutputConfigurationProvider2 {

	override getOutputConfigurations(ResourceSet context) {
		var String outputDir = null
		if(context.resources.get(0).URI.toString.contains(".osgi")) {
			outputDir = "./src/main/java";
		} else {
			outputDir = "./src/main/java";
		}
		var defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory(outputDir);
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		return newHashSet(defaultOutput)
	}
}
