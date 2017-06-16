package com.kennek.awal;

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

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Herbicidas.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Herbicidas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Herbicidas extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<HerbicidasData> arrayHerbicidasData = new ArrayList<>();

    RecyclerView recyclerHerbicidas;

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Herbicidas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Herbicidas.
     */
    // TODO: Rename and change types and number of parameters
    public static Herbicidas newInstance(String param1, String param2) {
        Herbicidas fragment = new Herbicidas();
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
        HerbicidasData herbicidasData1 = new HerbicidasData();
        HerbicidasData herbicidasData2 = new HerbicidasData();

        herbicidasData1.setHeader("Halcón 50 WG");
        herbicidasData1.setDetail("Muestra absorción gradual en las hojas. Es sistémico vía xilema, siendo transportado acropetalmente y de forma translaminar dentro de las hojas. Debido a este particular modo de acción debe ser aplicado de manera preventiva.");

        arrayHerbicidasData.add(herbicidasData1);

        herbicidasData2.setHeader("asdfasd 50 WG");
        herbicidasData2.setDetail("Muestra absorción gradual en las hojas. Es sistémico vía xilema, siendo transportado acropetalmente y de forma translaminar dentro de las hojas. Debido a este particular modo de acción debe ser aplicado de manera preventiva.");

        arrayHerbicidasData.add(herbicidasData2);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_herbicidas, container, false);
        recyclerHerbicidas = (RecyclerView)rootView.findViewById(R.id.recyclerHerbicidas);
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
        HerbicidasAdapterRecyclerCards herbicidasAdapterRecyclerCards;
        recyclerHerbicidas.setHasFixedSize(true);
        //Cambiar dependiendo de la manera que quiera mostrar las cards
        //layoutManager = new GridLayoutManager(this.getActivity(), 2);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerHerbicidas.setLayoutManager(layoutManager);
        herbicidasAdapterRecyclerCards = new HerbicidasAdapterRecyclerCards(arrayHerbicidasData, this.getActivity());
        recyclerHerbicidas.setAdapter(herbicidasAdapterRecyclerCards);
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
