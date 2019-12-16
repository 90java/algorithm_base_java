package com.nojava._01list;

import java.util.Arrays;

public class Array_List_Demo<E> {

    /**
     * 数组的存储位置
     * 存储的大小
     */
    public static final Object[] objects = {};
    /**
     * 线性表的当前长度
     */
    private int size;

    transient Object[] elementData;

    public Array_List_Demo(){
        this.elementData=objects;
    }


    public E getElem(int i){
        if(i<0||i>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elementData(i);
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    /**
     * 插入算法
     * 插入不合理 抛出异常
     * 线性表长度大于数组长度 则抛错或者动态扩容
     * 从最后一个元素开始向前遍历到第i个元素 分别将他们向后移动一个单位
     * 将插入元素插入到第i个位置
     * 表长加1
     *
     * @param e
     */
    void add(int index,E e){
        if(index<0||index>=size)
            throw new ArrayIndexOutOfBoundsException();
        final int s;
        Object[] emementData;
        if((s=size)==(emementData=this.elementData).length){
            emementData=grow();
        }



    }

    Object[] grow(){
        return grow(size+1);
    }

    Object[] grow(int minCapacity){
        return elementData= Arrays.copyOf(elementData,newCapacity(minCapacity));
    }
    private int newCapacity(int minCapacity) {
        // overflow-conscious code
//        int oldCapacity = elementData.length;
//        int newCapacity = oldCapacity + (oldCapacity >> 1);
//        if (newCapacity - minCapacity <= 0) {
//            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
//                return Math.max(DEFAULT_CAPACITY, minCapacity);
//            if (minCapacity < 0) // overflow
//                throw new OutOfMemoryError();
//            return minCapacity;
//        }
//        return (newCapacity - MAX_ARRAY_SIZE <= 0)
//                ? newCapacity
//                : hugeCapacity(minCapacity);
        return 0;
    }

}
