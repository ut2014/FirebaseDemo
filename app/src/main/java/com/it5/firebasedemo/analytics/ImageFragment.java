package com.it5.firebasedemo.analytics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.it5.firebasedemo.R;

/**
 * Created by IT5 on 2016/11/22.
 */

public class ImageFragment extends Fragment{
    private static final String ARG_PATTERN = "pattern";
    private int resId;

    public static ImageFragment newInstance(int resid) {
        Bundle args = new Bundle();
        args.putInt(ARG_PATTERN,resid);
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public ImageFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null) {
            resId=getArguments().getInt(ARG_PATTERN);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(resId);
        return view;
    }

}
