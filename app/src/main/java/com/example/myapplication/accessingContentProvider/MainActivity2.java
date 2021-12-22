package com.example.myapplication.accessingContentProvider;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.R;

public class MainActivity2 extends AppCompatActivity {

    Uri CONTENT_URI = Uri.parse("content://com.example.myapplication/content_provider");

    AppCompatButton loadDataFromProvider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_provider);

        loadDataFromProvider = findViewById(R.id.loadButton);
        loadDataFromProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onClickShowDetails(view);
            }
        });

    }

    @SuppressLint({"Range", "SetTextI18n"})
    public void onClickShowDetails(View view) {
        AppCompatTextView resultView = findViewById(R.id.provider_result);

        Cursor cursor = getContentResolver().query(Uri.parse("content://com.example.myapplication/content_provider"),
                null, null, null, null);

        if (cursor.moveToFirst()) {
            StringBuilder strBuild = new StringBuilder();
            while (!cursor.isAfterLast()) {
                strBuild.append("\n" + cursor.getString(cursor.getColumnIndex("id")) + "-" +
                        cursor.getString(cursor.getColumnIndex("name")));
                cursor.moveToNext();
            }
            resultView.setText(strBuild);
        } else {
            resultView.setText("No Records Found");
        }
    }
}
