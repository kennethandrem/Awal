package com.kennek.awal.Correctores;

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

public class CorrectoresDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correctores_detail);
        Bundle bundle = getIntent().getExtras();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(bundle.getString("Header"));
        TextView textViewAccion = (TextView)findViewById(R.id.textAccion);
        textViewAccion.setText(bundle.getString("accion"));
        TextView textViewConcentracion = (TextView)findViewById(R.id.textConcentracion);
        textViewConcentracion.setText(bundle.getString("concentracion"));
        TextView textViewCultivo = (TextView)findViewById(R.id.textCultivo);
        textViewCultivo.setText(bundle.getString("cultivo"));
        TextView textViewIndicaciones = (TextView)findViewById(R.id.textIndicaciones);
        textViewIndicaciones.setText(bundle.getString("indicaciones"));
        TextView textViewDosis = (TextView)findViewById(R.id.textDosis);
        textViewDosis.setText(bundle.getString("dosis"));
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
