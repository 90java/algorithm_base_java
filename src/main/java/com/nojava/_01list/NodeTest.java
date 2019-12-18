package com.nojava._01list;

public class NodeTest {

    public static void main(String[] args) {
        //创建一个空链表 node相当于头指针
        Node<Integer> node = new Node<>();

//        Node<Integer> node1 = new Node<>();
//        node1.data=1;
//        node.addNodeHeadInsert(node1);
//
//        Node<Integer> node2 = new Node<>();
//        node2.data=2;
//        node.addNodeHeadInsert(node2);
//
//        Node<Integer> node3 = new Node<>();
//        node3.data=3;
//        node.addNodeHeadInsert(node3);

        node.addNodeHeadInsert(4);
//        node.addNodeHeadInsert(5);
//        node.addNodeHeadInsert(6);
//        node.addNodeInsert(9,9);
//        System.out.println(node.getElem(9));
        node.delete(1);
        System.out.println(node.size());

    }


}
