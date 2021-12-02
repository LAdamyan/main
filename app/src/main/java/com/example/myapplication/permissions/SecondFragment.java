package com.example.myapplication.permissions;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;


import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;
import com.example.myapplication.fragment.ThirdFragment;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;


public class SecondFragment extends Fragment  {

    AppCompatEditText editText;
    AppCompatButton button;
    String inputText;

    AppCompatButton btnLocation;
    AppCompatTextView textView1,textView2;
    FusedLocationProviderClient fusedLocationProviderClient;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        editText = view.findViewById(R.id.editText1);
        button = view.findViewById(R.id.passData);
        passData();

        btnLocation = view.findViewById(R.id.getLocation);
        textView1 = view.findViewById(R.id.latitude);
        textView2 = view.findViewById(R.id.longitude);


        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(getContext());
        btnLocation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ActivityCompat.checkSelfPermission(getContext(),Manifest.permission.ACCESS_FINE_LOCATION)==
                            PackageManager.PERMISSION_GRANTED){
                        getLocation();
                    }else{
                        ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.ACCESS_FINE_LOCATION},404);
                    }
                }

            });

        return view;
    }

    @SuppressLint("MissingPermission")
    private void getLocation() {
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if(location!=null){
                    try {
                        Geocoder geocoder = new Geocoder(getContext(), Locale.getDefault());
                        List<Address>addresses = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);

                        textView1.setText(Html.fromHtml("<font color ='#6200EE'><b>Latitude:</b><br></font>"
                                + addresses.get(0).getLatitude()));
                        textView2.setText(Html.fromHtml("<font color ='#6200EE'><b>Longitude:</b><br></font>"
                                + addresses.get(0).getLongitude()));

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

    }

    public void passData() {
        button.setOnClickListener(view1 -> {
            inputText = Objects.requireNonNull(editText.getText()).toString();
            Bundle bundle = new Bundle();
            bundle.putString("Text", inputText);
            ThirdFragment thirdFragment = new ThirdFragment();
            thirdFragment.setArguments(bundle);
            FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, thirdFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        });
    }







}