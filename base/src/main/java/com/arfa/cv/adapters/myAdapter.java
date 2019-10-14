package com.arfa.cv.adapters;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arfa.cv.model.DemoItem;
import com.arfa.cv.base.R;
import java.util.List;

public class myAdapter extends RecyclerView.Adapter {
    private List<DemoItem> myList;
    private ImageView myImage;
    private Context myContext;

    public myAdapter(Context context,List<DemoItem> mylist)
    {
        this.myList=mylist;
        this.myContext=context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(myContext);
        View currView= inflater.inflate(R.layout.education,parent,false);
        myImage  = currView.findViewById(R.id.education_publication_link);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myContext.getString(R.string.ieee_link)));
                myContext.startActivity(intent);
            }
        });
        return new MyItemHolder(currView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) myContext).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
    public class MyItemHolder extends RecyclerView.ViewHolder {
        MyItemHolder(View itemView) {
            super(itemView);
        }
    }
}
