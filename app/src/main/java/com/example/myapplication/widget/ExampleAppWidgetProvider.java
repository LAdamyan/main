package com.example.myapplication.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

import com.example.myapplication.R;

public class ExampleAppWidgetProvider extends AppWidgetProvider {


    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int i = 0; i < appWidgetIds.length; i++) {
            int currentWidgetId = appWidgetIds[i];
            String url = "http://www.tutorialspoint.com";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(url));

            PendingIntent pending = PendingIntent.getActivity(context,0,intent,0);
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);

            views.setOnClickPendingIntent(R.id.widget_button,pending);

            appWidgetManager.updateAppWidget(appWidgetIds,views);
        } 
    }
}
