package com.kennek.awal.Fertilizantes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.kennek.awal.R;

import static com.kennek.awal.R.color.primary_dark;

public class FertilizantesDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizantes_detail);
        Bundle bundle = getIntent().getExtras();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(bundle.getString("HeaderFertilizantes"));
        TextView textViewBeneficioFertilizantes = (TextView)findViewById(R.id.textBeneficioFertilizantes);
        textViewBeneficioFertilizantes.setText(bundle.getString("beneficioFertilizantes"));
        TextView textViewRecomendacionFertilizantes = (TextView)findViewById(R.id.textRecomendacionFertilizante);
        textViewRecomendacionFertilizantes.setText(bundle.getString("recomendacionFertilizantes"));
        TextView textViewConcentracionFertilizantes = (TextView)findViewById(R.id.textConcentracionFertilizantes);
        textViewConcentracionFertilizantes.setText(bundle.getString("concentracionFertilizantes"));
        TextView textViewDosisFertilizantes = (TextView)findViewById(R.id.textDosisFertilizantes);
        textViewDosisFertilizantes.setText(bundle.getString("dosisFertilizantes"));

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "En la próxima versión podrás comprar", Snackbar.LENGTH_LONG)
                        .setAction("Aceptar", null);
                View sbView = snackbar.getView();
                sbView.setBackgroundColor(getResources().getColor(primary_dark));
                snackbar.show();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
