/*
 * generated by Xtext 2.37.0
 */
package org.xtext.stlrobust.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SpecAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/stlrobust/parser/antlr/internal/InternalSpec.tokens");
	}
}
