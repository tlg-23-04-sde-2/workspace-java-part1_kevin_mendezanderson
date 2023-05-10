package com.entertainment.client;

import com.entertainment.InvalidVolumeException;
import com.entertainment.Television;

class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = null;
        try {
            tv1 = new Television("LG", 50);
        } catch (InvalidVolumeException e) {
            e.printStackTrace();
        }
    }

}