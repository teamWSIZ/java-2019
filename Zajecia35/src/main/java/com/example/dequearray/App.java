/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.dequearray;

import java.util.ArrayDeque;
import java.util.Deque;

class chatRecord{
    String text;
    String date;

    chatRecord(String text){
        this.text = text;
        date = "17:20";
    }

    @Override
    public String toString() {
        return "["+text+"  "+date+"]"+"\n";
    }
}

public class App {
    Deque<chatRecord> chatDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        App app = new App();
        app.chatTest();
    }

    public void chatTest(){

        chatDeque.offerLast(new chatRecord("Pierwsza linia"));
        chatDeque.offerLast(new chatRecord("Kolejna linia "));
        chatDeque.offerLast(new chatRecord("Linia"));
        chatDeque.offerLast(new chatRecord("Linia"));

        System.out.println(chatDeque);

    }
}
