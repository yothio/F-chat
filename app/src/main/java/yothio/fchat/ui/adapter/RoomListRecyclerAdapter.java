package yothio.fchat.ui.adapter;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import yothio.fchat.R;
import yothio.fchat.ui.adapter.model.Room;
import yothio.fchat.ui.adapter.model.User;

/**
 * Created by yocchi on 2017/11/06.
 */

public class RoomListRecyclerAdapter extends RecyclerView.Adapter<RoomListRecyclerAdapter.RecyclerViewHolder> {

    List<Room> list;
    LayoutInflater layoutInflater;
    Context context;
    FragmentManager fm;
    CoordinatorLayout root;

    public RoomListRecyclerAdapter(Context c, List<Room> list, FragmentManager fm, CoordinatorLayout root) {
        layoutInflater = LayoutInflater.from(c);
        this.list = list;
        context = c;
        this.fm = fm;
        this.root = root;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_room_item, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText("test:" + position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

        }
    }
}
