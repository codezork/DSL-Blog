/*
 * generated by Xtext 2.19.0
 */
package org.xtext.vaadin.example.geo.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.vaadin.example.geo.GeoModel

@ExtendWith(InjectionExtension)
@InjectWith(GeoDslInjectorProvider)
class GeoDslParsingTest {
	@Inject
	ParseHelper<GeoModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			package org.geotest port 8080 name test
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}
