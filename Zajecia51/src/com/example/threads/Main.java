package com.example.threads;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.concurrent.*;

public class Main {
    ArrayDeque<ChatLine> chatDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        User przemyslaw = new User("Przemysław","Stokłosa");

        ExecutorService chatService = Executors.newWorkStealingPool();
        Future<ChatLine> future0 = chatService.submit(createChatUser(przemyslaw));

        chatDeque.add(new ChatLine(przemyslaw,"Nasz tekst"));
        try {
            future0.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(chatDeque);
    }

    Callable<ChatLine> createChatUser(User user){
        return ()->{
            int no = 0;
            while(no<10) {
                TimeUnit.MILLISECONDS.sleep(200);
                chatDeque.add(new ChatLine(user, "Kolejna linia"));
                no++;
            }

            return new ChatLine(user,"Zakończono rozmowę");
        };
    }
}
