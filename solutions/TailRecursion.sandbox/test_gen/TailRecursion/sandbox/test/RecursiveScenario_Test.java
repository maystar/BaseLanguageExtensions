package TailRecursion.sandbox.test;

/*Generated by MPS */

import junit.framework.TestCase;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public class RecursiveScenario_Test extends TestCase {
  public void test_sum() throws Exception {
    Assert.assertEquals(15, new TestCalculator().sum(0, 5));
    Assert.assertEquals(21, new TestCalculator().sum(0, 6));
  }

  public void test_sumS() throws Exception {
    Assert.assertEquals(15, TestCalculator.sumS(0, 5));
    Assert.assertEquals(21, TestCalculator.sumS(0, 6));
  }

  public void test_factorial() throws Exception {
    Assert.assertEquals(3628800, new TestCalculator().factorial(1L, 10));
    Assert.assertEquals(2432902008176640000L, new TestCalculator().factorial(1L, 20));
  }

  public void test_closure() throws Exception {
    _FunctionTypes._return_P2_E0<? extends Integer, ? super Integer, ? super Integer> fun = new _FunctionTypes._return_P2_E0<Integer, Integer, Integer>() {
      public Integer invoke(final Integer acc, final Integer n) {
        int localParam_6 = acc;
        int localParam_7 = n;
        while (true) {
          if (localParam_7 == 0) {
            return localParam_6;
          }
          localParam_6 = localParam_6 + localParam_7;
          localParam_7 = localParam_7 - 1;
        }
      }
    };
    Assert.assertEquals(Integer.valueOf(15), fun.invoke(0, 5));
    Assert.assertEquals(Integer.valueOf(21), fun.invoke(0, 6));
    Assert.assertTrue(15 == fun.invoke(0, 5));
    Assert.assertTrue(21 == fun.invoke(0, 6));
  }

  public void test_closureFactorial() throws Exception {
    _FunctionTypes._return_P2_E0<? extends Long, ? super Long, ? super Integer> factorial = new _FunctionTypes._return_P2_E0<Long, Long, Integer>() {
      public Long invoke(final Long acc, final Integer n) {
        long localParam_8 = acc;
        int localParam_9 = n;
        while (true) {
          if (localParam_9 == 1) {
            return localParam_8;
          } else if (false) {
            return 0L;
          } else {
            localParam_8 = localParam_8 * localParam_9;
            localParam_9 = localParam_9 - 1;
          }
        }
      }
    };
    Assert.assertTrue(3628800 == factorial.invoke(1L, 10));
    Assert.assertTrue(2432902008176640000L == factorial.invoke(1L, 20));
  }
}
