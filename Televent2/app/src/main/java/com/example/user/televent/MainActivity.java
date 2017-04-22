package com.example.user.televent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MainMenu> mainMenu = new ArrayList<>();
        mainMenu.add(new MainMenu(R.drawable.listevent, R.string.listEvent));
        mainMenu.add(new MainMenu(R.drawable.calendaricon, R.string.calendar));
        mainMenu.add(new MainMenu(R.drawable.profiliconnew, R.string.profil));

        ListView listView = (ListView) findViewById(R.id.activity_main);
        MainMenuAdapter adapter = new MainMenuAdapter(this, mainMenu);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, ListEventActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, CalendarActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, ProfilActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });

    }
}
