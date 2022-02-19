package com.digitalcoaster.lectorqr;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    Button btnVisit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult=findViewById(R.id.result);
        btnVisit=findViewById(R.id.visitURL);
    }

    public void onclick(View view) {
        if(view.getId()==R.id.OperScanner){
            new IntentIntegrator(this).initiateScan();
        }else if(view.getId()==R.id.visitURL){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse((String) tvResult.getText()));
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result=IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        String dataQR = result.getContents();

        tvResult.setText(dataQR);
        if(dataQR.substring(0,4).equals("http")){
            btnVisit.setVisibility(View.VISIBLE);
        }else{
            btnVisit.setVisibility(View.INVISIBLE);
        }
    }
}