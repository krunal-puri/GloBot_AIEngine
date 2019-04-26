package com.example.beast.chatbot;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class chat_rec extends RecyclerView.ViewHolder {

    TextView leftText, rightText;

    public chat_rec(View itemView) {
        super(itemView);

        leftText = itemView.findViewById(R.id.leftText);
        rightText = itemView.findViewById(R.id.rightText);
    }
}
