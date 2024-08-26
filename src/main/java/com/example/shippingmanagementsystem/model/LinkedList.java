package com.example.shippingmanagementsystem.model;

public class LinkedList<T> {
    private Node<T> head; // Reference to the first node (head) of the list
    private Node<T> tail; // Reference to the last node (tail) of the list

    public LinkedList() {
        head = null; // Initialize an empty list
        tail = null;
    }

    // Adds a new node with the given data to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node
        if (head == null) {
            head = newNode; // If the list is empty, set head and tail to the new node
            tail = newNode;
        } else {
            tail.next = newNode; // Otherwise, add the new node after the current tail
            tail = newNode; // Update the tail to the new node
        }
    }

    // Removes the first occurrence of the specified data from the list
    public void remove(T data) {
        Node<T> current = head; // Start from the head
        Node<T> previous = null; // Keep track of the previous node
        while (current != null && !current.data.equals(data)) {
            previous = current; // Move to the next node
            current = current.next;
        }
        if (current != null) {
            if (previous != null) {
                previous.next = current.next; // Remove the current node
            } else {
                head = current.next; // Update the head if the current node is the head
            }
            if (current == tail) {
                tail = previous; // Update the tail if the current node is the tail
            }
        }
    }

    // Finds and returns the first occurrence of the specified data
    public T find(T data) {
        Node<T> current = head; // Start from the head
        while (current != null) {
            if (current.data.equals(data)) {
                return current.data; // Return the data if found
            }
            current = current.next; // Move to the next node
        }
        return null; // Data not found
    }

    // Node class to represent individual elements
    private static class Node<T> {
        T data; // Data stored in the node
        Node<T> next; // Reference to the next node

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}



//Here’s a brief explanation of each method:
//add(T data): Adds a new node with the given data to the end of the list.
//remove(T data): Removes the first occurrence of the specified data from the list.
//find(T data): Finds and returns the first occurrence of the specified data.
//The Node class represents individual elements in the linked list.
