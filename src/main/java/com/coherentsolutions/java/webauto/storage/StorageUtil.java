package com.coherentsolutions.java.webauto.storage;

import com.coherentsolutions.java.webauto.disks.types.MovieDisk;

import java.util.Date;

public class StorageUtil {
    public static void fillStorage(Storage storage) {
        for (int i = 0; i < 20; i++) {
            storage.add(new MovieDisk("Movie" + i, new Date(), i % 5 + 1));
        }
    }
}
