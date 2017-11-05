package yothio.fchat.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import yothio.fchat.R;
import yothio.fchat.ui.adapter.RoomListRecyclerAdapter;
import yothio.fchat.ui.adapter.model.Room;

/**
 * Created by yoshiki on 2017/11/05.
 */

public class TalkRoomListFragment extends BaseFragment {

    private RecyclerView.Adapter adapter;

    private CoordinatorLayout root;
    private List<Room> list;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_friend_list, container, false);
//        rootの取得
        root = (CoordinatorLayout) v.findViewById(R.id.friend_list_root);
//        レイアウトとの結びつけ
        recyclerView = v.findViewById(R.id.friend_list_recyclerview);

        Room room = new Room();

        list = new ArrayList<>();

        list.add(room);

//        アダプターに配列を渡す
        adapter = new RoomListRecyclerAdapter(getContext(),list, getFragmentManager(),root );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        return v;
    }
}
