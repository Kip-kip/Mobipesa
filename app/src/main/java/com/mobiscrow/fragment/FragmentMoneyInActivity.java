package com.mobiscrow.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mobiscrow.R;


public class FragmentMoneyInActivity extends Fragment {

    public FragmentMoneyInActivity() {
    }

    public static FragmentMoneyInActivity newInstance() {
        FragmentMoneyInActivity fragment = new FragmentMoneyInActivity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_money_in, container, false);


        return root;
    }
}