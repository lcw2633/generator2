package com.xxxx.generator;

public class Test {

    public static void main(String[] args) {
        Node.insert(new Node(1));
        Node.insert(new Node(2));
        Node.insert(new Node(3));
        Node.insert(new Node(4));
        Node.insert(new Node(5));
        Node.insert(new Node(6));
        Node.bl(Node.headNode);

        Node node = Node.reverse(Node.headNode);

        Node.bl(node);

    }
}
