package com.scrum.plan.planbee;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageHolder> {

    private LayoutInflater inflater;
    private ArrayList<Message> mMessageList;
    private Context context;
    private static final int VIEW_TYPE_MESSAGE_SENT = 1;
    private static final int VIEW_TYPE_MESSAGE_RECEIVED = 2;

    public MessageAdapter(Context ctx, ArrayList<Message> messageList){
        inflater = LayoutInflater.from(ctx);
        this.context = ctx;
        mMessageList = messageList;
    }

    // Determines the appropriate ViewType according to the sender of the message.
    @Override
    public int getItemViewType(int position) {
        Message message = mMessageList.get(position);

        if (message.sender.userId == -1) {
            // If the current user is the sender of the message
            return VIEW_TYPE_MESSAGE_SENT;
        } else {
            // If some other user sent the message
            return VIEW_TYPE_MESSAGE_RECEIVED;
        }
    }

    @Override
    public MessageAdapter.MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if(viewType == VIEW_TYPE_MESSAGE_SENT){
             view = inflater.inflate(R.layout.item_message_sent, parent, false);
        }else{
             view = inflater.inflate(R.layout.item_message_received, parent, false);
        }


        MessageHolder holder = new MessageHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(MessageAdapter.MessageHolder holder, int position) {
        Message message = mMessageList.get(position);

        if(getItemViewType(position) == VIEW_TYPE_MESSAGE_RECEIVED){
            // Insert the profile image from the URL into the ImageView.
            Drawable drawable = context.getDrawable(message.sender.profilePicture);
            holder.profileImage.setBackground(drawable);
            holder.nameText.setText(message.sender.nickname);
        }


        holder.messageText.setText(message.entry);
        // Format the stored timestamp into a readable String using method.
        holder.timeText.setText(Utils.formatTime(message.epoch));



    }



    @Override
    public int getItemCount() {
        return mMessageList.size();
    }



    class MessageHolder extends RecyclerView.ViewHolder{
        TextView messageText, timeText, nameText;
        ImageView profileImage;

        public MessageHolder(View itemView) {
            super(itemView);
            messageText = itemView.findViewById(R.id.text_message_body);
            timeText =  itemView.findViewById(R.id.text_message_time);
            nameText = itemView.findViewById(R.id.text_message_name);
            profileImage = itemView.findViewById(R.id.image_message_profile);
        }

    }



}
