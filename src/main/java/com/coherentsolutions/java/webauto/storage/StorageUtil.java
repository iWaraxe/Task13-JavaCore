package com.coherentsolutions.java.webauto.storage;

import com.coherentsolutions.java.webauto.disks.types.GameDisk;
import com.coherentsolutions.java.webauto.disks.types.MovieDisk;
import com.coherentsolutions.java.webauto.disks.types.MusicDisk;
import com.coherentsolutions.java.webauto.disks.types.SoftwareDisk;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class StorageUtil {
    public static void fillStorage(Storage storage) {
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            storage.add(new MovieDisk(
                    faker.book().title(),
                    toLocalDate(faker.date().past(1000, java.util.concurrent.TimeUnit.DAYS)),
                    faker.number().numberBetween(1, 5)
            ));

            storage.add(new MusicDisk(
                    faker.music().genre(),
                    toLocalDate(faker.date().past(1000, java.util.concurrent.TimeUnit.DAYS)),
                    faker.number().numberBetween(1, 5)
            ));

            storage.add(new SoftwareDisk(
                    faker.app().name(),
                    toLocalDate(faker.date().past(1000, java.util.concurrent.TimeUnit.DAYS)),
                    faker.number().numberBetween(1, 5)
            ));

            storage.add(new GameDisk(
                    faker.esports().game(),
                    toLocalDate(faker.date().past(1000, java.util.concurrent.TimeUnit.DAYS)),
                    faker.number().numberBetween(1, 5)
            ));
        }
    }

    private static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
