package com.example.qtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button btn1;
EditText txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=findViewById(R.id.b1);
        txt2=findViewById(R.id.t2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager s1=SmsManager.getDefault();
                Toast.makeText(Main2Activity.this,"OTP Sent",Toast.LENGTH_LONG).show();
            }
        });
    }
}
