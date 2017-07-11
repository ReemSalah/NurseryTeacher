package com.nexus.nurseryteacher.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexus.nurseryteacher.R;
import com.nexus.nurseryteacher.adapter.DaysAdapter;
import com.nexus.nurseryteacher.adapter.TimeLineAdapter;
import com.nexus.nurseryteacher.model.TimeLineModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ScheduleFragment extends Fragment{

    DaysAdapter daysAdapter = new DaysAdapter();
    TimeLineAdapter timeLineAdapter;
    List<Date> days;
    List<TimeLineModel> timeLineModels = new ArrayList<>();

    RecyclerView recyclerView;

    public static ScheduleFragment newInstance() {
        ScheduleFragment scheduleFragment = new ScheduleFragment();
        return scheduleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootview = inflater.inflate(R.layout.fragment_schedule, null);
//        LinearLayoutManager layoutManager
//                = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
//
//        RecyclerView daysScrollView = (RecyclerView) rootview.findViewById(R.id.daysRecycler);
//        daysScrollView.setLayoutManager(layoutManager);

        days = getWeek();


        recyclerView = (RecyclerView) rootview.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        timeLineModels.add(new TimeLineModel("Breakfast", "Eheu, tumultumque!"));
        timeLineModels.add(new TimeLineModel("English", "Hydras mori! Teres genetrix etiam vitares xiphias est."));
        timeLineModels.add(new TimeLineModel("Math", "Genetrixs manducare! Pol."));
        timeLineModels.add(new TimeLineModel("Garden", "Nunquam perdere nix. Sunt castores contactus alter, dexter fluctuses."));
//        daysAdapter.setDaysList(days);
//        daysScrollView.setAdapter(daysAdapter);

        timeLineAdapter = new TimeLineAdapter(timeLineModels);
        recyclerView.setAdapter(timeLineAdapter);
        getActivity().setTitle("Schedule");
        return rootview;
    }

    private List<Date> getWeek()
    {
        ArrayList<Date> week = new ArrayList<>();
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DATE,-2);//first day of week

        week.add(c.getTime());

        for(int i=0; i<4 ; i++) {
            c.add(Calendar.DATE, +1);
            week.add(c.getTime());
        }

        return week;
    }
}
