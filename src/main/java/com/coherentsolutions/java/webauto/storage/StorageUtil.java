package com.coherentsolutions.java.webauto.storage;

import com.coherentsolutions.java.webauto.disks.types.MovieDisk;

import java.time.LocalDate;

public class StorageUtil {
    public static void fillStorage(Storage storage) {
        for (int i = 0; i < 20; i++) {
            storage.add(new MovieDisk("Movie" + i, LocalDate.now(), i % 5 + 1));
        }
    }
}
