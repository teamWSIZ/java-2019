package com.example.threads;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ChatLine{
    ChatLine(String text){

    }
    @Override
    public String toString() {
        return "ChatLine{}";
    }
}

public class Main {
    ArrayDeque<ChatLine> chatDeque;

    public static void main(String[] args) {
	// write your code here
        ExecutorService chatService = Executors.newWorkStealingPool();

        Future<ChatLine> future0 = chatService.submit(createUser("Name"));

    }

    static Callable<ChatLine> createUser(String param){
        return ()->{
            return new ChatLine("Zakończono: "+param);
        };
    }
}
