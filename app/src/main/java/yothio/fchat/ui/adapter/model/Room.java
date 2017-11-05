package yothio.fchat.ui.adapter.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by yoshiki on 2017/11/05.
 */
@Setter
@Getter
public class Room {

    int roomId;
    List<User> users;

}
