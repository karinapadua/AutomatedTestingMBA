package com.example.automatedSoftwareTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.example.automatedSoftwareTesting.Termo;


public class AutomatedTestingPalindromo {
    
    @Test
    public void testPalindormo(){

        String t = "Rotator";

        //Arrange
        Termo termo = new Termo(t);
        //Act
        termo.lerTermo(t);
        //Assert
        assertTrue(termo.isPalindromo());

    }
}
