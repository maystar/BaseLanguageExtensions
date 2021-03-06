package jetbrains.mps.baseLanguage.memoize.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class MakeClosureMemoized_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public MakeClosureMemoized_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral";
  }

  public String getPresentation() {
    return "MakeClosureMemoized";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.memoize.intentions.MakeClosureMemoized_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.baseLanguage.memoize";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation"))) == null;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:73d9b7c1-7a0a-4715-9de3-9f81c22388bf(jetbrains.mps.baseLanguage.memoize.intentions)", "1742094376850085723");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new MakeClosureMemoized_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Make Closure Memoized";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.setNewAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation")), "jetbrains.mps.baseLanguage.memoize.structure.MemoizeAnnotation");
    }

    public IntentionDescriptor getDescriptor() {
      return MakeClosureMemoized_Intention.this;
    }
  }
}
