package com.digitalcoaster.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView tvUserName1, tvUserName2, tvBirthday, tvPhoneNum, tvInstagramAccount, tvEmail, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // showing the back button in action bar*/
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvUserName1 = findViewById(R.id.userName1);
        tvUserName2 = findViewById(R.id.userName2);
        tvBirthday = findViewById(R.id.birthday);
        tvPhoneNum = findViewById(R.id.phoneNumber);
        tvInstagramAccount = findViewById(R.id.instagramAccount);
        tvEmail = findViewById(R.id.email);
        tvPassword = findViewById(R.id.password);

        tvUserName1.setText("Anna Avetisyan");
        tvUserName2.setText("Anna Avetisyan");
        tvBirthday.setText("13/07/1998");
        tvPhoneNum.setText("818 123 4567");
        tvInstagramAccount.setText("@anna_ave");
        tvEmail.setText("info@aplusdesign.com");
        Button showHideBtn = (Button) findViewById(R.id.showHideBtn);
        showHideBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Desarrollo de alguna acción.}});
                if(tvPassword.getText().toString().equals("Password")){
                    tvPassword.setText("1234");
                    //tvPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }else{
                    //tvPassword.setInputType(InputType.TYPE_CLASS_TEXT);
                    tvPassword.setText("Password");
                }
            }
        });
    }
}