package com.example.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

class ChatLine{
    SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");

    final Date date;
    final String lineText;

    final User user;

    ChatLine(User user, String text){
        this.user = user;
        lineText = text;
        date = new Date();
    }
    @Override
    public String toString() {
        return lineText+" "+"["+user.getName()+" "+user.getSurname()+" "+dateFormat.format(date)+"]";
    }
}
