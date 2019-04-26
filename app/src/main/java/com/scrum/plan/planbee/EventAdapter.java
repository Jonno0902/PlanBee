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

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<EventModel> eventList;

    public EventAdapter(Context ctx, ArrayList<EventModel> eventImageList){
        inflater = LayoutInflater.from(ctx);
        this.eventList = eventImageList;
    }

    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.event_item, parent, false);
        EventViewHolder holder = new EventViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EventAdapter.EventViewHolder holder, int position) {
        holder.eventImage.setImageResource(eventList.get(position).getImage_drawable());
        holder.eventTitle.setText(eventList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }





    class EventViewHolder extends RecyclerView.ViewHolder{
        TextView eventTitle;
        ImageView eventImage;

        public EventViewHolder(View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.tv);
            eventImage = itemView.findViewById(R.id.iv);
        }

    }
}
