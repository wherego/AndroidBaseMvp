package com.example.wanmen.wanmendx_android_mvp.main;

import com.example.wanmen.wanmendx_android_mvp.R;
import com.example.wanmen.wanmendx_android_mvp.base.BaseFragment;

/**
 * Created by yangyi on 2017/4/17.
 */

public class MainFragment extends BaseFragment {
    @Override
    public void initFragmentData() {

    }

    @Override
    public void initFragmentView() {

    }

    @Override
    public int getFragmentViewId() {
        return R.layout.fragment_main;
    }

    public static MainFragment newInstance(){
        return new MainFragment();
    }
}
