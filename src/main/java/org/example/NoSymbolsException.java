package org.example;

public class NoSymbolsException extends IllegalArgumentException{

    NoSymbolsException() {
        super("No arguments in current string");
    }

}
