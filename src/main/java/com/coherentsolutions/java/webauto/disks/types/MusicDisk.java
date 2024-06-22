package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.time.LocalDate;

public class MusicDisk extends Disk {
    public MusicDisk(String name, LocalDate inventoryDate, int rating) {
        super(Type.MUSIC, name, inventoryDate, rating);
    }
}