package com.example.user.televent;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventlist);

        ArrayList<ListEvent> listEvent = new ArrayList<>();
        listEvent.add(new ListEvent("FIT FEST 4.0", "GSG, Telkom University", "Kamis, 12 Mei 2017",
               R.drawable.event1 ,"Free"));
        listEvent.add(new ListEvent("Inditech", "Aula Fakultas Ilmu Terapan, Telkom University", "Kamis, 25 Mei 2017",
                R.drawable.event2 ,"Free"));
        listEvent.add(new ListEvent("Alek Nagari", "GSG, Telkom University", "Sabtu 12 Agustus 2017",
                R.drawable.event3 ,"Free"));
        listEvent.add(new ListEvent("Nihon Matsuri 10th", "Telkom Univesity Convention Hall, Telkom University", "Senin, 2 Oktober 2017",
                R.drawable.event4 ,"Free"));
        ListView eventList = (ListView) findViewById(R.id.eventList);
        ListEventAdapter adapter = new ListEventAdapter(this, listEvent);
        eventList.setAdapter(adapter);
    }

}
