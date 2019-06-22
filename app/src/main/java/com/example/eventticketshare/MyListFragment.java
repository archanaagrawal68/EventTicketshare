package com.example.eventticketshare;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MyListFragment extends ListFragment implements OnItemClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.event, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
       // Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
        if (position == 0) {
            Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
            startActivityForResult(myIntent, 0);
        }
        if (position == 1) {
            Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
            startActivityForResult(myIntent, 0);
        }
    }
}