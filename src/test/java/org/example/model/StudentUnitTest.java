package org.example.model;

import org.junit.Test;

public class StudentUnitTest {

    @Test
    public void testGetUsername() {
        Student student = new Student();

        String testName = "test";
        int testAge = 33;

        student.setName(testName);
        student.setAge(testAge);

        String testUsername = "test33";

        assert testUsername.equals(student.getUsername());
    }

}
