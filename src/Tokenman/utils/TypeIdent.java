package Tokenman.utils;

/**
 * Created by Дима on 14.11.2016.
 */
public class TypeIdent {

    public static boolean isDigit(char charElem) {
        return Character.isDigit(charElem);
    }

    public static boolean isLetter(char charElem) {
        return Character.isLetter(charElem);
    }

    public static boolean isSpace(char charElem) {
        return Character.isSpaceChar(charElem);
    }

    public static boolean isPunct(char charElem) {
        return (!(isDigit(charElem)) && !isSpace(charElem) && !isLetter(charElem));
    }
}