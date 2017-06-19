package com.kennek.awal.Correctores;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kennek.awal.Fragments.Correctores;
import com.kennek.awal.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kenne on 6/18/2017.
 */

public class CorrectoresAdapterRecylcerCards extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    ArrayList<CorrectoresData> arrayCorrectores = new ArrayList<>();
    @Bind(R.id.lbTituloCorrectores)
    TextView lbTitulo;
    @Bind(R.id.lbDetailCorrectores)
    TextView lbDetail;
    @Bind(R.id.card_view_correctores)
    CardView card_view_correctores;
    Activity activity;

    public CorrectoresAdapterRecylcerCards(ArrayList<CorrectoresData> arrayCorrectores, Activity activity)
    {
        this.arrayCorrectores = arrayCorrectores;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_correctores_cards, parent, false);
        ButterKnife.bind(this, v);
        return new CorrectoresAdapterItem(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        lbTitulo.setText(arrayCorrectores.get(position).getProducto());
        lbDetail.setText(arrayCorrectores.get(position).getModoDeAccion());
        card_view_correctores.setTag(position);
        card_view_correctores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(v.getTag().toString());
                Intent correctoresIntent = new Intent(activity, CorrectoresDetail.class);
                correctoresIntent.putExtra("Header", arrayCorrectores.get(position).getProducto());
                correctoresIntent.putExtra("indicaciones", arrayCorrectores.get(position).getIndicaciones());
                correctoresIntent.putExtra("accion", arrayCorrectores.get(position).getModoDeAccion());
                correctoresIntent.putExtra("concentracion", arrayCorrectores.get(position).getConcentracion());
                correctoresIntent.putExtra("cultivo", arrayCorrectores.get(position).getCultivo());
                correctoresIntent.putExtra("dosis", arrayCorrectores.get(position).getDosis());
                activity.startActivity(correctoresIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayCorrectores.size();
    }
}
