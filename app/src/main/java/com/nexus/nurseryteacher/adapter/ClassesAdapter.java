package com.nexus.nurseryteacher.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexus.nurseryteacher.activity.ChildActivity;
import com.nexus.nurseryteacher.model.Class;
import com.nexus.nurseryteacher.R;

import static android.media.CamcorderProfile.get;

/**
 * Created by Yousef on 02/05/2017.
 */


public class ClassesAdapter extends RecyclerView.Adapter<ClassesAdapter.RecyclerViewHolder> {

    //private ArrayList<Class> arrayList = new ArrayList<>();
    private Class[] item;
    Context context;
    boolean openChildActivity;

    public ClassesAdapter(Class[] itemsdata, Context context, boolean openChildActivity) {
        this.item = itemsdata;
        this.context = context;
        this.openChildActivity = openChildActivity;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view, context);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {
        holder.dname.setText(item[position].getD_name());
        holder.fname.setText(item[position].getF_name());
        holder.image.setImageResource(item[position].getImg());
        holder.container.setOnClickListener(new View.OnClickListener() {
            public Context ctx;

            @Override
            public void onClick(View view) {
                if(openChildActivity) {
                    Context ctx = view.getContext();
                    Intent intent = new Intent(ctx, ChildActivity.class);
                    ctx.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return item.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        ImageView arrow;
        TextView fname;
        TextView dname;
        //  Context ctx;
        CardView container;

        public RecyclerViewHolder(View itemView, Context context) {
            super(itemView);
            // this.ctx=ctx;
            image = (ImageView) itemView.findViewById(R.id.list);
            arrow = (ImageView) itemView.findViewById(R.id.image1);
            fname = (TextView) itemView.findViewById(R.id.name);
            dname = (TextView) itemView.findViewById(R.id.details);
            container = (CardView) itemView.findViewById(R.id.card_view);
            //   itemView.setOnClickListener(this);
        }
    }
}