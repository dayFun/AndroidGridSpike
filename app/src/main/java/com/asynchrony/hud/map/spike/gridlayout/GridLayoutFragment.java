package com.asynchrony.hud.map.spike.gridlayout;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import com.asynchrony.hud.map.spike.gridlayoutspike.R;

public class GridLayoutFragment extends Fragment {

    private GridLayout gridLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gridlayout_fragment, container, false);
        gridLayout = (GridLayout) view.findViewById(R.id.gridlayout_view);

        View cell1 = createCell(inflater, "Cell 1");
        View cell2 = createCell(inflater, "Cell 2");
        View cell3 = createCell(inflater, "Cell 3");
        View cell4 = createCell(inflater, "Cell 4");

        gridLayout.addView(cell1);
        gridLayout.addView(cell2);
        gridLayout.addView(cell3);
        gridLayout.addView(cell4);
        return view;
    }

    private View createCell(LayoutInflater inflater, String cellLabelText) {
        View cell = inflater.inflate(R.layout.single_grid_block, null);
        TextView cellLabel = (TextView) cell.findViewById(R.id.grid_block_label);
        cellLabel.setText(cellLabelText);
        return cell;
    }
}
