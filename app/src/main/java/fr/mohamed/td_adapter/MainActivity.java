package fr.mohamed.td_adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;
    RecyclerView moule_items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moule_items = findViewById(R.id.rvContacts);
        contacts = new ArrayList<Contact>();
        contacts.add(new Contact("andrie", "busin", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("matine", "lavie", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("antonin", "charpentier", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("hugo", "victor", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("florian", "cken", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("andrie", "busin", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));


        contactsAdapter adapter = new contactsAdapter(contacts);
        moule_items.setLayoutManager(new LinearLayoutManager(this));
        moule_items.setAdapter(adapter);
    }





}