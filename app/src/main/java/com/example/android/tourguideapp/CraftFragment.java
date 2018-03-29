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

public class CraftFragment extends Fragment {

    public CraftFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getResources().getString(R.string.craft_title_1), getResources().getString(R.string.cratf_subtitle_1), getResources().getString(R.string.craft_content_1), R.drawable.tkactwo));
        items.add(new Item(getResources().getString(R.string.craft_title_2), getResources().getString(R.string.cratf_subtitle_2), getResources().getString(R.string.craft_content_2), R.drawable.pracownialyzek));
        items.add(new Item(getResources().getString(R.string.craft_title_3), getResources().getString(R.string.cratf_subtitle_3), getResources().getString(R.string.craft_content_3), R.drawable.pracowniagarncarska));
        items.add(new Item(getResources().getString(R.string.craft_title_4), getResources().getString(R.string.cratf_subtitle_4), getResources().getString(R.string.craft_content_4), R.drawable.pracowniakowlaska));

        // Create an ItemAdapter
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the  ListView object
        ListView listView = rootView.findViewById(R.id.item_list);

        // Make the ListView use the ItemAdapte we created above, so that the
        // ListView will display list items for each Item in the list.
        listView.setAdapter(adapter);

        return rootView;

    }




}