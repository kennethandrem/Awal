package com.kennek.awal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kenne on 6/15/2017.
 */

public class HerbicidasAdapterRecyclerCards extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<HerbicidasData> arrayHerbicidas = new ArrayList<>();
    @Bind(R.id.lbTitulo)
    TextView lbTitulo;
    @Bind(R.id.lbDetail)
    TextView lbDetail;
    @Bind(R.id.card_view_herbicidas)
    CardView card_view_herbicidas;
    Activity activity;

    public HerbicidasAdapterRecyclerCards(ArrayList<HerbicidasData> arrayHerbicidas, Activity activity)
    {
        this.arrayHerbicidas = arrayHerbicidas;
        this.activity = activity;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_herbicidas_cards, parent, false);
        ButterKnife.bind(this, v);
        return new HerbicidasAdapterItem(v);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        lbTitulo.setText(arrayHerbicidas.get(position).getHeader());
        lbDetail.setText(arrayHerbicidas.get(position).getDetail());
        card_view_herbicidas.setTag(position);
        card_view_herbicidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(v.getTag().toString());
                Intent herbicidasIntent = new Intent(activity, HerbicidaDetail.class);
                herbicidasIntent.putExtra("Header", arrayHerbicidas.get(position).getHeader());
                activity.startActivity(herbicidasIntent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return arrayHerbicidas.size();
    }
}
