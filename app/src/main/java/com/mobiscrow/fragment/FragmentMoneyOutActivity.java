package com.mobiscrow.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mobiscrow.R;


public class FragmentMoneyOutActivity extends Fragment {

    public FragmentMoneyOutActivity() {
    }

    public static FragmentMoneyOutActivity newInstance() {
        FragmentMoneyOutActivity fragment = new FragmentMoneyOutActivity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_money_out, container, false);


        return root;
    }
}