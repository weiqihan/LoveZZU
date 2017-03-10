package com.gjf.lovezzu.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gc.flashview.FlashView;
import com.gc.flashview.constants.EffectConstants;
import com.gc.flashview.listener.FlashViewListener;
import com.gjf.lovezzu.R;

import java.util.ArrayList;

/**
 * Created by lenovo047 on 2017/3/9.
 */

public class School_shoolfragment extends android.app.Fragment {

    private FlashView flashView;
    private ArrayList<String> imageUrls;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.inchool_school_view, container, false);
        flashView = (FlashView) view.findViewById(R.id.flash_view);


        /*

        * 设置向服务器请求图片--返回jison--{json:图片的URL和点击图片跳转的的URL}（有格式）--本地解析json--
        * 将图片的URL和点击的URL解析 匹配，用于设置相应的点击事件
        *
        * */


        imageUrls = new ArrayList<String>();
        imageUrls.add("http://www.qipaox.com/tupian/200810/20081051924582.jpg");
        imageUrls.add("http://www.bz55.com/uploads1/allimg/120312/1_120312100435_8.jpg");
        imageUrls.add("http://img3.iqilu.com/data/attachment/forum/201308/21/192654ai88zf6zaa60zddo.jpg");
        flashView.setEffect(EffectConstants.DEPTH_PAGE_EFFECT);//更改图片切换的动画效果
        flashView.setOnPageClickListener(new FlashViewListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(getContext(), "你的点击的是第" + (position + 1) + "张图片！", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
