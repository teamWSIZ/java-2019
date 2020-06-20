package com.example.threads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;

public class Main {
    ArrayDeque<ChatLine> chatDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        ArrayList<User> users = new ArrayList<>();

        User przemyslaw = new User("Przemysław", "Stokłosa");
        User jozef = new User("Józef","Kudrys");
        User krzysztof = new User("Krzystof","Zarębski");
        User katarzyna = new User("Katarzyna","Skrzyp");
        User anna = new User("Anna","Surma");

        users.addAll(Arrays.asList(przemyslaw,jozef,krzysztof,katarzyna,anna));

        ExecutorService chatService = Executors.newWorkStealingPool();

        chatDeque.add(new ChatLine(jozef,"Nasz tekst"));

        users.forEach(user -> {chatUserHelper(chatService,user,2,TimeUnit.SECONDS);});

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

    void chatUserHelper(ExecutorService service, User user, long timeout, TimeUnit timeUnit){
        Future<ChatLine> chatUser = service.submit(createChatUser(user));
        try {
            chatDeque.add(chatUser.get(timeout,timeUnit));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            chatDeque.add(new ChatLine(user,"System przerwał rozmowę"));
            //System.out.println("Zakończono rozmowę po dwóch sekundach");
        }
    }

}
