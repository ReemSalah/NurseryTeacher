package com.nexus.nurseryteacher.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexus.nurseryteacher.R;
import com.nexus.nurseryteacher.model.Post;

import java.util.ArrayList;


/**
 * Created by Yousef on 15/05/2017.
 */

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.RecyclerViewHolder> {
    private ArrayList<Post> item;

    public PostsAdapter(ArrayList<Post> itemsData) {
        this.item = itemsData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.date.setText(item.get(position).getDate());
        holder.desc.setText(item.get(position).getDescription());
        holder.teacher.setText(item.get(position).getTeachername());
        holder.event.setText(item.get(position).getEventname());
        holder.imge.setImageResource(item.get(position).getC_image());
        holder.pic.setImageResource(item.get(position).getP_image());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder

    {
        ImageView imge,pic;
        TextView desc,teacher,event,date;
        View Cardview;
        public RecyclerViewHolder(View itemview){
            super(itemview);
            imge=(ImageView)itemView.findViewById(R.id.circle);

            pic=(ImageView)itemView.findViewById(R.id.img);
            desc=(TextView)itemView.findViewById(R.id.textView7);
            teacher=(TextView)itemView.findViewById(R.id.teacherNameTextView);
            event=(TextView)itemView.findViewById(R.id.eventNameTextView);
            date=(TextView)itemView.findViewById(R.id.dateTextView);
            Cardview=itemView.findViewById(R.id.card);
        }

    }
}