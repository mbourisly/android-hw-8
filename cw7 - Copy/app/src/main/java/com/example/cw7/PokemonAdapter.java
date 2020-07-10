package com.example.cw7;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter {
    ArrayList<Pokemon> pArray;
    Context c ;

    public PokemonAdapter(ArrayList<Pokemon> pArray, Context c) {
        this.pArray = pArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position){
        ((ViewHolder)holder).total.setText(pArray.get(position).getTotal()+"");
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).name.setText(pArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,details.class);
               i.putExtra("pokemon",pArray.get(position));
                c.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

      public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img ;
        public TextView name ;
        public TextView total ;
        public View view ;

          public ViewHolder(@NonNull View itemView) {
              super(itemView);
              view = itemView ;

             img = itemView.findViewById(R.id.imageView);
             name = itemView.findViewById(R.id.textView);
             total = itemView.findViewById(R.id.textView2);


          }
      }
}
