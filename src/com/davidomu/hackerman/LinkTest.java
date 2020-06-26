package com.davidomu.hackerman;

public class LinkTest {
    public static void main(String[] args){
        var peoplesAge = new LinkedList();
        peoplesAge.addItem(54);
        peoplesAge.addItem(67);
        peoplesAge.addItem(70);
        peoplesAge.addItem(709);
        System.out.println(peoplesAge.indexOf(54));

    }
}
