package com.daffaalam.example.tested;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class main extends AppCompatActivity {

    String[] sosmed = {
            "Facebook",
            "Youtube",
            "Twitter",
            "Instagram"
    };

    Integer[] logo = {
            R.drawable.facebook,
            R.drawable.youtube,
            R.drawable.twitter,
            R.drawable.instagram
    };

    String[] link = {
            "m.facebook.com",
            "m.youtube.com",
            "m.twitter.com",
            "m.instagram.com"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SosmedListAdapter adp = new SosmedListAdapter(this, sosmed, logo);

        ListView lstvw = (ListView) findViewById(R.id.main);

        lstvw.setAdapter(adp);
        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {

                Intent pindah = new Intent(main.this, sosmed.class);
                pindah.putExtra("Link", link[posisi]);
                startActivity(pindah);

//                Toast.makeText(main.this, "This is Toast message", Toast.LENGTH_LONG).show();

            }
        });
    }
}
