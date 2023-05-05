package com.solvd.laba.lab2.linkedList;

import java.util.NoSuchElementException;

public class LinkedListCustom<T> {
    /*declare properties*/
    private Node<T> head;
    private int size = 0;

    /*constructor*/
    public LinkedListCustom() {
        head = null;
    }

    public void add(T t) {
        //create new node to store generic value
        Node<T> newNode = new Node<>(t);

        //if list empty, new node become head
        if (head == null) {
            head = newNode;
        }
        //if list is not empty
        else {
            Node<T> current = head;
            //iterate until last node
            while (current.next != null) {
                current = current.next;
            }
            //set new node to last node
            current.next = newNode;
        }

        //update the size of the list
        size++;
    }

    public T get(int index) {
        //check for index is in bound, if not throw exception
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        //check for empty list
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node<T> current = head;
        //for loop to traverse the list to given index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        //return element at given index
        return current.t;
    }

    public int getSize() {
        return size;
    }

    private static class Node<T> {
        /*declare properties*/
        private T t;
        private Node<T> next;

        /*constructor*/
        public Node(T t) {
            this.t = t;
            next = null;
        }
    }
}
