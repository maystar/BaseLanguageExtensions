package jetbrains.mps.baseLanguage.memoize.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MemoizeAnnotation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getRole_1262430001741497900(SAbstractConcept thisConcept) {
    return "memoized";
  }

  public static List<SNode> virtual_getAttributed_3044950653914717013(SAbstractConcept thisConcept) {
    List<SNode> result = BehaviorReflection.invokeSuperStatic((Class<List<SNode>>) ((Class) Object.class), thisConcept, "jetbrains.mps.lang.core.structure.NodeAttribute", "virtual_getAttributed_3044950653914717013", new Object[]{});
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)", "1199569711397"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)", "1068580123132"));
    return result;
  }
}
