package jetbrains.mps.baseLanguage.tailRecursion.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.tailRecursion.generator.util.GenHelper;

public class QueriesGenerated {
  public static void mappingScript_CodeBlock_9009622095742524456(final IOperationContext operationContext, final MappingScriptContext _context) {
    Iterable<SNode> methods = ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), null)).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ListSequence.fromList(SNodeOperations.getDescendants(it, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, new String[]{})).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion"))) != null;
          }
        });
      }
    });

    Sequence.fromIterable(methods).visitAll(new IVisitor<SNode>() {
      public void visit(final SNode method) {
        SNode lastNode = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).last();
        if (GenHelper.checkLastNodeBeingOfCorrectKind(_context, lastNode)) {
          return;
        }

        final SNode methodCall = ListSequence.fromList(SNodeOperations.getDescendants(lastNode, "jetbrains.mps.baseLanguage.structure.IMethodCall", false, new String[]{})).last();
        final SNode containingStatementList = SNodeOperations.getAncestor(methodCall, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);

        if (GenHelper.checkMethodCallInvokesCorrectMethod(method, _context, methodCall)) {
          return;
        }
        GenHelper.checkPathForIncorrectNodes(_context, lastNode, methodCall);

        final SNode parameterCopyBlock = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null);
        ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).visitAll(new IVisitor<SNode>() {
          public void visit(SNode param) {
            GenHelper.handleParameter(method, containingStatementList, parameterCopyBlock, param, ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).getElement(SNodeOperations.getIndexInParent(param)), _context);
          }
        });
        GenHelper.removeTailStatement(methodCall);

        SLinkOperations.setTarget(method, "body", GenHelper.wrapInLoop(SLinkOperations.getTarget(method, "body", true), parameterCopyBlock), true);
      }
    });
  }

  public static void mappingScript_CodeBlock_9009622095742619517(final IOperationContext operationContext, final MappingScriptContext _context) {
    Iterable<SNode> closures = ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), null)).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ListSequence.fromList(SNodeOperations.getDescendants(it, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, new String[]{})).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion"))) != null;
          }
        });
      }
    });

    Sequence.fromIterable(closures).visitAll(new IVisitor<SNode>() {
      public void visit(final SNode closure) {
        SNode lastNode = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(closure, "body", true), "statement", true)).last();
        if (GenHelper.checkLastNodeBeingOfCorrectKind(_context, lastNode)) {
          return;
        }

        final SNode invokeExpression = ListSequence.fromList(SNodeOperations.getDescendants(lastNode, "jetbrains.mps.baseLanguage.closures.structure.InvokeExpression", false, new String[]{})).last();
        final SNode containingStatementList = SNodeOperations.getAncestor(invokeExpression, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);

        GenHelper.checkPathForIncorrectNodes(_context, lastNode, invokeExpression);

        final SNode parameterCopyBlock = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null);
        ListSequence.fromList(SLinkOperations.getTargets(closure, "parameter", true)).visitAll(new IVisitor<SNode>() {
          public void visit(SNode param) {
            GenHelper.handleParameter(closure, containingStatementList, parameterCopyBlock, param, ListSequence.fromList(SLinkOperations.getTargets(invokeExpression, "parameter", true)).getElement(SNodeOperations.getIndexInParent(param)), _context);
          }
        });
        GenHelper.removeTailStatement(invokeExpression);

        SLinkOperations.setTarget(closure, "body", GenHelper.wrapInLoop(SLinkOperations.getTarget(closure, "body", true), parameterCopyBlock), true);
      }
    });
  }
}
