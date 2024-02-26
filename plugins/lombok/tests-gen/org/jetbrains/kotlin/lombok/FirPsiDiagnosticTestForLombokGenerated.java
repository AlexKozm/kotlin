/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.lombok;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/lombok/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirPsiDiagnosticTestForLombokGenerated extends AbstractFirPsiDiagnosticTestForLombok {
  @Test
  @TestMetadata("accessorsStripPrefixCombined.kt")
  public void testAccessorsStripPrefixCombined() {
    runTest("plugins/lombok/testData/diagnostics/accessorsStripPrefixCombined.kt");
  }

  @Test
  public void testAllFilesPresentInDiagnostics() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/lombok/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), true);
  }

  @Test
  @TestMetadata("annotationTypes.kt")
  public void testAnnotationTypes() {
    runTest("plugins/lombok/testData/diagnostics/annotationTypes.kt");
  }

  @Test
  @TestMetadata("builderAnnotationArguments.kt")
  public void testBuilderAnnotationArguments() {
    runTest("plugins/lombok/testData/diagnostics/builderAnnotationArguments.kt");
  }

  @Test
  @TestMetadata("builderConfig.kt")
  public void testBuilderConfig() {
    runTest("plugins/lombok/testData/diagnostics/builderConfig.kt");
  }

  @Test
  @TestMetadata("builderSingularNullability.kt")
  public void testBuilderSingularNullability() {
    runTest("plugins/lombok/testData/diagnostics/builderSingularNullability.kt");
  }

  @Test
  @TestMetadata("clashAccessors.kt")
  public void testClashAccessors() {
    runTest("plugins/lombok/testData/diagnostics/clashAccessors.kt");
  }

  @Test
  @TestMetadata("getters.kt")
  public void testGetters() {
    runTest("plugins/lombok/testData/diagnostics/getters.kt");
  }

  @Test
  @TestMetadata("gettersClassLevel.kt")
  public void testGettersClassLevel() {
    runTest("plugins/lombok/testData/diagnostics/gettersClassLevel.kt");
  }

  @Test
  @TestMetadata("setters.kt")
  public void testSetters() {
    runTest("plugins/lombok/testData/diagnostics/setters.kt");
  }

  @Test
  @TestMetadata("settersClassLevel.kt")
  public void testSettersClassLevel() {
    runTest("plugins/lombok/testData/diagnostics/settersClassLevel.kt");
  }
}
