package com.example.android.tourguideapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mygosia on 27.03.18.
 */

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getResources().getString(R.string.food_title_1), getResources().getString(R.string.food_subtitle_1), getResources().getString(R.string.food_content_1), R.drawable.sekacz));
        items.add(new Item(getResources().getString(R.string.food_title_2), getResources().getString(R.string.food_subtitle_2), getResources().getString(R.string.food_content_2), R.drawable.samogon));
        items.add(new Item(getResources().getString(R.string.food_title_3), getResources().getString(R.string.food_subtitle_3), getResources().getString(R.string.food_content_3), R.drawable.kartacze));
        items.add(new Item(getResources().getString(R.string.food_title_4), getResources().getString(R.string.food_subtitle_4), getResources().getString(R.string.food_content_4), R.drawable.marcinek));
        items.add(new Item(getResources().getString(R.string.food_title_5), getResources().getString(R.string.food_subtitle_5), getResources().getString(R.string.food_content_5), R.drawable.mrowisko));

        // Create an WordAdapter
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the  ListView object
        ListView listView = (ListView) rootView.findViewById(R.id.item_list);

        // Make the ListView use the WordAdapter we created above, so that the
        // ListView will display list items for each Item in the list.
        listView.setAdapter(adapter);

        return rootView;

    }




}