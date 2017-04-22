package com.example.user.televent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        TextView text1 = (TextView) findViewById(R.id.myTicket);
        TextView text2 = (TextView) findViewById(R.id.createEvent);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ProfilActivity.this, "Aplikasi ini masih dalam pengembangan", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ProfilActivity.this, "Aplikasi ini masih dalam pengembangan", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
