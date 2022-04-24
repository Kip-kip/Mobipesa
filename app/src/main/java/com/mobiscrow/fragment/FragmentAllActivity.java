package com.mobiscrow.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mobiscrow.MainActivity;
import com.mobiscrow.MyTransactionsActivity;
import com.mobiscrow.R;


public class FragmentAllActivity extends Fragment {

    public FragmentAllActivity() {
    }

    public static FragmentAllActivity newInstance() {
        FragmentAllActivity fragment = new FragmentAllActivity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_all_transactions, container, false);




        return root;





    }
}