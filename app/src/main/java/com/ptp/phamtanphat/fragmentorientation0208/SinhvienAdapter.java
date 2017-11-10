package com.ptp.phamtanphat.fragmentorientation0208;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KhoaPhamPC on 10/11/2017.
 */

public class SinhvienAdapter extends ArrayAdapter<Sinhvien> {
    public SinhvienAdapter(@NonNull Context context, int resource, @NonNull List<Sinhvien> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        ImageView imgsinhvien;
        TextView txtten;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        View view = convertView;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.dong_sinhvien,null);
            viewHolder = new ViewHolder();
            viewHolder.imgsinhvien = view.findViewById(R.id.imageviewsinhvien);
            viewHolder.txtten = view.findViewById(R.id.textviewten);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Sinhvien sinhvien = getItem(position);
        viewHolder.txtten.setText(sinhvien.getHoten());
        return view;
    }
}
