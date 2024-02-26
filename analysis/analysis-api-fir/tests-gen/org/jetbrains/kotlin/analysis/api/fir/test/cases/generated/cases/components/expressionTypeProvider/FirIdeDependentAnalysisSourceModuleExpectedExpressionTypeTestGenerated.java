/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.expressionTypeProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.expressionTypeProvider.AbstractExpectedExpressionTypeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleExpectedExpressionTypeTestGenerated extends AbstractExpectedExpressionTypeTest {
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
  @TestMetadata("afterExclOperand.kt")
  public void testAfterExclOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/afterExclOperand.kt");
  }

  @Test
  public void testAllFilesPresentInExpectedExpressionType() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("annotationPositionalArgument.kt")
  public void testAnnotationPositionalArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/annotationPositionalArgument.kt");
  }

  @Test
  @TestMetadata("arrayAccessExpressionGet.kt")
  public void testArrayAccessExpressionGet() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionGet.kt");
  }

  @Test
  @TestMetadata("arrayAccessExpressionGetWithTypeParameters.kt")
  public void testArrayAccessExpressionGetWithTypeParameters() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionGetWithTypeParameters.kt");
  }

  @Test
  @TestMetadata("arrayAccessExpressionSet.kt")
  public void testArrayAccessExpressionSet() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionSet.kt");
  }

  @Test
  @TestMetadata("arrayAccessExpressionSetWithTypeParameters.kt")
  public void testArrayAccessExpressionSetWithTypeParameters() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionSetWithTypeParameters.kt");
  }

  @Test
  @TestMetadata("conditionInWhenWithSubject.kt")
  public void testConditionInWhenWithSubject() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/conditionInWhenWithSubject.kt");
  }

  @Test
  @TestMetadata("conditionInWhenWithoutSubject.kt")
  public void testConditionInWhenWithoutSubject() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/conditionInWhenWithoutSubject.kt");
  }

  @Test
  @TestMetadata("delegatedConstructorCall.kt")
  public void testDelegatedConstructorCall() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/delegatedConstructorCall.kt");
  }

  @Test
  @TestMetadata("elvisExpressionLeftOperand.kt")
  public void testElvisExpressionLeftOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionLeftOperand.kt");
  }

  @Test
  @TestMetadata("elvisExpressionLeftOperandWithoutExplicitType.kt")
  public void testElvisExpressionLeftOperandWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionLeftOperandWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("elvisExpressionRightOperand.kt")
  public void testElvisExpressionRightOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionRightOperand.kt");
  }

  @Test
  @TestMetadata("elvisExpressionRightOperandWithoutExplicitType.kt")
  public void testElvisExpressionRightOperandWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionRightOperandWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("functionExpressionBody.kt")
  public void testFunctionExpressionBody() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBody.kt");
  }

  @Test
  @TestMetadata("functionExpressionBodyBlockExpression.kt")
  public void testFunctionExpressionBodyBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyBlockExpression.kt");
  }

  @Test
  @TestMetadata("functionExpressionBodyQualified.kt")
  public void testFunctionExpressionBodyQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyQualified.kt");
  }

  @Test
  @TestMetadata("functionExpressionBodyWithTypeFromRHS.kt")
  public void testFunctionExpressionBodyWithTypeFromRHS() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyWithTypeFromRHS.kt");
  }

  @Test
  @TestMetadata("functionExpressionBodyWithoutExplicitType.kt")
  public void testFunctionExpressionBodyWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("functionLambdaParam.kt")
  public void testFunctionLambdaParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionLambdaParam.kt");
  }

  @Test
  @TestMetadata("functionNamedlParam.kt")
  public void testFunctionNamedlParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionNamedlParam.kt");
  }

  @Test
  @TestMetadata("functionParamWithTypeParam.kt")
  public void testFunctionParamWithTypeParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionParamWithTypeParam.kt");
  }

  @Test
  @TestMetadata("functionPositionalParam.kt")
  public void testFunctionPositionalParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionPositionalParam.kt");
  }

  @Test
  @TestMetadata("functionPositionalParamQualified.kt")
  public void testFunctionPositionalParamQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionPositionalParamQualified.kt");
  }

  @Test
  @TestMetadata("functionalTypeSubstitution.kt")
  public void testFunctionalTypeSubstitution() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionalTypeSubstitution.kt");
  }

  @Test
  @TestMetadata("ifCondition.kt")
  public void testIfCondition() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/ifCondition.kt");
  }

  @Test
  @TestMetadata("ifConditionQualified.kt")
  public void testIfConditionQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/ifConditionQualified.kt");
  }

  @Test
  @TestMetadata("infixFunctionAsRegularCallParam.kt")
  public void testInfixFunctionAsRegularCallParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionAsRegularCallParam.kt");
  }

  @Test
  @TestMetadata("infixFunctionParam.kt")
  public void testInfixFunctionParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionParam.kt");
  }

  @Test
  @TestMetadata("infixFunctionParamQualified.kt")
  public void testInfixFunctionParamQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionParamQualified.kt");
  }

  @Test
  @TestMetadata("infixFunctionTypeParameter.kt")
  public void testInfixFunctionTypeParameter() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionTypeParameter.kt");
  }

  @Test
  @TestMetadata("lambdaWithExplicitTypeFromVariable.kt")
  public void testLambdaWithExplicitTypeFromVariable() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lambdaWithExplicitTypeFromVariable.kt");
  }

  @Test
  @TestMetadata("lambdaWithoutReturnNorExplicitType.kt")
  public void testLambdaWithoutReturnNorExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lambdaWithoutReturnNorExplicitType.kt");
  }

  @Test
  @TestMetadata("lastStatementInFunctionBlockBody.kt")
  public void testLastStatementInFunctionBlockBody() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInFunctionBlockBody.kt");
  }

  @Test
  @TestMetadata("lastStatementInLambda.kt")
  public void testLastStatementInLambda() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambda.kt");
  }

  @Test
  @TestMetadata("lastStatementInLambdaWithTypeMismatch.kt")
  public void testLastStatementInLambdaWithTypeMismatch() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambdaWithTypeMismatch.kt");
  }

  @Test
  @TestMetadata("lastStatementInLambdaWithoutExplicitType.kt")
  public void testLastStatementInLambdaWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambdaWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("lastStatementInTry.kt")
  public void testLastStatementInTry() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInTry.kt");
  }

  @Test
  @TestMetadata("lastStatementInTryWithoutExplicitType.kt")
  public void testLastStatementInTryWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInTryWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("propertyDeclaration.kt")
  public void testPropertyDeclaration() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclaration.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationNoExplicitType.kt")
  public void testPropertyDeclarationNoExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationNoExplicitType.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationQualified.kt")
  public void testPropertyDeclarationQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationQualified.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationWithSafeCast.kt")
  public void testPropertyDeclarationWithSafeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithSafeCast.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationWithTypeCast.kt")
  public void testPropertyDeclarationWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithTypeCast.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationWithTypeFromRHS.kt")
  public void testPropertyDeclarationWithTypeFromRHS() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithTypeFromRHS.kt");
  }

  @Test
  @TestMetadata("propertyDeclarationWithoutExplicitType.kt")
  public void testPropertyDeclarationWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("returnFromFunction.kt")
  public void testReturnFromFunction() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunction.kt");
  }

  @Test
  @TestMetadata("returnFromFunctionQualifiedReceiver.kt")
  public void testReturnFromFunctionQualifiedReceiver() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunctionQualifiedReceiver.kt");
  }

  @Test
  @TestMetadata("returnFromFunctionQualifiedSelector.kt")
  public void testReturnFromFunctionQualifiedSelector() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunctionQualifiedSelector.kt");
  }

  @Test
  @TestMetadata("returnFromLambda.kt")
  public void testReturnFromLambda() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromLambda.kt");
  }

  @Test
  @TestMetadata("safeCallArgument.kt")
  public void testSafeCallArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/safeCallArgument.kt");
  }

  @Test
  @TestMetadata("sam.kt")
  public void testSam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/sam.kt");
  }

  @Test
  @TestMetadata("samAsArgument.kt")
  public void testSamAsArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsArgument.kt");
  }

  @Test
  @TestMetadata("samAsConstructorArgument.kt")
  public void testSamAsConstructorArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsConstructorArgument.kt");
  }

  @Test
  @TestMetadata("samAsReturn.kt")
  public void testSamAsReturn() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsReturn.kt");
  }

  @Test
  @TestMetadata("samReferenceAsArgument.kt")
  public void testSamReferenceAsArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceAsArgument.kt");
  }

  @Test
  @TestMetadata("samReferenceAsVararg.kt")
  public void testSamReferenceAsVararg() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceAsVararg.kt");
  }

  @Test
  @TestMetadata("samReferenceWithTypeCast.kt")
  public void testSamReferenceWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceWithTypeCast.kt");
  }

  @Test
  @TestMetadata("samWithExplicitTypeFromProperty.kt")
  public void testSamWithExplicitTypeFromProperty() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithExplicitTypeFromProperty.kt");
  }

  @Test
  @TestMetadata("samWithReturnToExplicitLabel.kt")
  public void testSamWithReturnToExplicitLabel() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithReturnToExplicitLabel.kt");
  }

  @Test
  @TestMetadata("samWithReturnToImplicitLabel.kt")
  public void testSamWithReturnToImplicitLabel() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithReturnToImplicitLabel.kt");
  }

  @Test
  @TestMetadata("samWithTypeCast.kt")
  public void testSamWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithTypeCast.kt");
  }

  @Test
  @TestMetadata("statementInIf.kt")
  public void testStatementInIf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIf.kt");
  }

  @Test
  @TestMetadata("statementInIfBlockExpression.kt")
  public void testStatementInIfBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIfBlockExpression.kt");
  }

  @Test
  @TestMetadata("statementInIfWithoutExplicitType.kt")
  public void testStatementInIfWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIfWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("statementInWhen.kt")
  public void testStatementInWhen() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhen.kt");
  }

  @Test
  @TestMetadata("statementInWhenBlockExpression.kt")
  public void testStatementInWhenBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhenBlockExpression.kt");
  }

  @Test
  @TestMetadata("statementInWhenWithoutExplicitType.kt")
  public void testStatementInWhenWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhenWithoutExplicitType.kt");
  }

  @Test
  @TestMetadata("variableAssignment.kt")
  public void testVariableAssignment() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/variableAssignment.kt");
  }

  @Test
  @TestMetadata("variableAssignmentQualified.kt")
  public void testVariableAssignmentQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/variableAssignmentQualified.kt");
  }

  @Test
  @TestMetadata("whileCondition.kt")
  public void testWhileCondition() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/whileCondition.kt");
  }

  @Test
  @TestMetadata("whileConditionQualified.kt")
  public void testWhileConditionQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/whileConditionQualified.kt");
  }
}
