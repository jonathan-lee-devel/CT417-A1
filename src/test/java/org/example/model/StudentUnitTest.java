package org.example.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentUnitTest {

    @Test
    public void testGetUsername() {
        Student student = new Student();

        String testName = "test";
        int testAge = 33;

        student.setName(testName);
        student.setAge(testAge);

        String testUsername = "test33";

        assertEquals(testUsername, student.getUsername());
    }

    @Test
    public void testGetUsernameNull() {
        Student student = new Student();

        Exception exception = null;
        try {
            student.getUsername();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            exception = ex;
        }

        assertNull(exception);
    }

}
