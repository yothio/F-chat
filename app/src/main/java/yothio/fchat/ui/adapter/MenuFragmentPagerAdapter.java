package yothio.fchat.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import yothio.fchat.ui.fragment.FriendListFragment;

/**
 * Created by yoshiki on 2017/11/05.
 */

public class MenuFragmentPagerAdapter extends FragmentPagerAdapter {
    //    メニューの画面を保持
    private List<Fragment> fragmentList;


    public MenuFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
    }

    //    呼び出し元からフラグメントのリストの受取
    public void serFragmentList(List<Fragment> fragmentList) {
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "友達";
            case 1:
                return "部屋";
            default:
                return "default";
        }
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
