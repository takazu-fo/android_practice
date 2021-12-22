package com.example.practice211222;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    public static SampleFragment newInstance(String str){
        // Fragemnt01 インスタンス生成
        SampleFragment fragment = new SampleFragment ();
        // Bundle にパラメータを設定
        Bundle barg = new Bundle();
        barg.putString("Message", str);
        fragment.setArguments(barg);

        return fragment;
    }

    // FragmentのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.samplefragment,
                container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();
        if(args != null ){
            String str = args.getString("Message");
            TextView textView = view.findViewById(R.id.text_fragment);
            textView.setText(str);
        }
    }
}
