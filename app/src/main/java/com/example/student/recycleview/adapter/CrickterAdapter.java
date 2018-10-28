package com.example.student.recycleview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.recycleview.R;
import com.example.student.recycleview.model.Cricketer;

import java.util.List;

public class CrickterAdapter extends RecyclerView.Adapter<CrickterAdapter.ViewHolder> {

    //context+data
    private Context context;
    //model
    private List<Cricketer>cricketerList;

    public CrickterAdapter(Context context, List<Cricketer> cricketerList) {
        this.context = context;
        this.cricketerList = cricketerList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {//call 1st step

        View view= LayoutInflater.from(context).inflate(R.layout.sample_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {//set 3 rd step
// img,name set

        viewHolder.imageView.setImageResource(cricketerList.get(i).getImage());
        viewHolder.textView.setText(cricketerList.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return cricketerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{//find|hold 2nd step
        //find
        ImageView imageView;
        TextView textView;





        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView= itemView.findViewById(R.id._image);
            textView= itemView.findViewById(R.id._name);
        }
    }
    {


    }
}
