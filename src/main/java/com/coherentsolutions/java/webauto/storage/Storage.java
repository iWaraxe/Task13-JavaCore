package com.coherentsolutions.java.webauto.storage;

import com.coherentsolutions.java.webauto.disks.IDisk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.*;

public class Storage implements IStorage {
    private Map<Integer, IDisk> disks = new HashMap<>();
    private int idCounter = 0;

    @Override
    public void add(IDisk disk) {
        disks.put(idCounter++, disk);
    }

    @Override
    public List<IDisk> getAll() {
        return new ArrayList<>(disks.values());
    }

    @Override
    public IDisk getBy(String name) {
        for (IDisk disk : disks.values()) {
            if (disk.getName().equals(name)) {
                return disk;
            }
        }
        return null;
    }

    @Override
    public List<IDisk> getAllBy(Type type) {
        List<IDisk> result = new ArrayList<>();
        for (IDisk disk : disks.values()) {
            if (disk.getType() == type) {
                result.add(disk);
            }
        }
        return result;
    }

    @Override
    public List<IDisk> getAllBy(int rating) {
        List<IDisk> result = new ArrayList<>();
        for (IDisk disk : disks.values()) {
            if (disk.getRating() == rating) {
                result.add(disk);
            }
        }
        return result;
    }

    @Override
    public boolean isExistedBy(Type type) {
        for (IDisk disk : disks.values()) {
            if (disk.getType() == type) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isExistedBy(String name) {
        for (IDisk disk : disks.values()) {
            if (disk.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<IDisk> getAllBy(String year) {
        List<IDisk> result = new ArrayList<>();
        for (IDisk disk : disks.values()) {
            if (disk.getInventoryDate().toString().contains(year)) {
                result.add(disk);
            }
        }
        return result;
    }
}
