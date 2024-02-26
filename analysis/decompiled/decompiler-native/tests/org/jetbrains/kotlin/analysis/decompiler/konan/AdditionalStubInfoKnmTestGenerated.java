/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.decompiler.konan;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo")
@TestDataPath("$PROJECT_ROOT")
public class AdditionalStubInfoKnmTestGenerated extends AbstractAdditionalStubInfoKnmTest {
  @Test
  public void testAllFilesPresentInAdditionalClsStubInfo() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @Test
  @TestMetadata("AnnotatedFlexibleTypes")
  public void testAnnotatedFlexibleTypes() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/AnnotatedFlexibleTypes/");
  }

  @Test
  @TestMetadata("AnnotationValues")
  public void testAnnotationValues() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/AnnotationValues/");
  }

  @Test
  @TestMetadata("Contracts")
  public void testContracts() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/Contracts/");
  }

  @Test
  @TestMetadata("OuterClassesWithFlexibleArgs")
  public void testOuterClassesWithFlexibleArgs() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/OuterClassesWithFlexibleArgs/");
  }

  @Test
  @TestMetadata("ParameterName")
  public void testParameterName() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/ParameterName/");
  }

  @Test
  @TestMetadata("PropertyInitializer")
  public void testPropertyInitializer() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/PropertyInitializer/");
  }

  @Test
  @TestMetadata("TypeParametersInFlexibleTypes")
  public void testTypeParametersInFlexibleTypes() {
    runTest("analysis/decompiled/decompiler-to-file-stubs/testData/additionalClsStubInfo/TypeParametersInFlexibleTypes/");
  }
}
