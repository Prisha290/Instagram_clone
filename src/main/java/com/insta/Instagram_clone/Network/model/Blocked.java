package com.insta.Instagram_clone.Network.model;

import java.util.*;

public class Blocked {

    List<Integer> block_list = new ArrayList<>();

    Blocked(List<Integer> l) {
        this.block_list = l;
    }

    public boolean block(int id) {
        for (Integer x : block_list) {
            if (x == id)
                return false;
        }
        block_list.add(id);
        return true;
    }

    public boolean unblock_user(int id) {
        for (Integer x : block_list) {
            if (x == id) {
                block_list.remove(id);
                return true;
            }

        }
        return false;

    }

}
