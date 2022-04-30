package com.example.bisc.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bisc.LocalModel.User;
import com.example.bisc.R;
import com.example.bisc.RetrofitClasses.ApiUtil;

import retrofit2.Call;

public class CnpsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
View view = inflater.inflate(R.layout.fragment_cnps, container, false);
view.findViewById(R.id.reference);
       // Call<> call;
        //call = ApiUtil.getServiceClass().getreference ("application/json","application/json","76ad62e779cc4182a4c003df6a9bd0a8");
        return view ;
    }


}