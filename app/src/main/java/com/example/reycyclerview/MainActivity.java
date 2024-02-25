 package com.example.reycyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.reycyclerview.adapter.NhanVienAdapter;
import com.example.reycyclerview.model.NhanVien;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewNV;
    NhanVienAdapter nhanVienAdapter;
    ArrayList<NhanVien> arr_NV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        loadData();
    }

    private void addControls() {
        recyclerViewNV = findViewById(R.id.recyclerviewNV);
        arr_NV = new ArrayList<>();
        nhanVienAdapter = new NhanVienAdapter(this,arr_NV);
        recyclerViewNV.setAdapter(nhanVienAdapter);
       // recyclerViewNV.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNV.setLayoutManager(new GridLayoutManager(this,2));
        //recyclerViewNV.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));
    }

    private void loadData() {
        arr_NV.add(new NhanVien(1,"Lan",1990,R.drawable.baseline_person_24));
        arr_NV.add(new NhanVien(2,"Anh",1999,R.drawable.baseline_person_2_24));
        arr_NV.add(new NhanVien(3,"Binh",1996,R.drawable.baseline_person_3_24));
        arr_NV.add(new NhanVien(4,"Toan",1992,R.drawable.baseline_person_4_24));

    }
}