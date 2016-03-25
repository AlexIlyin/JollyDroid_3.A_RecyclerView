package com.alexilyin.android.a3a_recyclerview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 25.03.16.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    int[] images;
    String[] titles;

    Context context;


    public RecycleViewAdapter(Context context, int[] imagesArray, String[] textArray) {
        this.context = context;
        this.images = imagesArray;
        this.titles = textArray;
    }


    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycleview_item,
                parent,
                false
        );

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapter.ViewHolder holder, int position) {

        holder.image.setImageDrawable(ContextCompat.getDrawable(context, images[position]));
        holder.title.setText(titles[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.recycle_view_preview_image);
            title = (TextView) itemView.findViewById(R.id.recycle_view_description);
        }
    }


}
