package Dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t;i++){

            Node head = null, tail = null;

            while(true){
                int data  = sc.nextInt();
                if(data == -1) break;

                Node node = new Node(data);
                if(head == null){
                    head = node;
                    tail = node;
                }
                else{
                    tail.next = node;
                    tail = node;
                }
            }
            Node reversedHead = reverseList(head);

            // Print the reversed list
            printList(reversedHead);
            System.out.println(-1);

        }


    }
}
