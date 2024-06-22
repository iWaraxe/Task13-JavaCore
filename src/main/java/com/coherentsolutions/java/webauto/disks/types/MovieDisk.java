package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.Date;

public class MovieDisk extends Disk {
    public MovieDisk(String name, Date inventoryDate, int rating) {
        super(Type.MOVIE, name, inventoryDate, rating);
    }
}