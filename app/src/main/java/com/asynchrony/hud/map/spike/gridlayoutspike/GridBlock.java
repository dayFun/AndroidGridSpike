//package com.asynchrony.hud.map.spike.gridlayoutspike;
//
//import android.content.Context;
//import android.view.View;
//import android.widget.TextView;
//
//public class GridBlock extends View {
//
//    public GridBlock(Context context) {
//        super(context);
//    }
//
//    public static GridBlock createBlock(Context context, int position) {
//        GridBlock gridBlock = new GridBlock(context);
//        TextView label = (TextView) gridBlock.findViewById(R.id.grid_item_label);
//        label.setText("" + position);
//        return gridBlock;
//    }
//
//
//
//
//
////    @Override
////    public void onCreate(Bundle savedInstanceState) {
////        this.blockNumber = getArguments().getInt("GRID_NUMBER");
////    }
//
////    @Nullable
////    @Override
////    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
////        View view = inflater.inflate(R.layout.single_grid_block, container, false);
////
////        TextView label = (TextView) view.findViewById(R.id.grid_item_label);
////        label.setText("" + blockNumber);
////
////        return view;
////    }
//}