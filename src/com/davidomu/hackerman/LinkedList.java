package com.davidomu.hackerman;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int item){
            value = item;
        }
    }

    private Node first;
    private Node last;
    int counter = 0;

    public void addItem(int item) {
        var node = new Node(item);

        if(first == null){
            first = last = node;
        }else{
            last.next = node;
            last = node;
            counter++;
        }
    }

    public void removeFirst(){
        var second = first.next;
        first.next = null;
        first = second;
        counter--;
    }

    public void removeLast(){
        var point = first;
        while(point.next != last){
            point = point.next;
        }
        point.next = null;
        last = point;
        counter--;
    }

    public void addFirst(int item){
        var node = new Node(item);
        node.next = first;
        first = node;
        counter++;
    }

    public void addLast(int item){
        var node = new Node(item);
        last.next = node;
        last = node;
        counter++;

    }

    public int indexOf(int item) {
        int count = 0;
        var point = first;
        while(point.next != null){
            if(point.value == item){
                return count;
            }else{
                point = point.next;
                count++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        var point = first;
        while (point.next != null) {
            if(point.value == item){
                return true;
            }else{
                point = point.next;
            }
        }
        return false;
    }

    public void addAtIndex(int position, int item){
        var node = new Node(item);
        int count = 0;
        var point = first;
        while(count != position - 1){
            point = point.next;
            count++;
        }
        node.next = point.next;
        point.next = node;
    }
}
