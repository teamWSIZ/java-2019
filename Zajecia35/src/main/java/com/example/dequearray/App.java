/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.dequearray;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    Deque<String> chatDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        App app = new App();
        app.chatTest();
    }

    public void chatTest(){
        System.out.println(chatDeque);

        chatDeque.offerLast("Pierwsza linia");
        chatDeque.offerLast("Kolejna linia ");
        chatDeque.offerLast("Linia");
        chatDeque.offerLast("Linia");

        System.out.println(chatDeque);

    }
}
