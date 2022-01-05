package com.example.myapplication.contacts;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import com.example.myapplication.R;

public class GetContactsActivity extends AppCompatActivity {
    ListView listView;
    AppCompatButton button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_activity);

        listView = findViewById(R.id.contacts_listView);
        button = findViewById(R.id.get_contact_btn);

        button.setOnClickListener(v -> getContacts());
    }

    public void getContacts() {


        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                                               null, null, null, null);
        startManagingCursor(cursor);

        String[] data = {ContactsContract.CommonDataKinds.Phone.NUMBER,
                         ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                         ContactsContract.CommonDataKinds.Phone._ID};
        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor, data, to);

        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }
}

