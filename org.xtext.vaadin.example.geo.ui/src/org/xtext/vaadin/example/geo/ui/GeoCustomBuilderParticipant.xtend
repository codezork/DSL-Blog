package org.xtext.vaadin.example.geo.ui

import com.google.inject.Inject
import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2
import org.eclipse.xtext.generator.OutputConfiguration
import com.google.common.collect.Maps
import com.google.common.base.Function

class GeoCustomBuilderParticipant extends BuilderParticipant {
	@Inject	extension IContextualOutputConfigurationProvider2 outputConfigurationProvider;
	
	override protected getOutputConfigurations(IBuildContext context) {
		var configurations = outputConfigurationProvider.getOutputConfigurations(context.getResourceSet());
		return Maps.uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			override apply(OutputConfiguration from) {
				return from.name
			}
		})
	}
}
