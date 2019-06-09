package com.lasveva.nyoba;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    String[] dataArray = {"mandi", "toilet", "apes", "arya", "rizki", "upi"};

//    inisialisasi variabel
    private TextView textView;
    private Button b;
    private ListView listView;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        perkenalan variabel dengan komponen
        b = findViewById(R.id.but);
        textView = findViewById(R.id.text1);
        listView =findViewById(R.id.list);
        b.setVisibility(View.INVISIBLE);

//        final Handler handler = new Handler();
//        final Handler handler1 = new Handler();


//        final ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, dataArray);


//        listView.setAdapter(arrayAdapter);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ArrayAdapter<String>mAdapter = new ArrayAdapter<String>(this,
                R.layout.listview,getResources().getStringArray(R.array.dataArray));

        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                hitungan dimulai dari 0 yaitu mandi, kemudian 1 yaitu toilet dst
                if (position==0){
                    mp= MediaPlayer.create(MainActivity.this,R.raw.mandi);
                    mp.start();
                    Toast.makeText(MainActivity.this,"Saya Ingin Mandi",Toast.LENGTH_SHORT).show();
                } else if (position==1){
                    mp= MediaPlayer.create(MainActivity.this,R.raw.toilet);
                    mp.start();
                } else {
                    Toast.makeText(MainActivity.this,"Saya Ingin ke Toilet",Toast.LENGTH_SHORT).show();
                }
            }
        });




//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                musik m = new musik(dataArray[position], dataArray[position]);
//                textView.setText(m.nama);
//
//                int resd = getResources().getIdentifier(m.lagu, "raw", getPackageName());
//
//                final MediaPlayer mp = MediaPlayer.create(MainActivity.this, resd);
//
//
//                b.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                     mp.start();
//                     mp.start();
//
//                    }
//                });
//            }
//            String t = textView.getText().toString();
//        });


    }
}


