/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 29 02:07:32 GMT 2024
 */

package com.williamfiset.algorithms.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.williamfiset.algorithms.math.SieveOfEratosthenes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SieveOfEratosthenes_ESTest extends SieveOfEratosthenes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.sieve(835);
      SieveOfEratosthenes sieveOfEratosthenes0 = new SieveOfEratosthenes();
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.sieve(835);
      SieveOfEratosthenes.sieve(3604);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      int int0 = 0;
      SieveOfEratosthenes.sieve(0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.main(stringArray0);
      SieveOfEratosthenes.sieve(1);
      // Undeclared exception!
      SieveOfEratosthenes.sieve(1781);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = SieveOfEratosthenes.sieve(0);
      assertEquals(0, intArray0.length);
      
      SieveOfEratosthenes sieveOfEratosthenes0 = new SieveOfEratosthenes();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SieveOfEratosthenes.sieve(2);
      SieveOfEratosthenes sieveOfEratosthenes0 = new SieveOfEratosthenes();
      String[] stringArray0 = new String[5];
      SieveOfEratosthenes.main(stringArray0);
      int[] intArray0 = SieveOfEratosthenes.sieve(2);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = SieveOfEratosthenes.sieve(3028);
      int[] intArray1 = SieveOfEratosthenes.sieve(0);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      SieveOfEratosthenes.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = SieveOfEratosthenes.sieve(29);
      assertEquals(9, intArray0.length);
      assertArrayEquals(new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23}, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SieveOfEratosthenes sieveOfEratosthenes0 = new SieveOfEratosthenes();
  }
}