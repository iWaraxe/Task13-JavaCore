// IDisk.java
package com.coherentsolutions.java.webauto.disks;

import java.util.Date;

public interface IDisk {
    Type getType();
    String getName();
    Date getInventoryDate();
    int getRating();
    String toString();
}
