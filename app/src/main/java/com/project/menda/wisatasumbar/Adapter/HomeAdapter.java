package com.project.menda.wisatasumbar.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.menda.wisatasumbar.R;

import java.util.ArrayList;

/**
 * Created by Megi Fernanda on 27-Sep-17.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {


    private OnItemClickListener mListener;
    private Context context;


    public HomeAdapter(Context context) {
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemHome = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_child_layout, parent, false);

        return new ViewHolder(itemHome);
    }

    @Override
    public void onBindViewHolder(HomeAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemViewUser) {
            super(itemViewUser);


        }
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.mListener = clickListener;

    }

    public interface OnItemClickListener {
        public abstract void onItemClick(View view, int position);
    }
}
