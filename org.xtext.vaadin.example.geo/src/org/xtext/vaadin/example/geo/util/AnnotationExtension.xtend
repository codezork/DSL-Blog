package org.xtext.vaadin.example.geo.util

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmEnumerationLiteral
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

@SuppressWarnings("restriction")
class AnnotationExtension {

	@Inject extension JvmTypesBuilder
	@Inject
	private TypesFactory typesFactory;
	@Inject
	private TypeReferences references;

	/**
	 * Creates an annotation value and adds it the the given type reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context,
		JvmTypeReference typeReference) {
		val value = typesFactory.createJvmTypeAnnotationValue
		annRef.explicitValues += value
		value.values += typeReference
		return value
	}
	
	/**
	 * Creates an enum annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, Enum<?>... enums) {
		val value = typesFactory.createJvmEnumAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(enums.get(0).declaringClass, context) as JvmDeclaredType
		for (Enum<?> enumxx : enums) {
			val JvmOperation op = typesFactory.createJvmOperation
			op.setSimpleName(name)
			op.setDeclaringType(declaredType)
			value.setOperation(op)
			val JvmEnumerationLiteral literal = typesFactory.createJvmEnumerationLiteral
			literal.setDeclaringType(declaredType)
			literal.setSimpleName(enumxx.name)
			value.values += literal
		}

		return value
	}

	/**
	 * Creates an enum annotation value and adds it the the given type reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name,
		JvmTypeReference typeReference) {
		val value = typesFactory.createJvmTypeAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(JvmTypeReference), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += typeReference
		return value
	}

	/**
	 * Creates an enum annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, Enum<?> enumX) {
		val value = typesFactory.createJvmEnumAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(enumX.declaringClass, context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		val JvmEnumerationLiteral literal = typesFactory.createJvmEnumerationLiteral
		literal.setDeclaringType(declaredType)
		literal.setSimpleName(enumX.name)
		value.values += literal
		return value
	}

	/**
	 * Creates a boolean annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, boolean booleanValue) {
		val value = typesFactory.createJvmBooleanAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(Boolean), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += booleanValue
		return value
	}

	/**
	 * Creates a string annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, String stringValue) {
		val value = typesFactory.createJvmStringAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(String), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += stringValue
		return value
	}

	/**
	 * Creates a string annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, int intValue) {
		val value = typesFactory.createJvmIntAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(Integer), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += intValue
		return value
	}

	/**
	 * Creates a string annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name,
		JvmAnnotationReference annotationValue) {
		val value = typesFactory.createJvmAnnotationAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(JvmAnnotationReference), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += annotationValue
		return value
	}

	/**
	 * Creates a string annotation value and adds it the the given string annotation values
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, List<String> stringValues) {
		val value = typesFactory.createJvmStringAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(JvmAnnotationReference), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		for (stringValue : stringValues) {
			value.values += stringValue
		}
		return value
	}

	/**
	 * Creates a string annotation value and adds it the the given annotation reference
	 */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name,
		JvmAnnotationReference... annotationValues) {
		val value = typesFactory.createJvmAnnotationAnnotationValue
		annRef.explicitValues += value
		val declaredType = references.findDeclaredType(typeof(JvmAnnotationReference), context) as JvmDeclaredType
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values.addAll(annotationValues)
		return value
	}

	def boolean containsAnnotation(JvmAnnotationTarget target, Class<?> type, EObject context) {
		for (anno : target.annotations) {
			var JvmAnnotationType resolved
			val JvmAnnotationType xan = anno.annotation;
			if (xan !== null) {
				if (xan.eIsProxy) {
					resolved = EcoreUtil::resolve(xan, context) as JvmAnnotationType
				} else {
					resolved = xan
				}
				if (resolved.qualifiedName !== null) {
					if (resolved.qualifiedName.equals(type.canonicalName)) {
						return true;
					}
				}
			}
		}
	}
}
