package com.example.myapplication.getContacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.recycleView2.Category;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<Contacts> contacts = new ArrayList<>();
    Context context;

    public ContactAdapter(ArrayList<Contacts> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_item_layout,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
     Contacts contact  = contacts.get(position);
     holder.initData(contact);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public  void setContacts(List<Contacts> contactsList){
        this.contacts.clear();
        this.contacts.addAll(contactsList);
        notifyDataSetChanged();
    }
}
class ContactViewHolder extends RecyclerView.ViewHolder{

    AppCompatTextView name  = itemView.findViewById(R.id.contacts_name);
    AppCompatTextView phoneNumber = itemView.findViewById(R.id.contacts_phone);

    public ContactViewHolder(@NonNull View itemView) { super(itemView); }


    void initData(Contacts contacts){
        name.setText(contacts.getName());
        phoneNumber.setText(contacts.getPhoneNumber());
    }
}