package com.example.threads;

import javax.xml.crypto.Data;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ChatLine{
    final Date date;
    ChatLine(String text){
        date = new Date();
    }
    @Override
    public String toString() {
        return "nasz text [nasza data]";
    }
}

public class Main {
    ArrayDeque<ChatLine> chatDeque;

    public static void main(String[] args) {
	// write your code here
        ExecutorService chatService = Executors.newWorkStealingPool();
        Future<ChatLine> future0 = chatService.submit(createUser("Name","Surname"));

    }

    static Callable<ChatLine> createUser(String name, String surname){
        return ()->{
            return new ChatLine("Zakończono: ");
        };
    }
}
