package jetbrains.mps.baseLanguage.tailRecursion.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class TailPositionInMethod_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public TailPositionInMethod_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseMethodDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (AttributeOperations.getAttribute(baseMethodDeclaration, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion"))) != null) {

      CheckingUtil.checkForVoidReturnType(typeCheckingContext, SLinkOperations.getTarget(baseMethodDeclaration, "returnType", true), baseMethodDeclaration);

      SNode lastNode = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(baseMethodDeclaration, "body", true), "statement", true)).last();
      CheckingUtil.checkCorrectKindOfLastNode(typeCheckingContext, lastNode);

      List<SNode> methodCalls = SNodeOperations.getDescendants(lastNode, "jetbrains.mps.baseLanguage.structure.IMethodCall", false, new String[]{});
      if (ListSequence.fromList(methodCalls).isEmpty()) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(lastNode, "No method call in the tail position", "r:293c28b4-50b9-42c3-936c-5778a017e4f1(jetbrains.mps.baseLanguage.tailRecursion.typesystem)", "9009622095742633442", null, errorTarget);
        }
      } else {
        SNode methodCall = ListSequence.fromList(methodCalls).first();
        if (SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false) != baseMethodDeclaration) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(methodCall, "A tail recursive function must be calling itself", "r:293c28b4-50b9-42c3-936c-5778a017e4f1(jetbrains.mps.baseLanguage.tailRecursion.typesystem)", "9009622095742637948", null, errorTarget);
          }
          return;
        }
        CheckingUtil.checkHierarchy(typeCheckingContext, lastNode, methodCall);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
