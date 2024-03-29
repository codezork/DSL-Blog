/*
 * generated by Xtext 2.19.0
 */
package org.xtext.vaadin.example.geo.jvmmodel

import com.google.inject.Inject
import com.vaadin.flow.component.AttachEvent
import com.vaadin.flow.component.ClientCallable
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.applayout.DrawerToggle
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.dependency.HtmlImport
import com.vaadin.flow.component.dependency.JavaScript
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.page.Viewport
import com.vaadin.flow.component.tabs.Tab
import com.vaadin.flow.component.tabs.Tabs
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.function.DeploymentConfiguration
import com.vaadin.flow.osgi.support.OsgiVaadinStaticResource
import com.vaadin.flow.router.Route
import com.vaadin.flow.server.PWA
import com.vaadin.flow.server.VaadinServlet
import com.vaadin.flow.theme.Theme
import com.vaadin.flow.theme.lumo.Lumo
import com.vaadin.flow.theme.material.Material
import java.util.HashMap
import java.util.Hashtable
import java.util.Map
import java.util.Properties
import java.util.regex.Pattern
import javax.servlet.Servlet
import javax.servlet.ServletConfig
import javax.servlet.ServletException
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.osgi.framework.BundleContext
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants
import org.xtext.vaadin.example.geo.GeoModel
import org.xtext.vaadin.example.geo.GeoTheme
import org.xtext.vaadin.example.geo.util.AnnotationExtension

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class GeoDslJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder
	@Inject extension AnnotationExtension
	
	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the lambda you pass as the last argument.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(GeoModel model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		// the servlet registration 
		acceptor.accept(model.toClass(model.packageName+".VaadinServletRegistration")) [
			var anno = org.osgi.service.component.annotations.Component.annotationRef
			anno.addAnnAttr(model, "immediate", true)
			annotations += anno
			documentation = model.documentation
			members += model.toClass(model.packageName+".FixedVaadinServlet") [
				superTypes += VaadinServlet.typeRef
				static = true
				visibility = JvmVisibility.PRIVATE
				members += model.toMethod("init", Void.TYPE.typeRef) [
					exceptions += ServletException.typeRef
					parameters += model.toParameter("servletConfig", ServletConfig.typeRef)
					annotations += Override.annotationRef
					visibility = JvmVisibility.PUBLIC
					body = [append(
					'''
					super.init(servletConfig);
					getService().setClassLoader(getClass().getClassLoader());''')
					]
				]
				members += model.toMethod("createDeploymentConfiguration", DeploymentConfiguration.typeRef) [
					parameters += model.toParameter("initParameters", Properties.typeRef)
					annotations += Override.annotationRef
					visibility = JvmVisibility.PROTECTED
					body = [append(
					'''
					// npm mode is not currently supported
					initParameters.setProperty("compatibilityMode", "true");					
					return super.createDeploymentConfiguration(initParameters);''')
					]
				]
			]
			members += model.toMethod("activate", void.typeRef) [
				parameters += model.toParameter("ctx", BundleContext.typeRef)
				annotations += org.osgi.service.component.annotations.Activate.annotationRef
				body = [
				append(Hashtable)
				append(
				'''
				<String, Object> properties = new Hashtable<>();
				properties.put(''')
				append(HttpWhiteboardConstants)
				append('''
				.HTTP_WHITEBOARD_SERVLET_ASYNC_SUPPORTED, true);
				properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN, "/*");
				ctx.registerService(''')
				append(Servlet)
				append('''.class, new FixedVaadinServlet(), properties);''')
				]
			]
		]
		// the app
		if(model.layout !== null) {
			val JvmGenericType layoutCls = model.toClass(model.packageName+"."+model.layout.name)
			val JvmGenericType mainViewCls = model.toClass(model.packageName+".MainView")
			acceptor.accept(model.toClass(model.packageName+".VaadinApp")) [
				documentation = model.documentation
				superTypes += Composite.typeRef(Div.typeRef)
				var route = Route.annotationRef
				route.addAnnAttr(model, "value", "")
				route.addAnnAttr(model, "layout", layoutCls.typeRef)
				val _mainViewCls = mainViewCls 
				members += model.toMethod("onAttach", void.typeRef) [
					annotations += Override.annotationRef
					parameters += model.toParameter("attachEvent", AttachEvent.typeRef)
					body = [
						append('''super.onAttach(attachEvent);
						''')
						append(UI)
						append('''.getCurrent().navigate(�_mainViewCls.simpleName�.class);''')					
					]
				]				 
				annotations += route
				if(model.pwa) {
					var pwaAnno = PWA.annotationRef
					pwaAnno.addAnnAttr(model, "name", model.hasLongName?model.longName:model.name)
					pwaAnno.addAnnAttr(model, "shortName", model.name)
					annotations += pwaAnno
				}
			]
			// the logo resource
			if(model.layout.hasLogo) {
				acceptor.createResource(model, model.layout.logoPath)
			}
			acceptor.accept(layoutCls) [
				superTypes += AppLayout.typeRef
				annotations += model.themeAnnotation
				var viewPort = Viewport.annotationRef
				viewPort.addAnnAttr(model, "value", "width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes, viewport-fit=cover")
				annotations += viewPort
				members += model.toField("tabLookup", Map.typeRef(Tab.typeRef, Component.typeRef)) [initializer = [append('''new ''') append(HashMap) append('''<>()''')]]
				members += model.toConstructor[
					body = [
						append(Image)
						append(''' img = new Image("�model.layout.logoPath.makeRelative�" , "Vaadin Logo");
						''')
						append('''
						img.setHeight("44px");
						addToNavbar(new ''')
						append(DrawerToggle)
						append('''(), img);
						''')
						append(Tabs)
						append('''
						 tabs = new Tabs();
						tabs.setOrientation(Tabs.Orientation.VERTICAL);
						tabs.addSelectedChangeListener(event -> {
						  final Tab selectedTab = event.getSelectedTab();
						  final ''')
						append(Component)
						append('''
						 component = tabLookup.get(selectedTab);
						  setContent(component);
						});
						addToDrawer(tabs);
						setContent(new Span("click in the menu ;-) , you will see me never again.."));
						''')
						val current = it
						model.layout.tabs.forEach[
							current.append('''tabLookup.put(new ''')
							current.append(Tab)
							current.append('''(new ''')
							current.append(HorizontalLayout)
							current.append('''(''')
							current.append(VaadinIcon)
							current.append('''.�it.iconName.toUpperCase�.create(), new ''')
							current.append(Span)
							current.append('''("�it.name�"))), new �model.packageName+"."+it.name.toFirstUpper�());
							''')
						]
						append('''
						for(Tab tab:tabLookup.keySet()) {
							tabs.add(tab);
						}''')
					]
				]
			]
			acceptor.accept(mainViewCls) [
				superTypes += Composite.typeRef(Div.typeRef)
				var route2 = Route.annotationRef
				route2.addAnnAttr(model, "value", "main")
				route2.addAnnAttr(model, "layout", layoutCls.typeRef)
				annotations += route2
				members += model.toConstructor[
					body = [
						append(Span)
						append(''' pageContent = new Span("page-content");
						''')
						append('''
						pageContent.setId("Page content");
						getContent().add(pageContent);''')
					]	
				]
			]
			// the style resource
			if(model.hasStyle) {
				acceptor.createResource(model, model.style)
			}
			model.layout.tabs.forEach[
				val current = it
				acceptor.accept(model.toClass(model.packageName+"."+it.name.toFirstUpper)) [
					superTypes += Composite.typeRef(Div.typeRef)
					var route2 = Route.annotationRef
					route2.addAnnAttr(model, "value", current.name)
					route2.addAnnAttr(model, "layout", layoutCls.typeRef)
					annotations += route2
					if(current.hasTopology) {
						if(model.eResource.URI.toString.contains(".osgi")) {
							annotations += JavaScript.annotationRef("frontend://src/d3.min.js")
							annotations += JavaScript.annotationRef("frontend://src/topojson.min.js")
							annotations += JavaScript.annotationRef("frontend://src/topology.js")
						} else {
							annotations += JavaScript.annotationRef("./src/d3.min.js")
							annotations += JavaScript.annotationRef("./src/topojson.min.js")
							annotations += JavaScript.annotationRef("./src/topology.js")
						}
						if(model.hasStyle) {
							if(model.eResource.URI.toString.contains(".osgi")) {
								annotations += HtmlImport.annotationRef('''frontend://styles/�model.style.createAlias(true)�''')
							} else {
								annotations += HtmlImport.annotationRef('''./styles/�model.style.createAlias(true)�''')
							}
						}
					}
					if(current.hasTopology) {
						members += model.toField("topoDiv", Div.typeRef) [initializer = [append('''new Div()''')]]
						members += model.toField("stateField", TextField.typeRef) [initializer = [append('''new TextField("state")''')]]
						members += model.toField("adminTypeField", TextField.typeRef) [initializer = [append('''new TextField("type")''')]]
						members += model.toField("adminField", TextField.typeRef) [initializer = [append('''new TextField("administrative region")''')]]
						members += model.toField("longitude", Integer.typeRef)
						members += model.toField("latitude", Integer.typeRef)
						members += model.toField("scale", Integer.typeRef)
					}
					members += model.toConstructor[
						body = [
							append(HorizontalLayout)
							append('''
							 base = new HorizontalLayout();
							base.setId("base");
							base.setSizeFull();
							getContent().add(base);
							''')
							append(VerticalLayout)
							append('''
							 components = new VerticalLayout();
							base.add(components);
							''')
							if(current.hasTopology) {
								append(TextField)
								append(''' longitudeField = new TextField("longitude");
								''')
								append('''
								longitudeField.addValueChangeListener(event -> {longitude = Integer.parseInt(longitudeField.getValue());});
								components.add(longitudeField);
								TextField latitudeField = new TextField("latitude");
								latitudeField.addValueChangeListener(event -> {latitude = Integer.parseInt(latitudeField.getValue());});
								components.add(latitudeField);
								TextField scaleField = new TextField("scale");
								scaleField.addValueChangeListener(event -> {scale = Integer.parseInt(scaleField.getValue());});
								stateField.setReadOnly(true);
								adminTypeField.setReadOnly(true);
								adminField.setReadOnly(true);
								components.add(scaleField); 
								''')
								append('''components.add(stateField, adminTypeField, adminField);
								''')
								append(Button)
								append(''' button = new Button("show topology");
								''')
								append('''
								button.addClickListener(click -> {
									getElement().executeJavaScript("topology($0, $1, $2, $3, $4, $5)", "�current.topology.makeRelative�", getElement(), topoDiv.getElement(), longitude, latitude, scale);
								});
								components.add(button);
								components.setWidth("200px");
								topoDiv.setSizeFull();
								base.add(topoDiv);
								''')
							}
						]	
					]
					if(current.hasTopology) {
						members += model.toMethod("onTopoClick", void.typeRef) [
							parameters += model.toParameter("name1", String.typeRef)
							parameters += model.toParameter("type2", String.typeRef)
							parameters += model.toParameter("name2", String.typeRef)
							annotations += ClientCallable.annotationRef
							body = [
								append('''
								stateField.setValue(name1);
								adminTypeField.setValue(type2);
								adminField.setValue(name2);
								''')
							]					
						]
					}
				]
				if(it.hasTopology) {
					acceptor.createResource(model, it.topology)
				}
			]
		}
	}
	
	def getThemeAnnotation(GeoModel model) {
		var themeAnno = Theme.annotationRef
		if(model.theme == GeoTheme.LUMO) {
			themeAnno.addAnnAttr(model, Lumo.typeRef)
		} else if(model.theme == GeoTheme.MATERIAL) {
			themeAnno.addAnnAttr(model, Material.typeRef)
		}
		themeAnno
	}

	def createResource(IJvmDeclaredTypeAcceptor acceptor, GeoModel model, String fullPath) {
		val path = fullPath.makeRelative
		acceptor.accept(model.toClass(model.packageName+".resources.Resource"+path.createAlias(false).toFirstUpper)) [
			var anno = org.osgi.service.component.annotations.Component.annotationRef
			anno.addAnnAttr(model, "immediate", true)
			anno.addAnnAttr(model, "service", OsgiVaadinStaticResource.typeRef)
			annotations += anno
			documentation = model.documentation
			superTypes += OsgiVaadinStaticResource.typeRef;
			members += model.toMethod("getPath", String.typeRef) [
				annotations += Override.annotationRef
				body = [append('''return "�path�";''')]
			]
			
			members += model.toMethod("getAlias", String.typeRef) [
				annotations += Override.annotationRef
				body = [append('''return "/�path.createAlias(true)�";''')]
			]
		]
	}
	
	def makeRelative(String fullPath) {
		var resourcePath = "src/main/resources"
		var idx = fullPath.lastIndexOf(resourcePath)
		if(idx > 0) {
			return fullPath.substring(idx+resourcePath.length)
		}
		return fullPath
	}
	
	def createAlias(String path, boolean withExtension) {
		var parts = path.split("/")
		var complete = parts.get(parts.length-1)
		if(withExtension) {
			return complete
		}
		var aliasArray = complete.split(Pattern.quote("."))
		return aliasArray.get(0)
	}
	
}
