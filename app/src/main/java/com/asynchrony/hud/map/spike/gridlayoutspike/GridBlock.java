package com.asynchrony.hud.map.spike.gridlayoutspike;

import android.content.Context;
import android.view.View;

public class GridBlock extends View {

    private int blockNumber;


    public GridBlock(Context context) {
        super(context);
    }
}


/*
*  public static GridBlock createBlock(int position) {
        GridBlock block = new GridBlock();
        Bundle args = new Bundle();
        args.putInt("GRID_NUMBER", position);
        block.setArguments(args);
        return block;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.blockNumber = getArguments().getInt("GRID_NUMBER");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.single_grid_block, container, false);

        TextView label = (TextView) view.findViewById(R.id.grid_item_label);
        label.setText("" + blockNumber);

        return view;
    }
* */
