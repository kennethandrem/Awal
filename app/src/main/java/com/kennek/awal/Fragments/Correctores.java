package com.kennek.awal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.kennek.awal.Correctores.CorrectoresAdapterRecylcerCards;
import com.kennek.awal.Correctores.CorrectoresData;
import com.kennek.awal.Herbicidas.HerbicidasAdapterRecyclerCards;
import com.kennek.awal.Herbicidas.HerbicidasData;
import com.kennek.awal.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Correctores.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Correctores#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Correctores extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<CorrectoresData> arrayCorrectoresData = new ArrayList<>();

    RecyclerView recyclerCorrectores;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Correctores() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Correctores.
     */
    // TODO: Rename and change types and number of parameters
    public static Correctores newInstance(String param1, String param2) {
        Correctores fragment = new Correctores();
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

        CorrectoresData correctoresData1 = new CorrectoresData();
        CorrectoresData correctoresData2 = new CorrectoresData();
        CorrectoresData correctoresData3 = new CorrectoresData();
        CorrectoresData correctoresData4 = new CorrectoresData();
        CorrectoresData correctoresData5 = new CorrectoresData();
        CorrectoresData correctoresData6 = new CorrectoresData();


        correctoresData1.setProducto("ac pH-OK");
        correctoresData1.setModoDeAccion("Permite mejorar el agua de mezcla de plaguicidas. Al ir acidificando, también va reduciendo los carbonatos de calcio, lo que permite mejorar la actividad biológica de los productos firosanitarios usados en agricultura.");
        correctoresData1.setConcentracion("Acido fosforico 305 g/L.");
        correctoresData1.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo.");
        correctoresData1.setDosis("0.5 - 1.0 mL/Litro de agua  \n8 - 16 mL/aspersora 16 L  / 100 \n200 mL/tonel 200 L de agua.");
        correctoresData1.setIndicaciones("Corrector de pH y carbonatos.");
        correctoresData1.setImage("");

        correctoresData2.setProducto("BlandoMAX");
        correctoresData2.setModoDeAccion("Evita que los agroquímicos se hidrolicen por exposición a un pH inadecuado o reaccionen con las sales disueltas y pierdan efectividad.");
        correctoresData2.setConcentracion("Acido fosforico 305 g/L");
        correctoresData2.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo");
        correctoresData2.setDosis("0.5 - 1.0 mL/Litro de agua  \n8 - 16 mL/aspersora 16 L  \n100 - 200 mL/tonel 200 L de agua");
        correctoresData2.setIndicaciones("Corrector de pH y carbonatos");
        correctoresData2.setImage("");

        correctoresData3.setProducto("Corrector TOTAL");
        correctoresData3.setModoDeAccion("Permite mejorar el agua de mezcla de plaguicidas. Al ir acidificando, también va reduciendo los carbonatos de calcio, lo que permite mejorar la actividad biológica de los productos firosanitarios.");
        correctoresData3.setConcentracion("Acido fosforico 50 g/L");
        correctoresData3.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo");
        correctoresData3.setDosis("1 - 2.5 mL/Litro de agua  \n16 - 40L/aspersora 16 L  \n200 - 500 mL/tonel 200 L de agua");
        correctoresData3.setIndicaciones("Corrector de pH y carbonatos");
        correctoresData3.setImage("");

        correctoresData4.setProducto("Silkawet");
        correctoresData4.setModoDeAccion("Agente coadyuvante, por sus características fisicoquímicas rompe la tensión superficial de las gotas de los agroquímicos que se aplican a los cultivos, proporcionandoles un alto poder de adherencia, dispersión y penetración. ");
        correctoresData4.setConcentracion("Dodecil benceno sulfonato de sodio 83.8 g/L + nonil fenol etoxilado 80 g/L formula antiespumante");
        correctoresData4.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo");
        correctoresData4.setDosis("100 mL/100 L de agua  \n25 mL/aspersora 16 L  \n1 mL/litro de mezcla");
        correctoresData4.setIndicaciones("Adherente, penetrante, humectante y dispersante que coadyuva a ser mas efectivo el uso de agroquimicos");
        correctoresData4.setImage("");

        correctoresData5.setProducto("Silkawet extra");
        correctoresData5.setModoDeAccion("Permite mejorar el agua de mezcla de plaguicidas. Al ir acidificando, también va reduciendo los carbonatos de calcio, lo que permite mejorar la actividad biológica de los productos firosanitarios.");
        correctoresData5.setConcentracion("Dodecil benceno sulfonato de sodio 121 g/L + polyethylene glicol monodecyl ether 51 g/L");
        correctoresData5.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo");
        correctoresData5.setDosis("100 - 200 mL/100 L de agua \n16 - 32 mL/aspersora 16 L  \n1 - 2 mL/Litro de mezcla (aspesiones terrestres)   \n3 mL/Litro de agua (aspersiones aereas)");
        correctoresData5.setIndicaciones("Adherente, penetrante, humectante y dispersante que coadyuva a ser mas efectivo el uso de agroquimicos");
        correctoresData5.setImage("");

        correctoresData6.setProducto("Wetagro");
        correctoresData6.setModoDeAccion("Agente coadyuvante, por sus características fisicoquímicas rompe la tensión superficial de las gotas de los agroquímicos que se aplican a los cultivos, proporcionandoles un alto poder de adherencia, dispersión y penetración.");
        correctoresData6.setConcentracion("Dodecilbenceno sulfonato de soodio + nonil fenol etoxilado 163.8 g/L");
        correctoresData6.setCultivo("Todos los cultivos agricolas y en cualquier estado vegetativo");
        correctoresData6.setDosis("100 mL/100 L de agua \n25 mL/aspersora 16 L  \n1 mL/litro de mezcla");
        correctoresData6.setIndicaciones("Adherente, penetrante, humectante y dispersante que coadyuva a ser mas efectivo el uso de agroquimicos");
        correctoresData6.setImage("");

        arrayCorrectoresData.add(correctoresData1);
        arrayCorrectoresData.add(correctoresData2);
        arrayCorrectoresData.add(correctoresData3);
        arrayCorrectoresData.add(correctoresData4);
        arrayCorrectoresData.add(correctoresData5);
        arrayCorrectoresData.add(correctoresData6);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_correctores, container, false);
        recyclerCorrectores = (RecyclerView)rootView.findViewById(R.id.recyclerCorrectores);
        showReciclerView();
        return rootView;
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
        CorrectoresAdapterRecylcerCards correctoresAdapterRecylcerCards;
        recyclerCorrectores.setHasFixedSize(true);
        //Cambiar dependiendo de la manera que quiera mostrar las cards
        //layoutManager = new GridLayoutManager(this.getActivity(), 2);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerCorrectores.setLayoutManager(layoutManager);
        correctoresAdapterRecylcerCards = new CorrectoresAdapterRecylcerCards(arrayCorrectoresData, this.getActivity());
        recyclerCorrectores.setAdapter(correctoresAdapterRecylcerCards);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
