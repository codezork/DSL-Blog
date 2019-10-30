package org.xtext.vaadin.example.geo.ui;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GeoCustomBuilderParticipant extends BuilderParticipant {
  @Inject
  @Extension
  private IContextualOutputConfigurationProvider2 outputConfigurationProvider;
  
  @Override
  protected Map<String, OutputConfiguration> getOutputConfigurations(final IXtextBuilderParticipant.IBuildContext context) {
    Set<OutputConfiguration> configurations = this.outputConfigurationProvider.getOutputConfigurations(context.getResourceSet());
    return Maps.<String, OutputConfiguration>uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
      @Override
      public String apply(final OutputConfiguration from) {
        return from.getName();
      }
    });
  }
}
