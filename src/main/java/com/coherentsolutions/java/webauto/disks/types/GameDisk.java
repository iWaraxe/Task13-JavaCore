package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.Date;

public class GameDisk extends Disk {
    public GameDisk(String name, Date inventoryDate, int rating) {
        super(Type.GAME, name, inventoryDate, rating);
    }
}