// IDisk.java
package com.coherentsolutions.java.webauto.disks;

import java.time.LocalDate;
import java.util.Date;

public interface IDisk {
    Type getType();
    String getName();
    LocalDate getInventoryDate();
    int getRating();
    String toString();

    default String getInfo() {
        return String.format("Type: %s, Name: %s, Inventory Date: %s, Rating: %d",
                getType(), getName(), getInventoryDate(), getRating());
    }
}
