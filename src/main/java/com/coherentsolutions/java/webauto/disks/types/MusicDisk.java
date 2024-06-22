package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.Date;

public class MusicDisk extends Disk {
    public MusicDisk(String name, Date inventoryDate, int rating) {
        super(Type.MUSIC, name, inventoryDate, rating);
    }
}