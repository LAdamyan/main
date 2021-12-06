package com.example.myapplication.asyncTask;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.R;

public class AsyncTaskActivity extends AppCompatActivity implements View.OnClickListener{

    AppCompatButton button;
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.async_layout);
        button = findViewById(R.id.async_btn);
        button.setOnClickListener(this);
        progressBar = findViewById(R.id.async_progressBar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.async_btn:
                new LongOperation().execute("");
                break;

        }

    }
    private class LongOperation extends AsyncTask<String,Integer,String>{

        @Override
        protected String doInBackground(String... strings) {
            Log.d("AsyncTask","doInBackground");
            for (int i = 0; i <5 ; i++) {

                try {
                    Log.d("AsyncTask","task" + (i + 1));
                    publishProgress(i+1);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   Thread.interrupted();
                }


            }
            return "Completed";
        }

        @Override
        protected void onPostExecute(String result) {
            Log.d("AsyncTask","onPostExecute");
            AppCompatTextView textView = findViewById(R.id.async_textView);
            textView.setText(result);
            progressBar.setProgress(0);
        }

        @SuppressLint("SetTextI18n")
        @Override
        protected void onPreExecute() {
            Log.d("AsyncTask","onPreExecute");
            AppCompatTextView textView = findViewById(R.id.async_textView);
            textView.setText("onPreExecute");
            progressBar.setMax(500);
            progressBar.setProgress(0);

        }

        @SuppressLint("SetTextI18n")
        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.d("AsyncTask","onProgressUpdate" + values[0]);
            AppCompatTextView textView = findViewById(R.id.async_textView);
            textView.setText("onProgressUpdate" + values[0]);

            ObjectAnimator animator = ObjectAnimator.ofInt(progressBar,"progress",100 * values[0]);
            animator.setDuration(1000);
            animator.setInterpolator(new LinearInterpolator());
            animator.start();
        }
    }
}

