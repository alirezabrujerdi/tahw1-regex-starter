/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.RegexSolution;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 16
 * @author mhrimaz
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:25, priority:1  }  | $$$GRADER$$$");
    }
    @Test
    public void testValid() {
        assertTrue(RegexSolution.isValidStudentNumber("9600003"));
        assertTrue(RegexSolution.isValidStudentNumber("9712343"));
        assertTrue(RegexSolution.isValidStudentNumber("9512343"));
        assertTrue(RegexSolution.isValidStudentNumber("9412343"));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void testInvalid() {
        assertFalse(RegexSolution.isValidStudentNumber("9624872")); 
        assertFalse(RegexSolution.isValidStudentNumber("9324873")); 
        assertFalse(RegexSolution.isValidStudentNumber("96524873")); 
        assertFalse(RegexSolution.isValidStudentNumber("96873")); 
        assertFalse(RegexSolution.isValidStudentNumber("96873")); 
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void guardNull() {
        assertFalse(RegexSolution.isValidStudentNumber(null));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:3 , reason:\"Test Passed.\" } | $$$GRADER$$$" );        
    }
    
    @Test
    public void guardEmpty() {
        assertFalse(RegexSolution.isValidStudentNumber("")); 
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:2 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
        @Test
    public void guardNotNumber() {
        assertFalse(RegexSolution.isValidStudentNumber("Hello")); 
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
}
