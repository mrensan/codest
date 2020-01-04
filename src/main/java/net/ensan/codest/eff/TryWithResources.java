package net.ensan.codest.eff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TryWithResources {

    static String firstLineOfFile(String path, String defaultValue) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            for (Throwable t: Arrays.asList(e.getSuppressed())) {
                System.out.print(t);
                System.out.println("");
            }

            return defaultValue;
        } finally {
            System.out.println("I am obsessive to write sth here!");
        }
    }

    public static void main(String[] args) {
        String path = args[0];
        System.out.println(firstLineOfFile(path, "Not Found!"));
    }

}
