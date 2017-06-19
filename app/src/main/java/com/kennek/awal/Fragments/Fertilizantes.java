package com.kennek.awal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kennek.awal.Correctores.CorrectoresAdapterRecylcerCards;
import com.kennek.awal.Correctores.CorrectoresData;
import com.kennek.awal.Fertilizantes.FertilizantesAdapterRecyclerCards;
import com.kennek.awal.Fertilizantes.FertilizantesData;
import com.kennek.awal.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fertilizantes.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fertilizantes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fertilizantes extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<FertilizantesData> arrayFertilizantesData = new ArrayList<>();

    RecyclerView recyclerFertilizantes;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fertilizantes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fertilizantes.
     */
    // TODO: Rename and change types and number of parameters
    public static Fertilizantes newInstance(String param1, String param2) {
        Fertilizantes fragment = new Fertilizantes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        FertilizantesData fertilizantesData1 = new FertilizantesData();
        FertilizantesData fertilizantesData2 = new FertilizantesData();
        FertilizantesData fertilizantesData3 = new FertilizantesData();
        FertilizantesData fertilizantesData4 = new FertilizantesData();
        FertilizantesData fertilizantesData5 = new FertilizantesData();
        FertilizantesData fertilizantesData6 = new FertilizantesData();
        FertilizantesData fertilizantesData7 = new FertilizantesData();
        FertilizantesData fertilizantesData8 = new FertilizantesData();
        FertilizantesData fertilizantesData9 = new FertilizantesData();

        fertilizantesData1.setProducto("Amarre");
        fertilizantesData1.setConcentracion("N, P, K \n+ Azufre \n+ Magnesio \n+ Microelementos \n+ Aminoácidos");
        fertilizantesData1.setRecomendacion("En Almácigos aplicar al follaje cada 30 días.  En una plantación establecida aplicar al incio de floración y de fructificación. ");
        fertilizantesData1.setBeneficio("Es un Bio-Estimulante que aporta la energía necesaria para que la planta crezca y produzca mejor. Además, ayuda al amarre de Flor, Cuaje de fruto y Llenado de Fruto.");
        fertilizantesData1.setDosis("50 - 75 mL/ aspersora 16L, \n600-900 mL/tonel 200L");
        fertilizantesData1.setImagen("");

        fertilizantesData2.setProducto("Fertig Calcio Boro");
        fertilizantesData2.setConcentracion("Óxido de calcio 4.00% \n+ Boro 2.00% ");
        fertilizantesData2.setRecomendacion("En café y frutales aplicar una vez iniciada la floración y dos veces al día cada 15 días. En tomate, chile y papa aplicar a los 30 días de transplantado y aplicar una vez cada 15 días.");
        fertilizantesData2.setBeneficio("El Calcio permite la multiplicación y crecimiento celular; y ayuda a la neutralización de los Hidrogeniones. El boro es esencial en el metabolismo del Nitrógeno y los carbohidratos.");
        fertilizantesData2.setDosis("1.87 L/ha, 1.3 L/mz,\n75 mL/Aspersora 16 L");
        fertilizantesData2.setImagen("");

        fertilizantesData3.setProducto("Folifer");
        fertilizantesData3.setConcentracion("N, P, K \n+ Azufre \n+ Magnesio \n+ Microelementos ");
        fertilizantesData3.setRecomendacion("En Almácigos aplicar al follaje cada 30 días.  En una plantación establecida aplicar al incio de floración y de fructificación. ");
        fertilizantesData3.setBeneficio("Ayuda a que la planta crezca y produzca mejor.");
        fertilizantesData3.setDosis("50 - 100 mL/Aspersora 16L, \n0.75 - 1.5 L por tonel ");
        fertilizantesData3.setImagen("");

        fertilizantesData4.setProducto("Kustodio");
        fertilizantesData4.setConcentracion("Fósforo 23.597% \n+ Potasio 31.187% \n+ Boro 0.02% \n+ Cobre 0.05% \n+ Hierro 0.10% \n+ Manganeso 0.05% \n+ Zinc 0.05% ");
        fertilizantesData4.setRecomendacion("No es recomendable mezclarlo con fuentes de calcio y hierro.");
        fertilizantesData4.setBeneficio("Fuente equlibrada de fósforo y potasio más elementos menores.\nIncrementa el tamaño de los granos, frutos y tubérculos. ");
        fertilizantesData4.setDosis("100 - 150 mL/Aspersora 16L / 1.3 - 1.9 L/tonel 200 L");
        fertilizantesData4.setImagen("");

        fertilizantesData5.setProducto("Maxikrop concentrado");
        fertilizantesData5.setConcentracion("Azufre 12.5%+ Hierro 12.5% + Zinc 7.5% \n+ Manganeso 1.2% +  Cobre 0.6% \n+ Molibdeno 0.0025% +  Boro 0.1%");
        fertilizantesData5.setRecomendacion("Mezclar 5 Kg de Maxikrop por cada quintal de fertilizante que aplique a la plantación.");
        fertilizantesData5.setBeneficio("Brinda a la planta micronutrientes esenciales. Es especial para suelos con tendencia alcalina.");
        fertilizantesData5.setDosis("20 kg/ha");
        fertilizantesData5.setImagen("");

        fertilizantesData6.setProducto("Maxikrop ll (Ca Mg)");
        fertilizantesData6.setConcentracion("Magnesio 14.92% \n+ Calcio 6.99% \n+ Hierro 1.00% \n+ Zinc 7.5% \n+ Manganeso 1.2% \n+ Cobre 0.6% \n+ Molibdeno 0.0025% \n+ Boro 0.1%");
        fertilizantesData6.setRecomendacion("Mezclar 5 Kg de Maxikrop por cada quintal de fertilizante que aplique a la plantación.");
        fertilizantesData6.setBeneficio("Brinda a la planta micronutrientes esenciales. Es especial para suelos con tendencia ácida.");
        fertilizantesData6.setDosis("20 kg/ha");
        fertilizantesData6.setImagen("");

        fertilizantesData7.setProducto("Previo");
        fertilizantesData7.setConcentracion("Nitrógeno amoniacal 8% \n+ Fósforo como P2O5 24% \n+ Fósforo como K2O5 4% \n+ Boro 0.02% \n+ Hierro 0.05% \n+ Manganeso 0.05% \n+ Zinc 0.1% \n+ Acidos Húmicos y Fulvicos 7%");
        fertilizantesData7.setRecomendacion("--");
        fertilizantesData7.setBeneficio("Incrementa el sistema radicular, la floración y fructificación; Y mejora la disponibilidad de nutrientes en el suelo.");
        fertilizantesData7.setDosis("--");
        fertilizantesData7.setImagen("");

        fertilizantesData8.setProducto("Empower");
        fertilizantesData8.setConcentracion("Fosfito de Potasio 28% + 28%");
        fertilizantesData8.setRecomendacion("--");
        fertilizantesData8.setBeneficio("Mejora el estado nutricional de la planta y crea defensas dentro de ella.");
        fertilizantesData8.setDosis("Foliar: 50 - 75 mL/Aspersora 16 L / 600-900 mL/tonel 200 L\nTronqueado 100 - 150mL/Aspersora 16 L / 1.2 - 1.8 L/tonel 200 L");
        fertilizantesData8.setImagen("");

        fertilizantesData9.setProducto("Zingular");
        fertilizantesData9.setConcentracion("Zinc 10%");
        fertilizantesData9.setRecomendacion("Aplicarse en la fase temprana del cultivo, antes de la etapa de floración y fructificación.");
        fertilizantesData9.setBeneficio("Promueve la formación de brotes y producción de semillas.");
        fertilizantesData9.setDosis("50 - 75 mL/Aspersora 16 L\n600 - 900 mL/tonel 200 L");
        fertilizantesData9.setImagen("");

        arrayFertilizantesData.add(fertilizantesData1);
        arrayFertilizantesData.add(fertilizantesData2);
        arrayFertilizantesData.add(fertilizantesData3);
        arrayFertilizantesData.add(fertilizantesData4);
        arrayFertilizantesData.add(fertilizantesData5);
        arrayFertilizantesData.add(fertilizantesData6);
        arrayFertilizantesData.add(fertilizantesData7);
        arrayFertilizantesData.add(fertilizantesData8);
        arrayFertilizantesData.add(fertilizantesData9);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fertilizantes, container, false);
        recyclerFertilizantes = (RecyclerView)view.findViewById(R.id.recyclerFertilizantes);
        showReciclerView();
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void showReciclerView(){
        RecyclerView.LayoutManager layoutManager;
        FertilizantesAdapterRecyclerCards fertilizantesAdapterRecylcerCards;
        recyclerFertilizantes.setHasFixedSize(true);
        //Cambiar dependiendo de la manera que quiera mostrar las cards
        //layoutManager = new GridLayoutManager(this.getActivity(), 2);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerFertilizantes.setLayoutManager(layoutManager);
        fertilizantesAdapterRecylcerCards = new FertilizantesAdapterRecyclerCards(arrayFertilizantesData, this.getActivity());
        recyclerFertilizantes.setAdapter(fertilizantesAdapterRecylcerCards);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
