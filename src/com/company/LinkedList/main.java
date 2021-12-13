package com.company.LinkedList;

import java.sql.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(20);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromTheEnd(2));

    }
}
