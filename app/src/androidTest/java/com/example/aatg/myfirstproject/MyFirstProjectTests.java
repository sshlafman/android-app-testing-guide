package com.example.aatg.myfirstproject;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * @author shymon
 */

public class MyFirstProjectTests extends TestCase {

    public MyFirstProjectTests() {
        this("MyFirstProjectTests");
    }

    /**
     * @param name - test's name
     */
    public MyFirstProjectTests(String name) {
        super(name);
    }

    /* (non-Javadoc)
        @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /* (non-Javadoc)
        @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @SmallTest
    public void testSomething() {
        fail("Not implemtented yet");
    }
}