package com.nojava;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalAccessException {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(1);

        Class<? extends LinkedList> aClass = integers.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        String nameVlues="";
        for (int i=0;i<declaredFields.length;i++){
            Field field = declaredFields[i];
            field.setAccessible(true);
            String name = field.getName();
            System.out.println(name);
//            if("first".equals(name)){
//                Node<Integer> o = (Node<Integer>) field.get(integers);
//                System.out.println(o.prev);
//                System.out.println(o.next);
//            }
            if("first".equals(name)){

                Object o = field.get(integers);

            }
            nameVlues+=field.get(integers);
        }
        System.out.println(nameVlues);
    }
    static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
