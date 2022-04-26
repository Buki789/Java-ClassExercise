//package com.revature.Git;
//
//import org.w3c.dom.Node;
//
//public class Quest5 {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode cur = head;
//        ListNode next = head;
//
//        while (cur != null) {
//            next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//
//        }
//
//
//    public static void main(String[] args) {
//        Linked a = new Linked();
//
//        Node head = null;
//
//        head = a.insert(12, head);
//        head = a.insert(99, head);
//        head = a.insert(8, head);
//        head = a.insert(39, head);
//        head = a.insert(5, head);
//
//        head = a.reverseIteratively(head);
//        a.printList(head);
//    }
//
//    }
