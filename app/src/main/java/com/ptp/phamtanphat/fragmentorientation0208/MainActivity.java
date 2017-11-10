package com.ptp.phamtanphat.fragmentorientation0208;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SendData{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void ChangeText(Sinhvien sinhvien) {
        Fragment_Info fragment_info = (Fragment_Info) getFragmentManager().findFragmentById(R.id.fragmentinfo);
        //Cach1 : Kiem tra huong cua thiet bi
        Configuration configuration = getResources().getConfiguration();
//        onfiguration.orientation == Configuration.ORIENTATION_LANDSCAPE
        //Cach2 : Kiem tra fragment co nam tren layout khong
        if (fragment_info != null && fragment_info.isInLayout()){
            fragment_info.SetText(sinhvien);
        }else {
            Intent intent = new Intent(MainActivity.this,MainInfoSinhVienActivity.class);
            intent.putExtra("SinhVien",sinhvien);
            startActivity(intent);
        }
    }
}
