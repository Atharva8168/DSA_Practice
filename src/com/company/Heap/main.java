package com.company.Heap;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        Heap heap = new Heap();
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
//        System.out.println("Done");

        int[] items = {1, 3, 10, 19, 5, 2, 6};
        var heap = new Heap();

        for (var item : items){
            heap.insert(item);
        }

//        while(!heap.isEmpty()){
//            System.out.println(heap.remove());
//        }

        // Descending Order
//        for (int i = 0 ; i < items.length ; i++){
//            items[i] = heap.remove();
//        }
//        System.out.println(Arrays.toString(items));

        // Ascending Order
        for (int i = items.length - 1; i >= 0 ; i--){
            items[i] = heap.remove();
        }
        System.out.println(Arrays.toString(items));
    }
}

