package com.ptk.recyclerviewexample.utility;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCustomItemDecoration extends RecyclerView.ItemDecoration {
    private int start;
    private int top;
    private int end;
    private int bottom;

    public MyCustomItemDecoration(int start, int top, int end, int bottom) {
        this.start = start;
        this.top = top;
        this.end = end;
        this.bottom = bottom;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(start, top, end, bottom);
    }

}
