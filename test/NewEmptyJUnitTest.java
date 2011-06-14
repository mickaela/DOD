/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20301227
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

        //@Test
    //Test different classes and methods
    //You can make another test class for PLAYERS or ONE big test class
    //Screenshot to show test class works
    //VAlIDATION TESTS AND DEFECT TESTS
    //(this!=this) will FAIL a test == DEFECT TESTS
    public void northTest(){
        assertTrue(this==this);
        //i.e. Assert users/players Location
    }
}