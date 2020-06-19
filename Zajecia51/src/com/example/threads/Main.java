package com.example.threads;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ChatLine{
    SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");

    final Date date;
    final String lineText;
    final String name;
    final String surname;

    ChatLine(String name, String surname, String text){
        this.name = name;
        this.surname = surname;
        lineText = text;
        date = new Date();
    }
    @Override
    public String toString() {
        return lineText+" "+"["+name+" "+surname+" "+dateFormat.format(date)+"]";
    }
}

public class Main {
    ArrayDeque<ChatLine> chatDeque;

    public static void main(String[] args) {
	// write your code here
        ExecutorService chatService = Executors.newWorkStealingPool();
        Future<ChatLine> future0 = chatService.submit(createUser("Name","Surname"));

        System.out.println(new ChatLine("Przemysław", "Stokłosa","Nasz tekst"));
    }

    static Callable<ChatLine> createUser(String name, String surname){
        return ()->{
            return new ChatLine("Przemysław","Stokłosa","Zakończono: ");
        };
    }
}
