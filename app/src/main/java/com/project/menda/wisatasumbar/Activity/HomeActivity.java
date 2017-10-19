package com.project.menda.wisatasumbar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.project.menda.wisatasumbar.Adapter.HomeAdapter;
import com.project.menda.wisatasumbar.R;

/**
 * Created by Megi Fernanda on 27-Sep-17.
 */

public class HomeActivity extends AppCompatActivity  {

    private HomeAdapter adapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_beranda);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(horizontalLayoutManagaer);
        adapter = new HomeAdapter(this, this);
        mRecyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}
