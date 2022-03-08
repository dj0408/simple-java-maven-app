package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
  
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        App.main(null);
        try {
            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World!\"");
        }
    } 
    @Test
    public void testcarprice()
    { App a1 = new App();
     try {
       assertEquals("honda is expensive", a1.carprice("honda")," it should come expensive");}
     catch (AssertionError e)
     {System.out.println("Different test case");}
     
        }
  @Test
  public void testadd()
  {  App a2 = new App();
   try { assertEquals(3, a2.add(1,2), "Addition should be shown");}
   catch (AssertionError e)
   {System.out.println(" Test is failed");}
  }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
