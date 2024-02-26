/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.types;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.types.AbstractAnalysisApiSubstitutorsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/substitutors/typeSubstitution")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleAnalysisApiSubstitutorsTestGenerated extends AbstractAnalysisApiSubstitutorsTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Dependent,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInTypeSubstitution() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/substitutors/typeSubstitution"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("directSubstitution.kt")
  public void testDirectSubstitution() {
    runTest("analysis/analysis-api/testData/substitutors/typeSubstitution/directSubstitution.kt");
  }

  @Test
  @TestMetadata("emptySubstitution.kt")
  public void testEmptySubstitution() {
    runTest("analysis/analysis-api/testData/substitutors/typeSubstitution/emptySubstitution.kt");
  }

  @Test
  @TestMetadata("notApplicableSubstitutor.kt")
  public void testNotApplicableSubstitutor() {
    runTest("analysis/analysis-api/testData/substitutors/typeSubstitution/notApplicableSubstitutor.kt");
  }

  @Test
  @TestMetadata("substitutionWithTypeParams.kt")
  public void testSubstitutionWithTypeParams() {
    runTest("analysis/analysis-api/testData/substitutors/typeSubstitution/substitutionWithTypeParams.kt");
  }
}
