package jetbrains.mps.baseLanguage.tailRecursion.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.NodeAttribute_BehaviorDescriptor;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SConcept;

public class TailRecursion_BehaviorDescriptor extends NodeAttribute_BehaviorDescriptor {
  public TailRecursion_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getAttributed_3044950653914717013(SConcept thisConcept) {
    return TailRecursion_Behavior.virtual_getAttributed_3044950653914717013(thisConcept);
  }

  public String virtual_getRole_1262430001741497900(SConcept thisConcept) {
    return TailRecursion_Behavior.virtual_getRole_1262430001741497900(thisConcept);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.tailRecursion.structure.TailRecursion";
  }
}
