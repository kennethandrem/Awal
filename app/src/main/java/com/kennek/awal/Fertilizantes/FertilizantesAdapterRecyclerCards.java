package com.kennek.awal.Fertilizantes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kennek.awal.Correctores.CorrectoresAdapterItem;
import com.kennek.awal.Correctores.CorrectoresData;
import com.kennek.awal.Correctores.CorrectoresDetail;
import com.kennek.awal.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kenne on 6/18/2017.
 */

public class FertilizantesAdapterRecyclerCards extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    ArrayList<FertilizantesData> arrayFertilizantes = new ArrayList<>();
    @Bind(R.id.lbTituloFertilizantes)
    TextView lbTitulo;
    @Bind(R.id.lbDetailFertilizantes)
    TextView lbDetail;
    @Bind(R.id.card_view_fertilizantes)
    CardView card_view_fertilizantes;
    Activity activity;

    public FertilizantesAdapterRecyclerCards(ArrayList<FertilizantesData> arrayFertilizantes, Activity activity)
    {
        this.arrayFertilizantes = arrayFertilizantes;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fertilizantes_cards, parent, false);
        ButterKnife.bind(this, v);
        return new FertilizantesAdapterItem(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        lbTitulo.setText(arrayFertilizantes.get(position).getProducto());
        lbDetail.setText(arrayFertilizantes.get(position).getBeneficio());
        card_view_fertilizantes.setTag(position);
        card_view_fertilizantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(v.getTag().toString());
                Intent fertilizantesIntent = new Intent(activity, FertilizantesDetail.class);
                fertilizantesIntent.putExtra("HeaderFertilizantes", arrayFertilizantes.get(position).getProducto());
                fertilizantesIntent.putExtra("beneficioFertilizantes", arrayFertilizantes.get(position).getBeneficio());
                fertilizantesIntent.putExtra("recomendacionFertilizantes", arrayFertilizantes.get(position).getRecomendacion());
                fertilizantesIntent.putExtra("concentracionFertilizantes", arrayFertilizantes.get(position).getConcentracion());
                fertilizantesIntent.putExtra("dosisFertilizantes", arrayFertilizantes.get(position).getDosis());
                activity.startActivity(fertilizantesIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayFertilizantes.size();
    }


}
