package com.surath.earthquake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button button;

    RecyclerView recyclerViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_mainactivity);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        recyclerViewHome = findViewById(R.id.recyclerViewHome);

        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerViewHome.setLayoutManager(manager);
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(this);
        recyclerViewHome.setAdapter(adapter);




    }
}
