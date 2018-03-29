package com.example.android.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mygosia on 27.03.18.
 */

public class AnimalsFragment extends Fragment {

    public AnimalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getResources().getString(R.string.animals_title_1), getResources().getString(R.string.animals_subtitle_1), getResources().getString(R.string.animals_content_1), R.drawable.wilk));
        items.add(new Item(getResources().getString(R.string.animals_title_2), getResources().getString(R.string.animals_subtitle_2), getResources().getString(R.string.animals_content_2), R.drawable.zubr));
        items.add(new Item(getResources().getString(R.string.animals_title_3), getResources().getString(R.string.animals_subtitle_3), getResources().getString(R.string.animals_content_3), R.drawable.rys));
        items.add(new Item(getResources().getString(R.string.animals_title_4), getResources().getString(R.string.animals_subtitle_4), getResources().getString(R.string.animals_content_4), R.drawable.los));

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