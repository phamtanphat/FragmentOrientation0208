package com.ptp.phamtanphat.fragmentorientation0208;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 10/11/2017.
 */

public class Fragment_SinhVien extends ListFragment {

    View view;
    ArrayList<Sinhvien> mangsinhvien;
    SinhvienAdapter sinhvienAdapter;
    SendData sendData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sinhvien,container,false);
        sendData = (SendData) getActivity();
        mangsinhvien = new ArrayList<>();
        sinhvienAdapter = new SinhvienAdapter(getActivity(),android.R.layout.simple_list_item_1,mangsinhvien);
        setListAdapter(sinhvienAdapter);
        InitData();

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        sendData.ChangeText(mangsinhvien.get(position));
        super.onListItemClick(l, v, position, id);
    }

    private void InitData() {
        mangsinhvien.add(new Sinhvien("Nguyen Van A","1990","Khu pho 1","nguyenvanA@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van B","1991","Khu pho 2","nguyenvanB@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van C","1992","Khu pho 3","nguyenvanC@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van D","1993","Khu pho 4","nguyenvanD@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van E","1994","Khu pho 5","nguyenvanE@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van F","1995","Khu pho 5","nguyenvanF@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van G","1996","Khu pho 6","nguyenvanG@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van H","1997","Khu pho 7","nguyenvanH@gmail.com"));
        mangsinhvien.add(new Sinhvien("Nguyen Van K","1998","Khu pho 8","nguyenvanK@gmail.com"));
        sinhvienAdapter.notifyDataSetChanged();
    }
}
