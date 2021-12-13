package com.company.Array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for (int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int number){
        if (count== items.length){
            int[] newItems = new int[count * 2];
            for (int i = 0; i<items.length; i++)
                newItems[i] = items[i];
            items = newItems;
        }
            items[count++]=number;
    }

    public void removeAt(int index){
        if (index<0 || index > count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i<count; i++){
            items[i]= items[i+1];
        }
        count--;
    }

    public int indexAt(int item){
        for (int i=0; i<count; i++)
            if(items[i]==item)
                return i;

        return -1;
    }
}
