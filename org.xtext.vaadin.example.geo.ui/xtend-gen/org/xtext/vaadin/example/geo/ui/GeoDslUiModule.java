/**
 * generated by Xtext 2.19.0
 */
package org.xtext.vaadin.example.geo.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.xtext.vaadin.example.geo.ui.AbstractGeoDslUiModule;
import org.xtext.vaadin.example.geo.ui.GeoCustomBuilderParticipant;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class GeoDslUiModule extends AbstractGeoDslUiModule {
  @Override
  public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
    return GeoCustomBuilderParticipant.class;
  }
  
  public GeoDslUiModule(final AbstractUIPlugin arg0) {
    super(arg0);
  }
}
