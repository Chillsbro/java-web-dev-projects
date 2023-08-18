package org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Dr. Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le beech!";
        } else if (lang.equals("eng")) {
            return "Hello, World!";
        } else {
            return "I don't understand!";
        }
    }
}
