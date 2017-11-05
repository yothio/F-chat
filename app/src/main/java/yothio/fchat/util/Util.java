package yothio.fchat.util;

import yothio.fchat.ui.adapter.model.User;

/**
 * Created by yoshiki on 2017/11/04.
 */

public class Util {


    private static Util  util = new Util();
    private User currentUser;

    public static Util getInstance() {
        return util;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
