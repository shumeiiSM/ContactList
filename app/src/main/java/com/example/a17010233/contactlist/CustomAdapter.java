package com.example.a17010233.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010233 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<ContactName> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactName> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);
        TextView tvNum = rowView.findViewById(R.id.textViewNum);

        ContactName currentItem = contactList.get(position);


        String name = currentItem.getName();
        int code = currentItem.getCode();
        int num = currentItem.getNum();

        tvName.setText(name);
        tvCode.setText("+" + String.valueOf(code));
        tvNum.setText(String.valueOf(num));

        return rowView;
    }

}
