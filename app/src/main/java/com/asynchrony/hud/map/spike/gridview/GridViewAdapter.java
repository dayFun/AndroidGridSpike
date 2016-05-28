package com.asynchrony.hud.map.spike.gridview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.asynchrony.hud.map.spike.SingleBox;
import com.asynchrony.hud.map.spike.gridlayoutspike.R;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private GridBlockSizeCalculator blockSizeCalculator;

    private List<SingleBox> data = Arrays.asList(new SingleBox("609.9", "Gamma CPS"),
            new SingleBox("0.01", "Neutron CPS"),
            new SingleBox("0.007", "Exposure mR/H"),
            new SingleBox("K-40", "Isotopes"));

    public GridViewAdapter(Context context, GridBlockSizeCalculator blockSizeCalculator) {
        this.context = context;
        this.blockSizeCalculator = blockSizeCalculator;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View singleBlock = convertView;

        if (singleBlock == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            singleBlock = inflater.inflate(R.layout.single_grid_block, parent, false);
        }

        TextView value = (TextView) singleBlock.findViewById(R.id.grid_block_value);
        value.setText(data.get(position).getValue());

        TextView label = (TextView) singleBlock.findViewById(R.id.grid_block_label);
        label.setText(data.get(position).getLabel());

        blockSizeCalculator.setBlockSize(singleBlock);
        setRandomBackgroundColor(singleBlock);
        return singleBlock;
    }

    private void setRandomBackgroundColor(View block) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        block.setBackgroundColor(color);
    }
}