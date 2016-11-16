package Tokenman.models;

public class Token {

    private int begin;
    private int end;
    private String text;
    private String type;

    public Token(int begin, int end, String text, String type) {
        this.begin = begin;
        this.end = end;
        this.text = text;
        this.type = type;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

}
