// Disk.java
package com.coherentsolutions.java.webauto.disks;

import java.util.Date;

public abstract class Disk implements IDisk {
    private Type type;
    private String name;
    private Date inventoryDate;
    private int rating;

    public Disk(Type type, String name, Date inventoryDate, int rating) {
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
    public Date getInventoryDate() {
        return inventoryDate;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Name: " + name + ", Inventory Date: " + inventoryDate + ", Rating: " + rating;
    }
}
