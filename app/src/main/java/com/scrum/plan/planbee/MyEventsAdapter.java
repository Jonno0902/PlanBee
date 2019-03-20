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

public class MyEventsAdapter extends RecyclerView.Adapter<MyEventsAdapter.EventViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MyEventsModel> myEventsList;

    public MyEventsAdapter(Context ctx, ArrayList<MyEventsModel> myEventsList){
        inflater = LayoutInflater.from(ctx);
        this.myEventsList = myEventsList;
    }

    @Override
    public MyEventsAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.my_event_item, parent, false);
        EventViewHolder holder = new EventViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyEventsAdapter.EventViewHolder holder, int position) {
        holder.eventIcon.setImageResource(myEventsList.get(position).getImage_drawable());
        holder.eventTitle.setText(myEventsList.get(position).getName());
        holder.eventUpcoming.setText(myEventsList.get(position).getUpcoming());
    }

    @Override
    public int getItemCount() {
        return myEventsList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{
        TextView eventTitle, eventUpcoming;
        ImageView eventIcon;

        public EventViewHolder(View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.my_event_title);
            eventUpcoming = itemView.findViewById(R.id.my_event_upcoming);
            eventIcon = itemView.findViewById(R.id.my_event_icon);
        }
    }
}
