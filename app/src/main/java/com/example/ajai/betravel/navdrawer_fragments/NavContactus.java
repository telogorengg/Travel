package com.example.ajai.betravel.navdrawer_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.example.ajai.betravel.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NavContactus.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NavContactus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NavContactus extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public NavContactus() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NavContactus.
     */
    // TODO: Rename and change types and number of parameters
    public static NavContactus newInstance(String param1, String param2) {
        NavContactus fragment = new NavContactus();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*Toolbar navContactusToolbar = (Toolbar) getView().findViewById(R.id.nav_contactus_toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(navContactusToolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navContactusToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem item)
            {
                return false;
            }
        });*/

        View view = inflater.inflate(R.layout.nav_contactus_layout, container, false);

        CardView facebookCard = (CardView) view.findViewById(R.id.facebook);
        CardView instagramCard = (CardView) view.findViewById(R.id.instagram);
        CardView linkedinCard = (CardView) view.findViewById(R.id.linkedin);

        facebookCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "Facebook", Toast.LENGTH_SHORT).show();
                /*Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ajailani4"));
                getActivity().startActivity(facebookIntent);*/
            }
        });

        instagramCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "Instagram", Toast.LENGTH_SHORT).show();
                /*Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/ajailani4"));
                getActivity().startActivity(instagramIntent);*/
            }
        });

        linkedinCard.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "LinkedIn", Toast.LENGTH_SHORT).show();
                /*Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://linkedin.com/in/ahmad-j-804936140"));
                getActivity().startActivity(linkedinIntent);*/
            }
        });

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
