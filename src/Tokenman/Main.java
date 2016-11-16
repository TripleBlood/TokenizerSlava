package Tokenman;

import Tokenman.models.Token;
import Tokenman.utils.LineSplittingToLinkedList;
import Tokenman.utils.ListToArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Token[] a = new Token[ListToArray.listToArray(LineSplittingToLinkedList.lineSplitting(line)).length];
        a = ListToArray.listToArray(LineSplittingToLinkedList.lineSplitting(line));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getText() + " - is " + a[i].getType() + " (from " + (a[i].getBegin() + 1) + " to " + (a[i].getEnd() + 1) + ")");
        }
    }

}
