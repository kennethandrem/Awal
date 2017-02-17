package com.kennek.awal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARAGON 2 on 14/11/2016.
 */

public class Fertilizante {
    private String nombre;
    private String concentracion;
    private String recomendacion;
    private String datos;
    private String dosis;
    private int idImagen;

    public Fertilizante(String nombre, String concentracion, String recomendacion, String datos, String dosis, int idImagen) {
        this.nombre = nombre;
        this.concentracion = concentracion;
        this.recomendacion = recomendacion;
        this.datos = datos;
        this.dosis = dosis;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public static final List<Fertilizante> MAIZ = new ArrayList<Fertilizante>();
    public static final List<Fertilizante> CITRICOS = new ArrayList<>();
    public static final List<Fertilizante> MANZANA = new ArrayList<>();
    public static final List<Fertilizante> PIÑA = new ArrayList<>();
    public static final List<Fertilizante> SORGO = new ArrayList<>();
    public static final List<Fertilizante> BANANO = new ArrayList<>();
    public static final List<Fertilizante> PAPAYA = new ArrayList<>();
    public static final List<Fertilizante> CAÑA_AZUCAR = new ArrayList<>();
    public static final List<Fertilizante> PALMA_AFRICANA = new ArrayList<>();

    static {
        MAIZ.add(new Fertilizante("Amarre", "N, P, K + Azufre, Magnesio + Microelementos + Aminoácidos", "En Almácigos aplicar al follaje cada 30 días.  En una plantación establecida aplicar al incio de floración y de fructificación. ", "Es un Bio-Estimulante que aporta la energía necesaria para que la planta crezca y produzca mejor. Además, ayuda al amarre de Flor, Cuaje de fruto y Llenado de Fruto.", "50-75 mL/ aspersora 16L, 600-900 mL/tonel 200L", R.drawable.logo_amarre));
        MAIZ.add(new Fertilizante("Fertig Calcio Boro", "Óxido de calcio 4.00% + Boro 2.00% ", "En café y frutales aplicar una vez iniciada la floración y dos veces al día cada 15 días. En tomate, chile y papa aplicar a los 30 días de transplantado y aplicar una vez cada 15 días.", "El Calcio permite la multiplicación y crecimiento celular; y ayuda a la neutralización de los Hidrogeniones. El boro es esencial en el metabolismo del Nitrógeno y los carbohidratos.", "1.87 L/ha                                                         1.3 L/mz                                                            75 mL/Aspersora 16L", R.drawable.logo_fertig_calcio_boro));
    }


}
