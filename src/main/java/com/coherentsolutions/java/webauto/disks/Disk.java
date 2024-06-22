// Disk.java
package com.coherentsolutions.java.webauto.disks;

import java.time.LocalDate;

public abstract class Disk implements IDisk {
    private Type type;
    private String name;
    private LocalDate inventoryDate;
    private int rating;

    public Disk(Type type, String name, LocalDate inventoryDate, int rating) {
        this.type = type;
        this.name = name;
        this.inventoryDate = inventoryDate;
        this.rating = rating;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getInventoryDate() {
        return inventoryDate;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
