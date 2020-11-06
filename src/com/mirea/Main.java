package com.mirea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(18);
        list.add(9);
        list.add(30);
        WaitList<Integer> element=new WaitList(list);
        element.add(12);
        element.add(18);
        element.add(30);
        element.remove();
        System.out.println(element.toString());
        System.out.println(element.contains(12));
        System.out.println(element.contains(18));
        System.out.println(element.contains(30));
        UnfairWaitList<Integer> element1=new UnfairWaitList();
        element1.push(30);
        element1.push(18);
        element1.push(5);
        element1.push(21);
        element1.push(82);
        element1.MoveToBack(5,2);
        element1.printList();
        BoundedWaitList element2=new BoundedWaitList(4);
        element2.add(6);
        element2.add(2);
        element2.add(7);
        System.out.println(element2.toString());
    }
}
