package com.example.myapplication.getContacts;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.recycleView2.Entertainments;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    ContactAdapter contactAdapter ;
    AppCompatButton button;
    AppCompatTextView name, phoneNumber;
    ArrayList<Contacts> contactsArrayList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_recycleview);
        button = findViewById(R.id.get_contact_btn);
        name = findViewById(R.id.contacts_name);
        phoneNumber = findViewById(R.id.contacts_phone);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getContacts();
            }
        });

        initRecycleView();
    }

    private void initRecycleView() {

        RecyclerView recyclerView = findViewById(R.id.contacts_recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        contactAdapter = new ContactAdapter(contactsArrayList,ContactsActivity.this);
        recyclerView.setAdapter(contactAdapter);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_CONTACTS,
                Manifest.permission.READ_CONTACTS}, PackageManager.PERMISSION_GRANTED);

    }

    public void getContacts() {

        
    }
}