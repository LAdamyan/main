package com.example.myapplication.boundService;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Random;

public class LocalService extends Service {

    private final IBinder binder = new LocalBinder(this);
    private final Random mGenerator = new Random();


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }


    public static class LocalBinder extends Binder {

        private final LocalService localService;

        public LocalBinder(LocalService localService) {
            this.localService = localService;
        }

        LocalService getService() {
            return localService;
        }
    }
}

