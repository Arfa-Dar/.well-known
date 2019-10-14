package com.arfa.cv.fragments;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arfa.cv.adapters.myAdapter;
import com.arfa.cv.base.R;
import com.arfa.cv.model.DemoItem;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class myEducation extends Fragment {

    public myEducation() {
    }
    public static myEducation newInstance() {
        myEducation fragment = new myEducation();
        Bundle mybundle = new Bundle();
        fragment.setArguments(mybundle);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment4, viewGroup, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.myRV1);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new myAdapter(getContext(),feedItems()));
        return view;
    }
    private List<DemoItem> feedItems() {
        String Titles = "Education Section" ;
        List<DemoItem> myList = new ArrayList<>();
        DemoItem myItem = new DemoItem(Titles);
        myList.add(myItem);
        return myList;

    }
}





