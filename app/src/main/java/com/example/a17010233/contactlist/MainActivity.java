package com.example.a17010233.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvName;

    ArrayList<ContactName> alContactList;

    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvName = findViewById(R.id.nameList);

        alContactList = new ArrayList<>();

        ContactName name1 = new ContactName("Mary", +65, 65442334);
        ContactName name2 = new ContactName("Ken", +65, 97442437);

        alContactList.add(name1);
        alContactList.add(name2);

        caContact = new CustomAdapter(this, R.layout.contact_name, alContactList);
        lvName.setAdapter(caContact);
    }

}
