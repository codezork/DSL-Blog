/**
 * generated by Xtext 2.19.0
 */
package org.xtext.vaadin.example.geo.ui.contentassist;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;

@SuppressWarnings("all")
public class FileNameTextApplier extends ReplacementTextApplier {
  private ContentAssistContext context;
  
  private String[] extensions;
  
  public ContentAssistContext setContext(final ContentAssistContext context) {
    return this.context = context;
  }
  
  public String[] setExtensions(final String[] fileExtensions) {
    return this.extensions = fileExtensions;
  }
  
  @Override
  public String getActualReplacementString(final ConfigurableCompletionProposal proposal) {
    Display display = this.context.getViewer().getTextWidget().getDisplay();
    Shell _activeShell = display.getActiveShell();
    FileDialog fileDialog = new FileDialog(_activeShell);
    fileDialog.setFilterExtensions(this.extensions);
    String fileName = fileDialog.open();
    fileName = fileName.replace("\\", "/");
    return "\"".concat(fileName).concat("\"");
  }
}
