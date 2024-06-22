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
        return disks.values().stream()
                .filter(disk -> disk.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<IDisk> getAllBy(Type type) {
        return disks.values().stream()
                .filter(disk -> disk.getType() == type)
                .toList();
    }

    @Override
    public List<IDisk> getAllBy(int rating) {
        return disks.values().stream()
                .filter(disk -> disk.getRating() == rating)
                .toList();
    }

    @Override
    public boolean isExistedBy(Type type) {
        return disks.values().stream()
                .anyMatch(disk -> disk.getType() == type);
    }

    @Override
    public boolean isExistedBy(String name) {
        return disks.values().stream()
                .anyMatch(disk -> disk.getName().equals(name));
    }

    @Override
    public List<IDisk> getAllBy(String year) {
        return disks.values().stream()
                .filter(disk -> Integer.toString(disk.getInventoryDate().getYear()).equals(year))
                .toList();
    }
}
