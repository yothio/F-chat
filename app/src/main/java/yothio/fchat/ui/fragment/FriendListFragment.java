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
import yothio.fchat.ui.adapter.FriendListRecyclerAdapter;
import yothio.fchat.ui.adapter.model.User;

/**
 * Created by yoshiki on 2017/11/04.
 */

public class FriendListFragment extends BaseFragment {

    private RecyclerView.Adapter adapter;

    private CoordinatorLayout root;
    private List<User> list;
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

        list = new ArrayList<>();
        User user = new User();
        user.setImagePath("test");
        user.setName("テストさん");
        user.setUserId(123);
        list.add(user);

//        アダプターに配列を渡す
        adapter = new FriendListRecyclerAdapter(getContext(),list, getFragmentManager(),root );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        return v;
    }
}
