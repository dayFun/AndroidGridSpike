package com.asynchrony.hud.map.spike.gridview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.asynchrony.hud.map.spike.gridlayoutspike.R;

public class GridViewFragment extends Fragment {

    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gridview_fragment, container, false);

        gridView = (GridView) view.findViewById(R.id.grid_view);
        gridView.setVerticalScrollBarEnabled(false);
        gridView.setAdapter(new GridViewAdapter(getActivity(), new GridBlockSizeCalculator(getActivity())));

        return view;
    }
}
