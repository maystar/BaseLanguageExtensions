package jetbrains.mps.baseLanguage.memoize.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.baseLanguage.memoize", "9f9722b2-7c97-43c8-9771-bea4630e2676"), SModelReference.fromString("r:73d9b7c1-7a0a-4715-9de3-9f81c22388bf(jetbrains.mps.baseLanguage.memoize.intentions)"));
  }

  public void init() {
    add(new MakeClosureMemoized_Intention(), "1742094376850085723");
    add(new MakeClosureNotMemoized_Intention(), "1742094376850086002");
    add(new MakeMethodMemoized_Intention(), "1742094376849958750");
    add(new MakeMethodNotMemoized_Intention(), "1742094376850085849");
  }
}