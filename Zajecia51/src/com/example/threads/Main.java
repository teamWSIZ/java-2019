package com.example.threads;

import java.util.ArrayDeque;
import java.util.concurrent.*;

public class Main {
    ArrayDeque<ChatLine> chatDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        User jozef = new User("Józef","Kudrys");
        User krzysztof = new User("Krzystof","Zarębski");

        ExecutorService chatService = Executors.newWorkStealingPool();

        Future<ChatLine> future0 = chatService.submit(createChatUser(jozef));
        Future<ChatLine> future1 = chatService.submit(createChatUser(krzysztof));

        chatDeque.add(new ChatLine(jozef,"Nasz tekst"));

        chatUserHelper(future0,2,TimeUnit.SECONDS);
        chatUserHelper(future1,2, TimeUnit.SECONDS);

        chatDeque.forEach(System.out::println);
    }

    Callable<ChatLine> createChatUser(User user){
        return ()->{
            int no = 0;
            while(no<100) {
                TimeUnit.MILLISECONDS.sleep(200);
                chatDeque.add(new ChatLine(user, "Kolejna linia"));
                no++;
            }

            return new ChatLine(user,"Zakończono rozmowę");
        };
    }

    void chatUserHelper(Future<ChatLine> chatUser, long timeout, TimeUnit timeUnit){
        try {
            chatUser.get(timeout,timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("Zakończono rozmowę po dwóch sekundach");
        }
    }

}
