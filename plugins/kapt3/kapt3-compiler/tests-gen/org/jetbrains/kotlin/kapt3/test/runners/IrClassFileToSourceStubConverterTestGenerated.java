/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kapt3.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kapt3/kapt3-compiler/testData/converter")
@TestDataPath("$PROJECT_ROOT")
public class IrClassFileToSourceStubConverterTestGenerated extends AbstractIrClassFileToSourceStubConverterTest {
  @Test
  @TestMetadata("abstractEnum.kt")
  public void testAbstractEnum() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/abstractEnum.kt");
  }

  @Test
  @TestMetadata("abstractMethods.kt")
  public void testAbstractMethods() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/abstractMethods.kt");
  }

  @Test
  @TestMetadata("aliasedImports.kt")
  public void testAliasedImports() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/aliasedImports.kt");
  }

  @Test
  public void testAllFilesPresentInConverter() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kapt3/kapt3-compiler/testData/converter"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("annotationInAnnotationParameters.kt")
  public void testAnnotationInAnnotationParameters() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationInAnnotationParameters.kt");
  }

  @Test
  @TestMetadata("annotationWithFqNames.kt")
  public void testAnnotationWithFqNames() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationWithFqNames.kt");
  }

  @Test
  @TestMetadata("annotationWithVaragArguments.kt")
  public void testAnnotationWithVaragArguments() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationWithVaragArguments.kt");
  }

  @Test
  @TestMetadata("annotations.kt")
  public void testAnnotations() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations.kt");
  }

  @Test
  @TestMetadata("annotations2.kt")
  public void testAnnotations2() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations2.kt");
  }

  @Test
  @TestMetadata("annotations3.kt")
  public void testAnnotations3() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotations3.kt");
  }

  @Test
  @TestMetadata("annotationsWithConstants.kt")
  public void testAnnotationsWithConstants() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationsWithConstants.kt");
  }

  @Test
  @TestMetadata("annotationsWithTargets.kt")
  public void testAnnotationsWithTargets() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/annotationsWithTargets.kt");
  }

  @Test
  @TestMetadata("anonymousDelegate.kt")
  public void testAnonymousDelegate() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/anonymousDelegate.kt");
  }

  @Test
  @TestMetadata("anonymousInitializer.kt")
  public void testAnonymousInitializer() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/anonymousInitializer.kt");
  }

  @Test
  @TestMetadata("anonymousObjectInEnumSuperConstructor.kt")
  public void testAnonymousObjectInEnumSuperConstructor() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/anonymousObjectInEnumSuperConstructor.kt");
  }

  @Test
  @TestMetadata("comments.kt")
  public void testComments() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/comments.kt");
  }

  @Test
  @TestMetadata("commentsRemoved.kt")
  public void testCommentsRemoved() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/commentsRemoved.kt");
  }

  @Test
  @TestMetadata("cyrillicClassName.kt")
  public void testCyrillicClassName() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/cyrillicClassName.kt");
  }

  @Test
  @TestMetadata("dataClass.kt")
  public void testDataClass() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/dataClass.kt");
  }

  @Test
  @TestMetadata("defaultImpls.kt")
  public void testDefaultImpls() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultImpls.kt");
  }

  @Test
  @TestMetadata("defaultImplsWithTypeParameters.kt")
  public void testDefaultImplsWithTypeParameters() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultImplsWithTypeParameters.kt");
  }

  @Test
  @TestMetadata("defaultPackage.kt")
  public void testDefaultPackage() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultPackage.kt");
  }

  @Test
  @TestMetadata("defaultPackageCorrectErrorTypes.kt")
  public void testDefaultPackageCorrectErrorTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultPackageCorrectErrorTypes.kt");
  }

  @Test
  @TestMetadata("defaultParameterValueOff.kt")
  public void testDefaultParameterValueOff() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultParameterValueOff.kt");
  }

  @Test
  @TestMetadata("defaultParameterValueOn.kt")
  public void testDefaultParameterValueOn() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/defaultParameterValueOn.kt");
  }

  @Test
  @TestMetadata("delegateCorrectErrorTypes.kt")
  public void testDelegateCorrectErrorTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/delegateCorrectErrorTypes.kt");
  }

  @Test
  @TestMetadata("delegateToList.kt")
  public void testDelegateToList() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/delegateToList.kt");
  }

  @Test
  @TestMetadata("delegatedProperties.kt")
  public void testDelegatedProperties() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/delegatedProperties.kt");
  }

  @Test
  @TestMetadata("delegationAndCompanionObject.kt")
  public void testDelegationAndCompanionObject() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/delegationAndCompanionObject.kt");
  }

  @Test
  @TestMetadata("delegationToAnonymousObject.kt")
  public void testDelegationToAnonymousObject() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/delegationToAnonymousObject.kt");
  }

  @Test
  @TestMetadata("deprecated.kt")
  public void testDeprecated() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/deprecated.kt");
  }

  @Test
  @TestMetadata("enumConstructorCallWithErrorType.kt")
  public void testEnumConstructorCallWithErrorType() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/enumConstructorCallWithErrorType.kt");
  }

  @Test
  @TestMetadata("enumImports.kt")
  public void testEnumImports() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/enumImports.kt");
  }

  @Test
  @TestMetadata("enumInCompanion.kt")
  public void testEnumInCompanion() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/enumInCompanion.kt");
  }

  @Test
  @TestMetadata("enumSecondaryConstructor.kt")
  public void testEnumSecondaryConstructor() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/enumSecondaryConstructor.kt");
  }

  @Test
  @TestMetadata("enums.kt")
  public void testEnums() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/enums.kt");
  }

  @Test
  @TestMetadata("errorExtensionReceiver.kt")
  public void testErrorExtensionReceiver() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorExtensionReceiver.kt");
  }

  @Test
  @TestMetadata("errorLocationMapping.kt")
  public void testErrorLocationMapping() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorLocationMapping.kt");
  }

  @Test
  @TestMetadata("errorSuperclass.kt")
  public void testErrorSuperclass() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorSuperclass.kt");
  }

  @Test
  @TestMetadata("errorSuperclassCorrectErrorTypes.kt")
  public void testErrorSuperclassCorrectErrorTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/errorSuperclassCorrectErrorTypes.kt");
  }

  @Test
  @TestMetadata("fileFacadeJvmName.kt")
  public void testFileFacadeJvmName() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/fileFacadeJvmName.kt");
  }

  @Test
  @TestMetadata("functions.kt")
  public void testFunctions() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/functions.kt");
  }

  @Test
  @TestMetadata("genericParameters.kt")
  public void testGenericParameters() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericParameters.kt");
  }

  @Test
  @TestMetadata("genericRawSignatures.kt")
  public void testGenericRawSignatures() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericRawSignatures.kt");
  }

  @Test
  @TestMetadata("genericSimple.kt")
  public void testGenericSimple() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/genericSimple.kt");
  }

  @Test
  @TestMetadata("ignoredMembers.kt")
  public void testIgnoredMembers() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/ignoredMembers.kt");
  }

  @Test
  @TestMetadata("implicitReturnTypes.kt")
  public void testImplicitReturnTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/implicitReturnTypes.kt");
  }

  @Test
  @TestMetadata("importsForErrorTypes.kt")
  public void testImportsForErrorTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/importsForErrorTypes.kt");
  }

  @Test
  @TestMetadata("importsKt22083.kt")
  public void testImportsKt22083() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/importsKt22083.kt");
  }

  @Test
  @TestMetadata("importsWithUnresolvedAnnotations.kt")
  public void testImportsWithUnresolvedAnnotations() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/importsWithUnresolvedAnnotations.kt");
  }

  @Test
  @TestMetadata("incorrectDelegate.kt")
  public void testIncorrectDelegate() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/incorrectDelegate.kt");
  }

  @Test
  @TestMetadata("inheritanceSimple.kt")
  public void testInheritanceSimple() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/inheritanceSimple.kt");
  }

  @Test
  @TestMetadata("inlineClasses.kt")
  public void testInlineClasses() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/inlineClasses.kt");
  }

  @Test
  @TestMetadata("innerClassesWithTypeParameters.kt")
  public void testInnerClassesWithTypeParameters() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/innerClassesWithTypeParameters.kt");
  }

  @Test
  @TestMetadata("interfaceImplementation.kt")
  public void testInterfaceImplementation() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/interfaceImplementation.kt");
  }

  @Test
  @TestMetadata("invalidFieldName.kt")
  public void testInvalidFieldName() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/invalidFieldName.kt");
  }

  @Test
  @TestMetadata("javaKeywords.kt")
  public void testJavaKeywords() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywords.kt");
  }

  @Test
  @TestMetadata("javaKeywordsInPackageNames.kt")
  public void testJavaKeywordsInPackageNames() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywordsInPackageNames.kt");
  }

  @Test
  @TestMetadata("javadoc.kt")
  public void testJavadoc() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/javadoc.kt");
  }

  @Test
  @TestMetadata("jvmDefaultAll.kt")
  public void testJvmDefaultAll() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmDefaultAll.kt");
  }

  @Test
  @TestMetadata("jvmDefaultAllCompatibility.kt")
  public void testJvmDefaultAllCompatibility() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmDefaultAllCompatibility.kt");
  }

  @Test
  @TestMetadata("jvmOverloads.kt")
  public void testJvmOverloads() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmOverloads.kt");
  }

  @Test
  @TestMetadata("jvmRepeatableAnnotation.kt")
  public void testJvmRepeatableAnnotation() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmRepeatableAnnotation.kt");
  }

  @Test
  @TestMetadata("jvmStatic.kt")
  public void testJvmStatic() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmStatic.kt");
  }

  @Test
  @TestMetadata("jvmStaticFieldInParent.kt")
  public void testJvmStaticFieldInParent() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/jvmStaticFieldInParent.kt");
  }

  @Test
  @TestMetadata("kt14996.kt")
  public void testKt14996() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14996.kt");
  }

  @Test
  @TestMetadata("kt14997.kt")
  public void testKt14997() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14997.kt");
  }

  @Test
  @TestMetadata("kt14998.kt")
  public void testKt14998() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt14998.kt");
  }

  @Test
  @TestMetadata("kt15145.kt")
  public void testKt15145() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt15145.kt");
  }

  @Test
  @TestMetadata("kt17567.kt")
  public void testKt17567() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt17567.kt");
  }

  @Test
  @TestMetadata("kt18377.kt")
  public void testKt18377() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt18377.kt");
  }

  @Test
  @TestMetadata("kt18682.kt")
  public void testKt18682() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt18682.kt");
  }

  @Test
  @TestMetadata("kt19700.kt")
  public void testKt19700() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt19700.kt");
  }

  @Test
  @TestMetadata("kt19750.kt")
  public void testKt19750() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt19750.kt");
  }

  @Test
  @TestMetadata("kt24272.kt")
  public void testKt24272() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt24272.kt");
  }

  @Test
  @TestMetadata("kt25071.kt")
  public void testKt25071() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt25071.kt");
  }

  @Test
  @TestMetadata("kt27126.kt")
  public void testKt27126() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt27126.kt");
  }

  @Test
  @TestMetadata("kt28306.kt")
  public void testKt28306() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt28306.kt");
  }

  @Test
  @TestMetadata("kt32596.kt")
  public void testKt32596() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt32596.kt");
  }

  @Test
  @TestMetadata("kt34569.kt")
  public void testKt34569() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt34569.kt");
  }

  @Test
  @TestMetadata("kt43786.kt")
  public void testKt43786() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt43786.kt");
  }

  @Test
  @TestMetadata("kt61729.kt")
  public void testKt61729() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt61729.kt");
  }

  @Test
  @TestMetadata("kt65399.kt")
  public void testKt65399() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt65399.kt");
  }

  @Test
  @TestMetadata("kt65453.kt")
  public void testKt65453() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/kt65453.kt");
  }

  @Test
  @TestMetadata("lazyProperty.kt")
  public void testLazyProperty() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/lazyProperty.kt");
  }

  @Test
  @TestMetadata("leadingDollars.kt")
  public void testLeadingDollars() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars.kt");
  }

  @Test
  @TestMetadata("leadingDollars2.kt")
  public void testLeadingDollars2() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars2.kt");
  }

  @Test
  @TestMetadata("mapEntry.kt")
  public void testMapEntry() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/mapEntry.kt");
  }

  @Test
  @TestMetadata("maxErrorCount.kt")
  public void testMaxErrorCount() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/maxErrorCount.kt");
  }

  @Test
  @TestMetadata("methodParameterNames.kt")
  public void testMethodParameterNames() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/methodParameterNames.kt");
  }

  @Test
  @TestMetadata("methodPropertySignatureClash.kt")
  public void testMethodPropertySignatureClash() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/methodPropertySignatureClash.kt");
  }

  @Test
  @TestMetadata("modifiers.kt")
  public void testModifiers() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/modifiers.kt");
  }

  @Test
  @TestMetadata("multifileClass.kt")
  public void testMultifileClass() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/multifileClass.kt");
  }

  @Test
  @TestMetadata("multifileClassDefaultPackage.kt")
  public void testMultifileClassDefaultPackage() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/multifileClassDefaultPackage.kt");
  }

  @Test
  @TestMetadata("multipleTypeConstraints.kt")
  public void testMultipleTypeConstraints() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/multipleTypeConstraints.kt");
  }

  @Test
  @TestMetadata("nestedClasses.kt")
  public void testNestedClasses() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses.kt");
  }

  @Test
  @TestMetadata("nestedClasses2.kt")
  public void testNestedClasses2() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses2.kt");
  }

  @Test
  @TestMetadata("nestedClassesNonRootPackage.kt")
  public void testNestedClassesNonRootPackage() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nestedClassesNonRootPackage.kt");
  }

  @Test
  @TestMetadata("nonExistentClass.kt")
  public void testNonExistentClass() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClass.kt");
  }

  @Test
  @TestMetadata("nonExistentClassTypesConversion.kt")
  public void testNonExistentClassTypesConversion() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassTypesConversion.kt");
  }

  @Test
  @TestMetadata("nonExistentClassWIthoutCorrection.kt")
  public void testNonExistentClassWIthoutCorrection() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassWIthoutCorrection.kt");
  }

  @Test
  @TestMetadata("primitiveTypes.kt")
  public void testPrimitiveTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/primitiveTypes.kt");
  }

  @Test
  @TestMetadata("properties.kt")
  public void testProperties() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/properties.kt");
  }

  @Test
  @TestMetadata("propertyAnnotations.kt")
  public void testPropertyAnnotations() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/propertyAnnotations.kt");
  }

  @Test
  @TestMetadata("recentlyNullable.kt")
  public void testRecentlyNullable() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/recentlyNullable.kt");
  }

  @Test
  @TestMetadata("repeatableAnnotations.kt")
  public void testRepeatableAnnotations() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/repeatableAnnotations.kt");
  }

  @Test
  @TestMetadata("secondaryConstructor.kt")
  public void testSecondaryConstructor() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/secondaryConstructor.kt");
  }

  @Test
  @TestMetadata("severalPackageParts.kt")
  public void testSeveralPackageParts() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/severalPackageParts.kt");
  }

  @Test
  @TestMetadata("starImports.kt")
  public void testStarImports() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/starImports.kt");
  }

  @Test
  @TestMetadata("strangeIdentifiers.kt")
  public void testStrangeIdentifiers() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/strangeIdentifiers.kt");
  }

  @Test
  @TestMetadata("strangeNames.kt")
  public void testStrangeNames() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/strangeNames.kt");
  }

  @Test
  @TestMetadata("stripMetadata.kt")
  public void testStripMetadata() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/stripMetadata.kt");
  }

  @Test
  @TestMetadata("superConstructorCall.kt")
  public void testSuperConstructorCall() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/superConstructorCall.kt");
  }

  @Test
  @TestMetadata("suspendArgName.kt")
  public void testSuspendArgName() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/suspendArgName.kt");
  }

  @Test
  @TestMetadata("suspendErrorTypes.kt")
  public void testSuspendErrorTypes() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/suspendErrorTypes.kt");
  }

  @Test
  @TestMetadata("suspendFunctionSupertype.kt")
  public void testSuspendFunctionSupertype() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/suspendFunctionSupertype.kt");
  }

  @Test
  @TestMetadata("suspendFunctionWithBigArity.kt")
  public void testSuspendFunctionWithBigArity() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/suspendFunctionWithBigArity.kt");
  }

  @Test
  @TestMetadata("topLevel.kt")
  public void testTopLevel() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/topLevel.kt");
  }

  @Test
  @TestMetadata("typeAnnotations.kt")
  public void testTypeAnnotations() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/typeAnnotations.kt");
  }

  @Test
  @TestMetadata("unresolvedDelegateExpression.kt")
  public void testUnresolvedDelegateExpression() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/unresolvedDelegateExpression.kt");
  }

  @Test
  @TestMetadata("unsafePropertyInitializers.kt")
  public void testUnsafePropertyInitializers() {
    runTest("plugins/kapt3/kapt3-compiler/testData/converter/unsafePropertyInitializers.kt");
  }
}
