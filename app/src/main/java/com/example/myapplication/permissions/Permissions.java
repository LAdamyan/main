package com.example.myapplication.permissions;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.myapplication.R;

public class Permissions extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_CODE = 1;
    private static final int STORAGE_PERMISSION_CODE = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.permissions);

        AppCompatButton storage = findViewById(R.id.storage);
        storage.setOnClickListener(view -> checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE));
        AppCompatButton camera = findViewById(R.id.camera);
        camera.setOnClickListener(view -> checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE));
    }

    public void checkPermission(String permission, int requestCode) {
        if (ContextCompat.checkSelfPermission(Permissions.this, permission) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(Permissions.this, new String[]{permission}, requestCode);
        } else {
            Toast.makeText(Permissions.this, "Permission is already granted", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Camera Permission GRANTED", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(Permissions.this, "Camera Permission DENIED", Toast.LENGTH_LONG).show();
            }
        }
        if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Storagee Permission GRANTED", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(Permissions.this, "Storagee Permission DENIED", Toast.LENGTH_LONG).show();
            }
        }
    }
}
