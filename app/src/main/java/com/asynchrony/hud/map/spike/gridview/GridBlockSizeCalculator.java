package com.asynchrony.hud.map.spike.gridview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.asynchrony.hud.map.spike.gridlayoutspike.R;

public class GridBlockSizeCalculator {

    private static final int NUM_COLUMNS = 2;
    private static final int NUM_ROWS = 2;
    private Context context;

    public GridBlockSizeCalculator(Context context) {
        this.context = context;
    }

    @NonNull
    public View setBlockSize(View block) {
        DisplayMetrics metrics = new DisplayMetrics();
        Activity activity = (Activity) context;
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int totalWidth = metrics.widthPixels;
        int totalHeight = metrics.heightPixels;

        int adjustedHeight = totalHeight - getStatusBarHeight() - getActionBarHeight();

        block.setMinimumHeight(adjustedHeight / NUM_ROWS);
        block.setMinimumWidth(totalWidth / NUM_COLUMNS);

        return block;
    }

    private int getActionBarHeight() {
        int actionBarHeight = 0;
        if (isToolbarShowing()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
            actionBarHeight = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        return actionBarHeight;

    }

    private int getStatusBarHeight() {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }

        Log.d("***DEBUG***", "actionBarHeight = " + result);
        return result;
    }


//    TODO: Why was this off?
//    public int getStatusBarHeight() {
//        Rect rectangle = new Rect();
//        Window window = getActivity().getWindow();
//        window.getDecorView().getWindowVisibleDisplayFrame(rectangle);
//        int statusBarHeight = rectangle.top;
//
//        int contentViewTop =
//                window.findViewById(Window.ID_ANDROID_CONTENT).getTop();
//
//        return contentViewTop - statusBarHeight;
//    }

    private AppCompatActivity getActivity() {
        return (AppCompatActivity) context;
    }

    private boolean isToolbarShowing() {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        return supportActionBar != null && supportActionBar.isShowing();
    }
}
