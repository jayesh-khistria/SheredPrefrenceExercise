package com.example.entry_contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class contactAdapter extends ArrayAdapter<person> {

    private Context mContext;
    private int mResource;

    public contactAdapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.contactImage);
        TextView firstName = convertView.findViewById(R.id.textView);
        TextView lastName = convertView.findViewById(R.id.textView2);

        firstName.setText(getItem(position).getFirstname());
        lastName.setText(getItem(position).getLastName());

        return convertView;
    }
}
