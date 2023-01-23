package com.pmadcode11.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] waterFalls=new String[]{"Bambarakanda Falls","Baker Falls","St. Clair’s Falls","Ravana Falls","Dunhinda Falls","Gartmore Falls"," Devon Falls","Diyaluma Falls","Bomburu Falls","Kindi Ella Falls","Kumari Falls","Bopath Falls","Olu Falls"};

        ListAdapter listadap=new ArrayAdapter<String>(this,R.layout.list_item,waterFalls);

        listView=findViewById(R.id.list_view);

        listView.setAdapter(listadap);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String wFall=String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,wFall,Toast.LENGTH_SHORT).show();

            }
        });

    }
}