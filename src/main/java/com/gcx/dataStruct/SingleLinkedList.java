package com.gcx.dataStruct;

import lombok.ToString;

/**
 * @ClassName SingleLinkedList
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/9 上午10:15
 * @Version 1.0
 */
@ToString
public class SingleLinkedList<T> {

    private Node head = null;
    private  Integer size = 0;

    public  Integer getSize() {
        return size;
    }

    public  class Node<T> {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    /**
     * 插入到尾
     * @param value
     */
    public void insertTail(T value){

        Node<T> newNode = new Node(value, null);

        if (head == null){
            head = newNode;

        }else{
            Node q = head;
            while(q.next != null){
                q = q.next;
            }
            newNode.next = q.next;
            q.next = newNode;
        }
        size = size +1;
    }

    /**
     * 倒序插入
     * @param newNode
     */
    public void insertToHead(Node newNode) {
        if (head == null) {
            head = newNode;//头结点为空
        } else {
            newNode.next = head;//新结点指向头结点（此时新结点为所有结点）
            head = newNode;//新结点赋值给头结点
        }
    }

    /**
     * 倒序插入
     * @param value
     */
    public void insertToHead(T value) {
        Node newNode = new Node(value, null);
        insertToHead(newNode);
    }

    /**
     * 单链表反转
     * @param
     * @return
     */
    public Node inverseLinkList(){

        Node pre = null;//前一个结点
        Node curr = head;//当前结点
        Node next= null;//下一个结点
        while(curr.next != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        curr.next = pre;
        return curr;
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList();
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(3);
        System.out.println("---------------"+linkedList.getSize());

//        SingleLinkedList<Integer> linkedList1 = new SingleLinkedList();
//        linkedList1.insertToHead(1);
//        linkedList1.insertToHead(2);
//        linkedList1.insertToHead(3);

        linkedList.inverseLinkList();

    }

}
