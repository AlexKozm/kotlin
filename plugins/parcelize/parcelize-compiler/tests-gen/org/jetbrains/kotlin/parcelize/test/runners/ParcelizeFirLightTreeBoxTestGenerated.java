/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.parcelize.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/parcelize/parcelize-compiler/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class ParcelizeFirLightTreeBoxTestGenerated extends AbstractParcelizeFirLightTreeBoxTest {
  @Test
  public void testAllFilesPresentInBox() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/parcelize/parcelize-compiler/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Test
  @TestMetadata("allPrimitiveTypes.kt")
  public void testAllPrimitiveTypes() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/allPrimitiveTypes.kt");
  }

  @Test
  @TestMetadata("allUnsignedTypes.kt")
  public void testAllUnsignedTypes() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/allUnsignedTypes.kt");
  }

  @Test
  @TestMetadata("arraySimple.kt")
  public void testArraySimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/arraySimple.kt");
  }

  @Test
  @TestMetadata("arrays.kt")
  public void testArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/arrays.kt");
  }

  @Test
  @TestMetadata("binder.kt")
  public void testBinder() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/binder.kt");
  }

  @Test
  @TestMetadata("boxedTypes.kt")
  public void testBoxedTypes() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/boxedTypes.kt");
  }

  @Test
  @TestMetadata("bundle.kt")
  public void testBundle() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/bundle.kt");
  }

  @Test
  @TestMetadata("charSequence.kt")
  public void testCharSequence() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/charSequence.kt");
  }

  @Test
  @TestMetadata("constructorWithoutValOrVar.kt")
  public void testConstructorWithoutValOrVar() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/constructorWithoutValOrVar.kt");
  }

  @Test
  @TestMetadata("customNewArray.kt")
  public void testCustomNewArray() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customNewArray.kt");
  }

  @Test
  @TestMetadata("customParcelable.kt")
  public void testCustomParcelable() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customParcelable.kt");
  }

  @Test
  @TestMetadata("customParcelerChecks.kt")
  public void testCustomParcelerChecks() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customParcelerChecks.kt");
  }

  @Test
  @TestMetadata("customParcelerScoping.kt")
  public void testCustomParcelerScoping() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customParcelerScoping.kt");
  }

  @Test
  @TestMetadata("customSerializerBoxing.kt")
  public void testCustomSerializerBoxing() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customSerializerBoxing.kt");
  }

  @Test
  @TestMetadata("customSerializerSimple.kt")
  public void testCustomSerializerSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customSerializerSimple.kt");
  }

  @Test
  @TestMetadata("customSerializerWriteWith.kt")
  public void testCustomSerializerWriteWith() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customSerializerWriteWith.kt");
  }

  @Test
  @TestMetadata("customSimple.kt")
  public void testCustomSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/customSimple.kt");
  }

  @Test
  @TestMetadata("duration.kt")
  public void testDuration() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/duration.kt");
  }

  @Test
  @TestMetadata("enumObject.kt")
  public void testEnumObject() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/enumObject.kt");
  }

  @Test
  @TestMetadata("enums.kt")
  public void testEnums() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/enums.kt");
  }

  @Test
  @TestMetadata("exceptions.kt")
  public void testExceptions() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/exceptions.kt");
  }

  @Test
  @TestMetadata("functions.kt")
  public void testFunctions() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/functions.kt");
  }

  @Test
  @TestMetadata("genericParcelable.kt")
  public void testGenericParcelable() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/genericParcelable.kt");
  }

  @Test
  @TestMetadata("generics.kt")
  public void testGenerics() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/generics.kt");
  }

  @Test
  @TestMetadata("ignoredOnParcel.kt")
  public void testIgnoredOnParcel() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/ignoredOnParcel.kt");
  }

  @Test
  @TestMetadata("intArray.kt")
  public void testIntArray() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/intArray.kt");
  }

  @Test
  @TestMetadata("javaInterop.kt")
  public void testJavaInterop() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/javaInterop.kt");
  }

  @Test
  @TestMetadata("kt19747.kt")
  public void testKt19747() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt19747.kt");
  }

  @Test
  @TestMetadata("kt19747Deprecated.kt")
  public void testKt19747Deprecated() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt19747Deprecated.kt");
  }

  @Test
  @TestMetadata("kt19747_2.kt")
  public void testKt19747_2() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt19747_2.kt");
  }

  @Test
  @TestMetadata("kt19749.kt")
  public void testKt19749() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt19749.kt");
  }

  @Test
  @TestMetadata("kt19853.kt")
  public void testKt19853() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt19853.kt");
  }

  @Test
  @TestMetadata("kt20002.kt")
  public void testKt20002() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt20002.kt");
  }

  @Test
  @TestMetadata("kt20021.kt")
  public void testKt20021() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt20021.kt");
  }

  @Test
  @TestMetadata("kt20717.kt")
  public void testKt20717() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt20717.kt");
  }

  @Test
  @TestMetadata("kt25839.kt")
  public void testKt25839() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt25839.kt");
  }

  @Test
  @TestMetadata("kt26221.kt")
  public void testKt26221() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt26221.kt");
  }

  @Test
  @TestMetadata("kt36658.kt")
  public void testKt36658() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt36658.kt");
  }

  @Test
  @TestMetadata("kt39981.kt")
  public void testKt39981() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt39981.kt");
  }

  @Test
  @TestMetadata("kt41553.kt")
  public void testKt41553() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt41553.kt");
  }

  @Test
  @TestMetadata("kt41553_2.kt")
  public void testKt41553_2() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt41553_2.kt");
  }

  @Test
  @TestMetadata("kt46567.kt")
  public void testKt46567() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/kt46567.kt");
  }

  @Test
  @TestMetadata("listKinds.kt")
  public void testListKinds() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/listKinds.kt");
  }

  @Test
  @TestMetadata("listSimple.kt")
  public void testListSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/listSimple.kt");
  }

  @Test
  @TestMetadata("listSimplePersistent.kt")
  public void testListSimplePersistent() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/listSimplePersistent.kt");
  }

  @Test
  @TestMetadata("lists.kt")
  public void testLists() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/lists.kt");
  }

  @Test
  @TestMetadata("mapKinds.kt")
  public void testMapKinds() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/mapKinds.kt");
  }

  @Test
  @TestMetadata("mapSimple.kt")
  public void testMapSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/mapSimple.kt");
  }

  @Test
  @TestMetadata("mapSimplePersistent.kt")
  public void testMapSimplePersistent() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/mapSimplePersistent.kt");
  }

  @Test
  @TestMetadata("maps.kt")
  public void testMaps() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/maps.kt");
  }

  @Test
  @TestMetadata("nestedArrays.kt")
  public void testNestedArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedArrays.kt");
  }

  @Test
  @TestMetadata("nestedLists.kt")
  public void testNestedLists() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedLists.kt");
  }

  @Test
  @TestMetadata("nestedMaps.kt")
  public void testNestedMaps() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedMaps.kt");
  }

  @Test
  @TestMetadata("nestedParcelable.kt")
  public void testNestedParcelable() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedParcelable.kt");
  }

  @Test
  @TestMetadata("nestedSparseArrays.kt")
  public void testNestedSparseArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedSparseArrays.kt");
  }

  @Test
  @TestMetadata("nestedSparseArrays2.kt")
  public void testNestedSparseArrays2() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nestedSparseArrays2.kt");
  }

  @Test
  @TestMetadata("newArray.kt")
  public void testNewArray() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/newArray.kt");
  }

  @Test
  @TestMetadata("newArrayParceler.kt")
  public void testNewArrayParceler() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/newArrayParceler.kt");
  }

  @Test
  @TestMetadata("nullableSparseArrays.kt")
  public void testNullableSparseArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nullableSparseArrays.kt");
  }

  @Test
  @TestMetadata("nullableTypes.kt")
  public void testNullableTypes() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nullableTypes.kt");
  }

  @Test
  @TestMetadata("nullableTypesSimple.kt")
  public void testNullableTypesSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/nullableTypesSimple.kt");
  }

  @Test
  @TestMetadata("objectWriteParcelable.kt")
  public void testObjectWriteParcelable() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/objectWriteParcelable.kt");
  }

  @Test
  @TestMetadata("objects.kt")
  public void testObjects() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/objects.kt");
  }

  @Test
  @TestMetadata("openParcelize.kt")
  public void testOpenParcelize() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/openParcelize.kt");
  }

  @Test
  @TestMetadata("overriddenDescribeContents.kt")
  public void testOverriddenDescribeContents() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/overriddenDescribeContents.kt");
  }

  @Test
  @TestMetadata("parcelableValueClass.kt")
  public void testParcelableValueClass() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/parcelableValueClass.kt");
  }

  @Test
  @TestMetadata("parcelizeCustomValueClass.kt")
  public void testParcelizeCustomValueClass() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/parcelizeCustomValueClass.kt");
  }

  @Test
  @TestMetadata("persistableBundle.kt")
  public void testPersistableBundle() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/persistableBundle.kt");
  }

  @Test
  @TestMetadata("primitiveTypes.kt")
  public void testPrimitiveTypes() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/primitiveTypes.kt");
  }

  @Test
  @TestMetadata("privateConstructor.kt")
  public void testPrivateConstructor() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/privateConstructor.kt");
  }

  @Test
  @TestMetadata("recursiveGenerics.kt")
  public void testRecursiveGenerics() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/recursiveGenerics.kt");
  }

  @Test
  @TestMetadata("sealedClass.kt")
  public void testSealedClass() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/sealedClass.kt");
  }

  @Test
  @TestMetadata("sealedClass2.kt")
  public void testSealedClass2() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/sealedClass2.kt");
  }

  @Test
  @TestMetadata("sealedInterface.kt")
  public void testSealedInterface() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/sealedInterface.kt");
  }

  @Test
  @TestMetadata("shortArray.kt")
  public void testShortArray() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/shortArray.kt");
  }

  @Test
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/simple.kt");
  }

  @Test
  @TestMetadata("simpleDeprecated.kt")
  public void testSimpleDeprecated() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/simpleDeprecated.kt");
  }

  @Test
  @TestMetadata("sparseArrays.kt")
  public void testSparseArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/sparseArrays.kt");
  }

  @Test
  @TestMetadata("sparseBooleanArray.kt")
  public void testSparseBooleanArray() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/sparseBooleanArray.kt");
  }

  @Test
  @TestMetadata("typeParameters.kt")
  public void testTypeParameters() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/typeParameters.kt");
  }

  @Test
  @TestMetadata("unsignedArrays.kt")
  public void testUnsignedArrays() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/unsignedArrays.kt");
  }

  @Test
  @TestMetadata("valueClassWrapper.kt")
  public void testValueClassWrapper() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/valueClassWrapper.kt");
  }

  @Test
  @TestMetadata("valueClasses.kt")
  public void testValueClasses() {
    runTest("plugins/parcelize/parcelize-compiler/testData/box/valueClasses.kt");
  }
}
