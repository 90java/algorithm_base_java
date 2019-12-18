package com.nojava._01list;

public class Node<E> {

    public E data;

    public Node<E> next;

    private int size;

    /**
     * 初始化 建立一个空链表
     */
    public Node() {
    }

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getElem(int index){
        Node<E> p = next;
        int j = 1;
        while (p!=null&&j<index){
            p=p.next;
            ++j;
        }
        if(p==null||j>index){
            return null;
        }
        return p.data;
    }


    /**
     * 头插
     * @param node
     */
    public void addNodeHeadInsert(Node<E> node){
        if(next==null){
            next = node;
        }else{
            Node<E> temp = next;
            node.next=temp;
            next = node;
        }
        size++;
    }

    /**
     * 直接插入元素数据
     * @param data
     */
    public void addNodeHeadInsert(E data){
        if(next==null){
            next = new Node<>();
            next.data = data;
        }else{
            Node<E> temp = next;
            Node<E> node = new Node<>();
            node.data = data;
            node.next=temp;
            next = node;
        }
        size++;
    }

    /**
     * 在第i节点中插入数据
     */
    public void addNodeInsert(int index,E data){
        Node<E> p = this;

        int j=1;
        //j<i 遍历链表
        while (p!=null&&j<index){
            p = p.next;
            ++j;
        }
        //什么时候会大于呢？
        if(p==null||j>index){
            return ;
        }
        Node<E> newNode = new Node<>();
        newNode.data = data;
        newNode.next = p.next;
        p.next = newNode;
        size++;
    }

    /**
     * 删除第index节点
     * @param index
     */
    public void delete(int index){
        Node<E> p = this;
        int j = 1;
        while (p!=null&&j<index){
            p=p.next;
            ++j;
        }
        if(p.next==null||j>index){
            return;
        }
        Node<E> q  = p.next;
        p.next = q.next;
        size--;
    }


    public int size(){
        return size;
    }
}
