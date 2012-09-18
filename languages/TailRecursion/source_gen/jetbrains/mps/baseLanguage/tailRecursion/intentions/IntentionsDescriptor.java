package jetbrains.mps.baseLanguage.tailRecursion.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.baseLanguage.tailRecursion", "f142cd5e-ea1d-466a-86a8-52891b6256a4"), SModelReference.fromString("r:6df770e3-0000-4824-9d7d-6d58a2073987(jetbrains.mps.baseLanguage.tailRecursion.intentions)"));
  }

  public void init() {
    add(new MakeClosureRecursive_Intention(), "9009622095742619488");
    add(new MakeClosureTailRecursive_Intention(), "9009622095742619462");
    add(new MakeMethodRecursive_Intention(), "9009622095742579504");
    add(new MakeMethodTailRecursive_Intention(), "9009622095742545593");
  }
}
