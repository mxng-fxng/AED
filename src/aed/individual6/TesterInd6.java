
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2025/11/20 -- 21:37:15
// Seed: {1763,671033,902320}
//
//////////////////////////////////////////////////////////////////////



package aed.individual6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.set.*;
import es.upm.aedlib.tree.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd6 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(100,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,13,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_001 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_001")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_001")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_002")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_0 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1 = tree_0.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree_0.insertRight(root_1,49) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree_0.insertLeft(pos_2,4) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree_0.insertRight(pos_3,22) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree_0.insertLeft(pos_4,19) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree_0.insertLeft(pos_5,6) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree_0.insertRight(pos_6,7) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree_0.insertRight(pos_7,17) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree_0.insertRight(pos_4,34) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree_0.insertLeft(pos_9,30) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree_0.insertRight(pos_10,31) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree_0.insertRight(pos_9,41) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree_0.insertRight(pos_2,50) ;
  ok_sofar = new IsBinarySearchTree(tree_0).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_002")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_003")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_14 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_15 = tree_14.addRoot(2) ;
  es.upm.aedlib.Position<Integer> pos_16 = tree_14.insertRight(root_15,11) ;
  es.upm.aedlib.Position<Integer> pos_17 = tree_14.insertLeft(pos_16,5) ;
  es.upm.aedlib.Position<Integer> pos_18 = tree_14.insertRight(pos_17,10) ;
  es.upm.aedlib.Position<Integer> pos_19 = tree_14.insertRight(pos_16,24) ;
  es.upm.aedlib.Position<Integer> pos_20 = tree_14.insertLeft(pos_19,23) ;
  es.upm.aedlib.Position<Integer> pos_21 = tree_14.insertRight(pos_19,38) ;
  ok_sofar = new IsBinarySearchTree(tree_14).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_003")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_004")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_22 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_23 = tree_22.addRoot(3) ;
  es.upm.aedlib.Position<Integer> pos_24 = tree_22.insertLeft(root_23,1) ;
  es.upm.aedlib.Position<Integer> pos_25 = tree_22.insertRight(root_23,8) ;
  es.upm.aedlib.Position<Integer> pos_26 = tree_22.insertRight(pos_25,50) ;
  es.upm.aedlib.Position<Integer> pos_27 = tree_22.insertLeft(pos_26,32) ;
  es.upm.aedlib.Position<Integer> pos_28 = tree_22.insertLeft(pos_27,26) ;
  es.upm.aedlib.Position<Integer> pos_29 = tree_22.insertLeft(pos_28,21) ;
  es.upm.aedlib.Position<Integer> pos_30 = tree_22.insertLeft(pos_29,50000) ;
  es.upm.aedlib.Position<Integer> pos_31 = tree_22.insertLeft(pos_30,12) ;
  es.upm.aedlib.Position<Integer> pos_32 = tree_22.insertRight(pos_29,22) ;
  ok_sofar = new IsBinarySearchTree(tree_22).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_004")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_005")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_33 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_34 = tree_33.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_35 = tree_33.insertRight(root_34,13) ;
  es.upm.aedlib.Position<Integer> pos_36 = tree_33.insertRight(pos_35,50) ;
  es.upm.aedlib.Position<Integer> pos_37 = tree_33.insertLeft(pos_36,24) ;
  es.upm.aedlib.Position<Integer> pos_38 = tree_33.insertRight(pos_37,34) ;
  es.upm.aedlib.Position<Integer> pos_39 = tree_33.insertLeft(pos_38,29) ;
  es.upm.aedlib.Position<Integer> pos_40 = tree_33.insertRight(pos_38,45) ;
  es.upm.aedlib.Position<Integer> pos_41 = tree_33.insertLeft(pos_40,41) ;
  ok_sofar = new IsBinarySearchTree(tree_33).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_005")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_006")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_42 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_43 = tree_42.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_44 = tree_42.insertRight(root_43,28) ;
  es.upm.aedlib.Position<Integer> pos_45 = tree_42.insertLeft(pos_44,18) ;
  es.upm.aedlib.Position<Integer> pos_46 = tree_42.insertRight(pos_44,31) ;
  ok_sofar = new IsBinarySearchTree(tree_42).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_006")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_007")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_47 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_48 = tree_47.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_49 = tree_47.insertRight(root_48,44) ;
  es.upm.aedlib.Position<Integer> pos_50 = tree_47.insertLeft(pos_49,20) ;
  es.upm.aedlib.Position<Integer> pos_51 = tree_47.insertLeft(pos_50,14) ;
  es.upm.aedlib.Position<Integer> pos_52 = tree_47.insertLeft(pos_51,9) ;
  es.upm.aedlib.Position<Integer> pos_53 = tree_47.insertLeft(pos_52,8) ;
  es.upm.aedlib.Position<Integer> pos_54 = tree_47.insertRight(pos_50,41) ;
  es.upm.aedlib.Position<Integer> pos_55 = tree_47.insertLeft(pos_54,27) ;
  es.upm.aedlib.Position<Integer> pos_56 = tree_47.insertRight(pos_55,31) ;
  es.upm.aedlib.Position<Integer> pos_57 = tree_47.insertRight(pos_54,42) ;
  es.upm.aedlib.Position<Integer> pos_58 = tree_47.insertRight(pos_49,47) ;
  es.upm.aedlib.Position<Integer> pos_59 = tree_47.insertLeft(pos_58,46) ;
  es.upm.aedlib.Position<Integer> pos_60 = tree_47.insertRight(pos_58,48) ;
  ok_sofar = new IsBinarySearchTree(tree_47).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_007")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_008")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_61 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_62 = tree_61.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_63 = tree_61.insertRight(root_62,49) ;
  es.upm.aedlib.Position<Integer> pos_64 = tree_61.insertLeft(pos_63,47) ;
  ok_sofar = new IsBinarySearchTree(tree_61).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_008")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_009")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_65 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_66 = tree_65.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_67 = tree_65.insertLeft(root_66,3) ;
  es.upm.aedlib.Position<Integer> pos_68 = tree_65.insertRight(root_66,30) ;
  es.upm.aedlib.Position<Integer> pos_69 = tree_65.insertLeft(pos_68,17) ;
  es.upm.aedlib.Position<Integer> pos_70 = tree_65.insertRight(pos_68,32) ;
  es.upm.aedlib.Position<Integer> pos_71 = tree_65.insertLeft(pos_70,31) ;
  es.upm.aedlib.Position<Integer> pos_72 = tree_65.insertRight(pos_70,-50000) ;
  ok_sofar = new IsBinarySearchTree(tree_65).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_009")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_010")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_73 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_74 = tree_73.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_75 = tree_73.insertRight(root_74,18) ;
  es.upm.aedlib.Position<Integer> pos_76 = tree_73.insertRight(pos_75,37) ;
  es.upm.aedlib.Position<Integer> pos_77 = tree_73.insertLeft(pos_76,20) ;
  ok_sofar = new IsBinarySearchTree(tree_73).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_010")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_011")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_78 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_79 = tree_78.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_80 = tree_78.insertLeft(root_79,5) ;
  es.upm.aedlib.Position<Integer> pos_81 = tree_78.insertRight(root_79,48) ;
  es.upm.aedlib.Position<Integer> pos_82 = tree_78.insertLeft(pos_81,36) ;
  es.upm.aedlib.Position<Integer> pos_83 = tree_78.insertLeft(pos_82,32) ;
  es.upm.aedlib.Position<Integer> pos_84 = tree_78.insertLeft(pos_83,22) ;
  es.upm.aedlib.Position<Integer> pos_85 = tree_78.insertLeft(pos_84,20) ;
  es.upm.aedlib.Position<Integer> pos_86 = tree_78.insertRight(pos_84,31) ;
  es.upm.aedlib.Position<Integer> pos_87 = tree_78.insertRight(pos_83,35) ;
  es.upm.aedlib.Position<Integer> pos_88 = tree_78.insertLeft(pos_87,33) ;
  es.upm.aedlib.Position<Integer> pos_89 = tree_78.insertRight(pos_88,34) ;
  es.upm.aedlib.Position<Integer> pos_90 = tree_78.insertRight(pos_81,50) ;
  ok_sofar = new IsBinarySearchTree(tree_78).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_011")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_012")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_91 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_92 = tree_91.addRoot(9) ;
  es.upm.aedlib.Position<Integer> pos_93 = tree_91.insertRight(root_92,42) ;
  es.upm.aedlib.Position<Integer> pos_94 = tree_91.insertLeft(pos_93,22) ;
  ok_sofar = new IsBinarySearchTree(tree_91).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_012")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_013")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_95 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_96 = tree_95.addRoot(10) ;
  ok_sofar = new IsBinarySearchTree(tree_95).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_013")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_014")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_97 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_98 = tree_97.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_99 = tree_97.insertRight(root_98,27) ;
  es.upm.aedlib.Position<Integer> pos_100 = tree_97.insertRight(pos_99,41) ;
  ok_sofar = new IsBinarySearchTree(tree_97).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_014")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_015")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_101 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_102 = tree_101.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_103 = tree_101.insertLeft(root_102,10) ;
  es.upm.aedlib.Position<Integer> pos_104 = tree_101.insertRight(root_102,40) ;
  es.upm.aedlib.Position<Integer> pos_105 = tree_101.insertLeft(pos_104,23) ;
  es.upm.aedlib.Position<Integer> pos_106 = tree_101.insertLeft(pos_105,-50000) ;
  es.upm.aedlib.Position<Integer> pos_107 = tree_101.insertRight(pos_106,15) ;
  es.upm.aedlib.Position<Integer> pos_108 = tree_101.insertRight(pos_105,28) ;
  es.upm.aedlib.Position<Integer> pos_109 = tree_101.insertRight(pos_108,35) ;
  es.upm.aedlib.Position<Integer> pos_110 = tree_101.insertRight(pos_104,48) ;
  es.upm.aedlib.Position<Integer> pos_111 = tree_101.insertLeft(pos_110,43) ;
  es.upm.aedlib.Position<Integer> pos_112 = tree_101.insertRight(pos_111,47) ;
  ok_sofar = new IsBinarySearchTree(tree_101).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_015")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_016")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_113 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_114 = tree_113.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_115 = tree_113.insertLeft(root_114,8) ;
  es.upm.aedlib.Position<Integer> pos_116 = tree_113.insertRight(root_114,35) ;
  es.upm.aedlib.Position<Integer> pos_117 = tree_113.insertLeft(pos_116,32) ;
  es.upm.aedlib.Position<Integer> pos_118 = tree_113.insertRight(pos_116,42) ;
  ok_sofar = new IsBinarySearchTree(tree_113).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_016")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_017")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_119 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_120 = tree_119.addRoot(13) ;
  es.upm.aedlib.Position<Integer> pos_121 = tree_119.insertRight(root_120,46) ;
  es.upm.aedlib.Position<Integer> pos_122 = tree_119.insertLeft(pos_121,21) ;
  es.upm.aedlib.Position<Integer> pos_123 = tree_119.insertRight(pos_122,22) ;
  es.upm.aedlib.Position<Integer> pos_124 = tree_119.insertRight(pos_121,49) ;
  ok_sofar = new IsBinarySearchTree(tree_119).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_017")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_018")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_125 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_126 = tree_125.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_127 = tree_125.insertLeft(root_126,6) ;
  es.upm.aedlib.Position<Integer> pos_128 = tree_125.insertRight(root_126,47) ;
  es.upm.aedlib.Position<Integer> pos_129 = tree_125.insertLeft(pos_128,25) ;
  es.upm.aedlib.Position<Integer> pos_130 = tree_125.insertLeft(pos_129,22) ;
  es.upm.aedlib.Position<Integer> pos_131 = tree_125.insertRight(pos_129,32) ;
  es.upm.aedlib.Position<Integer> pos_132 = tree_125.insertLeft(pos_131,29) ;
  es.upm.aedlib.Position<Integer> pos_133 = tree_125.insertLeft(pos_132,28) ;
  es.upm.aedlib.Position<Integer> pos_134 = tree_125.insertRight(pos_131,34) ;
  es.upm.aedlib.Position<Integer> pos_135 = tree_125.insertRight(pos_128,49) ;
  ok_sofar = new IsBinarySearchTree(tree_125).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_018")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_019")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_136 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_137 = tree_136.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_138 = tree_136.insertLeft(root_137,12) ;
  es.upm.aedlib.Position<Integer> pos_139 = tree_136.insertLeft(pos_138,9) ;
  es.upm.aedlib.Position<Integer> pos_140 = tree_136.insertRight(pos_139,10) ;
  es.upm.aedlib.Position<Integer> pos_141 = tree_136.insertRight(root_137,26) ;
  es.upm.aedlib.Position<Integer> pos_142 = tree_136.insertRight(pos_141,31) ;
  es.upm.aedlib.Position<Integer> pos_143 = tree_136.insertRight(pos_142,40) ;
  ok_sofar = new IsBinarySearchTree(tree_136).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_019")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_020")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_144 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_145 = tree_144.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_146 = tree_144.insertLeft(root_145,2) ;
  es.upm.aedlib.Position<Integer> pos_147 = tree_144.insertLeft(pos_146,1) ;
  es.upm.aedlib.Position<Integer> pos_148 = tree_144.insertRight(pos_146,6) ;
  es.upm.aedlib.Position<Integer> pos_149 = tree_144.insertRight(root_145,43) ;
  es.upm.aedlib.Position<Integer> pos_150 = tree_144.insertLeft(pos_149,30) ;
  es.upm.aedlib.Position<Integer> pos_151 = tree_144.insertLeft(pos_150,21) ;
  es.upm.aedlib.Position<Integer> pos_152 = tree_144.insertLeft(pos_151,17) ;
  es.upm.aedlib.Position<Integer> pos_153 = tree_144.insertRight(pos_152,19) ;
  es.upm.aedlib.Position<Integer> pos_154 = tree_144.insertRight(pos_151,29) ;
  es.upm.aedlib.Position<Integer> pos_155 = tree_144.insertLeft(pos_154,26) ;
  es.upm.aedlib.Position<Integer> pos_156 = tree_144.insertRight(pos_150,31) ;
  es.upm.aedlib.Position<Integer> pos_157 = tree_144.insertRight(pos_156,36) ;
  es.upm.aedlib.Position<Integer> pos_158 = tree_144.insertRight(pos_157,38) ;
  es.upm.aedlib.Position<Integer> pos_159 = tree_144.insertRight(pos_149,48) ;
  es.upm.aedlib.Position<Integer> pos_160 = tree_144.insertLeft(pos_159,44) ;
  ok_sofar = new IsBinarySearchTree(tree_144).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_020")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_021")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_161 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_162 = tree_161.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_163 = tree_161.insertLeft(root_162,5) ;
  es.upm.aedlib.Position<Integer> pos_164 = tree_161.insertLeft(pos_163,2) ;
  es.upm.aedlib.Position<Integer> pos_165 = tree_161.insertRight(pos_163,9) ;
  es.upm.aedlib.Position<Integer> pos_166 = tree_161.insertLeft(pos_165,6) ;
  es.upm.aedlib.Position<Integer> pos_167 = tree_161.insertRight(pos_165,15) ;
  es.upm.aedlib.Position<Integer> pos_168 = tree_161.insertRight(root_162,47) ;
  es.upm.aedlib.Position<Integer> pos_169 = tree_161.insertLeft(pos_168,40) ;
  es.upm.aedlib.Position<Integer> pos_170 = tree_161.insertLeft(pos_169,22) ;
  es.upm.aedlib.Position<Integer> pos_171 = tree_161.insertRight(pos_168,49) ;
  ok_sofar = new IsBinarySearchTree(tree_161).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_021")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_022")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_172 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_173 = tree_172.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_174 = tree_172.insertLeft(root_173,10) ;
  es.upm.aedlib.Position<Integer> pos_175 = tree_172.insertLeft(pos_174,8) ;
  es.upm.aedlib.Position<Integer> pos_176 = tree_172.insertLeft(pos_175,50000) ;
  es.upm.aedlib.Position<Integer> pos_177 = tree_172.insertLeft(pos_176,3) ;
  es.upm.aedlib.Position<Integer> pos_178 = tree_172.insertRight(root_173,43) ;
  es.upm.aedlib.Position<Integer> pos_179 = tree_172.insertLeft(pos_178,38) ;
  es.upm.aedlib.Position<Integer> pos_180 = tree_172.insertLeft(pos_179,21) ;
  es.upm.aedlib.Position<Integer> pos_181 = tree_172.insertLeft(pos_180,20) ;
  es.upm.aedlib.Position<Integer> pos_182 = tree_172.insertRight(pos_180,22) ;
  es.upm.aedlib.Position<Integer> pos_183 = tree_172.insertRight(pos_182,25) ;
  es.upm.aedlib.Position<Integer> pos_184 = tree_172.insertRight(pos_183,36) ;
  es.upm.aedlib.Position<Integer> pos_185 = tree_172.insertLeft(pos_184,28) ;
  es.upm.aedlib.Position<Integer> pos_186 = tree_172.insertRight(pos_178,50) ;
  ok_sofar = new IsBinarySearchTree(tree_172).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_022")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_023")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_187 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_188 = tree_187.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_189 = tree_187.insertLeft(root_188,7) ;
  es.upm.aedlib.Position<Integer> pos_190 = tree_187.insertRight(root_188,48) ;
  es.upm.aedlib.Position<Integer> pos_191 = tree_187.insertLeft(pos_190,22) ;
  es.upm.aedlib.Position<Integer> pos_192 = tree_187.insertRight(pos_191,25) ;
  ok_sofar = new IsBinarySearchTree(tree_187).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_023")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_024")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_193 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_194 = tree_193.addRoot(24) ;
  es.upm.aedlib.Position<Integer> pos_195 = tree_193.insertLeft(root_194,14) ;
  es.upm.aedlib.Position<Integer> pos_196 = tree_193.insertLeft(pos_195,2) ;
  es.upm.aedlib.Position<Integer> pos_197 = tree_193.insertRight(pos_195,23) ;
  es.upm.aedlib.Position<Integer> pos_198 = tree_193.insertRight(root_194,40) ;
  es.upm.aedlib.Position<Integer> pos_199 = tree_193.insertLeft(pos_198,29) ;
  es.upm.aedlib.Position<Integer> pos_200 = tree_193.insertLeft(pos_199,27) ;
  es.upm.aedlib.Position<Integer> pos_201 = tree_193.insertRight(pos_199,38) ;
  es.upm.aedlib.Position<Integer> pos_202 = tree_193.insertRight(pos_198,50) ;
  ok_sofar = new IsBinarySearchTree(tree_193).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_024")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_025")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_203 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_204 = tree_203.addRoot(24) ;
  es.upm.aedlib.Position<Integer> pos_205 = tree_203.insertLeft(root_204,19) ;
  es.upm.aedlib.Position<Integer> pos_206 = tree_203.insertLeft(pos_205,11) ;
  es.upm.aedlib.Position<Integer> pos_207 = tree_203.insertRight(root_204,40) ;
  es.upm.aedlib.Position<Integer> pos_208 = tree_203.insertLeft(pos_207,36) ;
  es.upm.aedlib.Position<Integer> pos_209 = tree_203.insertLeft(pos_208,33) ;
  es.upm.aedlib.Position<Integer> pos_210 = tree_203.insertRight(pos_208,39) ;
  es.upm.aedlib.Position<Integer> pos_211 = tree_203.insertLeft(pos_210,37) ;
  ok_sofar = new IsBinarySearchTree(tree_203).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_025")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_026")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_212 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_213 = tree_212.addRoot(25) ;
  ok_sofar = new IsBinarySearchTree(tree_212).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_026")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_027")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_214 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_215 = tree_214.addRoot(25) ;
  es.upm.aedlib.Position<Integer> pos_216 = tree_214.insertLeft(root_215,9) ;
  es.upm.aedlib.Position<Integer> pos_217 = tree_214.insertLeft(pos_216,3) ;
  es.upm.aedlib.Position<Integer> pos_218 = tree_214.insertLeft(pos_217,2) ;
  es.upm.aedlib.Position<Integer> pos_219 = tree_214.insertRight(pos_217,8) ;
  es.upm.aedlib.Position<Integer> pos_220 = tree_214.insertLeft(pos_219,50000) ;
  es.upm.aedlib.Position<Integer> pos_221 = tree_214.insertRight(pos_216,19) ;
  es.upm.aedlib.Position<Integer> pos_222 = tree_214.insertLeft(pos_221,-50000) ;
  es.upm.aedlib.Position<Integer> pos_223 = tree_214.insertRight(pos_222,12) ;
  es.upm.aedlib.Position<Integer> pos_224 = tree_214.insertRight(root_215,40) ;
  es.upm.aedlib.Position<Integer> pos_225 = tree_214.insertLeft(pos_224,27) ;
  es.upm.aedlib.Position<Integer> pos_226 = tree_214.insertRight(pos_225,28) ;
  es.upm.aedlib.Position<Integer> pos_227 = tree_214.insertRight(pos_226,34) ;
  es.upm.aedlib.Position<Integer> pos_228 = tree_214.insertRight(pos_224,42) ;
  ok_sofar = new IsBinarySearchTree(tree_214).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_027")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_028")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_229 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_230 = tree_229.addRoot(25) ;
  es.upm.aedlib.Position<Integer> pos_231 = tree_229.insertLeft(root_230,19) ;
  es.upm.aedlib.Position<Integer> pos_232 = tree_229.insertRight(root_230,47) ;
  es.upm.aedlib.Position<Integer> pos_233 = tree_229.insertLeft(pos_232,42) ;
  es.upm.aedlib.Position<Integer> pos_234 = tree_229.insertLeft(pos_233,40) ;
  es.upm.aedlib.Position<Integer> pos_235 = tree_229.insertLeft(pos_234,27) ;
  es.upm.aedlib.Position<Integer> pos_236 = tree_229.insertRight(pos_235,29) ;
  es.upm.aedlib.Position<Integer> pos_237 = tree_229.insertRight(pos_232,48) ;
  ok_sofar = new IsBinarySearchTree(tree_229).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_028")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_029")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_238 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_239 = tree_238.addRoot(26) ;
  es.upm.aedlib.Position<Integer> pos_240 = tree_238.insertLeft(root_239,2) ;
  ok_sofar = new IsBinarySearchTree(tree_238).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_029")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_030")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_241 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_242 = tree_241.addRoot(27) ;
  es.upm.aedlib.Position<Integer> pos_243 = tree_241.insertLeft(root_242,17) ;
  es.upm.aedlib.Position<Integer> pos_244 = tree_241.insertLeft(pos_243,6) ;
  es.upm.aedlib.Position<Integer> pos_245 = tree_241.insertRight(pos_244,7) ;
  es.upm.aedlib.Position<Integer> pos_246 = tree_241.insertRight(pos_243,26) ;
  es.upm.aedlib.Position<Integer> pos_247 = tree_241.insertLeft(pos_246,24) ;
  es.upm.aedlib.Position<Integer> pos_248 = tree_241.insertRight(root_242,-50000) ;
  es.upm.aedlib.Position<Integer> pos_249 = tree_241.insertLeft(pos_248,39) ;
  ok_sofar = new IsBinarySearchTree(tree_241).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_030")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_031")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_250 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_251 = tree_250.addRoot(27) ;
  es.upm.aedlib.Position<Integer> pos_252 = tree_250.insertLeft(root_251,18) ;
  es.upm.aedlib.Position<Integer> pos_253 = tree_250.insertLeft(pos_252,5) ;
  es.upm.aedlib.Position<Integer> pos_254 = tree_250.insertRight(root_251,50) ;
  es.upm.aedlib.Position<Integer> pos_255 = tree_250.insertLeft(pos_254,47) ;
  ok_sofar = new IsBinarySearchTree(tree_250).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_031")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_032 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_032")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_256 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_257 = tree_256.addRoot(28) ;
  es.upm.aedlib.Position<Integer> pos_258 = tree_256.insertLeft(root_257,18) ;
  ok_sofar = new IsBinarySearchTree(tree_256).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_032")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_033 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_033")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_259 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_260 = tree_259.addRoot(30) ;
  es.upm.aedlib.Position<Integer> pos_261 = tree_259.insertLeft(root_260,16) ;
  es.upm.aedlib.Position<Integer> pos_262 = tree_259.insertLeft(pos_261,2) ;
  es.upm.aedlib.Position<Integer> pos_263 = tree_259.insertRight(pos_262,7) ;
  es.upm.aedlib.Position<Integer> pos_264 = tree_259.insertRight(pos_263,14) ;
  es.upm.aedlib.Position<Integer> pos_265 = tree_259.insertLeft(pos_264,8) ;
  es.upm.aedlib.Position<Integer> pos_266 = tree_259.insertRight(pos_261,20) ;
  es.upm.aedlib.Position<Integer> pos_267 = tree_259.insertLeft(pos_266,18) ;
  es.upm.aedlib.Position<Integer> pos_268 = tree_259.insertRight(pos_266,27) ;
  es.upm.aedlib.Position<Integer> pos_269 = tree_259.insertRight(pos_268,29) ;
  es.upm.aedlib.Position<Integer> pos_270 = tree_259.insertRight(root_260,44) ;
  es.upm.aedlib.Position<Integer> pos_271 = tree_259.insertLeft(pos_270,39) ;
  es.upm.aedlib.Position<Integer> pos_272 = tree_259.insertLeft(pos_271,38) ;
  es.upm.aedlib.Position<Integer> pos_273 = tree_259.insertRight(pos_270,45) ;
  es.upm.aedlib.Position<Integer> pos_274 = tree_259.insertRight(pos_273,50) ;
  ok_sofar = new IsBinarySearchTree(tree_259).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_033")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_034 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_034")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_275 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_276 = tree_275.addRoot(33) ;
  es.upm.aedlib.Position<Integer> pos_277 = tree_275.insertLeft(root_276,29) ;
  es.upm.aedlib.Position<Integer> pos_278 = tree_275.insertLeft(pos_277,25) ;
  es.upm.aedlib.Position<Integer> pos_279 = tree_275.insertLeft(pos_278,3) ;
  es.upm.aedlib.Position<Integer> pos_280 = tree_275.insertLeft(pos_279,1) ;
  es.upm.aedlib.Position<Integer> pos_281 = tree_275.insertRight(pos_279,13) ;
  es.upm.aedlib.Position<Integer> pos_282 = tree_275.insertRight(pos_281,17) ;
  es.upm.aedlib.Position<Integer> pos_283 = tree_275.insertRight(pos_278,26) ;
  es.upm.aedlib.Position<Integer> pos_284 = tree_275.insertRight(root_276,41) ;
  es.upm.aedlib.Position<Integer> pos_285 = tree_275.insertRight(pos_284,42) ;
  ok_sofar = new IsBinarySearchTree(tree_275).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_034")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_035 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_035")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_286 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_287 = tree_286.addRoot(37) ;
  es.upm.aedlib.Position<Integer> pos_288 = tree_286.insertLeft(root_287,8) ;
  es.upm.aedlib.Position<Integer> pos_289 = tree_286.insertLeft(pos_288,6) ;
  es.upm.aedlib.Position<Integer> pos_290 = tree_286.insertRight(pos_288,29) ;
  ok_sofar = new IsBinarySearchTree(tree_286).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_035")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_036 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_036")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_291 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_292 = tree_291.addRoot(37) ;
  es.upm.aedlib.Position<Integer> pos_293 = tree_291.insertLeft(root_292,15) ;
  es.upm.aedlib.Position<Integer> pos_294 = tree_291.insertRight(pos_293,19) ;
  es.upm.aedlib.Position<Integer> pos_295 = tree_291.insertLeft(pos_294,17) ;
  es.upm.aedlib.Position<Integer> pos_296 = tree_291.insertLeft(pos_295,16) ;
  es.upm.aedlib.Position<Integer> pos_297 = tree_291.insertRight(pos_295,18) ;
  es.upm.aedlib.Position<Integer> pos_298 = tree_291.insertRight(pos_294,27) ;
  es.upm.aedlib.Position<Integer> pos_299 = tree_291.insertLeft(pos_298,24) ;
  es.upm.aedlib.Position<Integer> pos_300 = tree_291.insertRight(pos_299,25) ;
  es.upm.aedlib.Position<Integer> pos_301 = tree_291.insertRight(pos_298,33) ;
  es.upm.aedlib.Position<Integer> pos_302 = tree_291.insertLeft(pos_301,29) ;
  es.upm.aedlib.Position<Integer> pos_303 = tree_291.insertRight(pos_301,34) ;
  es.upm.aedlib.Position<Integer> pos_304 = tree_291.insertRight(root_292,40) ;
  es.upm.aedlib.Position<Integer> pos_305 = tree_291.insertRight(pos_304,41) ;
  es.upm.aedlib.Position<Integer> pos_306 = tree_291.insertRight(pos_305,44) ;
  es.upm.aedlib.Position<Integer> pos_307 = tree_291.insertRight(pos_306,45) ;
  ok_sofar = new IsBinarySearchTree(tree_291).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_036")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_037 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_037")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_308 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_309 = tree_308.addRoot(39) ;
  es.upm.aedlib.Position<Integer> pos_310 = tree_308.insertLeft(root_309,17) ;
  es.upm.aedlib.Position<Integer> pos_311 = tree_308.insertLeft(pos_310,3) ;
  ok_sofar = new IsBinarySearchTree(tree_308).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_037")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_038 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_038")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_312 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_313 = tree_312.addRoot(39) ;
  es.upm.aedlib.Position<Integer> pos_314 = tree_312.insertLeft(root_313,24) ;
  es.upm.aedlib.Position<Integer> pos_315 = tree_312.insertLeft(pos_314,7) ;
  es.upm.aedlib.Position<Integer> pos_316 = tree_312.insertRight(pos_315,13) ;
  es.upm.aedlib.Position<Integer> pos_317 = tree_312.insertLeft(pos_316,8) ;
  es.upm.aedlib.Position<Integer> pos_318 = tree_312.insertRight(pos_316,18) ;
  es.upm.aedlib.Position<Integer> pos_319 = tree_312.insertRight(pos_318,20) ;
  es.upm.aedlib.Position<Integer> pos_320 = tree_312.insertRight(pos_314,28) ;
  es.upm.aedlib.Position<Integer> pos_321 = tree_312.insertRight(pos_320,38) ;
  es.upm.aedlib.Position<Integer> pos_322 = tree_312.insertLeft(pos_321,33) ;
  es.upm.aedlib.Position<Integer> pos_323 = tree_312.insertRight(root_313,50) ;
  es.upm.aedlib.Position<Integer> pos_324 = tree_312.insertLeft(pos_323,43) ;
  es.upm.aedlib.Position<Integer> pos_325 = tree_312.insertRight(pos_324,45) ;
  ok_sofar = new IsBinarySearchTree(tree_312).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_038")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_039 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_039")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_326 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_327 = tree_326.addRoot(39) ;
  es.upm.aedlib.Position<Integer> pos_328 = tree_326.insertLeft(root_327,28) ;
  es.upm.aedlib.Position<Integer> pos_329 = tree_326.insertLeft(pos_328,22) ;
  ok_sofar = new IsBinarySearchTree(tree_326).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_039")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_040 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_040")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_330 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_331 = tree_330.addRoot(40) ;
  es.upm.aedlib.Position<Integer> pos_332 = tree_330.insertLeft(root_331,1) ;
  es.upm.aedlib.Position<Integer> pos_333 = tree_330.insertRight(pos_332,12) ;
  es.upm.aedlib.Position<Integer> pos_334 = tree_330.insertLeft(pos_333,11) ;
  es.upm.aedlib.Position<Integer> pos_335 = tree_330.insertLeft(pos_334,9) ;
  es.upm.aedlib.Position<Integer> pos_336 = tree_330.insertRight(pos_333,26) ;
  ok_sofar = new IsBinarySearchTree(tree_330).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_040")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_041 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_041")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_337 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_338 = tree_337.addRoot(41) ;
  es.upm.aedlib.Position<Integer> pos_339 = tree_337.insertLeft(root_338,2) ;
  es.upm.aedlib.Position<Integer> pos_340 = tree_337.insertRight(pos_339,26) ;
  es.upm.aedlib.Position<Integer> pos_341 = tree_337.insertLeft(pos_340,19) ;
  es.upm.aedlib.Position<Integer> pos_342 = tree_337.insertRight(pos_340,34) ;
  ok_sofar = new IsBinarySearchTree(tree_337).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_041")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_042 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_042")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_343 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_344 = tree_343.addRoot(41) ;
  es.upm.aedlib.Position<Integer> pos_345 = tree_343.insertLeft(root_344,17) ;
  es.upm.aedlib.Position<Integer> pos_346 = tree_343.insertLeft(pos_345,3) ;
  es.upm.aedlib.Position<Integer> pos_347 = tree_343.insertRight(pos_345,37) ;
  es.upm.aedlib.Position<Integer> pos_348 = tree_343.insertLeft(pos_347,33) ;
  es.upm.aedlib.Position<Integer> pos_349 = tree_343.insertRight(root_344,45) ;
  es.upm.aedlib.Position<Integer> pos_350 = tree_343.insertLeft(pos_349,44) ;
  es.upm.aedlib.Position<Integer> pos_351 = tree_343.insertRight(pos_349,47) ;
  es.upm.aedlib.Position<Integer> pos_352 = tree_343.insertRight(pos_351,48) ;
  ok_sofar = new IsBinarySearchTree(tree_343).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_042")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_043 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_043")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_353 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_354 = tree_353.addRoot(42) ;
  es.upm.aedlib.Position<Integer> pos_355 = tree_353.insertLeft(root_354,17) ;
  es.upm.aedlib.Position<Integer> pos_356 = tree_353.insertLeft(pos_355,9) ;
  es.upm.aedlib.Position<Integer> pos_357 = tree_353.insertLeft(pos_356,6) ;
  es.upm.aedlib.Position<Integer> pos_358 = tree_353.insertRight(pos_356,10) ;
  es.upm.aedlib.Position<Integer> pos_359 = tree_353.insertRight(pos_358,11) ;
  es.upm.aedlib.Position<Integer> pos_360 = tree_353.insertRight(pos_359,16) ;
  es.upm.aedlib.Position<Integer> pos_361 = tree_353.insertRight(pos_355,23) ;
  es.upm.aedlib.Position<Integer> pos_362 = tree_353.insertRight(pos_361,41) ;
  es.upm.aedlib.Position<Integer> pos_363 = tree_353.insertLeft(pos_362,36) ;
  es.upm.aedlib.Position<Integer> pos_364 = tree_353.insertRight(pos_363,40) ;
  es.upm.aedlib.Position<Integer> pos_365 = tree_353.insertRight(root_354,48) ;
  ok_sofar = new IsBinarySearchTree(tree_353).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_043")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_044 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_044")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_366 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_367 = tree_366.addRoot(42) ;
  es.upm.aedlib.Position<Integer> pos_368 = tree_366.insertLeft(root_367,34) ;
  es.upm.aedlib.Position<Integer> pos_369 = tree_366.insertLeft(pos_368,50000) ;
  es.upm.aedlib.Position<Integer> pos_370 = tree_366.insertLeft(pos_369,9) ;
  es.upm.aedlib.Position<Integer> pos_371 = tree_366.insertRight(pos_369,30) ;
  es.upm.aedlib.Position<Integer> pos_372 = tree_366.insertRight(pos_368,39) ;
  es.upm.aedlib.Position<Integer> pos_373 = tree_366.insertRight(root_367,45) ;
  es.upm.aedlib.Position<Integer> pos_374 = tree_366.insertLeft(pos_373,44) ;
  es.upm.aedlib.Position<Integer> pos_375 = tree_366.insertRight(pos_373,46) ;
  es.upm.aedlib.Position<Integer> pos_376 = tree_366.insertRight(pos_375,47) ;
  ok_sofar = new IsBinarySearchTree(tree_366).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_044")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_045 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_045")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_377 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_378 = tree_377.addRoot(43) ;
  es.upm.aedlib.Position<Integer> pos_379 = tree_377.insertLeft(root_378,16) ;
  es.upm.aedlib.Position<Integer> pos_380 = tree_377.insertLeft(pos_379,3) ;
  es.upm.aedlib.Position<Integer> pos_381 = tree_377.insertRight(pos_379,27) ;
  es.upm.aedlib.Position<Integer> pos_382 = tree_377.insertLeft(pos_381,19) ;
  es.upm.aedlib.Position<Integer> pos_383 = tree_377.insertRight(pos_381,33) ;
  es.upm.aedlib.Position<Integer> pos_384 = tree_377.insertLeft(pos_383,32) ;
  es.upm.aedlib.Position<Integer> pos_385 = tree_377.insertRight(root_378,49) ;
  ok_sofar = new IsBinarySearchTree(tree_377).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_045")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_046 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_046")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_386 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_387 = tree_386.addRoot(45) ;
  es.upm.aedlib.Position<Integer> pos_388 = tree_386.insertLeft(root_387,19) ;
  es.upm.aedlib.Position<Integer> pos_389 = tree_386.insertLeft(pos_388,18) ;
  es.upm.aedlib.Position<Integer> pos_390 = tree_386.insertLeft(pos_389,10) ;
  es.upm.aedlib.Position<Integer> pos_391 = tree_386.insertLeft(pos_390,8) ;
  es.upm.aedlib.Position<Integer> pos_392 = tree_386.insertRight(pos_390,12) ;
  es.upm.aedlib.Position<Integer> pos_393 = tree_386.insertRight(pos_388,30) ;
  es.upm.aedlib.Position<Integer> pos_394 = tree_386.insertLeft(pos_393,24) ;
  es.upm.aedlib.Position<Integer> pos_395 = tree_386.insertRight(pos_393,43) ;
  es.upm.aedlib.Position<Integer> pos_396 = tree_386.insertRight(root_387,50) ;
  es.upm.aedlib.Position<Integer> pos_397 = tree_386.insertLeft(pos_396,49) ;
  ok_sofar = new IsBinarySearchTree(tree_386).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_046")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_047 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_047")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_398 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_399 = tree_398.addRoot(47) ;
  es.upm.aedlib.Position<Integer> pos_400 = tree_398.insertLeft(root_399,33) ;
  es.upm.aedlib.Position<Integer> pos_401 = tree_398.insertLeft(pos_400,26) ;
  es.upm.aedlib.Position<Integer> pos_402 = tree_398.insertLeft(pos_401,13) ;
  es.upm.aedlib.Position<Integer> pos_403 = tree_398.insertLeft(pos_402,4) ;
  es.upm.aedlib.Position<Integer> pos_404 = tree_398.insertRight(pos_403,11) ;
  es.upm.aedlib.Position<Integer> pos_405 = tree_398.insertRight(pos_402,25) ;
  es.upm.aedlib.Position<Integer> pos_406 = tree_398.insertRight(pos_400,45) ;
  es.upm.aedlib.Position<Integer> pos_407 = tree_398.insertLeft(pos_406,40) ;
  es.upm.aedlib.Position<Integer> pos_408 = tree_398.insertLeft(pos_407,39) ;
  es.upm.aedlib.Position<Integer> pos_409 = tree_398.insertLeft(pos_408,34) ;
  ok_sofar = new IsBinarySearchTree(tree_398).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_047")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_048 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_048")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_410 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_411 = tree_410.addRoot(48) ;
  es.upm.aedlib.Position<Integer> pos_412 = tree_410.insertLeft(root_411,43) ;
  es.upm.aedlib.Position<Integer> pos_413 = tree_410.insertLeft(pos_412,50000) ;
  es.upm.aedlib.Position<Integer> pos_414 = tree_410.insertLeft(pos_413,8) ;
  es.upm.aedlib.Position<Integer> pos_415 = tree_410.insertLeft(pos_414,4) ;
  es.upm.aedlib.Position<Integer> pos_416 = tree_410.insertRight(pos_414,21) ;
  es.upm.aedlib.Position<Integer> pos_417 = tree_410.insertLeft(pos_416,20) ;
  es.upm.aedlib.Position<Integer> pos_418 = tree_410.insertLeft(pos_417,9) ;
  es.upm.aedlib.Position<Integer> pos_419 = tree_410.insertRight(pos_416,25) ;
  es.upm.aedlib.Position<Integer> pos_420 = tree_410.insertRight(pos_413,42) ;
  es.upm.aedlib.Position<Integer> pos_421 = tree_410.insertLeft(pos_420,32) ;
  es.upm.aedlib.Position<Integer> pos_422 = tree_410.insertRight(pos_421,34) ;
  es.upm.aedlib.Position<Integer> pos_423 = tree_410.insertRight(pos_422,36) ;
  es.upm.aedlib.Position<Integer> pos_424 = tree_410.insertRight(pos_423,39) ;
  es.upm.aedlib.Position<Integer> pos_425 = tree_410.insertRight(root_411,49) ;
  ok_sofar = new IsBinarySearchTree(tree_410).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_048")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_049 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_049")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_426 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_427 = tree_426.addRoot(49) ;
  es.upm.aedlib.Position<Integer> pos_428 = tree_426.insertLeft(root_427,28) ;
  es.upm.aedlib.Position<Integer> pos_429 = tree_426.insertLeft(pos_428,50000) ;
  es.upm.aedlib.Position<Integer> pos_430 = tree_426.insertRight(pos_429,25) ;
  es.upm.aedlib.Position<Integer> pos_431 = tree_426.insertLeft(pos_430,22) ;
  es.upm.aedlib.Position<Integer> pos_432 = tree_426.insertRight(pos_428,39) ;
  es.upm.aedlib.Position<Integer> pos_433 = tree_426.insertRight(pos_432,46) ;
  ok_sofar = new IsBinarySearchTree(tree_426).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_049")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBinarySearchTree")
  public void test_isBinarySearchTree_050 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBinarySearchTree_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBinarySearchTree_050")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_434 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_435 = tree_434.addRoot(50) ;
  es.upm.aedlib.Position<Integer> pos_436 = tree_434.insertLeft(root_435,4) ;
  es.upm.aedlib.Position<Integer> pos_437 = tree_434.insertRight(pos_436,49) ;
  es.upm.aedlib.Position<Integer> pos_438 = tree_434.insertLeft(pos_437,48) ;
  es.upm.aedlib.Position<Integer> pos_439 = tree_434.insertLeft(pos_438,30) ;
  es.upm.aedlib.Position<Integer> pos_440 = tree_434.insertLeft(pos_439,10) ;
  es.upm.aedlib.Position<Integer> pos_441 = tree_434.insertLeft(pos_440,9) ;
  es.upm.aedlib.Position<Integer> pos_442 = tree_434.insertRight(pos_440,13) ;
  es.upm.aedlib.Position<Integer> pos_443 = tree_434.insertRight(pos_442,16) ;
  es.upm.aedlib.Position<Integer> pos_444 = tree_434.insertRight(pos_443,19) ;
  es.upm.aedlib.Position<Integer> pos_445 = tree_434.insertRight(pos_444,21) ;
  es.upm.aedlib.Position<Integer> pos_446 = tree_434.insertRight(pos_445,23) ;
  es.upm.aedlib.Position<Integer> pos_447 = tree_434.insertRight(pos_439,33) ;
  ok_sofar = new IsBinarySearchTree(tree_434).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBinarySearchTree_050")) ;
    ResultsHandler.add_result(new String("isBinarySearchTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_051 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_051")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_051")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_052 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_052")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_448 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_449 = tree_448.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_450 = tree_448.insertRight(root_449,3) ;
  es.upm.aedlib.Position<Integer> pos_451 = tree_448.insertLeft(pos_450,1) ;
  es.upm.aedlib.Position<Integer> pos_452 = tree_448.insertLeft(pos_451,4) ;
  es.upm.aedlib.Position<Integer> pos_453 = tree_448.insertLeft(pos_452,2) ;
  es.upm.aedlib.Position<Integer> pos_454 = tree_448.insertRight(pos_452,18) ;
  es.upm.aedlib.Position<Integer> pos_455 = tree_448.insertRight(pos_450,11) ;
  es.upm.aedlib.Position<Integer> pos_456 = tree_448.insertLeft(pos_455,3) ;
  es.upm.aedlib.Position<Integer> pos_457 = tree_448.insertLeft(pos_456,17) ;
  es.upm.aedlib.Position<Integer> pos_458 = tree_448.insertRight(pos_456,16) ;
  es.upm.aedlib.Position<Integer> pos_459 = tree_448.insertRight(pos_455,14) ;
  es.upm.aedlib.Position<Integer> pos_460 = tree_448.insertLeft(pos_459,19) ;
  es.upm.aedlib.Position<Integer> pos_461 = tree_448.insertRight(pos_459,9) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_462 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_463 = tree_462.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_464 = tree_462.insertRight(root_463,19) ;
  es.upm.aedlib.Position<Integer> pos_465 = tree_462.insertLeft(pos_464,18) ;
  es.upm.aedlib.Position<Integer> pos_466 = tree_462.insertLeft(pos_465,18) ;
  es.upm.aedlib.Position<Integer> pos_467 = tree_462.insertLeft(pos_466,2) ;
  es.upm.aedlib.Position<Integer> pos_468 = tree_462.insertRight(pos_466,18) ;
  es.upm.aedlib.Position<Integer> pos_469 = tree_462.insertRight(pos_464,19) ;
  es.upm.aedlib.Position<Integer> pos_470 = tree_462.insertLeft(pos_469,17) ;
  es.upm.aedlib.Position<Integer> pos_471 = tree_462.insertLeft(pos_470,17) ;
  es.upm.aedlib.Position<Integer> pos_472 = tree_462.insertRight(pos_470,16) ;
  es.upm.aedlib.Position<Integer> pos_473 = tree_462.insertRight(pos_469,19) ;
  es.upm.aedlib.Position<Integer> pos_474 = tree_462.insertLeft(pos_473,19) ;
  es.upm.aedlib.Position<Integer> pos_475 = tree_462.insertRight(pos_473,9) ;
  ok_sofar = new FillMaxTree(tree_448).doCall().checkResult(tree_462) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_052")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_053 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_053")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_476 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_477 = tree_476.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_478 = tree_476.insertLeft(root_477,4) ;
  es.upm.aedlib.Position<Integer> pos_479 = tree_476.insertLeft(pos_478,8) ;
  es.upm.aedlib.Position<Integer> pos_480 = tree_476.insertRight(pos_479,9) ;
  es.upm.aedlib.Position<Integer> pos_481 = tree_476.insertLeft(pos_480,5) ;
  es.upm.aedlib.Position<Integer> pos_482 = tree_476.insertRight(pos_480,7) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_483 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_484 = tree_483.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_485 = tree_483.insertLeft(root_484,7) ;
  es.upm.aedlib.Position<Integer> pos_486 = tree_483.insertLeft(pos_485,7) ;
  es.upm.aedlib.Position<Integer> pos_487 = tree_483.insertRight(pos_486,7) ;
  es.upm.aedlib.Position<Integer> pos_488 = tree_483.insertLeft(pos_487,5) ;
  es.upm.aedlib.Position<Integer> pos_489 = tree_483.insertRight(pos_487,7) ;
  ok_sofar = new FillMaxTree(tree_476).doCall().checkResult(tree_483) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_053")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_054 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_054")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_490 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_491 = tree_490.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_492 = tree_490.insertLeft(root_491,10) ;
  es.upm.aedlib.Position<Integer> pos_493 = tree_490.insertLeft(pos_492,9) ;
  es.upm.aedlib.Position<Integer> pos_494 = tree_490.insertLeft(pos_493,12) ;
  es.upm.aedlib.Position<Integer> pos_495 = tree_490.insertLeft(pos_494,4) ;
  es.upm.aedlib.Position<Integer> pos_496 = tree_490.insertRight(pos_493,12) ;
  es.upm.aedlib.Position<Integer> pos_497 = tree_490.insertLeft(pos_496,5) ;
  es.upm.aedlib.Position<Integer> pos_498 = tree_490.insertRight(pos_496,6) ;
  es.upm.aedlib.Position<Integer> pos_499 = tree_490.insertRight(pos_492,16) ;
  es.upm.aedlib.Position<Integer> pos_500 = tree_490.insertLeft(pos_499,18) ;
  es.upm.aedlib.Position<Integer> pos_501 = tree_490.insertLeft(pos_500,20) ;
  es.upm.aedlib.Position<Integer> pos_502 = tree_490.insertRight(pos_500,7) ;
  es.upm.aedlib.Position<Integer> pos_503 = tree_490.insertRight(root_491,13) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_504 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_505 = tree_504.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_506 = tree_504.insertLeft(root_505,20) ;
  es.upm.aedlib.Position<Integer> pos_507 = tree_504.insertLeft(pos_506,6) ;
  es.upm.aedlib.Position<Integer> pos_508 = tree_504.insertLeft(pos_507,4) ;
  es.upm.aedlib.Position<Integer> pos_509 = tree_504.insertLeft(pos_508,4) ;
  es.upm.aedlib.Position<Integer> pos_510 = tree_504.insertRight(pos_507,6) ;
  es.upm.aedlib.Position<Integer> pos_511 = tree_504.insertLeft(pos_510,5) ;
  es.upm.aedlib.Position<Integer> pos_512 = tree_504.insertRight(pos_510,6) ;
  es.upm.aedlib.Position<Integer> pos_513 = tree_504.insertRight(pos_506,20) ;
  es.upm.aedlib.Position<Integer> pos_514 = tree_504.insertLeft(pos_513,20) ;
  es.upm.aedlib.Position<Integer> pos_515 = tree_504.insertLeft(pos_514,20) ;
  es.upm.aedlib.Position<Integer> pos_516 = tree_504.insertRight(pos_514,7) ;
  es.upm.aedlib.Position<Integer> pos_517 = tree_504.insertRight(root_505,13) ;
  ok_sofar = new FillMaxTree(tree_490).doCall().checkResult(tree_504) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_054")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_055 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_055")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_518 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_519 = tree_518.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_520 = tree_518.insertLeft(root_519,11) ;
  es.upm.aedlib.Position<Integer> pos_521 = tree_518.insertLeft(pos_520,19) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_522 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_523 = tree_522.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_524 = tree_522.insertLeft(root_523,19) ;
  es.upm.aedlib.Position<Integer> pos_525 = tree_522.insertLeft(pos_524,19) ;
  ok_sofar = new FillMaxTree(tree_518).doCall().checkResult(tree_522) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_055")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_056 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_056")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_526 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_527 = tree_526.addRoot(1) ;
  es.upm.aedlib.Position<Integer> pos_528 = tree_526.insertLeft(root_527,14) ;
  es.upm.aedlib.Position<Integer> pos_529 = tree_526.insertLeft(pos_528,20) ;
  es.upm.aedlib.Position<Integer> pos_530 = tree_526.insertRight(pos_528,20) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_531 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_532 = tree_531.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_533 = tree_531.insertLeft(root_532,20) ;
  es.upm.aedlib.Position<Integer> pos_534 = tree_531.insertLeft(pos_533,20) ;
  es.upm.aedlib.Position<Integer> pos_535 = tree_531.insertRight(pos_533,20) ;
  ok_sofar = new FillMaxTree(tree_526).doCall().checkResult(tree_531) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_056")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_057 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_057")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_536 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_537 = tree_536.addRoot(2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_538 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_539 = tree_538.addRoot(2) ;
  ok_sofar = new FillMaxTree(tree_536).doCall().checkResult(tree_538) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_057")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_058 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_058")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_540 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_541 = tree_540.addRoot(2) ;
  es.upm.aedlib.Position<Integer> pos_542 = tree_540.insertLeft(root_541,4) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_543 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_544 = tree_543.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_545 = tree_543.insertLeft(root_544,4) ;
  ok_sofar = new FillMaxTree(tree_540).doCall().checkResult(tree_543) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_058")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_059 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_059")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_546 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_547 = tree_546.addRoot(2) ;
  es.upm.aedlib.Position<Integer> pos_548 = tree_546.insertLeft(root_547,8) ;
  es.upm.aedlib.Position<Integer> pos_549 = tree_546.insertRight(root_547,10) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_550 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_551 = tree_550.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_552 = tree_550.insertLeft(root_551,8) ;
  es.upm.aedlib.Position<Integer> pos_553 = tree_550.insertRight(root_551,10) ;
  ok_sofar = new FillMaxTree(tree_546).doCall().checkResult(tree_550) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_059")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_060 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_060")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_554 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_555 = tree_554.addRoot(3) ;
  es.upm.aedlib.Position<Integer> pos_556 = tree_554.insertLeft(root_555,3) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_557 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_558 = tree_557.addRoot(3) ;
  es.upm.aedlib.Position<Integer> pos_559 = tree_557.insertLeft(root_558,3) ;
  ok_sofar = new FillMaxTree(tree_554).doCall().checkResult(tree_557) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_060")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_061 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_061")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_560 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_561 = tree_560.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_562 = tree_560.insertLeft(root_561,1) ;
  es.upm.aedlib.Position<Integer> pos_563 = tree_560.insertRight(root_561,20) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_564 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_565 = tree_564.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_566 = tree_564.insertLeft(root_565,1) ;
  es.upm.aedlib.Position<Integer> pos_567 = tree_564.insertRight(root_565,20) ;
  ok_sofar = new FillMaxTree(tree_560).doCall().checkResult(tree_564) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_061")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_062 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_062")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_568 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_569 = tree_568.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_570 = tree_568.insertLeft(root_569,11) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_571 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_572 = tree_571.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_573 = tree_571.insertLeft(root_572,11) ;
  ok_sofar = new FillMaxTree(tree_568).doCall().checkResult(tree_571) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_062")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_063 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_063")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_574 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_575 = tree_574.addRoot(5) ;
  es.upm.aedlib.Position<Integer> pos_576 = tree_574.insertRight(root_575,14) ;
  es.upm.aedlib.Position<Integer> pos_577 = tree_574.insertLeft(pos_576,3) ;
  es.upm.aedlib.Position<Integer> pos_578 = tree_574.insertRight(pos_576,5) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_579 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_580 = tree_579.addRoot(5) ;
  es.upm.aedlib.Position<Integer> pos_581 = tree_579.insertRight(root_580,5) ;
  es.upm.aedlib.Position<Integer> pos_582 = tree_579.insertLeft(pos_581,3) ;
  es.upm.aedlib.Position<Integer> pos_583 = tree_579.insertRight(pos_581,5) ;
  ok_sofar = new FillMaxTree(tree_574).doCall().checkResult(tree_579) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_063")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_064 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_064")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_584 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_585 = tree_584.addRoot(5) ;
  es.upm.aedlib.Position<Integer> pos_586 = tree_584.insertLeft(root_585,16) ;
  es.upm.aedlib.Position<Integer> pos_587 = tree_584.insertLeft(pos_586,10) ;
  es.upm.aedlib.Position<Integer> pos_588 = tree_584.insertLeft(pos_587,4) ;
  es.upm.aedlib.Position<Integer> pos_589 = tree_584.insertRight(pos_588,6) ;
  es.upm.aedlib.Position<Integer> pos_590 = tree_584.insertRight(pos_589,1) ;
  es.upm.aedlib.Position<Integer> pos_591 = tree_584.insertLeft(pos_590,13) ;
  es.upm.aedlib.Position<Integer> pos_592 = tree_584.insertRight(pos_590,8) ;
  es.upm.aedlib.Position<Integer> pos_593 = tree_584.insertRight(pos_587,13) ;
  es.upm.aedlib.Position<Integer> pos_594 = tree_584.insertLeft(pos_593,1) ;
  es.upm.aedlib.Position<Integer> pos_595 = tree_584.insertLeft(pos_594,7) ;
  es.upm.aedlib.Position<Integer> pos_596 = tree_584.insertRight(pos_595,9) ;
  es.upm.aedlib.Position<Integer> pos_597 = tree_584.insertRight(pos_594,7) ;
  es.upm.aedlib.Position<Integer> pos_598 = tree_584.insertLeft(pos_597,3) ;
  es.upm.aedlib.Position<Integer> pos_599 = tree_584.insertRight(pos_586,10) ;
  es.upm.aedlib.Position<Integer> pos_600 = tree_584.insertLeft(pos_599,6) ;
  es.upm.aedlib.Position<Integer> pos_601 = tree_584.insertRight(pos_600,8) ;
  es.upm.aedlib.Position<Integer> pos_602 = tree_584.insertRight(pos_601,12) ;
  es.upm.aedlib.Position<Integer> pos_603 = tree_584.insertRight(pos_602,20) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_604 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_605 = tree_604.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_606 = tree_604.insertLeft(root_605,20) ;
  es.upm.aedlib.Position<Integer> pos_607 = tree_604.insertLeft(pos_606,13) ;
  es.upm.aedlib.Position<Integer> pos_608 = tree_604.insertLeft(pos_607,13) ;
  es.upm.aedlib.Position<Integer> pos_609 = tree_604.insertRight(pos_608,13) ;
  es.upm.aedlib.Position<Integer> pos_610 = tree_604.insertRight(pos_609,13) ;
  es.upm.aedlib.Position<Integer> pos_611 = tree_604.insertLeft(pos_610,13) ;
  es.upm.aedlib.Position<Integer> pos_612 = tree_604.insertRight(pos_610,8) ;
  es.upm.aedlib.Position<Integer> pos_613 = tree_604.insertRight(pos_607,9) ;
  es.upm.aedlib.Position<Integer> pos_614 = tree_604.insertLeft(pos_613,9) ;
  es.upm.aedlib.Position<Integer> pos_615 = tree_604.insertLeft(pos_614,9) ;
  es.upm.aedlib.Position<Integer> pos_616 = tree_604.insertRight(pos_615,9) ;
  es.upm.aedlib.Position<Integer> pos_617 = tree_604.insertRight(pos_614,3) ;
  es.upm.aedlib.Position<Integer> pos_618 = tree_604.insertLeft(pos_617,3) ;
  es.upm.aedlib.Position<Integer> pos_619 = tree_604.insertRight(pos_606,20) ;
  es.upm.aedlib.Position<Integer> pos_620 = tree_604.insertLeft(pos_619,20) ;
  es.upm.aedlib.Position<Integer> pos_621 = tree_604.insertRight(pos_620,20) ;
  es.upm.aedlib.Position<Integer> pos_622 = tree_604.insertRight(pos_621,20) ;
  es.upm.aedlib.Position<Integer> pos_623 = tree_604.insertRight(pos_622,20) ;
  ok_sofar = new FillMaxTree(tree_584).doCall().checkResult(tree_604) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_064")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_065 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_065")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_624 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_625 = tree_624.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_626 = tree_624.insertLeft(root_625,11) ;
  es.upm.aedlib.Position<Integer> pos_627 = tree_624.insertLeft(pos_626,7) ;
  es.upm.aedlib.Position<Integer> pos_628 = tree_624.insertRight(pos_627,2) ;
  es.upm.aedlib.Position<Integer> pos_629 = tree_624.insertRight(pos_628,17) ;
  es.upm.aedlib.Position<Integer> pos_630 = tree_624.insertRight(pos_626,8) ;
  es.upm.aedlib.Position<Integer> pos_631 = tree_624.insertRight(pos_630,14) ;
  es.upm.aedlib.Position<Integer> pos_632 = tree_624.insertRight(pos_631,17) ;
  es.upm.aedlib.Position<Integer> pos_633 = tree_624.insertRight(root_625,20) ;
  es.upm.aedlib.Position<Integer> pos_634 = tree_624.insertRight(pos_633,12) ;
  es.upm.aedlib.Position<Integer> pos_635 = tree_624.insertRight(pos_634,5) ;
  es.upm.aedlib.Position<Integer> pos_636 = tree_624.insertLeft(pos_635,9) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_637 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_638 = tree_637.addRoot(17) ;
  es.upm.aedlib.Position<Integer> pos_639 = tree_637.insertLeft(root_638,17) ;
  es.upm.aedlib.Position<Integer> pos_640 = tree_637.insertLeft(pos_639,17) ;
  es.upm.aedlib.Position<Integer> pos_641 = tree_637.insertRight(pos_640,17) ;
  es.upm.aedlib.Position<Integer> pos_642 = tree_637.insertRight(pos_641,17) ;
  es.upm.aedlib.Position<Integer> pos_643 = tree_637.insertRight(pos_639,17) ;
  es.upm.aedlib.Position<Integer> pos_644 = tree_637.insertRight(pos_643,17) ;
  es.upm.aedlib.Position<Integer> pos_645 = tree_637.insertRight(pos_644,17) ;
  es.upm.aedlib.Position<Integer> pos_646 = tree_637.insertRight(root_638,9) ;
  es.upm.aedlib.Position<Integer> pos_647 = tree_637.insertRight(pos_646,9) ;
  es.upm.aedlib.Position<Integer> pos_648 = tree_637.insertRight(pos_647,9) ;
  es.upm.aedlib.Position<Integer> pos_649 = tree_637.insertLeft(pos_648,9) ;
  ok_sofar = new FillMaxTree(tree_624).doCall().checkResult(tree_637) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_065")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_066 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_066")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_650 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_651 = tree_650.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_652 = tree_650.insertLeft(root_651,13) ;
  es.upm.aedlib.Position<Integer> pos_653 = tree_650.insertRight(pos_652,18) ;
  es.upm.aedlib.Position<Integer> pos_654 = tree_650.insertLeft(pos_653,14) ;
  es.upm.aedlib.Position<Integer> pos_655 = tree_650.insertLeft(pos_654,8) ;
  es.upm.aedlib.Position<Integer> pos_656 = tree_650.insertRight(pos_654,3) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_657 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_658 = tree_657.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_659 = tree_657.insertLeft(root_658,8) ;
  es.upm.aedlib.Position<Integer> pos_660 = tree_657.insertRight(pos_659,8) ;
  es.upm.aedlib.Position<Integer> pos_661 = tree_657.insertLeft(pos_660,8) ;
  es.upm.aedlib.Position<Integer> pos_662 = tree_657.insertLeft(pos_661,8) ;
  es.upm.aedlib.Position<Integer> pos_663 = tree_657.insertRight(pos_661,3) ;
  ok_sofar = new FillMaxTree(tree_650).doCall().checkResult(tree_657) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_066")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_067 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_067")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_664 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_665 = tree_664.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_666 = tree_664.insertLeft(root_665,1) ;
  es.upm.aedlib.Position<Integer> pos_667 = tree_664.insertRight(pos_666,14) ;
  es.upm.aedlib.Position<Integer> pos_668 = tree_664.insertRight(root_665,9) ;
  es.upm.aedlib.Position<Integer> pos_669 = tree_664.insertRight(pos_668,8) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_670 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_671 = tree_670.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_672 = tree_670.insertLeft(root_671,14) ;
  es.upm.aedlib.Position<Integer> pos_673 = tree_670.insertRight(pos_672,14) ;
  es.upm.aedlib.Position<Integer> pos_674 = tree_670.insertRight(root_671,8) ;
  es.upm.aedlib.Position<Integer> pos_675 = tree_670.insertRight(pos_674,8) ;
  ok_sofar = new FillMaxTree(tree_664).doCall().checkResult(tree_670) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_067")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_068 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_068")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_676 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_677 = tree_676.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_678 = tree_676.insertLeft(root_677,2) ;
  es.upm.aedlib.Position<Integer> pos_679 = tree_676.insertLeft(pos_678,20) ;
  es.upm.aedlib.Position<Integer> pos_680 = tree_676.insertLeft(pos_679,3) ;
  es.upm.aedlib.Position<Integer> pos_681 = tree_676.insertLeft(pos_680,10) ;
  es.upm.aedlib.Position<Integer> pos_682 = tree_676.insertRight(pos_681,11) ;
  es.upm.aedlib.Position<Integer> pos_683 = tree_676.insertRight(pos_682,8) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_684 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_685 = tree_684.addRoot(8) ;
  es.upm.aedlib.Position<Integer> pos_686 = tree_684.insertLeft(root_685,8) ;
  es.upm.aedlib.Position<Integer> pos_687 = tree_684.insertLeft(pos_686,8) ;
  es.upm.aedlib.Position<Integer> pos_688 = tree_684.insertLeft(pos_687,8) ;
  es.upm.aedlib.Position<Integer> pos_689 = tree_684.insertLeft(pos_688,8) ;
  es.upm.aedlib.Position<Integer> pos_690 = tree_684.insertRight(pos_689,8) ;
  es.upm.aedlib.Position<Integer> pos_691 = tree_684.insertRight(pos_690,8) ;
  ok_sofar = new FillMaxTree(tree_676).doCall().checkResult(tree_684) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_068")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_069 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_069")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_692 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_693 = tree_692.addRoot(9) ;
  es.upm.aedlib.Position<Integer> pos_694 = tree_692.insertLeft(root_693,20) ;
  es.upm.aedlib.Position<Integer> pos_695 = tree_692.insertLeft(pos_694,20) ;
  es.upm.aedlib.Position<Integer> pos_696 = tree_692.insertRight(pos_694,14) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_697 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_698 = tree_697.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_699 = tree_697.insertLeft(root_698,20) ;
  es.upm.aedlib.Position<Integer> pos_700 = tree_697.insertLeft(pos_699,20) ;
  es.upm.aedlib.Position<Integer> pos_701 = tree_697.insertRight(pos_699,14) ;
  ok_sofar = new FillMaxTree(tree_692).doCall().checkResult(tree_697) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_069")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_070 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_070")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_702 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_703 = tree_702.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_704 = tree_702.insertRight(root_703,7) ;
  es.upm.aedlib.Position<Integer> pos_705 = tree_702.insertLeft(pos_704,19) ;
  es.upm.aedlib.Position<Integer> pos_706 = tree_702.insertLeft(pos_705,5) ;
  es.upm.aedlib.Position<Integer> pos_707 = tree_702.insertRight(pos_706,11) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_708 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_709 = tree_708.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_710 = tree_708.insertRight(root_709,11) ;
  es.upm.aedlib.Position<Integer> pos_711 = tree_708.insertLeft(pos_710,11) ;
  es.upm.aedlib.Position<Integer> pos_712 = tree_708.insertLeft(pos_711,11) ;
  es.upm.aedlib.Position<Integer> pos_713 = tree_708.insertRight(pos_712,11) ;
  ok_sofar = new FillMaxTree(tree_702).doCall().checkResult(tree_708) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_070")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_071 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_071")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_714 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_715 = tree_714.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_716 = tree_714.insertRight(root_715,17) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_717 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_718 = tree_717.addRoot(17) ;
  es.upm.aedlib.Position<Integer> pos_719 = tree_717.insertRight(root_718,17) ;
  ok_sofar = new FillMaxTree(tree_714).doCall().checkResult(tree_717) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_071")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_072 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_072")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_720 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_721 = tree_720.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_722 = tree_720.insertRight(root_721,18) ;
  es.upm.aedlib.Position<Integer> pos_723 = tree_720.insertLeft(pos_722,13) ;
  es.upm.aedlib.Position<Integer> pos_724 = tree_720.insertLeft(pos_723,19) ;
  es.upm.aedlib.Position<Integer> pos_725 = tree_720.insertLeft(pos_724,18) ;
  es.upm.aedlib.Position<Integer> pos_726 = tree_720.insertRight(pos_723,11) ;
  es.upm.aedlib.Position<Integer> pos_727 = tree_720.insertRight(pos_726,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_728 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_729 = tree_728.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_730 = tree_728.insertRight(root_729,18) ;
  es.upm.aedlib.Position<Integer> pos_731 = tree_728.insertLeft(pos_730,18) ;
  es.upm.aedlib.Position<Integer> pos_732 = tree_728.insertLeft(pos_731,18) ;
  es.upm.aedlib.Position<Integer> pos_733 = tree_728.insertLeft(pos_732,18) ;
  es.upm.aedlib.Position<Integer> pos_734 = tree_728.insertRight(pos_731,2) ;
  es.upm.aedlib.Position<Integer> pos_735 = tree_728.insertRight(pos_734,2) ;
  ok_sofar = new FillMaxTree(tree_720).doCall().checkResult(tree_728) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_072")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_073 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_073")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_736 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_737 = tree_736.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_738 = tree_736.insertLeft(root_737,6) ;
  es.upm.aedlib.Position<Integer> pos_739 = tree_736.insertLeft(pos_738,2) ;
  es.upm.aedlib.Position<Integer> pos_740 = tree_736.insertRight(pos_739,2) ;
  es.upm.aedlib.Position<Integer> pos_741 = tree_736.insertRight(root_737,17) ;
  es.upm.aedlib.Position<Integer> pos_742 = tree_736.insertRight(pos_741,7) ;
  es.upm.aedlib.Position<Integer> pos_743 = tree_736.insertLeft(pos_742,1) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_744 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_745 = tree_744.addRoot(2) ;
  es.upm.aedlib.Position<Integer> pos_746 = tree_744.insertLeft(root_745,2) ;
  es.upm.aedlib.Position<Integer> pos_747 = tree_744.insertLeft(pos_746,2) ;
  es.upm.aedlib.Position<Integer> pos_748 = tree_744.insertRight(pos_747,2) ;
  es.upm.aedlib.Position<Integer> pos_749 = tree_744.insertRight(root_745,1) ;
  es.upm.aedlib.Position<Integer> pos_750 = tree_744.insertRight(pos_749,1) ;
  es.upm.aedlib.Position<Integer> pos_751 = tree_744.insertLeft(pos_750,1) ;
  ok_sofar = new FillMaxTree(tree_736).doCall().checkResult(tree_744) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_073")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_074 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_074")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_752 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_753 = tree_752.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_754 = tree_752.insertLeft(root_753,7) ;
  es.upm.aedlib.Position<Integer> pos_755 = tree_752.insertRight(pos_754,13) ;
  es.upm.aedlib.Position<Integer> pos_756 = tree_752.insertRight(pos_755,16) ;
  es.upm.aedlib.Position<Integer> pos_757 = tree_752.insertLeft(pos_756,18) ;
  es.upm.aedlib.Position<Integer> pos_758 = tree_752.insertLeft(pos_757,9) ;
  es.upm.aedlib.Position<Integer> pos_759 = tree_752.insertRight(pos_756,15) ;
  es.upm.aedlib.Position<Integer> pos_760 = tree_752.insertLeft(pos_759,1) ;
  es.upm.aedlib.Position<Integer> pos_761 = tree_752.insertRight(root_753,5) ;
  es.upm.aedlib.Position<Integer> pos_762 = tree_752.insertLeft(pos_761,11) ;
  es.upm.aedlib.Position<Integer> pos_763 = tree_752.insertRight(pos_762,13) ;
  es.upm.aedlib.Position<Integer> pos_764 = tree_752.insertLeft(pos_763,13) ;
  es.upm.aedlib.Position<Integer> pos_765 = tree_752.insertLeft(pos_764,4) ;
  es.upm.aedlib.Position<Integer> pos_766 = tree_752.insertRight(pos_764,12) ;
  es.upm.aedlib.Position<Integer> pos_767 = tree_752.insertRight(pos_763,1) ;
  es.upm.aedlib.Position<Integer> pos_768 = tree_752.insertLeft(pos_767,19) ;
  es.upm.aedlib.Position<Integer> pos_769 = tree_752.insertRight(pos_761,11) ;
  es.upm.aedlib.Position<Integer> pos_770 = tree_752.insertLeft(pos_769,10) ;
  es.upm.aedlib.Position<Integer> pos_771 = tree_752.insertRight(pos_770,19) ;
  es.upm.aedlib.Position<Integer> pos_772 = tree_752.insertRight(pos_771,20) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_773 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_774 = tree_773.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_775 = tree_773.insertLeft(root_774,9) ;
  es.upm.aedlib.Position<Integer> pos_776 = tree_773.insertRight(pos_775,9) ;
  es.upm.aedlib.Position<Integer> pos_777 = tree_773.insertRight(pos_776,9) ;
  es.upm.aedlib.Position<Integer> pos_778 = tree_773.insertLeft(pos_777,9) ;
  es.upm.aedlib.Position<Integer> pos_779 = tree_773.insertLeft(pos_778,9) ;
  es.upm.aedlib.Position<Integer> pos_780 = tree_773.insertRight(pos_777,1) ;
  es.upm.aedlib.Position<Integer> pos_781 = tree_773.insertLeft(pos_780,1) ;
  es.upm.aedlib.Position<Integer> pos_782 = tree_773.insertRight(root_774,20) ;
  es.upm.aedlib.Position<Integer> pos_783 = tree_773.insertLeft(pos_782,19) ;
  es.upm.aedlib.Position<Integer> pos_784 = tree_773.insertRight(pos_783,19) ;
  es.upm.aedlib.Position<Integer> pos_785 = tree_773.insertLeft(pos_784,12) ;
  es.upm.aedlib.Position<Integer> pos_786 = tree_773.insertLeft(pos_785,4) ;
  es.upm.aedlib.Position<Integer> pos_787 = tree_773.insertRight(pos_785,12) ;
  es.upm.aedlib.Position<Integer> pos_788 = tree_773.insertRight(pos_784,19) ;
  es.upm.aedlib.Position<Integer> pos_789 = tree_773.insertLeft(pos_788,19) ;
  es.upm.aedlib.Position<Integer> pos_790 = tree_773.insertRight(pos_782,20) ;
  es.upm.aedlib.Position<Integer> pos_791 = tree_773.insertLeft(pos_790,20) ;
  es.upm.aedlib.Position<Integer> pos_792 = tree_773.insertRight(pos_791,20) ;
  es.upm.aedlib.Position<Integer> pos_793 = tree_773.insertRight(pos_792,20) ;
  ok_sofar = new FillMaxTree(tree_752).doCall().checkResult(tree_773) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_074")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_075 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_075")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_794 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_795 = tree_794.addRoot(10) ;
  es.upm.aedlib.Position<Integer> pos_796 = tree_794.insertLeft(root_795,7) ;
  es.upm.aedlib.Position<Integer> pos_797 = tree_794.insertRight(pos_796,18) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_798 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_799 = tree_798.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_800 = tree_798.insertLeft(root_799,18) ;
  es.upm.aedlib.Position<Integer> pos_801 = tree_798.insertRight(pos_800,18) ;
  ok_sofar = new FillMaxTree(tree_794).doCall().checkResult(tree_798) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_075")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_076 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_076")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_802 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_803 = tree_802.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_804 = tree_802.insertRight(root_803,10) ;
  es.upm.aedlib.Position<Integer> pos_805 = tree_802.insertLeft(pos_804,14) ;
  es.upm.aedlib.Position<Integer> pos_806 = tree_802.insertLeft(pos_805,14) ;
  es.upm.aedlib.Position<Integer> pos_807 = tree_802.insertRight(pos_805,17) ;
  es.upm.aedlib.Position<Integer> pos_808 = tree_802.insertRight(pos_804,18) ;
  es.upm.aedlib.Position<Integer> pos_809 = tree_802.insertLeft(pos_808,17) ;
  es.upm.aedlib.Position<Integer> pos_810 = tree_802.insertRight(pos_808,19) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_811 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_812 = tree_811.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_813 = tree_811.insertRight(root_812,19) ;
  es.upm.aedlib.Position<Integer> pos_814 = tree_811.insertLeft(pos_813,17) ;
  es.upm.aedlib.Position<Integer> pos_815 = tree_811.insertLeft(pos_814,14) ;
  es.upm.aedlib.Position<Integer> pos_816 = tree_811.insertRight(pos_814,17) ;
  es.upm.aedlib.Position<Integer> pos_817 = tree_811.insertRight(pos_813,19) ;
  es.upm.aedlib.Position<Integer> pos_818 = tree_811.insertLeft(pos_817,17) ;
  es.upm.aedlib.Position<Integer> pos_819 = tree_811.insertRight(pos_817,19) ;
  ok_sofar = new FillMaxTree(tree_802).doCall().checkResult(tree_811) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_076")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_077 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_077")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_820 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_821 = tree_820.addRoot(11) ;
  es.upm.aedlib.Position<Integer> pos_822 = tree_820.insertLeft(root_821,6) ;
  es.upm.aedlib.Position<Integer> pos_823 = tree_820.insertRight(pos_822,7) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_824 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_825 = tree_824.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_826 = tree_824.insertLeft(root_825,7) ;
  es.upm.aedlib.Position<Integer> pos_827 = tree_824.insertRight(pos_826,7) ;
  ok_sofar = new FillMaxTree(tree_820).doCall().checkResult(tree_824) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_077")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_078 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_078")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_828 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_829 = tree_828.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_830 = tree_828.insertRight(root_829,2) ;
  es.upm.aedlib.Position<Integer> pos_831 = tree_828.insertLeft(pos_830,18) ;
  es.upm.aedlib.Position<Integer> pos_832 = tree_828.insertLeft(pos_831,13) ;
  es.upm.aedlib.Position<Integer> pos_833 = tree_828.insertLeft(pos_832,20) ;
  es.upm.aedlib.Position<Integer> pos_834 = tree_828.insertLeft(pos_833,19) ;
  es.upm.aedlib.Position<Integer> pos_835 = tree_828.insertLeft(pos_834,13) ;
  es.upm.aedlib.Position<Integer> pos_836 = tree_828.insertRight(pos_834,11) ;
  es.upm.aedlib.Position<Integer> pos_837 = tree_828.insertRight(pos_833,10) ;
  es.upm.aedlib.Position<Integer> pos_838 = tree_828.insertLeft(pos_837,18) ;
  es.upm.aedlib.Position<Integer> pos_839 = tree_828.insertRight(pos_837,1) ;
  es.upm.aedlib.Position<Integer> pos_840 = tree_828.insertRight(pos_832,19) ;
  es.upm.aedlib.Position<Integer> pos_841 = tree_828.insertRight(pos_840,5) ;
  es.upm.aedlib.Position<Integer> pos_842 = tree_828.insertLeft(pos_841,10) ;
  es.upm.aedlib.Position<Integer> pos_843 = tree_828.insertRight(pos_841,1) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_844 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_845 = tree_844.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_846 = tree_844.insertRight(root_845,18) ;
  es.upm.aedlib.Position<Integer> pos_847 = tree_844.insertLeft(pos_846,18) ;
  es.upm.aedlib.Position<Integer> pos_848 = tree_844.insertLeft(pos_847,18) ;
  es.upm.aedlib.Position<Integer> pos_849 = tree_844.insertLeft(pos_848,18) ;
  es.upm.aedlib.Position<Integer> pos_850 = tree_844.insertLeft(pos_849,13) ;
  es.upm.aedlib.Position<Integer> pos_851 = tree_844.insertLeft(pos_850,13) ;
  es.upm.aedlib.Position<Integer> pos_852 = tree_844.insertRight(pos_850,11) ;
  es.upm.aedlib.Position<Integer> pos_853 = tree_844.insertRight(pos_849,18) ;
  es.upm.aedlib.Position<Integer> pos_854 = tree_844.insertLeft(pos_853,18) ;
  es.upm.aedlib.Position<Integer> pos_855 = tree_844.insertRight(pos_853,1) ;
  es.upm.aedlib.Position<Integer> pos_856 = tree_844.insertRight(pos_848,10) ;
  es.upm.aedlib.Position<Integer> pos_857 = tree_844.insertRight(pos_856,10) ;
  es.upm.aedlib.Position<Integer> pos_858 = tree_844.insertLeft(pos_857,10) ;
  es.upm.aedlib.Position<Integer> pos_859 = tree_844.insertRight(pos_857,1) ;
  ok_sofar = new FillMaxTree(tree_828).doCall().checkResult(tree_844) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_078")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_079 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_079")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_860 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_861 = tree_860.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_862 = tree_860.insertRight(root_861,16) ;
  es.upm.aedlib.Position<Integer> pos_863 = tree_860.insertLeft(pos_862,8) ;
  es.upm.aedlib.Position<Integer> pos_864 = tree_860.insertRight(pos_862,16) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_865 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_866 = tree_865.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_867 = tree_865.insertRight(root_866,16) ;
  es.upm.aedlib.Position<Integer> pos_868 = tree_865.insertLeft(pos_867,8) ;
  es.upm.aedlib.Position<Integer> pos_869 = tree_865.insertRight(pos_867,16) ;
  ok_sofar = new FillMaxTree(tree_860).doCall().checkResult(tree_865) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_079")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_080 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_080")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_870 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_871 = tree_870.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_872 = tree_870.insertRight(root_871,19) ;
  es.upm.aedlib.Position<Integer> pos_873 = tree_870.insertRight(pos_872,8) ;
  es.upm.aedlib.Position<Integer> pos_874 = tree_870.insertLeft(pos_873,13) ;
  es.upm.aedlib.Position<Integer> pos_875 = tree_870.insertRight(pos_874,6) ;
  es.upm.aedlib.Position<Integer> pos_876 = tree_870.insertRight(pos_873,14) ;
  es.upm.aedlib.Position<Integer> pos_877 = tree_870.insertRight(pos_876,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_878 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_879 = tree_878.addRoot(6) ;
  es.upm.aedlib.Position<Integer> pos_880 = tree_878.insertRight(root_879,6) ;
  es.upm.aedlib.Position<Integer> pos_881 = tree_878.insertRight(pos_880,6) ;
  es.upm.aedlib.Position<Integer> pos_882 = tree_878.insertLeft(pos_881,6) ;
  es.upm.aedlib.Position<Integer> pos_883 = tree_878.insertRight(pos_882,6) ;
  es.upm.aedlib.Position<Integer> pos_884 = tree_878.insertRight(pos_881,2) ;
  es.upm.aedlib.Position<Integer> pos_885 = tree_878.insertRight(pos_884,2) ;
  ok_sofar = new FillMaxTree(tree_870).doCall().checkResult(tree_878) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_080")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_081 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_081")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_886 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_887 = tree_886.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_888 = tree_886.insertLeft(root_887,5) ;
  es.upm.aedlib.Position<Integer> pos_889 = tree_886.insertRight(pos_888,6) ;
  es.upm.aedlib.Position<Integer> pos_890 = tree_886.insertRight(pos_889,3) ;
  es.upm.aedlib.Position<Integer> pos_891 = tree_886.insertLeft(pos_890,10) ;
  es.upm.aedlib.Position<Integer> pos_892 = tree_886.insertLeft(pos_891,20) ;
  es.upm.aedlib.Position<Integer> pos_893 = tree_886.insertRight(pos_892,19) ;
  es.upm.aedlib.Position<Integer> pos_894 = tree_886.insertRight(pos_891,13) ;
  es.upm.aedlib.Position<Integer> pos_895 = tree_886.insertRight(pos_894,16) ;
  es.upm.aedlib.Position<Integer> pos_896 = tree_886.insertRight(pos_890,9) ;
  es.upm.aedlib.Position<Integer> pos_897 = tree_886.insertLeft(pos_896,13) ;
  es.upm.aedlib.Position<Integer> pos_898 = tree_886.insertLeft(pos_897,18) ;
  es.upm.aedlib.Position<Integer> pos_899 = tree_886.insertRight(pos_897,13) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_900 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_901 = tree_900.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_902 = tree_900.insertLeft(root_901,19) ;
  es.upm.aedlib.Position<Integer> pos_903 = tree_900.insertRight(pos_902,19) ;
  es.upm.aedlib.Position<Integer> pos_904 = tree_900.insertRight(pos_903,19) ;
  es.upm.aedlib.Position<Integer> pos_905 = tree_900.insertLeft(pos_904,19) ;
  es.upm.aedlib.Position<Integer> pos_906 = tree_900.insertLeft(pos_905,19) ;
  es.upm.aedlib.Position<Integer> pos_907 = tree_900.insertRight(pos_906,19) ;
  es.upm.aedlib.Position<Integer> pos_908 = tree_900.insertRight(pos_905,16) ;
  es.upm.aedlib.Position<Integer> pos_909 = tree_900.insertRight(pos_908,16) ;
  es.upm.aedlib.Position<Integer> pos_910 = tree_900.insertRight(pos_904,18) ;
  es.upm.aedlib.Position<Integer> pos_911 = tree_900.insertLeft(pos_910,18) ;
  es.upm.aedlib.Position<Integer> pos_912 = tree_900.insertLeft(pos_911,18) ;
  es.upm.aedlib.Position<Integer> pos_913 = tree_900.insertRight(pos_911,13) ;
  ok_sofar = new FillMaxTree(tree_886).doCall().checkResult(tree_900) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_081")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_082 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_082")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_914 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_915 = tree_914.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_916 = tree_914.insertLeft(root_915,13) ;
  es.upm.aedlib.Position<Integer> pos_917 = tree_914.insertLeft(pos_916,13) ;
  es.upm.aedlib.Position<Integer> pos_918 = tree_914.insertRight(pos_917,4) ;
  es.upm.aedlib.Position<Integer> pos_919 = tree_914.insertRight(pos_918,1) ;
  es.upm.aedlib.Position<Integer> pos_920 = tree_914.insertLeft(pos_919,9) ;
  es.upm.aedlib.Position<Integer> pos_921 = tree_914.insertLeft(pos_920,4) ;
  es.upm.aedlib.Position<Integer> pos_922 = tree_914.insertRight(pos_920,13) ;
  es.upm.aedlib.Position<Integer> pos_923 = tree_914.insertRight(pos_919,18) ;
  es.upm.aedlib.Position<Integer> pos_924 = tree_914.insertLeft(pos_923,7) ;
  es.upm.aedlib.Position<Integer> pos_925 = tree_914.insertRight(pos_923,3) ;
  es.upm.aedlib.Position<Integer> pos_926 = tree_914.insertRight(pos_916,13) ;
  es.upm.aedlib.Position<Integer> pos_927 = tree_914.insertRight(pos_926,7) ;
  es.upm.aedlib.Position<Integer> pos_928 = tree_914.insertLeft(pos_927,11) ;
  es.upm.aedlib.Position<Integer> pos_929 = tree_914.insertLeft(pos_928,20) ;
  es.upm.aedlib.Position<Integer> pos_930 = tree_914.insertRight(pos_929,1) ;
  es.upm.aedlib.Position<Integer> pos_931 = tree_914.insertRight(pos_928,4) ;
  es.upm.aedlib.Position<Integer> pos_932 = tree_914.insertLeft(pos_931,9) ;
  es.upm.aedlib.Position<Integer> pos_933 = tree_914.insertRight(root_915,6) ;
  es.upm.aedlib.Position<Integer> pos_934 = tree_914.insertLeft(pos_933,1) ;
  es.upm.aedlib.Position<Integer> pos_935 = tree_914.insertLeft(pos_934,13) ;
  es.upm.aedlib.Position<Integer> pos_936 = tree_914.insertLeft(pos_935,19) ;
  es.upm.aedlib.Position<Integer> pos_937 = tree_914.insertLeft(pos_936,8) ;
  es.upm.aedlib.Position<Integer> pos_938 = tree_914.insertLeft(pos_937,13) ;
  es.upm.aedlib.Position<Integer> pos_939 = tree_914.insertRight(pos_936,16) ;
  es.upm.aedlib.Position<Integer> pos_940 = tree_914.insertRight(pos_939,18) ;
  es.upm.aedlib.Position<Integer> pos_941 = tree_914.insertRight(pos_934,19) ;
  es.upm.aedlib.Position<Integer> pos_942 = tree_914.insertLeft(pos_941,17) ;
  es.upm.aedlib.Position<Integer> pos_943 = tree_914.insertRight(pos_942,10) ;
  es.upm.aedlib.Position<Integer> pos_944 = tree_914.insertLeft(pos_943,10) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_945 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_946 = tree_945.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_947 = tree_945.insertLeft(root_946,13) ;
  es.upm.aedlib.Position<Integer> pos_948 = tree_945.insertLeft(pos_947,13) ;
  es.upm.aedlib.Position<Integer> pos_949 = tree_945.insertRight(pos_948,13) ;
  es.upm.aedlib.Position<Integer> pos_950 = tree_945.insertRight(pos_949,13) ;
  es.upm.aedlib.Position<Integer> pos_951 = tree_945.insertLeft(pos_950,13) ;
  es.upm.aedlib.Position<Integer> pos_952 = tree_945.insertLeft(pos_951,4) ;
  es.upm.aedlib.Position<Integer> pos_953 = tree_945.insertRight(pos_951,13) ;
  es.upm.aedlib.Position<Integer> pos_954 = tree_945.insertRight(pos_950,7) ;
  es.upm.aedlib.Position<Integer> pos_955 = tree_945.insertLeft(pos_954,7) ;
  es.upm.aedlib.Position<Integer> pos_956 = tree_945.insertRight(pos_954,3) ;
  es.upm.aedlib.Position<Integer> pos_957 = tree_945.insertRight(pos_947,9) ;
  es.upm.aedlib.Position<Integer> pos_958 = tree_945.insertRight(pos_957,9) ;
  es.upm.aedlib.Position<Integer> pos_959 = tree_945.insertLeft(pos_958,9) ;
  es.upm.aedlib.Position<Integer> pos_960 = tree_945.insertLeft(pos_959,1) ;
  es.upm.aedlib.Position<Integer> pos_961 = tree_945.insertRight(pos_960,1) ;
  es.upm.aedlib.Position<Integer> pos_962 = tree_945.insertRight(pos_959,9) ;
  es.upm.aedlib.Position<Integer> pos_963 = tree_945.insertLeft(pos_962,9) ;
  es.upm.aedlib.Position<Integer> pos_964 = tree_945.insertRight(root_946,18) ;
  es.upm.aedlib.Position<Integer> pos_965 = tree_945.insertLeft(pos_964,18) ;
  es.upm.aedlib.Position<Integer> pos_966 = tree_945.insertLeft(pos_965,18) ;
  es.upm.aedlib.Position<Integer> pos_967 = tree_945.insertLeft(pos_966,18) ;
  es.upm.aedlib.Position<Integer> pos_968 = tree_945.insertLeft(pos_967,13) ;
  es.upm.aedlib.Position<Integer> pos_969 = tree_945.insertLeft(pos_968,13) ;
  es.upm.aedlib.Position<Integer> pos_970 = tree_945.insertRight(pos_967,18) ;
  es.upm.aedlib.Position<Integer> pos_971 = tree_945.insertRight(pos_970,18) ;
  es.upm.aedlib.Position<Integer> pos_972 = tree_945.insertRight(pos_965,10) ;
  es.upm.aedlib.Position<Integer> pos_973 = tree_945.insertLeft(pos_972,10) ;
  es.upm.aedlib.Position<Integer> pos_974 = tree_945.insertRight(pos_973,10) ;
  es.upm.aedlib.Position<Integer> pos_975 = tree_945.insertLeft(pos_974,10) ;
  ok_sofar = new FillMaxTree(tree_914).doCall().checkResult(tree_945) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_082")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_083 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_083")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_976 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_977 = tree_976.addRoot(12) ;
  es.upm.aedlib.Position<Integer> pos_978 = tree_976.insertLeft(root_977,20) ;
  es.upm.aedlib.Position<Integer> pos_979 = tree_976.insertLeft(pos_978,17) ;
  es.upm.aedlib.Position<Integer> pos_980 = tree_976.insertRight(pos_979,15) ;
  es.upm.aedlib.Position<Integer> pos_981 = tree_976.insertRight(pos_980,15) ;
  es.upm.aedlib.Position<Integer> pos_982 = tree_976.insertLeft(pos_981,17) ;
  es.upm.aedlib.Position<Integer> pos_983 = tree_976.insertLeft(pos_982,1) ;
  es.upm.aedlib.Position<Integer> pos_984 = tree_976.insertRight(pos_982,9) ;
  es.upm.aedlib.Position<Integer> pos_985 = tree_976.insertRight(pos_981,4) ;
  es.upm.aedlib.Position<Integer> pos_986 = tree_976.insertLeft(pos_985,14) ;
  es.upm.aedlib.Position<Integer> pos_987 = tree_976.insertRight(pos_978,3) ;
  es.upm.aedlib.Position<Integer> pos_988 = tree_976.insertLeft(pos_987,8) ;
  es.upm.aedlib.Position<Integer> pos_989 = tree_976.insertRight(pos_988,12) ;
  es.upm.aedlib.Position<Integer> pos_990 = tree_976.insertLeft(pos_989,12) ;
  es.upm.aedlib.Position<Integer> pos_991 = tree_976.insertLeft(pos_990,10) ;
  es.upm.aedlib.Position<Integer> pos_992 = tree_976.insertRight(pos_990,3) ;
  es.upm.aedlib.Position<Integer> pos_993 = tree_976.insertRight(pos_989,8) ;
  es.upm.aedlib.Position<Integer> pos_994 = tree_976.insertRight(pos_993,17) ;
  es.upm.aedlib.Position<Integer> pos_995 = tree_976.insertRight(pos_987,3) ;
  es.upm.aedlib.Position<Integer> pos_996 = tree_976.insertRight(pos_995,14) ;
  es.upm.aedlib.Position<Integer> pos_997 = tree_976.insertLeft(pos_996,18) ;
  es.upm.aedlib.Position<Integer> pos_998 = tree_976.insertLeft(pos_997,14) ;
  es.upm.aedlib.Position<Integer> pos_999 = tree_976.insertRight(pos_997,13) ;
  es.upm.aedlib.Position<Integer> pos_1000 = tree_976.insertRight(pos_996,5) ;
  es.upm.aedlib.Position<Integer> pos_1001 = tree_976.insertRight(pos_1000,7) ;
  es.upm.aedlib.Position<Integer> pos_1002 = tree_976.insertRight(root_977,19) ;
  es.upm.aedlib.Position<Integer> pos_1003 = tree_976.insertLeft(pos_1002,13) ;
  es.upm.aedlib.Position<Integer> pos_1004 = tree_976.insertLeft(pos_1003,9) ;
  es.upm.aedlib.Position<Integer> pos_1005 = tree_976.insertLeft(pos_1004,18) ;
  es.upm.aedlib.Position<Integer> pos_1006 = tree_976.insertLeft(pos_1005,2) ;
  es.upm.aedlib.Position<Integer> pos_1007 = tree_976.insertRight(pos_1006,17) ;
  es.upm.aedlib.Position<Integer> pos_1008 = tree_976.insertRight(pos_1004,17) ;
  es.upm.aedlib.Position<Integer> pos_1009 = tree_976.insertLeft(pos_1008,16) ;
  es.upm.aedlib.Position<Integer> pos_1010 = tree_976.insertRight(pos_1009,20) ;
  es.upm.aedlib.Position<Integer> pos_1011 = tree_976.insertRight(pos_1003,13) ;
  es.upm.aedlib.Position<Integer> pos_1012 = tree_976.insertLeft(pos_1011,6) ;
  es.upm.aedlib.Position<Integer> pos_1013 = tree_976.insertLeft(pos_1012,10) ;
  es.upm.aedlib.Position<Integer> pos_1014 = tree_976.insertRight(pos_1013,10) ;
  es.upm.aedlib.Position<Integer> pos_1015 = tree_976.insertRight(pos_1002,20) ;
  es.upm.aedlib.Position<Integer> pos_1016 = tree_976.insertLeft(pos_1015,20) ;
  es.upm.aedlib.Position<Integer> pos_1017 = tree_976.insertLeft(pos_1016,13) ;
  es.upm.aedlib.Position<Integer> pos_1018 = tree_976.insertLeft(pos_1017,14) ;
  es.upm.aedlib.Position<Integer> pos_1019 = tree_976.insertLeft(pos_1018,18) ;
  es.upm.aedlib.Position<Integer> pos_1020 = tree_976.insertRight(pos_1018,3) ;
  es.upm.aedlib.Position<Integer> pos_1021 = tree_976.insertRight(pos_1015,16) ;
  es.upm.aedlib.Position<Integer> pos_1022 = tree_976.insertLeft(pos_1021,9) ;
  es.upm.aedlib.Position<Integer> pos_1023 = tree_976.insertLeft(pos_1022,14) ;
  es.upm.aedlib.Position<Integer> pos_1024 = tree_976.insertLeft(pos_1023,2) ;
  es.upm.aedlib.Position<Integer> pos_1025 = tree_976.insertRight(pos_1021,6) ;
  es.upm.aedlib.Position<Integer> pos_1026 = tree_976.insertLeft(pos_1025,19) ;
  es.upm.aedlib.Position<Integer> pos_1027 = tree_976.insertLeft(pos_1026,7) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1028 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1029 = tree_1028.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_1030 = tree_1028.insertLeft(root_1029,17) ;
  es.upm.aedlib.Position<Integer> pos_1031 = tree_1028.insertLeft(pos_1030,14) ;
  es.upm.aedlib.Position<Integer> pos_1032 = tree_1028.insertRight(pos_1031,14) ;
  es.upm.aedlib.Position<Integer> pos_1033 = tree_1028.insertRight(pos_1032,14) ;
  es.upm.aedlib.Position<Integer> pos_1034 = tree_1028.insertLeft(pos_1033,9) ;
  es.upm.aedlib.Position<Integer> pos_1035 = tree_1028.insertLeft(pos_1034,1) ;
  es.upm.aedlib.Position<Integer> pos_1036 = tree_1028.insertRight(pos_1034,9) ;
  es.upm.aedlib.Position<Integer> pos_1037 = tree_1028.insertRight(pos_1033,14) ;
  es.upm.aedlib.Position<Integer> pos_1038 = tree_1028.insertLeft(pos_1037,14) ;
  es.upm.aedlib.Position<Integer> pos_1039 = tree_1028.insertRight(pos_1030,17) ;
  es.upm.aedlib.Position<Integer> pos_1040 = tree_1028.insertLeft(pos_1039,17) ;
  es.upm.aedlib.Position<Integer> pos_1041 = tree_1028.insertRight(pos_1040,17) ;
  es.upm.aedlib.Position<Integer> pos_1042 = tree_1028.insertLeft(pos_1041,10) ;
  es.upm.aedlib.Position<Integer> pos_1043 = tree_1028.insertLeft(pos_1042,10) ;
  es.upm.aedlib.Position<Integer> pos_1044 = tree_1028.insertRight(pos_1042,3) ;
  es.upm.aedlib.Position<Integer> pos_1045 = tree_1028.insertRight(pos_1041,17) ;
  es.upm.aedlib.Position<Integer> pos_1046 = tree_1028.insertRight(pos_1045,17) ;
  es.upm.aedlib.Position<Integer> pos_1047 = tree_1028.insertRight(pos_1039,14) ;
  es.upm.aedlib.Position<Integer> pos_1048 = tree_1028.insertRight(pos_1047,14) ;
  es.upm.aedlib.Position<Integer> pos_1049 = tree_1028.insertLeft(pos_1048,14) ;
  es.upm.aedlib.Position<Integer> pos_1050 = tree_1028.insertLeft(pos_1049,14) ;
  es.upm.aedlib.Position<Integer> pos_1051 = tree_1028.insertRight(pos_1049,13) ;
  es.upm.aedlib.Position<Integer> pos_1052 = tree_1028.insertRight(pos_1048,7) ;
  es.upm.aedlib.Position<Integer> pos_1053 = tree_1028.insertRight(pos_1052,7) ;
  es.upm.aedlib.Position<Integer> pos_1054 = tree_1028.insertRight(root_1029,20) ;
  es.upm.aedlib.Position<Integer> pos_1055 = tree_1028.insertLeft(pos_1054,20) ;
  es.upm.aedlib.Position<Integer> pos_1056 = tree_1028.insertLeft(pos_1055,20) ;
  es.upm.aedlib.Position<Integer> pos_1057 = tree_1028.insertLeft(pos_1056,17) ;
  es.upm.aedlib.Position<Integer> pos_1058 = tree_1028.insertLeft(pos_1057,17) ;
  es.upm.aedlib.Position<Integer> pos_1059 = tree_1028.insertRight(pos_1058,17) ;
  es.upm.aedlib.Position<Integer> pos_1060 = tree_1028.insertRight(pos_1056,20) ;
  es.upm.aedlib.Position<Integer> pos_1061 = tree_1028.insertLeft(pos_1060,20) ;
  es.upm.aedlib.Position<Integer> pos_1062 = tree_1028.insertRight(pos_1061,20) ;
  es.upm.aedlib.Position<Integer> pos_1063 = tree_1028.insertRight(pos_1055,10) ;
  es.upm.aedlib.Position<Integer> pos_1064 = tree_1028.insertLeft(pos_1063,10) ;
  es.upm.aedlib.Position<Integer> pos_1065 = tree_1028.insertLeft(pos_1064,10) ;
  es.upm.aedlib.Position<Integer> pos_1066 = tree_1028.insertRight(pos_1065,10) ;
  es.upm.aedlib.Position<Integer> pos_1067 = tree_1028.insertRight(pos_1054,18) ;
  es.upm.aedlib.Position<Integer> pos_1068 = tree_1028.insertLeft(pos_1067,18) ;
  es.upm.aedlib.Position<Integer> pos_1069 = tree_1028.insertLeft(pos_1068,18) ;
  es.upm.aedlib.Position<Integer> pos_1070 = tree_1028.insertLeft(pos_1069,18) ;
  es.upm.aedlib.Position<Integer> pos_1071 = tree_1028.insertLeft(pos_1070,18) ;
  es.upm.aedlib.Position<Integer> pos_1072 = tree_1028.insertRight(pos_1070,3) ;
  es.upm.aedlib.Position<Integer> pos_1073 = tree_1028.insertRight(pos_1067,7) ;
  es.upm.aedlib.Position<Integer> pos_1074 = tree_1028.insertLeft(pos_1073,2) ;
  es.upm.aedlib.Position<Integer> pos_1075 = tree_1028.insertLeft(pos_1074,2) ;
  es.upm.aedlib.Position<Integer> pos_1076 = tree_1028.insertLeft(pos_1075,2) ;
  es.upm.aedlib.Position<Integer> pos_1077 = tree_1028.insertRight(pos_1073,7) ;
  es.upm.aedlib.Position<Integer> pos_1078 = tree_1028.insertLeft(pos_1077,7) ;
  es.upm.aedlib.Position<Integer> pos_1079 = tree_1028.insertLeft(pos_1078,7) ;
  ok_sofar = new FillMaxTree(tree_976).doCall().checkResult(tree_1028) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_083")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_084 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_084")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1080 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1081 = tree_1080.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_1082 = tree_1080.insertRight(root_1081,6) ;
  es.upm.aedlib.Position<Integer> pos_1083 = tree_1080.insertLeft(pos_1082,16) ;
  es.upm.aedlib.Position<Integer> pos_1084 = tree_1080.insertRight(pos_1082,20) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1085 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1086 = tree_1085.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_1087 = tree_1085.insertRight(root_1086,20) ;
  es.upm.aedlib.Position<Integer> pos_1088 = tree_1085.insertLeft(pos_1087,16) ;
  es.upm.aedlib.Position<Integer> pos_1089 = tree_1085.insertRight(pos_1087,20) ;
  ok_sofar = new FillMaxTree(tree_1080).doCall().checkResult(tree_1085) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_084")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_085 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_085")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1090 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1091 = tree_1090.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_1092 = tree_1090.insertRight(root_1091,13) ;
  es.upm.aedlib.Position<Integer> pos_1093 = tree_1090.insertLeft(pos_1092,13) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1094 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1095 = tree_1094.addRoot(13) ;
  es.upm.aedlib.Position<Integer> pos_1096 = tree_1094.insertRight(root_1095,13) ;
  es.upm.aedlib.Position<Integer> pos_1097 = tree_1094.insertLeft(pos_1096,13) ;
  ok_sofar = new FillMaxTree(tree_1090).doCall().checkResult(tree_1094) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_085")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_086 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_086")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1098 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1099 = tree_1098.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1100 = tree_1098.insertLeft(root_1099,11) ;
  es.upm.aedlib.Position<Integer> pos_1101 = tree_1098.insertRight(pos_1100,18) ;
  es.upm.aedlib.Position<Integer> pos_1102 = tree_1098.insertLeft(pos_1101,16) ;
  es.upm.aedlib.Position<Integer> pos_1103 = tree_1098.insertLeft(pos_1102,13) ;
  es.upm.aedlib.Position<Integer> pos_1104 = tree_1098.insertRight(pos_1103,17) ;
  es.upm.aedlib.Position<Integer> pos_1105 = tree_1098.insertLeft(pos_1104,8) ;
  es.upm.aedlib.Position<Integer> pos_1106 = tree_1098.insertRight(root_1099,12) ;
  es.upm.aedlib.Position<Integer> pos_1107 = tree_1098.insertLeft(pos_1106,15) ;
  es.upm.aedlib.Position<Integer> pos_1108 = tree_1098.insertRight(pos_1107,15) ;
  es.upm.aedlib.Position<Integer> pos_1109 = tree_1098.insertRight(pos_1108,18) ;
  es.upm.aedlib.Position<Integer> pos_1110 = tree_1098.insertLeft(pos_1109,18) ;
  es.upm.aedlib.Position<Integer> pos_1111 = tree_1098.insertLeft(pos_1110,1) ;
  es.upm.aedlib.Position<Integer> pos_1112 = tree_1098.insertRight(pos_1110,1) ;
  es.upm.aedlib.Position<Integer> pos_1113 = tree_1098.insertRight(pos_1109,20) ;
  es.upm.aedlib.Position<Integer> pos_1114 = tree_1098.insertRight(pos_1113,16) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1115 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1116 = tree_1115.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_1117 = tree_1115.insertLeft(root_1116,8) ;
  es.upm.aedlib.Position<Integer> pos_1118 = tree_1115.insertRight(pos_1117,8) ;
  es.upm.aedlib.Position<Integer> pos_1119 = tree_1115.insertLeft(pos_1118,8) ;
  es.upm.aedlib.Position<Integer> pos_1120 = tree_1115.insertLeft(pos_1119,8) ;
  es.upm.aedlib.Position<Integer> pos_1121 = tree_1115.insertRight(pos_1120,8) ;
  es.upm.aedlib.Position<Integer> pos_1122 = tree_1115.insertLeft(pos_1121,8) ;
  es.upm.aedlib.Position<Integer> pos_1123 = tree_1115.insertRight(root_1116,16) ;
  es.upm.aedlib.Position<Integer> pos_1124 = tree_1115.insertLeft(pos_1123,16) ;
  es.upm.aedlib.Position<Integer> pos_1125 = tree_1115.insertRight(pos_1124,16) ;
  es.upm.aedlib.Position<Integer> pos_1126 = tree_1115.insertRight(pos_1125,16) ;
  es.upm.aedlib.Position<Integer> pos_1127 = tree_1115.insertLeft(pos_1126,1) ;
  es.upm.aedlib.Position<Integer> pos_1128 = tree_1115.insertLeft(pos_1127,1) ;
  es.upm.aedlib.Position<Integer> pos_1129 = tree_1115.insertRight(pos_1127,1) ;
  es.upm.aedlib.Position<Integer> pos_1130 = tree_1115.insertRight(pos_1126,16) ;
  es.upm.aedlib.Position<Integer> pos_1131 = tree_1115.insertRight(pos_1130,16) ;
  ok_sofar = new FillMaxTree(tree_1098).doCall().checkResult(tree_1115) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_086")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_087 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_087")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1132 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1133 = tree_1132.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1134 = tree_1132.insertLeft(root_1133,14) ;
  es.upm.aedlib.Position<Integer> pos_1135 = tree_1132.insertLeft(pos_1134,1) ;
  es.upm.aedlib.Position<Integer> pos_1136 = tree_1132.insertRight(pos_1134,5) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1137 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1138 = tree_1137.addRoot(5) ;
  es.upm.aedlib.Position<Integer> pos_1139 = tree_1137.insertLeft(root_1138,5) ;
  es.upm.aedlib.Position<Integer> pos_1140 = tree_1137.insertLeft(pos_1139,1) ;
  es.upm.aedlib.Position<Integer> pos_1141 = tree_1137.insertRight(pos_1139,5) ;
  ok_sofar = new FillMaxTree(tree_1132).doCall().checkResult(tree_1137) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_087")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_088 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_088")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1142 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1143 = tree_1142.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1144 = tree_1142.insertLeft(root_1143,16) ;
  es.upm.aedlib.Position<Integer> pos_1145 = tree_1142.insertLeft(pos_1144,18) ;
  es.upm.aedlib.Position<Integer> pos_1146 = tree_1142.insertLeft(pos_1145,7) ;
  es.upm.aedlib.Position<Integer> pos_1147 = tree_1142.insertLeft(pos_1146,2) ;
  es.upm.aedlib.Position<Integer> pos_1148 = tree_1142.insertRight(pos_1147,13) ;
  es.upm.aedlib.Position<Integer> pos_1149 = tree_1142.insertRight(pos_1145,1) ;
  es.upm.aedlib.Position<Integer> pos_1150 = tree_1142.insertLeft(pos_1149,20) ;
  es.upm.aedlib.Position<Integer> pos_1151 = tree_1142.insertRight(pos_1150,8) ;
  es.upm.aedlib.Position<Integer> pos_1152 = tree_1142.insertRight(pos_1149,12) ;
  es.upm.aedlib.Position<Integer> pos_1153 = tree_1142.insertRight(pos_1144,11) ;
  es.upm.aedlib.Position<Integer> pos_1154 = tree_1142.insertRight(pos_1153,4) ;
  es.upm.aedlib.Position<Integer> pos_1155 = tree_1142.insertLeft(pos_1154,12) ;
  es.upm.aedlib.Position<Integer> pos_1156 = tree_1142.insertLeft(pos_1155,3) ;
  es.upm.aedlib.Position<Integer> pos_1157 = tree_1142.insertRight(root_1143,1) ;
  es.upm.aedlib.Position<Integer> pos_1158 = tree_1142.insertRight(pos_1157,7) ;
  es.upm.aedlib.Position<Integer> pos_1159 = tree_1142.insertRight(pos_1158,2) ;
  es.upm.aedlib.Position<Integer> pos_1160 = tree_1142.insertRight(pos_1159,19) ;
  es.upm.aedlib.Position<Integer> pos_1161 = tree_1142.insertRight(pos_1160,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1162 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1163 = tree_1162.addRoot(13) ;
  es.upm.aedlib.Position<Integer> pos_1164 = tree_1162.insertLeft(root_1163,13) ;
  es.upm.aedlib.Position<Integer> pos_1165 = tree_1162.insertLeft(pos_1164,13) ;
  es.upm.aedlib.Position<Integer> pos_1166 = tree_1162.insertLeft(pos_1165,13) ;
  es.upm.aedlib.Position<Integer> pos_1167 = tree_1162.insertLeft(pos_1166,13) ;
  es.upm.aedlib.Position<Integer> pos_1168 = tree_1162.insertRight(pos_1167,13) ;
  es.upm.aedlib.Position<Integer> pos_1169 = tree_1162.insertRight(pos_1165,12) ;
  es.upm.aedlib.Position<Integer> pos_1170 = tree_1162.insertLeft(pos_1169,8) ;
  es.upm.aedlib.Position<Integer> pos_1171 = tree_1162.insertRight(pos_1170,8) ;
  es.upm.aedlib.Position<Integer> pos_1172 = tree_1162.insertRight(pos_1169,12) ;
  es.upm.aedlib.Position<Integer> pos_1173 = tree_1162.insertRight(pos_1164,3) ;
  es.upm.aedlib.Position<Integer> pos_1174 = tree_1162.insertRight(pos_1173,3) ;
  es.upm.aedlib.Position<Integer> pos_1175 = tree_1162.insertLeft(pos_1174,3) ;
  es.upm.aedlib.Position<Integer> pos_1176 = tree_1162.insertLeft(pos_1175,3) ;
  es.upm.aedlib.Position<Integer> pos_1177 = tree_1162.insertRight(root_1163,2) ;
  es.upm.aedlib.Position<Integer> pos_1178 = tree_1162.insertRight(pos_1177,2) ;
  es.upm.aedlib.Position<Integer> pos_1179 = tree_1162.insertRight(pos_1178,2) ;
  es.upm.aedlib.Position<Integer> pos_1180 = tree_1162.insertRight(pos_1179,2) ;
  es.upm.aedlib.Position<Integer> pos_1181 = tree_1162.insertRight(pos_1180,2) ;
  ok_sofar = new FillMaxTree(tree_1142).doCall().checkResult(tree_1162) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_088")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_089 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_089")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1182 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1183 = tree_1182.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_1184 = tree_1182.insertRight(root_1183,15) ;
  es.upm.aedlib.Position<Integer> pos_1185 = tree_1182.insertRight(pos_1184,19) ;
  es.upm.aedlib.Position<Integer> pos_1186 = tree_1182.insertLeft(pos_1185,12) ;
  es.upm.aedlib.Position<Integer> pos_1187 = tree_1182.insertRight(pos_1186,7) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1188 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1189 = tree_1188.addRoot(7) ;
  es.upm.aedlib.Position<Integer> pos_1190 = tree_1188.insertRight(root_1189,7) ;
  es.upm.aedlib.Position<Integer> pos_1191 = tree_1188.insertRight(pos_1190,7) ;
  es.upm.aedlib.Position<Integer> pos_1192 = tree_1188.insertLeft(pos_1191,7) ;
  es.upm.aedlib.Position<Integer> pos_1193 = tree_1188.insertRight(pos_1192,7) ;
  ok_sofar = new FillMaxTree(tree_1182).doCall().checkResult(tree_1188) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_089")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_090 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_090")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1194 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1195 = tree_1194.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_1196 = tree_1194.insertLeft(root_1195,5) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1197 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1198 = tree_1197.addRoot(5) ;
  es.upm.aedlib.Position<Integer> pos_1199 = tree_1197.insertLeft(root_1198,5) ;
  ok_sofar = new FillMaxTree(tree_1194).doCall().checkResult(tree_1197) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_090")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_091 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_091")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1200 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1201 = tree_1200.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_1202 = tree_1200.insertLeft(root_1201,15) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1203 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1204 = tree_1203.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1205 = tree_1203.insertLeft(root_1204,15) ;
  ok_sofar = new FillMaxTree(tree_1200).doCall().checkResult(tree_1203) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_091")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_092 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_092")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1206 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1207 = tree_1206.addRoot(17) ;
  es.upm.aedlib.Position<Integer> pos_1208 = tree_1206.insertLeft(root_1207,14) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1209 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1210 = tree_1209.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_1211 = tree_1209.insertLeft(root_1210,14) ;
  ok_sofar = new FillMaxTree(tree_1206).doCall().checkResult(tree_1209) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_092")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_093 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_093")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1212 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1213 = tree_1212.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_1214 = tree_1212.insertLeft(root_1213,13) ;
  es.upm.aedlib.Position<Integer> pos_1215 = tree_1212.insertLeft(pos_1214,14) ;
  es.upm.aedlib.Position<Integer> pos_1216 = tree_1212.insertRight(pos_1215,13) ;
  es.upm.aedlib.Position<Integer> pos_1217 = tree_1212.insertRight(pos_1214,9) ;
  es.upm.aedlib.Position<Integer> pos_1218 = tree_1212.insertRight(pos_1217,15) ;
  es.upm.aedlib.Position<Integer> pos_1219 = tree_1212.insertRight(root_1213,9) ;
  es.upm.aedlib.Position<Integer> pos_1220 = tree_1212.insertRight(pos_1219,1) ;
  es.upm.aedlib.Position<Integer> pos_1221 = tree_1212.insertLeft(pos_1220,9) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1222 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1223 = tree_1222.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1224 = tree_1222.insertLeft(root_1223,15) ;
  es.upm.aedlib.Position<Integer> pos_1225 = tree_1222.insertLeft(pos_1224,13) ;
  es.upm.aedlib.Position<Integer> pos_1226 = tree_1222.insertRight(pos_1225,13) ;
  es.upm.aedlib.Position<Integer> pos_1227 = tree_1222.insertRight(pos_1224,15) ;
  es.upm.aedlib.Position<Integer> pos_1228 = tree_1222.insertRight(pos_1227,15) ;
  es.upm.aedlib.Position<Integer> pos_1229 = tree_1222.insertRight(root_1223,9) ;
  es.upm.aedlib.Position<Integer> pos_1230 = tree_1222.insertRight(pos_1229,9) ;
  es.upm.aedlib.Position<Integer> pos_1231 = tree_1222.insertLeft(pos_1230,9) ;
  ok_sofar = new FillMaxTree(tree_1212).doCall().checkResult(tree_1222) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_093")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_094 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_094")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1232 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1233 = tree_1232.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_1234 = tree_1232.insertRight(root_1233,10) ;
  es.upm.aedlib.Position<Integer> pos_1235 = tree_1232.insertRight(pos_1234,14) ;
  es.upm.aedlib.Position<Integer> pos_1236 = tree_1232.insertLeft(pos_1235,16) ;
  es.upm.aedlib.Position<Integer> pos_1237 = tree_1232.insertRight(pos_1236,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1238 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1239 = tree_1238.addRoot(2) ;
  es.upm.aedlib.Position<Integer> pos_1240 = tree_1238.insertRight(root_1239,2) ;
  es.upm.aedlib.Position<Integer> pos_1241 = tree_1238.insertRight(pos_1240,2) ;
  es.upm.aedlib.Position<Integer> pos_1242 = tree_1238.insertLeft(pos_1241,2) ;
  es.upm.aedlib.Position<Integer> pos_1243 = tree_1238.insertRight(pos_1242,2) ;
  ok_sofar = new FillMaxTree(tree_1232).doCall().checkResult(tree_1238) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_094")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_095 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_095")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1244 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1245 = tree_1244.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_1246 = tree_1244.insertLeft(root_1245,3) ;
  es.upm.aedlib.Position<Integer> pos_1247 = tree_1244.insertLeft(pos_1246,17) ;
  es.upm.aedlib.Position<Integer> pos_1248 = tree_1244.insertRight(pos_1247,17) ;
  es.upm.aedlib.Position<Integer> pos_1249 = tree_1244.insertLeft(pos_1248,12) ;
  es.upm.aedlib.Position<Integer> pos_1250 = tree_1244.insertLeft(pos_1249,7) ;
  es.upm.aedlib.Position<Integer> pos_1251 = tree_1244.insertLeft(pos_1250,19) ;
  es.upm.aedlib.Position<Integer> pos_1252 = tree_1244.insertRight(pos_1250,11) ;
  es.upm.aedlib.Position<Integer> pos_1253 = tree_1244.insertRight(pos_1248,8) ;
  es.upm.aedlib.Position<Integer> pos_1254 = tree_1244.insertLeft(pos_1253,5) ;
  es.upm.aedlib.Position<Integer> pos_1255 = tree_1244.insertLeft(pos_1254,3) ;
  es.upm.aedlib.Position<Integer> pos_1256 = tree_1244.insertRight(pos_1253,6) ;
  es.upm.aedlib.Position<Integer> pos_1257 = tree_1244.insertLeft(pos_1256,6) ;
  es.upm.aedlib.Position<Integer> pos_1258 = tree_1244.insertRight(root_1245,20) ;
  es.upm.aedlib.Position<Integer> pos_1259 = tree_1244.insertLeft(pos_1258,10) ;
  es.upm.aedlib.Position<Integer> pos_1260 = tree_1244.insertLeft(pos_1259,14) ;
  es.upm.aedlib.Position<Integer> pos_1261 = tree_1244.insertRight(pos_1260,4) ;
  es.upm.aedlib.Position<Integer> pos_1262 = tree_1244.insertLeft(pos_1261,20) ;
  es.upm.aedlib.Position<Integer> pos_1263 = tree_1244.insertLeft(pos_1262,9) ;
  es.upm.aedlib.Position<Integer> pos_1264 = tree_1244.insertRight(pos_1262,11) ;
  es.upm.aedlib.Position<Integer> pos_1265 = tree_1244.insertRight(pos_1259,19) ;
  es.upm.aedlib.Position<Integer> pos_1266 = tree_1244.insertLeft(pos_1265,14) ;
  es.upm.aedlib.Position<Integer> pos_1267 = tree_1244.insertLeft(pos_1266,8) ;
  es.upm.aedlib.Position<Integer> pos_1268 = tree_1244.insertLeft(pos_1267,6) ;
  es.upm.aedlib.Position<Integer> pos_1269 = tree_1244.insertRight(pos_1266,17) ;
  es.upm.aedlib.Position<Integer> pos_1270 = tree_1244.insertLeft(pos_1269,13) ;
  es.upm.aedlib.Position<Integer> pos_1271 = tree_1244.insertRight(pos_1269,13) ;
  es.upm.aedlib.Position<Integer> pos_1272 = tree_1244.insertRight(pos_1265,13) ;
  es.upm.aedlib.Position<Integer> pos_1273 = tree_1244.insertLeft(pos_1272,15) ;
  es.upm.aedlib.Position<Integer> pos_1274 = tree_1244.insertLeft(pos_1273,5) ;
  es.upm.aedlib.Position<Integer> pos_1275 = tree_1244.insertRight(pos_1272,17) ;
  es.upm.aedlib.Position<Integer> pos_1276 = tree_1244.insertLeft(pos_1275,19) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1277 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1278 = tree_1277.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_1279 = tree_1277.insertLeft(root_1278,19) ;
  es.upm.aedlib.Position<Integer> pos_1280 = tree_1277.insertLeft(pos_1279,19) ;
  es.upm.aedlib.Position<Integer> pos_1281 = tree_1277.insertRight(pos_1280,19) ;
  es.upm.aedlib.Position<Integer> pos_1282 = tree_1277.insertLeft(pos_1281,19) ;
  es.upm.aedlib.Position<Integer> pos_1283 = tree_1277.insertLeft(pos_1282,19) ;
  es.upm.aedlib.Position<Integer> pos_1284 = tree_1277.insertLeft(pos_1283,19) ;
  es.upm.aedlib.Position<Integer> pos_1285 = tree_1277.insertRight(pos_1283,11) ;
  es.upm.aedlib.Position<Integer> pos_1286 = tree_1277.insertRight(pos_1281,6) ;
  es.upm.aedlib.Position<Integer> pos_1287 = tree_1277.insertLeft(pos_1286,3) ;
  es.upm.aedlib.Position<Integer> pos_1288 = tree_1277.insertLeft(pos_1287,3) ;
  es.upm.aedlib.Position<Integer> pos_1289 = tree_1277.insertRight(pos_1286,6) ;
  es.upm.aedlib.Position<Integer> pos_1290 = tree_1277.insertLeft(pos_1289,6) ;
  es.upm.aedlib.Position<Integer> pos_1291 = tree_1277.insertRight(root_1278,19) ;
  es.upm.aedlib.Position<Integer> pos_1292 = tree_1277.insertLeft(pos_1291,19) ;
  es.upm.aedlib.Position<Integer> pos_1293 = tree_1277.insertLeft(pos_1292,11) ;
  es.upm.aedlib.Position<Integer> pos_1294 = tree_1277.insertRight(pos_1293,11) ;
  es.upm.aedlib.Position<Integer> pos_1295 = tree_1277.insertLeft(pos_1294,11) ;
  es.upm.aedlib.Position<Integer> pos_1296 = tree_1277.insertLeft(pos_1295,9) ;
  es.upm.aedlib.Position<Integer> pos_1297 = tree_1277.insertRight(pos_1295,11) ;
  es.upm.aedlib.Position<Integer> pos_1298 = tree_1277.insertRight(pos_1292,19) ;
  es.upm.aedlib.Position<Integer> pos_1299 = tree_1277.insertLeft(pos_1298,13) ;
  es.upm.aedlib.Position<Integer> pos_1300 = tree_1277.insertLeft(pos_1299,6) ;
  es.upm.aedlib.Position<Integer> pos_1301 = tree_1277.insertLeft(pos_1300,6) ;
  es.upm.aedlib.Position<Integer> pos_1302 = tree_1277.insertRight(pos_1299,13) ;
  es.upm.aedlib.Position<Integer> pos_1303 = tree_1277.insertLeft(pos_1302,13) ;
  es.upm.aedlib.Position<Integer> pos_1304 = tree_1277.insertRight(pos_1302,13) ;
  es.upm.aedlib.Position<Integer> pos_1305 = tree_1277.insertRight(pos_1298,19) ;
  es.upm.aedlib.Position<Integer> pos_1306 = tree_1277.insertLeft(pos_1305,5) ;
  es.upm.aedlib.Position<Integer> pos_1307 = tree_1277.insertLeft(pos_1306,5) ;
  es.upm.aedlib.Position<Integer> pos_1308 = tree_1277.insertRight(pos_1305,19) ;
  es.upm.aedlib.Position<Integer> pos_1309 = tree_1277.insertLeft(pos_1308,19) ;
  ok_sofar = new FillMaxTree(tree_1244).doCall().checkResult(tree_1277) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_095")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_096 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_096")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1310 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1311 = tree_1310.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_1312 = tree_1310.insertLeft(root_1311,20) ;
  es.upm.aedlib.Position<Integer> pos_1313 = tree_1310.insertLeft(pos_1312,14) ;
  es.upm.aedlib.Position<Integer> pos_1314 = tree_1310.insertLeft(pos_1313,16) ;
  es.upm.aedlib.Position<Integer> pos_1315 = tree_1310.insertRight(pos_1312,13) ;
  es.upm.aedlib.Position<Integer> pos_1316 = tree_1310.insertLeft(pos_1315,13) ;
  es.upm.aedlib.Position<Integer> pos_1317 = tree_1310.insertRight(root_1311,3) ;
  es.upm.aedlib.Position<Integer> pos_1318 = tree_1310.insertLeft(pos_1317,20) ;
  es.upm.aedlib.Position<Integer> pos_1319 = tree_1310.insertRight(pos_1318,2) ;
  es.upm.aedlib.Position<Integer> pos_1320 = tree_1310.insertRight(pos_1317,8) ;
  es.upm.aedlib.Position<Integer> pos_1321 = tree_1310.insertLeft(pos_1320,7) ;
  es.upm.aedlib.Position<Integer> pos_1322 = tree_1310.insertRight(pos_1320,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1323 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1324 = tree_1323.addRoot(16) ;
  es.upm.aedlib.Position<Integer> pos_1325 = tree_1323.insertLeft(root_1324,16) ;
  es.upm.aedlib.Position<Integer> pos_1326 = tree_1323.insertLeft(pos_1325,16) ;
  es.upm.aedlib.Position<Integer> pos_1327 = tree_1323.insertLeft(pos_1326,16) ;
  es.upm.aedlib.Position<Integer> pos_1328 = tree_1323.insertRight(pos_1325,13) ;
  es.upm.aedlib.Position<Integer> pos_1329 = tree_1323.insertLeft(pos_1328,13) ;
  es.upm.aedlib.Position<Integer> pos_1330 = tree_1323.insertRight(root_1324,7) ;
  es.upm.aedlib.Position<Integer> pos_1331 = tree_1323.insertLeft(pos_1330,2) ;
  es.upm.aedlib.Position<Integer> pos_1332 = tree_1323.insertRight(pos_1331,2) ;
  es.upm.aedlib.Position<Integer> pos_1333 = tree_1323.insertRight(pos_1330,7) ;
  es.upm.aedlib.Position<Integer> pos_1334 = tree_1323.insertLeft(pos_1333,7) ;
  es.upm.aedlib.Position<Integer> pos_1335 = tree_1323.insertRight(pos_1333,2) ;
  ok_sofar = new FillMaxTree(tree_1310).doCall().checkResult(tree_1323) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_096")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_097 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_097")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1336 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1337 = tree_1336.addRoot(19) ;
  es.upm.aedlib.Position<Integer> pos_1338 = tree_1336.insertLeft(root_1337,20) ;
  es.upm.aedlib.Position<Integer> pos_1339 = tree_1336.insertLeft(pos_1338,20) ;
  es.upm.aedlib.Position<Integer> pos_1340 = tree_1336.insertRight(pos_1339,13) ;
  es.upm.aedlib.Position<Integer> pos_1341 = tree_1336.insertLeft(pos_1340,12) ;
  es.upm.aedlib.Position<Integer> pos_1342 = tree_1336.insertLeft(pos_1341,13) ;
  es.upm.aedlib.Position<Integer> pos_1343 = tree_1336.insertRight(pos_1340,14) ;
  es.upm.aedlib.Position<Integer> pos_1344 = tree_1336.insertLeft(pos_1343,18) ;
  es.upm.aedlib.Position<Integer> pos_1345 = tree_1336.insertRight(pos_1338,16) ;
  es.upm.aedlib.Position<Integer> pos_1346 = tree_1336.insertLeft(pos_1345,5) ;
  es.upm.aedlib.Position<Integer> pos_1347 = tree_1336.insertLeft(pos_1346,19) ;
  es.upm.aedlib.Position<Integer> pos_1348 = tree_1336.insertLeft(pos_1347,6) ;
  es.upm.aedlib.Position<Integer> pos_1349 = tree_1336.insertRight(pos_1346,9) ;
  es.upm.aedlib.Position<Integer> pos_1350 = tree_1336.insertLeft(pos_1349,16) ;
  es.upm.aedlib.Position<Integer> pos_1351 = tree_1336.insertRight(pos_1345,19) ;
  es.upm.aedlib.Position<Integer> pos_1352 = tree_1336.insertLeft(pos_1351,19) ;
  es.upm.aedlib.Position<Integer> pos_1353 = tree_1336.insertLeft(pos_1352,8) ;
  es.upm.aedlib.Position<Integer> pos_1354 = tree_1336.insertRight(pos_1352,10) ;
  es.upm.aedlib.Position<Integer> pos_1355 = tree_1336.insertRight(pos_1351,1) ;
  es.upm.aedlib.Position<Integer> pos_1356 = tree_1336.insertRight(pos_1355,7) ;
  es.upm.aedlib.Position<Integer> pos_1357 = tree_1336.insertRight(root_1337,15) ;
  es.upm.aedlib.Position<Integer> pos_1358 = tree_1336.insertRight(pos_1357,6) ;
  es.upm.aedlib.Position<Integer> pos_1359 = tree_1336.insertLeft(pos_1358,6) ;
  es.upm.aedlib.Position<Integer> pos_1360 = tree_1336.insertLeft(pos_1359,7) ;
  es.upm.aedlib.Position<Integer> pos_1361 = tree_1336.insertRight(pos_1360,14) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1362 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1363 = tree_1362.addRoot(18) ;
  es.upm.aedlib.Position<Integer> pos_1364 = tree_1362.insertLeft(root_1363,18) ;
  es.upm.aedlib.Position<Integer> pos_1365 = tree_1362.insertLeft(pos_1364,18) ;
  es.upm.aedlib.Position<Integer> pos_1366 = tree_1362.insertRight(pos_1365,18) ;
  es.upm.aedlib.Position<Integer> pos_1367 = tree_1362.insertLeft(pos_1366,13) ;
  es.upm.aedlib.Position<Integer> pos_1368 = tree_1362.insertLeft(pos_1367,13) ;
  es.upm.aedlib.Position<Integer> pos_1369 = tree_1362.insertRight(pos_1366,18) ;
  es.upm.aedlib.Position<Integer> pos_1370 = tree_1362.insertLeft(pos_1369,18) ;
  es.upm.aedlib.Position<Integer> pos_1371 = tree_1362.insertRight(pos_1364,16) ;
  es.upm.aedlib.Position<Integer> pos_1372 = tree_1362.insertLeft(pos_1371,16) ;
  es.upm.aedlib.Position<Integer> pos_1373 = tree_1362.insertLeft(pos_1372,6) ;
  es.upm.aedlib.Position<Integer> pos_1374 = tree_1362.insertLeft(pos_1373,6) ;
  es.upm.aedlib.Position<Integer> pos_1375 = tree_1362.insertRight(pos_1372,16) ;
  es.upm.aedlib.Position<Integer> pos_1376 = tree_1362.insertLeft(pos_1375,16) ;
  es.upm.aedlib.Position<Integer> pos_1377 = tree_1362.insertRight(pos_1371,10) ;
  es.upm.aedlib.Position<Integer> pos_1378 = tree_1362.insertLeft(pos_1377,10) ;
  es.upm.aedlib.Position<Integer> pos_1379 = tree_1362.insertLeft(pos_1378,8) ;
  es.upm.aedlib.Position<Integer> pos_1380 = tree_1362.insertRight(pos_1378,10) ;
  es.upm.aedlib.Position<Integer> pos_1381 = tree_1362.insertRight(pos_1377,7) ;
  es.upm.aedlib.Position<Integer> pos_1382 = tree_1362.insertRight(pos_1381,7) ;
  es.upm.aedlib.Position<Integer> pos_1383 = tree_1362.insertRight(root_1363,14) ;
  es.upm.aedlib.Position<Integer> pos_1384 = tree_1362.insertRight(pos_1383,14) ;
  es.upm.aedlib.Position<Integer> pos_1385 = tree_1362.insertLeft(pos_1384,14) ;
  es.upm.aedlib.Position<Integer> pos_1386 = tree_1362.insertLeft(pos_1385,14) ;
  es.upm.aedlib.Position<Integer> pos_1387 = tree_1362.insertRight(pos_1386,14) ;
  ok_sofar = new FillMaxTree(tree_1336).doCall().checkResult(tree_1362) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_097")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_098 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_098")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1388 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1389 = tree_1388.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_1390 = tree_1388.insertLeft(root_1389,4) ;
  es.upm.aedlib.Position<Integer> pos_1391 = tree_1388.insertRight(root_1389,2) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1392 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1393 = tree_1392.addRoot(4) ;
  es.upm.aedlib.Position<Integer> pos_1394 = tree_1392.insertLeft(root_1393,4) ;
  es.upm.aedlib.Position<Integer> pos_1395 = tree_1392.insertRight(root_1393,2) ;
  ok_sofar = new FillMaxTree(tree_1388).doCall().checkResult(tree_1392) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_098")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_099 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_099")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1396 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1397 = tree_1396.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_1398 = tree_1396.insertLeft(root_1397,14) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1399 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1400 = tree_1399.addRoot(14) ;
  es.upm.aedlib.Position<Integer> pos_1401 = tree_1399.insertLeft(root_1400,14) ;
  ok_sofar = new FillMaxTree(tree_1396).doCall().checkResult(tree_1399) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_099")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("fillMaxTree")
  public void test_fillMaxTree_100 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_fillMaxTree_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_fillMaxTree_100")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1402 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1403 = tree_1402.addRoot(20) ;
  es.upm.aedlib.Position<Integer> pos_1404 = tree_1402.insertLeft(root_1403,17) ;
  es.upm.aedlib.Position<Integer> pos_1405 = tree_1402.insertLeft(pos_1404,15) ;
  es.upm.aedlib.Position<Integer> pos_1406 = tree_1402.insertRight(pos_1404,12) ;
  es.upm.aedlib.Position<Integer> pos_1407 = tree_1402.insertRight(root_1403,20) ;
  es.upm.aedlib.Position<Integer> pos_1408 = tree_1402.insertLeft(pos_1407,3) ;
  es.upm.aedlib.Position<Integer> pos_1409 = tree_1402.insertRight(pos_1407,9) ;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_1410 = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root_1411 = tree_1410.addRoot(15) ;
  es.upm.aedlib.Position<Integer> pos_1412 = tree_1410.insertLeft(root_1411,15) ;
  es.upm.aedlib.Position<Integer> pos_1413 = tree_1410.insertLeft(pos_1412,15) ;
  es.upm.aedlib.Position<Integer> pos_1414 = tree_1410.insertRight(pos_1412,12) ;
  es.upm.aedlib.Position<Integer> pos_1415 = tree_1410.insertRight(root_1411,9) ;
  es.upm.aedlib.Position<Integer> pos_1416 = tree_1410.insertLeft(pos_1415,3) ;
  es.upm.aedlib.Position<Integer> pos_1417 = tree_1410.insertRight(pos_1415,9) ;
  ok_sofar = new FillMaxTree(tree_1402).doCall().checkResult(tree_1410) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_fillMaxTree_100")) ;
    ResultsHandler.add_result(new String("fillMaxTree"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd6";
}




static class BinaryTreeUtils2026 {

  static boolean checkFill(FillMaxTree call,
                           TestResult<Void,LinkedBinaryTree<Integer>> result,
                           BinaryTree<Integer> expected)
  {
    if (!call.noException(() -> "\nThe tree was\n"+call)) {
      return false;
    }

    if (!call.tree.equals(expected)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.DURING,
         "the call "+call+
         "\ncaused the tree to become\n"+
         call.tree+
         "\nwhich is different from the expected tree\n"+
         expected);
      return false;
    } else return true;
    
  }
}
  



























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Tree<?>) {
      Tree<?> t = (Tree<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("\n");
      buf.append(t.toString());
      buf.append("\n");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class IsBinarySearchTree extends TestCall<Boolean,Boolean>
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree;
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree_orig;
  String callString;
  
  public IsBinarySearchTree (es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree)
  {
    this.tree = tree ;
    if (tree == null)
      tree_orig = null ;
    else
      tree_orig = new es.upm.aedlib.tree.LinkedBinaryTree<Integer>(tree) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("BinaryTreeUtils.isBinarySearchTree")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(tree_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return BinaryTreeUtils.isBinarySearchTree(tree) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),tree)))
      return false ;
    if (!unchanged(tree,tree_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class FillMaxTree extends TestCall<Void,es.upm.aedlib.tree.LinkedBinaryTree<Integer>>
{
  es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree;
  String callString;
  
  public FillMaxTree (es.upm.aedlib.tree.LinkedBinaryTree<Integer> tree)
  {
    voidReturn = true ;
    this.tree = tree ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("BinaryTreeUtils.fillMaxTree")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(tree)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Void call () 
  {
    BinaryTreeUtils.fillMaxTree(tree) ;
    return null ;
  }
  
  public boolean checkResult (es.upm.aedlib.tree.LinkedBinaryTree<Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!BinaryTreeUtils2026.checkFill(this,result,expected))
      return false ;
    return true ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}










static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
