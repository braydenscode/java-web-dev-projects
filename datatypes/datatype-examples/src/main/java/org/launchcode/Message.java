package org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("es")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("ru")) {
            return "Привет, мир!";
        } else {
            return "Hello, World!";
        }
    }
}
