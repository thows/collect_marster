package com.master.ui.activity.map;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.master.R;
import com.master.app.tools.ActionBarManager;
import com.master.contract.BaseActivity;

import butterknife.BindView;

public class MrLayerActivity extends BaseActivity {

    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.toolbar)
    Toolbar toolbar;



    @Override
    public void bindView(Bundle savedInstanceState) {
        setSupportActionBar(toolbar);
        ActionBarManager.initBackTitle(getSupportActionBar());
        title.setText("图层管理");

    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_mr_layer;
    }
}
