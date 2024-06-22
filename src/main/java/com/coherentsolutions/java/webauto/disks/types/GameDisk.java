package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.time.LocalDate;

public class GameDisk extends Disk {
    public GameDisk(String name, LocalDate inventoryDate, int rating) {
        super(Type.GAME, name, inventoryDate, rating);
    }
}