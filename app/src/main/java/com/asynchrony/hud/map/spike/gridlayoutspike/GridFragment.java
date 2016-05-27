package com.asynchrony.hud.map.spike.gridlayoutspike;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class GridFragment extends Fragment {

    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grid_fragment, container, false);
        gridView = (GridView) view.findViewById(R.id.grid_view);

        gridView.setAdapter(new GridViewAdapter(getActivity(), new int[]{1, 2, 3, 4}));

        return view;
    }
}
