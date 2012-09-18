package jetbrains.mps.baseLanguage.memoize.util.caches;

/*Generated by MPS */

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUProtectionStorage extends LinkedHashMap<Object, Object> {
  private final int maxSize;

  public LRUProtectionStorage(final int maxSize) {
    super(maxSize, 0.75f, true);
    this.maxSize = maxSize;
  }

  @Override
  protected boolean removeEldestEntry(@SuppressWarnings(value = "rawtypes") final Map.Entry<Object, Object> eldest) {
    return size() > maxSize;
  }

  public synchronized void touch(final Object key, final Object value) {
    if (value == get(key)) {
      return;
    }
    remove(key);
    put(key, value);
  }

  @Override
  public Object clone() {
    return super.clone();
  }
}
