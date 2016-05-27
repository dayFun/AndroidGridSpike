package com.asynchrony.hud.map.spike.gridlayoutspike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Random;

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private int[] data;

    public GridViewAdapter(Context context, int[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View grid;

        if (convertView == null) {
            grid = inflater.inflate(R.layout.single_grid_block, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_item_label);

            String text = "Some text " + new Random().nextInt();
            textView.setText(text);

        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
