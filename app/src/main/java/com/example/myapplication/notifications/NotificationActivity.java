package com.example.myapplication.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.myapplication.R;

public class NotificationActivity extends AppCompatActivity {

    private static final int NOTIFICATION_ID = 200;

    AppCompatButton ntfButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_activity);

          ntfButton = findViewById(R.id.show_ntf);

          ntfButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                showNotification();
              }
          });


    }

    private void showNotification(){

       NotificationService notificationService = new NotificationService();
       Notification notification= notificationService.startActivityFromNotification(this,R.drawable.heart);
       notificationService.createNotificationChannel(this);
       notificationService.createSecondNotificationChannel(this);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID,notification);
    }


}
