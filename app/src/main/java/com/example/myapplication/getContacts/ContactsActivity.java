package com.example.myapplication.getContacts;

import static com.example.myapplication.content_provider.MyContentProvider.CONTENT_URI;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
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

    ContactAdapter contactAdapter = new ContactAdapter();
    AppCompatButton button;
    AppCompatTextView name, phoneNumber;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_recycleview);
        button = findViewById(R.id.get_contact_btn);
        name = findViewById(R.id.contacts_name);
        phoneNumber = findViewById(R.id.contacts_phone);

        initRecycleView();
       getContacts();


    }

    private void initRecycleView() {

        RecyclerView recyclerView = findViewById(R.id.contacts_recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(contactAdapter);


    }

    private void getContacts(){

        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null, null, null, null);

        String displayName =  ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME;
        String displayNumber =  ContactsContract.CommonDataKinds.Phone.NUMBER;

         name.setText(displayName);
         phoneNumber.setText(displayNumber);

    }


}