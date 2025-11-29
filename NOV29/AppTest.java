package com.mphasis.NOV29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void sayHelloTest()
    {
    	String expected ="Vanakam";
    	String actual=new App().sayHello();
    	assertEquals(expected,actual);
    	
    }
}
