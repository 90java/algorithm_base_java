package com.nojava._01list;

public class Link_List_Demo<E> {









    private static class Node<E> {

        E elementData;

        Node<E> pre;

        Node<E> next;

        Node(Node<E> pre,E elementData , Node<E> next){
            this.elementData = elementData;
            this.pre = pre;
            this.next = next;
        }

    }
}
