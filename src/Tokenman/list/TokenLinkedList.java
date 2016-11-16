package Tokenman.list;

import Tokenman.models.Token;

/**
 * Created by Дима on 14.11.2016.
 */
public class TokenLinkedList {

    private Node top;
    private Node last;

    public void setCurrent(Node current) {
        this.current = current;
    }

    private Node current;

    public int getCount() {
        return count;
    }

    private int count;

    public void addToBegin(Token value) {
        Node newNode = new Node(value);
        // если список пустой
        if (top == null) {
            this.top = newNode;
            this.last = newNode;
        } else {
            // current - указатель на текущий элемент
            newNode.setNext(top);
            top = newNode;
        }
        this.count++;
    }

    public Node getTop() {
        return top;
    }

    public void add(Token value) {
        // создаем новый узел
        Node newNode = new Node(value);

        // если список пустой
        if (top == null) {
            this.top = newNode;
            this.last = newNode;
        } else {
            // current - указатель на текущий элемент
            Node current = this.top;
            // пока есть следующий элемент после текущего
            while (current.getNext() != null) {
                // переходим на следующий
                current = current.getNext();
            }
            // кладете новый элемент
            current.setNext(newNode);
        }
        this.count++;
    }

    public void print() {
        Node current = this.top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void remove(Token value) {
        // если удаляемый элемент - первый
        if (this.top.getValue() == value) {
            this.top = this.top.getNext();
        } else {
            Node current = this.top;
            int i = 0;
            while ((i < this.count - 1) && current.getNext().getValue() != value) {
                current = current.getNext();
                i++;
            }
            if (current.getNext() == null) {
                return;
            }
            current.setNext(current.getNext().getNext());
        }
    }


    // результирующий список - просто конкатенация двух списков
    public void union(TokenLinkedList newList) {
        if (this.last == null) {
            this.top = newList.top;
            this.last = newList.last;
            return;
        }
        this.last.setNext(newList.top);
        this.last = newList.last;
    }

    // каждый раз возвращает следующий элемент из списка
    public Token getCurrent() {
        // если current нулевой, ставим его в начало, и возвращаем
        if (current == null) {
            current = this.top;
            return current.getValue();
        }
        // прежде чем вернуть, смотрим, не нулевой ли следующий
        Node temp = current.getNext();
        current = current.getNext();

        if (temp == null) {
            return null;
        }

        return temp.getValue();
    }
}
