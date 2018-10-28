package com.example.student.recycleview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.student.recycleview.R;
import com.example.student.recycleview.adapter.CrickterAdapter;
import com.example.student.recycleview.model.Cricketer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private int[] images = {R.drawable.afridid, R.drawable.babar_azam, R.drawable.fakhar_zaman, R.drawable.hashim_amla,
            R.drawable.mahmudullah, R.drawable.mashrafee, R.drawable.mushfiqur_rahim, R.drawable.sakib, R.drawable.tamim};
    private String[] name = {"Afridid", "Babar_azam", "fakhar_zaman", "hashim_amla",
            "mahmudullah", "mashrafee", "mushfiqur_rahim",  "sakib", "tamim"};
    private List<Cricketer> cricketerList=new ArrayList<>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        preparedData();

    }

    private void preparedData() {
        for(int i=0;i<name.length;i++)
        {
           cricketerList.add(new Cricketer(images[i],name[i])) ;
        }
        CrickterAdapter adapter=new CrickterAdapter(this,cricketerList);
        recyclerView.setAdapter(adapter);

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerViewId);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

}