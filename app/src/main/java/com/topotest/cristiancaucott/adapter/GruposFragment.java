package com.topotest.cristiancaucott.adapter;

import com.topotest.cristiancaucott.topotest2.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GruposFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.grupos_fragment, container, false);
        return rootView;
    }
}