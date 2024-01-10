package com.iamsajan.data_structures;

/*
DAY 10 : EASY
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
 */
public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();
        ListNode reversedList = reverseSinglyLinkedList.reverseList(head);

        while (reversedList != null) {
            System.out.println(reversedList.val);
            reversedList = reversedList.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode currentNode = head;
        ListNode previousNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next; // [2,3]
            currentNode.next = previousNode; // [1,2] -> [1, null]
            previousNode = currentNode; // [1,null] -> [2,3]
            currentNode = nextNode; // [2,3] -> [3,4]
        }
        return previousNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}