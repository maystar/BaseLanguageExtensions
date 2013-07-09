package jetbrains.mps.baseLanguage.memoize.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VoidMethodsCannotBeMemoized_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_VoidMethodsCannotBeMemoized_NonTypesystemRule() {
  }

  public void applyRule(final SNode memoizeAnnotation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode returnType = (SNodeOperations.isInstanceOf(SNodeOperations.getParent(memoizeAnnotation), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") ?
      SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(memoizeAnnotation), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true) :
      SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SNodeOperations.cast(SNodeOperations.getParent(memoizeAnnotation), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral")), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true)
    );

    if (SNodeOperations.isInstanceOf(returnType, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SNodeOperations.getParent(memoizeAnnotation), "Memoized methods and closures must not return void", "r:1a7e4fda-61ba-46bd-8e65-eed0537e42aa(jetbrains.mps.baseLanguage.memoize.typesystem)", "94989256191898211", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation";
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
