package edu.sjsu.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradebookTest {

    @Test
    void addStudent() {
        assertTrue(Gradebook.addStudent(1, "Bob", 'A'));
        assertTrue(Gradebook.addStudent(2, "Alice", 'i'));
        assertFalse(Gradebook.addStudent(1, "Cathy", 'C'));
    }

    @Test
    void testAddStudent() {
        assertFalse(Gradebook.addStudent(3,"Trudy"));
    }

    @Test
    void deleteStudent() {
        assertTrue(Gradebook. deleteStudent(6));

    }

    @Test
    void updateGrade() {
        assertFalse(Gradebook.updateGrade(6, 'o'));
    }


}