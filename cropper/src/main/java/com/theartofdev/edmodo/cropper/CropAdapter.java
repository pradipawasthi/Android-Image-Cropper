package com.theartofdev.edmodo.cropper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;


public class CropAdapter extends RecyclerView.Adapter<CropAdapter.ViewHolder> {

    private ArrayList<String> countries;
    int selectedpos;

    public CropAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public CropAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CropAdapter.ViewHolder viewHolder, final int i) {

        viewHolder.tv_country.setText(countries.get(i));

//        viewHolder.tv_country.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectedpos=i;
//            }
//        });
//
//        if (selectedpos == i) {
//            viewHolder.crop_ll.setBackgroundColor(Color.parseColor("#4f83cc"));
//
//        } else {
//            viewHolder.crop_ll.setBackgroundColor(Color.parseColor("#ffffff"));
//        }
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_country;

        //        private LinearLayout crop_ll;
        public ViewHolder(View view) {
            super(view);

            tv_country = (TextView) view.findViewById(R.id.lng);
//            crop_ll=(LinearLayout) view.findViewById(R.id.crop_ll);
        }
    }

}