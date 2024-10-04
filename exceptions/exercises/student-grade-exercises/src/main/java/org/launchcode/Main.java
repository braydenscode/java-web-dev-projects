package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(5, 55);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!s
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            int points = CheckFileExtension(entry.getValue());
            System.out.println(entry.getKey() + "'s points: " + points);
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if (y != 0) {
            int sum = x / y;
        } else {
            try {
                throw new ArithmeticException("You cant divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.endsWith(".java")) {
            return 1;
        } else if (fileName == null || fileName.equals("")) {
            try {
                throw new NullPointerException("Filename is null.");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            return -1;
        } else {
            return 0;
        }
    }
}