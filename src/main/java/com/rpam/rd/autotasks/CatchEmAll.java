package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException e1) {
            throw new IllegalArgumentException("Resource is missing", e1);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Resource error", e2);
        } catch (ArithmeticException | NumberFormatException e3) {
            System.err.println(e3.getMessage());
        }
    }
}
