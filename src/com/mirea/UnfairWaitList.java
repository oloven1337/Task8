package com.mirea;

public class UnfairWaitList<E> extends WaitList {
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void remove(int position)
    {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0)
        {
            head = temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
        System.out.println("\n");
    }


    public void MoveToBack(int element,int position) {
        remove(position);
        content.offer(element);
    }
}



