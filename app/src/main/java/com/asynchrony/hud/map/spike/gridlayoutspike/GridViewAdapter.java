package com.asynchrony.hud.map.spike.gridlayoutspike;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {

    private Context context;

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
//        return GridBlock.createBlock(context, position);
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

        View singleBlock;

        if (convertView == null) {

            DisplayMetrics metrics = new DisplayMetrics();
            Activity activity = (Activity) context;
            activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

            int width = metrics.widthPixels;
            int height = metrics.heightPixels;

            singleBlock = inflater.inflate(R.layout.single_grid_block, parent, false);
            singleBlock.setMinimumHeight(height / 2);
            singleBlock.setMinimumWidth(width / 2);


            TextView label = (TextView) singleBlock.findViewById(R.id.grid_item_label);
            label.setText("" + position);
        } else {
            singleBlock = convertView;
        }

        return singleBlock;
    }
}