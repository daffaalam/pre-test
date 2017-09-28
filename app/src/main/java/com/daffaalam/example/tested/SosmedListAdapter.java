package com.daffaalam.example.tested;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SosmedListAdapter extends ArrayAdapter<String>{

    private final Activity contex;
    private final String[] medsos;
    private final Integer[] logos;

    public SosmedListAdapter(Activity contex, String[] medsos, Integer[] logos){

        super(contex, R.layout.list_view, medsos);

        this.contex = contex;
        this.medsos = medsos;
        this.logos = logos;
    }

    public View getView(int posisi, View views, ViewGroup parent){

        LayoutInflater layout = contex.getLayoutInflater();
        View rowView = layout.inflate(R.layout.list_view, null, true);

        ImageView lgs = (ImageView)rowView.findViewById(R.id.lg);
        TextView txt = (TextView)rowView.findViewById(R.id.tx);

        lgs.setImageResource(logos[posisi]);
        txt.setText(medsos[posisi]);

        return rowView;
    }
}
