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

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.nature_fragment, container, false);

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
            final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getResources().getString(R.string.nature_title_1), getResources().getString(R.string.nature_subtitle_1), getResources().getString(R.string.nature_content_1), R.drawable.bialowieski));
        items.add(new Item(getResources().getString(R.string.nature_title_2), getResources().getString(R.string.nature_subtitle_2), getResources().getString(R.string.nature_content_2), R.drawable.biebrzanski));
        items.add(new Item(getResources().getString(R.string.nature_title_3), getResources().getString(R.string.nature_subtitle_3), getResources().getString(R.string.nature_content_3), R.drawable.narwianski));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            ItemAdapter adapter = new ItemAdapter(getActivity(), items);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.item_list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);

            // Set a click listener to play the audio when the list item is clicked on

            return rootView;

    }




}