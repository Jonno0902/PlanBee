package com.scrum.plan.planbee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.EventViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ChatModel> chatsList;

    public ChatAdapter(Context ctx, ArrayList<ChatModel> chatsList){
        inflater = LayoutInflater.from(ctx);
        this.chatsList = chatsList;
    }

    @Override
    public ChatAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.group_chat_item, parent, false);
        EventViewHolder holder = new EventViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ChatAdapter.EventViewHolder holder, int position) {
        holder.chatIcon.setImageResource(chatsList.get(position).getImage_drawable());
        holder.chatTitle.setText(chatsList.get(position).getName());
        holder.chatUpcoming.setText(chatsList.get(position).getUpcoming());
    }

    @Override
    public int getItemCount() {
        return chatsList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{
        TextView chatTitle, chatUpcoming;
        ImageView chatIcon;

        public EventViewHolder(View itemView) {
            super(itemView);
            chatTitle = itemView.findViewById(R.id.chat_title);
            chatUpcoming = itemView.findViewById(R.id.chat_upcoming);
            chatIcon = itemView.findViewById(R.id.chat_icon);


        }
    }
}
