/*
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package org.xtext.vaadin.example.geo.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.vaadin.example.geo.parser.antlr.internal.InternalGeoDslParser;
import org.xtext.vaadin.example.geo.services.GeoDslGrammarAccess;

public class GeoDslParser extends AbstractAntlrParser {

	@Inject
	private GeoDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGeoDslParser createParser(XtextTokenStream stream) {
		return new InternalGeoDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GeoModel";
	}

	public GeoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GeoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
