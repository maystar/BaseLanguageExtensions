package jetbrains.mps.baseLanguage.memoize.sandbox.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.memoize.util.caches.KeyCalculator;
import jetbrains.mps.baseLanguage.memoize.util.caches.Memoizator;
import jetbrains.mps.baseLanguage.memoize.util.caches.NullValue;
import java.util.Map;

public class Calculator {
  public static int staticCounter = 0;
  public static _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> factorial = (memoizedCacheForClosures_4_Closure = new _FunctionTypes._return_P1_E0<Long, Integer>() {
    public Long invoke(final Integer n) {
      final KeyCalculator key = new KeyCalculator();
      key.addKey(n);
      Object value = Memoizator.retrieveFromCache(memoizedCacheForClosures_4, key);
      if (value == null) {
        final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
          public Long invoke(Integer n) {
            staticCounter += 1;
            if (n == 1) {
              return 1L;
            }
            return n * memoizedCacheForClosures_4_Closure.invoke(n - 1);
          }
        };
        final Object result = function.invoke(n);
        Memoizator.storeInCache(memoizedCacheForClosures_4, key, (result != null ?
          result :
          NullValue.NULL_CACHED_VALUE
        ));
        value = result;
      }
      return (value == NullValue.NULL_CACHED_VALUE ?
        null :
        (Long) value
      );
    }
  });
  private static Map<Integer, Object> memoizedCache_0 = Memoizator.buildMemoizeCache(0);
  private static Map<Integer, Object> memoizedCacheForClosures_4 = Memoizator.buildMemoizeCache(0);
  private static _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> memoizedCacheForClosures_4_Closure;

  private int counter = 0;
  public _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> instanceFactorial = (memoizedCacheForClosures_5_Closure = new _FunctionTypes._return_P1_E0<Long, Integer>() {
    public Long invoke(final Integer n) {
      final KeyCalculator key = new KeyCalculator();
      key.addKey(n);
      Object value = Memoizator.retrieveFromCache(memoizedCacheForClosures_5, key);
      if (value == null) {
        final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
          public Long invoke(Integer n) {
            counter += 1;
            if (n == 1) {
              return 1L;
            }
            return n * memoizedCacheForClosures_5_Closure.invoke(n - 1);
          }
        };
        final Object result = function.invoke(n);
        Memoizator.storeInCache(memoizedCacheForClosures_5, key, (result != null ?
          result :
          NullValue.NULL_CACHED_VALUE
        ));
        value = result;
      }
      return (value == NullValue.NULL_CACHED_VALUE ?
        null :
        (Long) value
      );
    }
  });
  private final Map<Integer, Object> memoizedCache_1 = Memoizator.buildMemoizeCache(0);
  private final Map<Integer, Object> memoizedCache_2 = Memoizator.buildMemoizeCache(2);
  private final Map<Integer, Object> memoizedCacheForClosures_5 = Memoizator.buildMemoizeCache(0);
  private _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> memoizedCacheForClosures_5_Closure;

  public Calculator() {
  }

  public int retrieveCounter() {
    return counter;
  }

  public Integer add(final int a, final int b) {
    final KeyCalculator key = new KeyCalculator();
    key.addKey(a);
    key.addKey(b);
    Object value = Memoizator.retrieveFromCache(memoizedCache_1, key);
    if (value == null) {
      final _FunctionTypes._return_P2_E0<? extends Integer, ? super Integer, ? super Integer> function = new _FunctionTypes._return_P2_E0<Integer, Integer, Integer>() {
        public Integer invoke(Integer a, Integer b) {
          counter += 1;
          return a + b;
        }
      };
      final Object result = function.invoke(a, b);
      Memoizator.storeInCache(memoizedCache_1, key, (result != null ?
        result :
        NullValue.NULL_CACHED_VALUE
      ));
      value = result;
    }
    return (value == NullValue.NULL_CACHED_VALUE ?
      null :
      (Integer) value
    );

  }

  public Long fibonacci(final int n) {
    final KeyCalculator key = new KeyCalculator();
    key.addKey(n);
    Object value = Memoizator.retrieveFromCache(memoizedCache_2, key);
    if (value == null) {
      final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
        public Long invoke(Integer n) {
          counter += 1;
          if (n <= 2) {
            return 1L;
          }
          return fibonacci(n - 2) + fibonacci(n - 1);
        }
      };
      final Object result = function.invoke(n);
      Memoizator.storeInCache(memoizedCache_2, key, (result != null ?
        result :
        NullValue.NULL_CACHED_VALUE
      ));
      value = result;
    }
    return (value == NullValue.NULL_CACHED_VALUE ?
      null :
      (Long) value
    );

  }

  public final Calculator.NestedCalculator createNestedCalculator() {
    return new Calculator.NestedCalculator();
  }

  public static Integer adds(final int a, final int b) {
    final KeyCalculator key = new KeyCalculator();
    key.addKey(a);
    key.addKey(b);
    Object value = Memoizator.retrieveFromCache(memoizedCache_0, key);
    if (value == null) {
      final _FunctionTypes._return_P2_E0<? extends Integer, ? super Integer, ? super Integer> function = new _FunctionTypes._return_P2_E0<Integer, Integer, Integer>() {
        public Integer invoke(Integer a, Integer b) {
          staticCounter += 1;
          return a + b;
        }
      };
      final Object result = function.invoke(a, b);
      Memoizator.storeInCache(memoizedCache_0, key, (result != null ?
        result :
        NullValue.NULL_CACHED_VALUE
      ));
      value = result;
    }
    return (value == NullValue.NULL_CACHED_VALUE ?
      null :
      (Integer) value
    );
  }

  public class NestedCalculator {
    public _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> nestedInstanceFactorial = (memoizedCacheForClosures_6_Closure = new _FunctionTypes._return_P1_E0<Long, Integer>() {
      public Long invoke(final Integer n) {
        final KeyCalculator key = new KeyCalculator();
        key.addKey(n);
        Object value = Memoizator.retrieveFromCache(memoizedCacheForClosures_6, key);
        if (value == null) {
          final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
            public Long invoke(Integer n) {
              counter += 1;
              if (n == 1) {
                return 1L;
              }
              return n * memoizedCacheForClosures_6_Closure.invoke(n - 1);
            }
          };
          final Object result = function.invoke(n);
          Memoizator.storeInCache(memoizedCacheForClosures_6, key, (result != null ?
            result :
            NullValue.NULL_CACHED_VALUE
          ));
          value = result;
        }
        return (value == NullValue.NULL_CACHED_VALUE ?
          null :
          (Long) value
        );
      }
    });
    private final Map<Integer, Object> memoizedCache_3 = Memoizator.buildMemoizeCache(2);
    private final Map<Integer, Object> memoizedCacheForClosures_6 = Memoizator.buildMemoizeCache(0);
    private _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> memoizedCacheForClosures_6_Closure;

    public NestedCalculator() {
    }

    public Long fibonacci(final int n) {
      final KeyCalculator key = new KeyCalculator();
      key.addKey(n);
      Object value = Memoizator.retrieveFromCache(memoizedCache_3, key);
      if (value == null) {
        final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
          public Long invoke(Integer n) {
            counter += 1;
            if (n <= 2) {
              return 1L;
            }
            return fibonacci(n - 2) + fibonacci(n - 1);
          }
        };
        final Object result = function.invoke(n);
        Memoizator.storeInCache(memoizedCache_3, key, (result != null ?
          result :
          NullValue.NULL_CACHED_VALUE
        ));
        value = result;
      }
      return (value == NullValue.NULL_CACHED_VALUE ?
        null :
        (Long) value
      );

    }
  }

  public static class StaticNestedCalculator {
    public static _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> factorial = (memoizedCacheForClosures_7_Closure = new _FunctionTypes._return_P1_E0<Long, Integer>() {
      public Long invoke(final Integer n) {
        final KeyCalculator key = new KeyCalculator();
        key.addKey(n);
        Object value = Memoizator.retrieveFromCache(memoizedCacheForClosures_7, key);
        if (value == null) {
          final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
            public Long invoke(Integer n) {
              Calculator.staticCounter += 1;
              if (n == 1) {
                return 1L;
              }
              return n * memoizedCacheForClosures_7_Closure.invoke(n - 1);
            }
          };
          final Object result = function.invoke(n);
          Memoizator.storeInCache(memoizedCacheForClosures_7, key, (result != null ?
            result :
            NullValue.NULL_CACHED_VALUE
          ));
          value = result;
        }
        return (value == NullValue.NULL_CACHED_VALUE ?
          null :
          (Long) value
        );
      }
    });
    private static Map<Integer, Object> memoizedCache_4 = Memoizator.buildMemoizeCache(0);
    private static Map<Integer, Object> memoizedCacheForClosures_7 = Memoizator.buildMemoizeCache(0);
    private static _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> memoizedCacheForClosures_7_Closure;

    private int counter;
    public _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> nestedInstanceFactorial = (memoizedCacheForClosures_8_Closure = new _FunctionTypes._return_P1_E0<Long, Integer>() {
      public Long invoke(final Integer n) {
        final KeyCalculator key = new KeyCalculator();
        key.addKey(n);
        Object value = Memoizator.retrieveFromCache(memoizedCacheForClosures_8, key);
        if (value == null) {
          final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
            public Long invoke(Integer n) {
              counter += 1;
              if (n == 1) {
                return 1L;
              }
              return n * memoizedCacheForClosures_8_Closure.invoke(n - 1);
            }
          };
          final Object result = function.invoke(n);
          Memoizator.storeInCache(memoizedCacheForClosures_8, key, (result != null ?
            result :
            NullValue.NULL_CACHED_VALUE
          ));
          value = result;
        }
        return (value == NullValue.NULL_CACHED_VALUE ?
          null :
          (Long) value
        );
      }
    });
    private final Map<Integer, Object> memoizedCache_5 = Memoizator.buildMemoizeCache(2);
    private final Map<Integer, Object> memoizedCacheForClosures_8 = Memoizator.buildMemoizeCache(0);
    private _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> memoizedCacheForClosures_8_Closure;

    public StaticNestedCalculator() {
    }

    public Long fibonacci(final int n) {
      final KeyCalculator key = new KeyCalculator();
      key.addKey(n);
      Object value = Memoizator.retrieveFromCache(memoizedCache_5, key);
      if (value == null) {
        final _FunctionTypes._return_P1_E0<? extends Long, ? super Integer> function = new _FunctionTypes._return_P1_E0<Long, Integer>() {
          public Long invoke(Integer n) {
            counter += 1;
            if (n <= 2) {
              return 1L;
            }
            return fibonacci(n - 2) + fibonacci(n - 1);
          }
        };
        final Object result = function.invoke(n);
        Memoizator.storeInCache(memoizedCache_5, key, (result != null ?
          result :
          NullValue.NULL_CACHED_VALUE
        ));
        value = result;
      }
      return (value == NullValue.NULL_CACHED_VALUE ?
        null :
        (Long) value
      );

    }

    public int retrieveCounter() {
      return counter;
    }

    public static Integer adds(final int a, final int b) {
      final KeyCalculator key = new KeyCalculator();
      key.addKey(a);
      key.addKey(b);
      Object value = Memoizator.retrieveFromCache(memoizedCache_4, key);
      if (value == null) {
        final _FunctionTypes._return_P2_E0<? extends Integer, ? super Integer, ? super Integer> function = new _FunctionTypes._return_P2_E0<Integer, Integer, Integer>() {
          public Integer invoke(Integer a, Integer b) {
            Calculator.staticCounter += 1;
            return a + b;
          }
        };
        final Object result = function.invoke(a, b);
        Memoizator.storeInCache(memoizedCache_4, key, (result != null ?
          result :
          NullValue.NULL_CACHED_VALUE
        ));
        value = result;
      }
      return (value == NullValue.NULL_CACHED_VALUE ?
        null :
        (Integer) value
      );
    }
  }
}
