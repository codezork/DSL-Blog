package org.xtext.vaadin.example.geo.util;

import java.util.Set;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GeoOutputConfigurationProvider implements IContextualOutputConfigurationProvider2 {
  @Override
  public Set<OutputConfiguration> getOutputConfigurations(final ResourceSet context) {
    String outputDir = null;
    boolean _contains = context.getResources().get(0).getURI().toString().contains(".osgi");
    if (_contains) {
      outputDir = "./src/main/java";
    } else {
      outputDir = "./src/main/java";
    }
    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Output Folder");
    defaultOutput.setOutputDirectory(outputDir);
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);
    return CollectionLiterals.<OutputConfiguration>newHashSet(defaultOutput);
  }
}
