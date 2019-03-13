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

public class ScrollerAdapter extends RecyclerView.Adapter<ScrollerAdapter.EventViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ScrollerModel> eventImageList;

    public ScrollerAdapter(Context ctx, ArrayList<ScrollerModel> eventImageList){
        inflater = LayoutInflater.from(ctx);
        this.eventImageList = eventImageList;
    }

    @Override
    public ScrollerAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.event_item, parent, false);
        EventViewHolder holder = new EventViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ScrollerAdapter.EventViewHolder holder, int position) {
        holder.eventImage.setImageResource(eventImageList.get(position).getImage_drawable());
        //holder.eventTitle.setText(imageModelArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return eventImageList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{
        //TextView eventTitle;
        ImageView eventImage;

        public EventViewHolder(View itemView) {
            super(itemView);
            //eventTitle = (TextView) itemView.findViewById(R.id.tv);
            eventImage = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
