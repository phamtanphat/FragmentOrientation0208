package com.ptp.phamtanphat.fragmentorientation0208;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 10/11/2017.
 */

public class Fragment_Info extends Fragment {
    View view;
    TextView txthoten,txtdiachi,txtemail,txtnamsinh;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_info,container,false);
        txtdiachi = view.findViewById(R.id.textviewdiachi);
        txthoten = view.findViewById(R.id.textviewtensinhvien);
        txtemail = view.findViewById(R.id.textviewemail);
        txtnamsinh = view.findViewById(R.id.textviewnamsinh);
        return view;
    }
    public void SetText(Sinhvien sinhvien){
        txtnamsinh.setText(sinhvien.getNamsinh());
        txtemail.setText(sinhvien.getEmail());
        txthoten.setText(sinhvien.getHoten());
        txtdiachi.setText(sinhvien.getDiachi());
    }
}
