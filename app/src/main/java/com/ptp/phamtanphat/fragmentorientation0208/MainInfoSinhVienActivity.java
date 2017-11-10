package com.ptp.phamtanphat.fragmentorientation0208;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainInfoSinhVienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_info_sinh_vien);
        Intent intent = getIntent();
        Sinhvien sinhvien = (Sinhvien) intent.getSerializableExtra("SinhVien");
      
        Fragment_Info fragment_info = (Fragment_Info) getFragmentManager().findFragmentById(R.id.fragmentThongtinsinhvien);
        fragment_info.SetText(sinhvien);
    }
}
