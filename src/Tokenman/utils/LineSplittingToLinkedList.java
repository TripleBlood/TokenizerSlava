package Tokenman.utils;

import Tokenman.list.TokenLinkedList;
import Tokenman.models.Token;

public class LineSplittingToLinkedList {

    public static TokenLinkedList lineSplitting(String line) {

        char lineMass[] = line.toCharArray();
        String buffer = "";

        TokenLinkedList TokenLinkedListOne = new TokenLinkedList();

        for (int i = 0; i < lineMass.length; i++) {
            if (i < lineMass.length && TypeIdent.isDigit(lineMass[i])) {
                int begin = i;
                while (i < lineMass.length && TypeIdent.isDigit(lineMass[i])) {
                    buffer += lineMass[i];
                    i++;
                }
                i--;
                int end = i;
                TokenLinkedListOne.add(new Token(begin, end, buffer, "Number"));
                buffer = "";
            } else if (i < lineMass.length && TypeIdent.isLetter(lineMass[i])) {
                int begin = i;
                while (i < lineMass.length && TypeIdent.isLetter(lineMass[i])) {
                    buffer += lineMass[i];
                    i++;
                }
                i--;
                int end = i;
                TokenLinkedListOne.add(new Token(begin, end, buffer, "Word"));
                buffer = "";
            } else if (i < lineMass.length && TypeIdent.isSpace(lineMass[i])) {
                int begin = i;
                while (i < lineMass.length && TypeIdent.isSpace(lineMass[i])) {
                    buffer += lineMass[i];
                    i++;
                }
                i--;
                int end = i;
                TokenLinkedListOne.add(new Token(begin, end, buffer, "Space Character"));
                buffer = "";
            } else if (i < lineMass.length && TypeIdent.isPunct(lineMass[i])) {
                int begin = i;
                while (i < lineMass.length && TypeIdent.isPunct(lineMass[i])) {
                    buffer += lineMass[i];
                    i++;
                }
                i--;
                int end = i;
                TokenLinkedListOne.add(new Token(begin, end, buffer, "Punctuation"));
                buffer = "";
            }
        }
        return TokenLinkedListOne;
    }

}