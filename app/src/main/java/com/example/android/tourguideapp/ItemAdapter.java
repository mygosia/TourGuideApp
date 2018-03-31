package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mygosia on 27.03.18.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Item currentItem = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView titleTetView = listItemView.findViewById(R.id.title_text_view);
        titleTetView.setText(currentItem.getTitleText());

        TextView subtitleTextView = listItemView.findViewById(R.id.subtitle_text_view);
        subtitleTextView.setText(currentItem.getSubtitleText());

        TextView contentsTextView = listItemView.findViewById(R.id.contents_text_view);
        contentsTextView.setText(currentItem.getContensText());

        ImageView imageItem = listItemView.findViewById(R.id.image_item);

        imageItem.setImageResource(currentItem.getmImageResourceId());

        return listItemView;
    }
}

