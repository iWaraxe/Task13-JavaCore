package com.coherentsolutions.java.webauto.storage;

import com.coherentsolutions.java.webauto.disks.IDisk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.List;

public interface IStorage {
    void add(IDisk disk);
    List<IDisk> getAll();
    IDisk getBy(String name);
    List<IDisk> getAllBy(Type type);
    List<IDisk> getAllBy(int rating);
    boolean isExistedBy(Type type);
    boolean isExistedBy(String name);
    List<IDisk> getAllBy(String year);
}

