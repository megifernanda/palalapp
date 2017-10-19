package com.project.menda.wisatasumbar.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

    public static Activity activity;

    private int count = 10;

    public HomeAdapter(Context context, Activity act) {
        this.context = context;
        activity = act;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemHome = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_child_layout, parent, false);

        return new ViewHolder(itemHome);
    }


    @Override
    public int getItemCount() {
        return count;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(View itemViewUser) {
            super(itemViewUser);
            cardView = (CardView) itemViewUser.findViewById(R.id.card_view);
        }
    }


    @Override
    public void onBindViewHolder(HomeAdapter.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {

            setAnimation(((ViewHolder) holder).cardView, position);

        }
    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > count) {
            Animation animation = AnimationUtils.loadAnimation(activity, R.anim.zoomin);
            viewToAnimate.startAnimation(animation);
            count = position;
        }
    }

    public void setClickListener(OnItemClickListener clickListener) {
        this.mListener = clickListener;

    }

    public interface OnItemClickListener {
        public abstract void onItemClick(View view, int position);
    }
}
