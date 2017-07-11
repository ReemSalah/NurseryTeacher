package com.nexus.nurseryteacher.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexus.nurseryteacher.model.Class;
import com.nexus.nurseryteacher.R;
import com.nexus.nurseryteacher.adapter.ClassesAdapter;

import java.util.ArrayList;

public class ChildActivity extends AppCompatActivity {
    ImageView img,arrow;
    TextView name,details;

    RecyclerView rv;
    private ArrayList<Class> arrayList = new ArrayList<Class>();
    private CollapsingToolbarLayout collapsingToolbarLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Class A");

        rv=(RecyclerView)findViewById(R.id.children);
        Class item[] = { new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child1","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child2","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child3","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child4","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child5","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child6","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child7","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"Child8","Lorem lpsum is simply dummy text of the printing")};

        rv.setLayoutManager(new LinearLayoutManager(this));
        setTitle("Children");
        ClassesAdapter mAdapter = new ClassesAdapter(item,this, false);
        // 4. set adapter
        rv.setAdapter(mAdapter);
    }
}
