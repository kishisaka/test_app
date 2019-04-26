package com.pinger.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class NameList extends AppCompatActivity {
    NameAdapter nameAdapter;
    RecyclerView recyclerView;
    List<Name> nameList;

    private List<Name> getNameList() {
        List<Name> nameList = new ArrayList<>();
        nameList.add(new Name("test1  ", "408 940 2344"));
        nameList.add(new Name("test1  ", "408 941 2343"));
        nameList.add(new Name("hest3  ", "408 840 2342"));
        nameList.add(new Name("mest4  ", "408 799 2345"));
        nameList.add(new Name("rest1  ", "408 140 2346"));
        nameList.add(new Name("rest1  ", "408 340 2390"));
        nameList.add(new Name("test1  ", "408 245 2343"));
        nameList.add(new Name("gest1  ", "408 640 2348"));
        nameList.add(new Name("hest1  ", "408 941 2346"));
        nameList.add(new Name("jest1  ", "408 643 2343"));
        return nameList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        nameList = getNameList();
        nameAdapter = new NameAdapter(nameList);
        recyclerView = (RecyclerView)findViewById(R.id.name_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(nameAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, soo1` long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
