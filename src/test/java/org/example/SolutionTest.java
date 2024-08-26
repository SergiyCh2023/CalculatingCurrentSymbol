package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }


    @Test
    void calculatingCurrentSymbolTestReturnThree()  {
        int result = solution.calculatingCurrentSymbol("the happiest day in my life", "e");
        Assertions.assertEquals(3, result);
    }


    @Test
    void calculatingCurrentSymbolTestReturnTwo()  {
        int result = solution.calculatingCurrentSymbol("the happiest day in my life", "p");
        Assertions.assertEquals(2, result);
    }

    @Test
    void calculatingCurrentSymbolTestReturnFive()  {
        int result = solution.calculatingCurrentSymbol("the happiest day in my life", " ");
        Assertions.assertEquals(5, result);
    }


    @Test
    void calculatingCurrentSymbolTestNoSymbolsException() {
        Assertions.assertThrows(NoSymbolsException.class, ()-> solution.calculatingCurrentSymbol("", "s"));
        Assertions.assertThrows(NoSymbolsException.class, ()-> solution.calculatingCurrentSymbol("kbnakd", ""));
    }

}