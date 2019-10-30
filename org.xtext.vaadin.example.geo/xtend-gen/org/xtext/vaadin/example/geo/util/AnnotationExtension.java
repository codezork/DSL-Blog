package org.xtext.vaadin.example.geo.util;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmBooleanAnnotationValue;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("restriction")
public class AnnotationExtension {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private TypeReferences references;
  
  /**
   * Creates an annotation value and adds it the the given type reference
   */
  protected JvmTypeAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final JvmTypeReference typeReference) {
    final JvmTypeAnnotationValue value = this.typesFactory.createJvmTypeAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmTypeAnnotationValue>operator_add(_explicitValues, value);
    EList<JvmTypeReference> _values = value.getValues();
    this._jvmTypesBuilder.<JvmTypeReference>operator_add(_values, typeReference);
    return value;
  }
  
  /**
   * Creates an enum annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final Enum<?>... enums) {
    final JvmEnumAnnotationValue value = this.typesFactory.createJvmEnumAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmEnumAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType((enums[0]).getDeclaringClass(), context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    for (final Enum<?> enumxx : enums) {
      {
        final JvmOperation op = this.typesFactory.createJvmOperation();
        op.setSimpleName(name);
        op.setDeclaringType(declaredType);
        value.setOperation(op);
        final JvmEnumerationLiteral literal = this.typesFactory.createJvmEnumerationLiteral();
        literal.setDeclaringType(declaredType);
        literal.setSimpleName(enumxx.name());
        EList<JvmEnumerationLiteral> _values = value.getValues();
        this._jvmTypesBuilder.<JvmEnumerationLiteral>operator_add(_values, literal);
      }
    }
    return value;
  }
  
  /**
   * Creates an enum annotation value and adds it the the given type reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final JvmTypeReference typeReference) {
    final JvmTypeAnnotationValue value = this.typesFactory.createJvmTypeAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmTypeAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(JvmTypeReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<JvmTypeReference> _values = value.getValues();
    this._jvmTypesBuilder.<JvmTypeReference>operator_add(_values, typeReference);
    return value;
  }
  
  /**
   * Creates an enum annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final Enum<?> enumX) {
    final JvmEnumAnnotationValue value = this.typesFactory.createJvmEnumAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmEnumAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(enumX.getDeclaringClass(), context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    final JvmEnumerationLiteral literal = this.typesFactory.createJvmEnumerationLiteral();
    literal.setDeclaringType(declaredType);
    literal.setSimpleName(enumX.name());
    EList<JvmEnumerationLiteral> _values = value.getValues();
    this._jvmTypesBuilder.<JvmEnumerationLiteral>operator_add(_values, literal);
    return value;
  }
  
  /**
   * Creates a boolean annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final boolean booleanValue) {
    final JvmBooleanAnnotationValue value = this.typesFactory.createJvmBooleanAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmBooleanAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(Boolean.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<Boolean> _values = value.getValues();
    this._jvmTypesBuilder.<Boolean>operator_add(_values, Boolean.valueOf(booleanValue));
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final String stringValue) {
    final JvmStringAnnotationValue value = this.typesFactory.createJvmStringAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmStringAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(String.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<String> _values = value.getValues();
    this._jvmTypesBuilder.<String>operator_add(_values, stringValue);
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final int intValue) {
    final JvmIntAnnotationValue value = this.typesFactory.createJvmIntAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmIntAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(Integer.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<Integer> _values = value.getValues();
    this._jvmTypesBuilder.<Integer>operator_add(_values, Integer.valueOf(intValue));
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final JvmAnnotationReference annotationValue) {
    final JvmAnnotationAnnotationValue value = this.typesFactory.createJvmAnnotationAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmAnnotationAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(JvmAnnotationReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<JvmAnnotationReference> _values = value.getValues();
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_values, annotationValue);
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given string annotation values
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final List<String> stringValues) {
    final JvmStringAnnotationValue value = this.typesFactory.createJvmStringAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmStringAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(JvmAnnotationReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    for (final String stringValue : stringValues) {
      EList<String> _values = value.getValues();
      this._jvmTypesBuilder.<String>operator_add(_values, stringValue);
    }
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final JvmAnnotationReference... annotationValues) {
    final JvmAnnotationAnnotationValue value = this.typesFactory.createJvmAnnotationAnnotationValue();
    EList<JvmAnnotationValue> _explicitValues = annRef.getExplicitValues();
    this._jvmTypesBuilder.<JvmAnnotationAnnotationValue>operator_add(_explicitValues, value);
    JvmType _findDeclaredType = this.references.findDeclaredType(JvmAnnotationReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    CollectionExtensions.<JvmAnnotationReference>addAll(value.getValues(), annotationValues);
    return value;
  }
  
  public boolean containsAnnotation(final JvmAnnotationTarget target, final Class<?> type, final EObject context) {
    EList<JvmAnnotationReference> _annotations = target.getAnnotations();
    for (final JvmAnnotationReference anno : _annotations) {
      {
        JvmAnnotationType resolved = null;
        final JvmAnnotationType xan = anno.getAnnotation();
        if ((xan != null)) {
          boolean _eIsProxy = xan.eIsProxy();
          if (_eIsProxy) {
            EObject _resolve = EcoreUtil.resolve(xan, context);
            resolved = ((JvmAnnotationType) _resolve);
          } else {
            resolved = xan;
          }
          String _qualifiedName = resolved.getQualifiedName();
          boolean _tripleNotEquals = (_qualifiedName != null);
          if (_tripleNotEquals) {
            boolean _equals = resolved.getQualifiedName().equals(type.getCanonicalName());
            if (_equals) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public JvmTypeAnnotationValue addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final JvmTypeReference typeReference) {
    return _addAnnAttr(annRef, context, typeReference);
  }
  
  public JvmAnnotationValue addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final Object intValue) {
    if (intValue instanceof Integer) {
      return _addAnnAttr(annRef, context, name, (Integer)intValue);
    } else if (intValue instanceof List) {
      return _addAnnAttr(annRef, context, name, (List<String>)intValue);
    } else if (intValue instanceof JvmAnnotationReference) {
      return _addAnnAttr(annRef, context, name, (JvmAnnotationReference)intValue);
    } else if (intValue instanceof JvmTypeReference) {
      return _addAnnAttr(annRef, context, name, (JvmTypeReference)intValue);
    } else if (intValue instanceof Boolean) {
      return _addAnnAttr(annRef, context, name, (Boolean)intValue);
    } else if (intValue instanceof Enum) {
      return _addAnnAttr(annRef, context, name, (Enum<?>)intValue);
    } else if (intValue instanceof String) {
      return _addAnnAttr(annRef, context, name, (String)intValue);
    } else if (intValue instanceof Enum[]) {
      return _addAnnAttr(annRef, context, name, (Enum<?>[])intValue);
    } else if (intValue instanceof JvmAnnotationReference[]) {
      return _addAnnAttr(annRef, context, name, (JvmAnnotationReference[])intValue);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(annRef, context, name, intValue).toString());
    }
  }
}
