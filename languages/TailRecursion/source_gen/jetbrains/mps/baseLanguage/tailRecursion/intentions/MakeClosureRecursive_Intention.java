package jetbrains.mps.baseLanguage.tailRecursion.intentions;

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
import jetbrains.mps.intentions.IntentionDescriptor;

public class MakeClosureRecursive_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public MakeClosureRecursive_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral";
  }

  public String getPresentation() {
    return "MakeClosureRecursive";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.tailRecursion.intentions.MakeClosureRecursive_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.baseLanguage.tailRecursion";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion"))) != null;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:6df770e3-0000-4824-9d7d-6d58a2073987(jetbrains.mps.baseLanguage.tailRecursion.intentions)", "9009622095742619488");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new MakeClosureRecursive_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Make Closure Recursive";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion")), null);
    }

    public IntentionDescriptor getDescriptor() {
      return MakeClosureRecursive_Intention.this;
    }
  }
}
