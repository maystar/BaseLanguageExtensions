package jetbrains.mps.baseLanguage.memoize.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.generator.template.TemplateQueryContext;

@Generated
public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_3629985228611606137(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") && AttributeOperations.getAttribute(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
  }

  public static boolean baseMappingRule_Condition_5885889520400912649(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && AttributeOperations.getAttribute(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
  }

  public static boolean baseMappingRule_Condition_1020370389589189369(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return AttributeOperations.getAttribute(_context.getNode(), new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
  }

  public static boolean baseMappingRule_Condition_1020370389589004731(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral") && AttributeOperations.getAttribute(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
  }

  public static boolean baseMappingRule_Condition_1020370389589201655(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode ancestor = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false);
    return ancestor != null && AttributeOperations.getAttribute(ancestor, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
  }

  public static boolean baseMappingRule_Condition_5885889520400912311(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
  }

  public static boolean baseMappingRule_Condition_5885889520400912463(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
  }

  public static boolean baseMappingRule_Condition_1020370389589004433(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode ancestor = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false);
    return ancestor != null && AttributeOperations.getAttribute(ancestor, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null && (SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") || SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.FieldDeclaration", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_1020370389589215170(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode ancestor = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false);
    return ancestor != null && AttributeOperations.getAttribute(ancestor, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null && (SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") || SNodeOperations.getAncestor(ancestor, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration", false, false) != null);
  }

  public static Object propertyMacro_GetPropertyValue_9172390174097901142(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "sizeLimit");
  }

  public static Object propertyMacro_GetPropertyValue_1572979163263114581(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589004714(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "sizeLimit");
  }

  public static Object propertyMacro_GetPropertyValue_5885889520400912515(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589004723(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "sizeLimit");
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589004607(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589178096(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString() + "_Closure";
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589215228(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "sizeLimit");
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589215236(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1020370389589215463(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString() + "_Closure";
  }

  public static Object referenceMacro_GetReferent_1020370389589189493(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false)).toString() + "_Closure";
  }

  public static Object referenceMacro_GetReferent_1020370389589201905(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false)).toString() + "_Closure";
  }

  public static Object referenceMacro_GetReferent_5885889520400912918(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object referenceMacro_GetReferent_5885889520400912937(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object referenceMacro_GetReferent_5885889520400912956(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object referenceMacro_GetReferent_5885889520400912975(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)).toString();
  }

  public static Object referenceMacro_GetReferent_1020370389589005208(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString();
  }

  public static Object referenceMacro_GetReferent_1020370389589005326(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getSessionObject(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)).toString();
  }

  public static SNode sourceNodeQuery_1020370389589189510(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1572979163263067830(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_1572979163263075129(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_1572979163263075276(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1572979163263075340(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(_context.getNode());
  }

  public static SNode sourceNodeQuery_1572979163263068048(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_1572979163263085071(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_5885889520400912685(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_5885889520400912725(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_5885889520400912746(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_5885889520400912767(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(_context.getNode());
  }

  public static SNode sourceNodeQuery_5885889520400912802(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_5885889520400912841(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_1020370389589178300(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode closure = (SNode) ((Object) _context.getVariable("var:closure"));
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(closure), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_1020370389589005175(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_1020370389589005229(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral")), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_1020370389589005250(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1020370389589005271(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(_context.getNode());
  }

  public static SNode sourceNodeQuery_1020370389589005306(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", _context.getNode(), false);
    return ref;
  }

  public static SNode sourceNodeQuery_1020370389589005359(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral")), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static SNode sourceNodeQuery_1020370389589215410(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode closure = (SNode) ((Object) _context.getVariable("var:closure"));
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(closure), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true), "virtual_getBoxedType_1213877337320", new Object[]{});
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589201931(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1572979163263067847(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1572979163263075214(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1572979163263075329(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1572979163263075378(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "statement", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1572979163263068037(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_5885889520400912702(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_5885889520400912736(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_5885889520400912756(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_5885889520400912777(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "statement", true);
  }

  public static Iterable<SNode> sourceNodesQuery_5885889520400912791(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589178552(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode closure = (SNode) ((Object) _context.getVariable("var:closure"));
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(closure), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "parameterType", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), it, "virtual_getBoxedType_1213877337320", new Object[]{});
      }
    });
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589005192(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589005240(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589005260(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589005281(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "statement", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589005295(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false), "parameter", true);
  }

  public static Iterable<SNode> sourceNodesQuery_1020370389589215271(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode closure = (SNode) ((Object) _context.getVariable("var:closure"));
    return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(closure), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "parameterType", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), it, "virtual_getBoxedType_1213877337320", new Object[]{});
      }
    });
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1572979163263092451(final IOperationContext operationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_5885889520400912461(final IOperationContext operationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1020370389589004431(final IOperationContext operationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1020370389589215168(final IOperationContext operationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

  public static void mappingScript_CodeBlock_4821781367346984846(final IOperationContext operationContext, final MappingScriptContext _context) {
    Iterable<SNode> methods = ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), null)).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SNodeOperations.getDescendants(it, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, new String[]{});
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
      }
    });

    Sequence.fromIterable(methods).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
      }
    }).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        _context.showErrorMessage(it, "Memoized methods must not return void");
      }
    });

    Sequence.fromIterable(methods).visitAll(new IVisitor<SNode>() {
      public void visit(SNode method) {
        _context.putSessionObject(method, _context.createUniqueName("memoizedCache", null));
      }
    });

    Iterable<SNode> closures = ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), null)).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SNodeOperations.getDescendants(it, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, new String[]{});
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")) != null;
      }
    });

    Sequence.fromIterable(closures).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(it), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
      }
    }).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        _context.showErrorMessage(it, "Memoized closures must not return void");
      }
    });

    Sequence.fromIterable(closures).visitAll(new IVisitor<SNode>() {
      public void visit(SNode closure) {
        _context.putSessionObject(closure, _context.createUniqueName("memoizedCacheForClosures", null));
      }
    });

  }

  public static Object insertMacro_varValue_1020370389589178100(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false);
  }

  public static Object insertMacro_varValue_1020370389589215261(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false);
  }
}
