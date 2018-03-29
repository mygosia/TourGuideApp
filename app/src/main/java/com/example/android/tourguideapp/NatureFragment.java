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

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.nature_fragment, container, false);

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
            final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getResources().getString(R.string.nature_title_1), getResources().getString(R.string.nature_subtitle_1), getResources().getString(R.string.nature_content_1), R.drawable.bialowieski));
        items.add(new Item(getResources().getString(R.string.nature_title_2), getResources().getString(R.string.nature_subtitle_2), getResources().getString(R.string.nature_content_2), R.drawable.biebrzanski));
        items.add(new Item(getResources().getString(R.string.nature_title_3), getResources().getString(R.string.nature_subtitle_3), getResources().getString(R.string.nature_content_3), R.drawable.narwianski));

        // Create an  WordAdapter, whose data source is a list of items. The
            // adapter knows how to create list items for each item in the list.
            ItemAdapter adapter = new ItemAdapter(getActivity(), items);

            // Find the ListView object in
            ListView listView = rootView.findViewById(R.id.item_list);

            // Make the ListView use the ItemAdapter we created above, so that the
            // ListView will display list items for each Item in the list.
            listView.setAdapter(adapter);

            return rootView;

    }




}