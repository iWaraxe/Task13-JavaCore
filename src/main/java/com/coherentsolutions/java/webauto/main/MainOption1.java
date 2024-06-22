package com.coherentsolutions.java.webauto.main;

import com.coherentsolutions.java.webauto.disks.IDisk;
import com.coherentsolutions.java.webauto.disks.Type;
import com.coherentsolutions.java.webauto.storage.Storage;
import com.coherentsolutions.java.webauto.storage.StorageUtil;

import java.util.List;

public class MainOption1 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        StorageUtil.fillStorage(storage);

        List<IDisk> movies = storage.getAllBy(Type.MOVIE);
        movies.forEach(movie -> System.out.println(movie.toString()));
    }
}
