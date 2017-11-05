package yothio.fchat.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import yothio.fchat.R;
import yothio.fchat.ui.adapter.MenuFragmentPagerAdapter;
import yothio.fchat.ui.fragment.FriendListFragment;
import yothio.fchat.ui.fragment.TalkRoomListFragment;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);


        MenuFragmentPagerAdapter pagerAdapter = new MenuFragmentPagerAdapter(getSupportFragmentManager());

        tabLayout.setupWithViewPager(viewPager);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new FriendListFragment());
        fragmentList.add(new TalkRoomListFragment());

        pagerAdapter.serFragmentList(fragmentList);

        initTabLayout();

        viewPager.setAdapter(pagerAdapter);
    }

    private void initTabLayout() {

    }


}
