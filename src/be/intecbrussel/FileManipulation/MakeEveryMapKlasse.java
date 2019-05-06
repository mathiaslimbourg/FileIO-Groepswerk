package be.intecbrussel.MakeEveryMap;

import java.io.File;

public class MakeEveryMapKlasse {
    public static void makeEveyMap() {
        final String test1_sorted = "C:\\data\\Sorted\\";

        new File(test1_sorted + "csv").mkdirs();
        new File(test1_sorted + "database").mkdirs();
        new File(test1_sorted + "exe").mkdirs();
        new File(test1_sorted + "gif").mkdirs();
        new File(test1_sorted + "gitignore").mkdirs();
        new File(test1_sorted + "jpg").mkdirs();
        new File(test1_sorted + "json").mkdirs();
        new File(test1_sorted + "pdf").mkdirs();
        new File(test1_sorted + "png").mkdirs();
        new File(test1_sorted + "py").mkdirs();
        new File(test1_sorted + "summary").mkdirs();
        new File(test1_sorted + "txt").mkdirs();
        new File(test1_sorted + "wma").mkdirs();
        new File(test1_sorted + "zip").mkdirs();

    }
}
