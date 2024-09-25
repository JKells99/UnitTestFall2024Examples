package com.keyin.entities;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create a linked List
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert into a linked list
    //0. if linked list doesn't exist then create it
    //1. Inserting at the begining
    //2. Inserting at the ending
    //3. Insert anywhere in the LL

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;

    }

    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if ( i != size -1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public void searchNode (int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue) {
                    System.out.println( "Found the node at location: " + i + "\n");
                }
                tempNode = tempNode.next;
            }
            System.out.println("Node not found");
        }

    }

    public void deleteNode(int location) {
        if (head == null) { // Check if the list is empty
            System.out.println("The linked list does not exist.");
            return;
        }

        if (location == 0) { // Deleting the first node
            head = head.next; // Move head to the next node
            size--;
            if (size == 0) { // If the list had only one node
                tail = null;  // Set tail to null since it's now empty
            }
            return;
        }

        if (location >= size - 1) { // Deleting the last node
            Node currentNode = head;
            while (currentNode.next != tail) { // Find the second-to-last node
                currentNode = currentNode.next;
            }
            currentNode.next = null; // Remove the last node
            tail = currentNode;      // Update tail to the second-to-last node
            size--;
            return;
        }

        // Deleting a node in the middle
        Node currentNode = head;
        for (int i = 0; i < location - 1; i++) { // Find the node before the one to delete
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next; // Skip the node to delete
        size--;
    }

}


    //Traverse a Linked List
    //Search for a Node


