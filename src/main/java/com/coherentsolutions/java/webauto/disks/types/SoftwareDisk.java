package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.util.Date;

public class SoftwareDisk extends Disk {
    public SoftwareDisk(String name, Date inventoryDate, int rating) {
        super(Type.SOFTWARE, name, inventoryDate, rating);
    }
}