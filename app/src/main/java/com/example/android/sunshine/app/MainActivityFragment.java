package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */

/**
 * @author Fábio Henrique Pires
 * @date 11/09/2015
 * 
 */

public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> times = new ArrayList<String>();
        times.add("Today - Sunny - 88 / 63");
        times.add("Tomorrow - Foggy - 70 / 46");
        times.add("Weds - Cloudy - 72 / 63");
        times.add("Thurs - Rainy - 64 / 51");
        times.add("Fri - Foggy - 70 / 46");
        times.add("Sat - Sunny - 76 / 68");

        this.mForecastAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast, R.id.list_item_forecast_textview, times);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
