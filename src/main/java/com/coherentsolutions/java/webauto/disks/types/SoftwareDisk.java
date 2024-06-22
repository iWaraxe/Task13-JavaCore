package com.coherentsolutions.java.webauto.disks.types;

import com.coherentsolutions.java.webauto.disks.Disk;
import com.coherentsolutions.java.webauto.disks.Type;

import java.time.LocalDate;

public class SoftwareDisk extends Disk {
    public SoftwareDisk(String name, LocalDate inventoryDate, int rating) {
        super(Type.SOFTWARE, name, inventoryDate, rating);
    }
}