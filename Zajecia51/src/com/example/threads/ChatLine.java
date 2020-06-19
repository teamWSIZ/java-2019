package com.example.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

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
