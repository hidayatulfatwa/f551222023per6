package com.hidayatulfatwa.f551222023per6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {
    View view;
    public void fragmentHome(){}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceStade){
        view = inflater.inflate(R.layout.home_fragment, container, false);
        return view;
    }

}
