package com.ncnews.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mobiscrow.R;

import java.util.List;

/**
 * Created by Cyrus on 4/5/2018.
 */

public class FragmentAllAdapter extends RecyclerView.Adapter<FragmentAllAdapter.ViewHolder> {



    private Context context;



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.transactions_list_item,parent,false);
        return new ViewHolder(v);



    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.Title.setText("God is good");
//        holder.textViewContent.setText(listItem.getNewscontent());
//        holder.textViewAuthor.setText(listItem.getAuthor());
//        holder.textViewDate.setText(listItem.getDate());





        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {

        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView Title;
        public TextView textViewContent;
        public TextView textViewAuthor;
        public TextView textViewDate;
        public ImageView imageView;
        public LinearLayout linearLayout;
        public ImageView ifadhi;
        public ImageView gawa;

        public ViewHolder(View itemView) {
            super(itemView);

            Title=(TextView) itemView.findViewById(R.id.textViewTitle);
//            textViewContent=(TextView) itemView.findViewById(R.id.textViewContent);
//            imageView=(ImageView)itemView.findViewById(R.id.imageView);
//            textViewAuthor=(TextView) itemView.findViewById(R.id.textViewAuthor);
//            textViewDate=(TextView) itemView.findViewById(R.id.textViewDate);
//            linearLayout=(LinearLayout) itemView.findViewById(R.id.linearlayout);
//
//            gawa=(ImageView) itemView.findViewById(R.id.gawa);





        }
    }
}
