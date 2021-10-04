package com.xxxx.generator;

public class Node {

    public static Node headNode = new Node();

    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void insertToFirst(Node node){
        node.next = this.next;
        this.next = node;
    }

    public static void insert(Node node){
        if(headNode.next == null){
            headNode.next = node;
            System.out.println("插入了一条数据"+node.value);
            return;
        }
        Node temp = headNode;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        System.out.println("插入了一条数据"+node.value);
    }

    public static Node reverse(Node headNode){
        Node newHeadNode = new Node();
        Node temp = headNode.next;
        while (temp != null){
            Node node = temp;
            System.out.println("反转了"+temp);
            temp = temp.next;
            node.next = newHeadNode.next;
            newHeadNode.next = node;
        }
        return newHeadNode;
    }

    public static void bl(Node headNode){
        if(headNode.next == null){
            System.out.println("头节点为空");
            return;
        }
        Node temp = headNode.next;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
