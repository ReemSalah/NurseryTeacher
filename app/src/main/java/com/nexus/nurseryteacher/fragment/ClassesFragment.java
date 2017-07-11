package com.nexus.nurseryteacher.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexus.nurseryteacher.R;
import com.nexus.nurseryteacher.adapter.ClassesAdapter;
import com.nexus.nurseryteacher.model.Class;

import java.util.ArrayList;

/**
 * Created by Yousef on 29/05/2017.
 */

public class ClassesFragment extends Fragment {
    RecyclerView rv;
    private ArrayList<Class> arrayList = new ArrayList<Class>();
    Context context;

    public static ClassesFragment newInstance()
    {
        ClassesFragment classesFragment=new ClassesFragment();
        return classesFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View rootview=inflater.inflate(R.layout.activity_classes,null);
        //context= getActivity();
        rv=(RecyclerView)rootview.findViewById(R.id.rv);
        Class item[] = { new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing"),
                new Class(R.drawable.baby,"ClassName","Lorem lpsum is simply dummy text of the printing")};

       rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Classes");
        ClassesAdapter mAdapter = new ClassesAdapter(item,context, true);
        // 4. set adapter
        rv.setAdapter(mAdapter);
        return rootview;
    }
    public String toString(){
        return "ClassesFragment";
    }
}