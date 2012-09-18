package jetbrains.mps.baseLanguage.memoize.util.caches;

/*Generated by MPS */


public final class KeyCalculator {
  private int acc = 0;

  public KeyCalculator() {
  }

  public void addKey(Object object) {
    if (acc == 0) {
      acc = calculateIndividualHash(object);
    } else {
      acc = 31 * acc + (calculateIndividualHash(object));
    }
  }

  public int getKey() {
    return acc;
  }

  private static int calculateIndividualHash(Object object) {
    return (object != null ?
      object.hashCode() :
      0
    );
  }
}