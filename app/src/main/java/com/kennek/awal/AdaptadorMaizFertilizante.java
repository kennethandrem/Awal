package com.kennek.awal;

/**
 * Created by Kenneth on 14/11/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kennek.awal.Fragments.Fertilizante;

/**
 * Adaptador para mostrar las comidas más pedidas en la sección "Inicio"
 */
public class AdaptadorMaizFertilizante
        extends RecyclerView.Adapter<AdaptadorMaizFertilizante.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView nombre;
        public ImageView imagen;

        public ViewHolder(View v) {
            super(v);
            nombre = (TextView) v.findViewById(R.id.nombre_maiz);
            imagen = (ImageView) v.findViewById(R.id.miniatura_maiz);
        }
    }

    public AdaptadorMaizFertilizante() {
    }

    @Override
    public int getItemCount() {
        return Fertilizante.MAIZ.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_maiz, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Fertilizante item = Fertilizante.MAIZ.get(i);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getIdImagen())
                .centerCrop()
                .into(viewHolder.imagen);
        viewHolder.nombre.setText(item.getNombre());

    }


}