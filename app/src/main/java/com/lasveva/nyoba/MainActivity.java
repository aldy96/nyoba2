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

public class MainActivity extends AppCompatActivity {

    String[] dataArray = {"mandi", "toilet", "apes", "arya", "rizki", "upi"};
    TextView textView;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        final Handler handler1 = new Handler();


        final ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, dataArray);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);

        b = (Button) findViewById(R.id.but);

        textView = (TextView) findViewById(R.id.text1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                musik m = new musik(dataArray[position], dataArray[position]);
                textView.setText(m.nama);

                int resd = getResources().getIdentifier(m.lagu, "raw", getPackageName());

                final MediaPlayer mp = MediaPlayer.create(MainActivity.this, resd);


                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                     mp.start();
                     mp.start();

                    }
                });
            }
            String t = textView.getText().toString();
        });


    }
}


