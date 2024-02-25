package com.example.reycyclerview.adapter;

import static android.os.Build.VERSION_CODES.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reycyclerview.R;
import com.example.reycyclerview.model.NhanVien;

import java.util.ArrayList;

public class NhanVienAdapter extends RecyclerView.Adapter<NhanVienAdapter.ViewHolder> {
    Activity context;
    ArrayList<NhanVien> arr_NV;
    public NhanVienAdapter(Activity context,ArrayList<NhanVien> arr_NV)
    {
        this.context = context;
        this.arr_NV = arr_NV;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewNV = layoutInflater.inflate(com.example.reycyclerview.R.layout.items,parent,false);
        ViewHolder viewHolderNV = new ViewHolder(viewNV);
        return viewHolderNV;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NhanVien nv = arr_NV.get(position);
        holder.imgHinh.setImageResource(nv.getHinhnv());
        holder.txtMaNV.setText(nv.getManv()+"");
        holder.txtTenNV.setText(nv.getTennv());
        holder.txtNamSinh.setText(nv.getNamsinh()+"");
    }

    @Override
    public int getItemCount() {
        return arr_NV.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView imgHinh;
    TextView txtMaNV,txtTenNV,txtNamSinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHinh = itemView.findViewById(com.example.reycyclerview.R.id.imgHinh);
            txtMaNV = itemView.findViewById(com.example.reycyclerview.R.id.txtMaNV);
            txtTenNV = itemView.findViewById(com.example.reycyclerview.R.id.txtTenNV);
            txtNamSinh = itemView.findViewById(com.example.reycyclerview.R.id.txtNamSinh);
        }
    }
}
