package Tokenman.utils;

import Tokenman.list.Node;
import Tokenman.list.TokenLinkedList;
import Tokenman.models.Token;

public class ListToArray {

    public static Token[] listToArray(TokenLinkedList value) {
        //Node current = new Node(value.getTop().getValue());
        //Token[] tokenArray = new Token[value.getCount()];
        //for (int i = 0; i < tokenArray.length ; i++){
        //    tokenArray[i] = current.getValue();
        //    current = current.getNext();
        //}

        Token[] tokenArray = new  Token[value.getCount()];
        for (int i = 0; i < tokenArray.length; i++){
            tokenArray[i] = value.getCurrent();
        }
        return tokenArray;
    }

}
