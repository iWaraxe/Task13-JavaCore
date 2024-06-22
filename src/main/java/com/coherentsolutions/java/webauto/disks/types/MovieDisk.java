package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.time.LocalDate;

public class MovieDisk extends Disk {
    public MovieDisk(String name, LocalDate inventoryDate, int rating) {
        super(Type.MOVIE, name, inventoryDate, rating);
    }
}