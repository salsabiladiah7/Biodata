package com.example.biodata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtNl, edtNp, edtTtl, edtAlamat, edtHobi, edtTelepon, edtIg, edtTwt;
    private Button btnSimpan;
    private TextView tvNl, tvNp, tvTtl, tvAlamat, tvHobi, tvTelepon, tvIg, tvTwt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNl = findViewById(R.id.edt_nl);
        edtNp = findViewById(R.id.edt_np);
        edtTtl = findViewById(R.id.edt_ttl);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtHobi = findViewById(R.id.edt_hobi);
        edtTelepon = findViewById(R.id.edt_telepon);
        edtIg = findViewById(R.id.edt_ig);
        edtTwt = findViewById(R.id.edt_twt);
        btnSimpan = findViewById(R.id.btn_simpan);
        tvNl = findViewById(R.id.tv_nl);
        tvNp = findViewById(R.id.tv_np);
        tvTtl = findViewById(R.id.tv_ttl);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvHobi = findViewById(R.id.tv_hobi);
        tvTelepon = findViewById(R.id.tv_telepon);
        tvIg = findViewById(R.id.tv_ig);
        tvTwt = findViewById(R.id.tv_twt);

        btnSimpan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nama = edtNl.getText().toString();
        tvNl.setText(nama);
        String panggilan = edtNp.getText().toString();
        tvNp.setText(panggilan);
        String ttl = edtTtl.getText().toString();
        tvTtl.setText(ttl);
        String alamat = edtAlamat.getText().toString();
        tvAlamat.setText(alamat);
        String hobi = edtHobi.getText().toString();
        tvHobi.setText(hobi);
        String telepon = edtTelepon.getText().toString();
        tvTelepon.setText(telepon);
        String instagram = edtIg.getText().toString();
        tvIg.setText(instagram);
        String twt = edtTwt.getText().toString();
        tvTwt.setText(twt);

    }
}