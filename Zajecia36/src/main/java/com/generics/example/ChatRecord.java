package com.generics.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ChatRecord {
    String text;
    String date;

    ChatRecord(String text){
        this.text = text;

        DateFormat dateFormat = new SimpleDateFormat("h:mm");

        Calendar calendar = Calendar.getInstance();
        date = "Czas "+dateFormat.format(calendar.getTime());
    }

    @Override
    public String toString() {
        return "["+text+"  "+date+"]"+"\n";
    }
}
