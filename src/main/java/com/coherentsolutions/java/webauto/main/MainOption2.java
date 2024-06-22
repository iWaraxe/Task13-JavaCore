package com.coherentsolutions.java.webauto.main;

import com.coherentsolutions.java.webauto.disks.IDisk;
import com.coherentsolutions.java.webauto.disks.Type;
import com.coherentsolutions.java.webauto.storage.Storage;
import com.coherentsolutions.java.webauto.storage.StorageUtil;

import java.util.List;
import java.util.Scanner;

public class MainOption2 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        StorageUtil.fillStorage(storage);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number if you want to:");
            System.out.println("1) Get information about all movie disks");
            System.out.println("0) Exit");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                List<IDisk> movies = storage.getAllBy(Type.MOVIE);
                for (IDisk movie : movies) {
                    System.out.println(movie.toString());
                }
            }
        }
        scanner.close();
    }
}

