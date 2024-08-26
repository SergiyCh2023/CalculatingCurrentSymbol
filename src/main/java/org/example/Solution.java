package org.example;

public class Solution {

    public int calculatingCurrentSymbol(String s, String currentSymbols) {

        if (s.length() == 0 || currentSymbols.length() == 0) throw new NoSymbolsException();

        String [] array = s.split("");
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(currentSymbols)) result++;
        }

        return  result;
    }


}
