package com.example.myapplication.content_provider;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.R;

public class ProvidersMainActivity extends AppCompatActivity {


    AppCompatTextView resultText;
    AppCompatButton insertButton;
    AppCompatButton showButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);

        insertButton = findViewById(R.id.insert_button);
        showButton = findViewById(R.id.loading_button);

        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickAddDetails(view);
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickShowDetails(view);
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        return true;
    }

    public void onClickAddDetails(View view) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MyContentProvider.name, ((AppCompatEditText) findViewById(R.id.editText_content)).getText().toString());
        getContentResolver().insert(MyContentProvider.CONTENT_URI, contentValues);
        Toast.makeText(getBaseContext(), "New Record inserted", Toast.LENGTH_LONG).show();
    }

    @SuppressLint("Range")
    public void onClickShowDetails(View view) {
        resultText = findViewById(R.id.result);
        Cursor cursor = getContentResolver().query(Uri.parse("content://com.example.myapplication/content_provider"), null, null, null, null);
        if (cursor.moveToFirst()) {
            StringBuilder strBuild = new StringBuilder();
            while (!cursor.isAfterLast()) {
                strBuild.append("\n" + cursor.getString(cursor.getColumnIndex("id"))
                        + "-" + cursor.getString(cursor.getColumnIndex("name")));
                cursor.moveToNext();
            }
            resultText.setText(strBuild);
        } else {
            resultText.setText("No record found");
        }
    }
}