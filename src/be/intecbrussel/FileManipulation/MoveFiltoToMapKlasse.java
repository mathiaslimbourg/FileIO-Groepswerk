package be.intecbrussel.FileManipulation;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;


//TODO: In deze klasse is zeer veel duplicate code,
// probeer om je code te refactoren eens je werkende code hebt.

//TODO: Het grote probleem in deze klasse is de hoge aanwezigheid van hard coded elementen.
// Het is een goede poging maar zal enorm veel werk naar onderhoud meebrengen,
// probeer je klassen zo dynamisch mogelijk te houden. Probeer ook De klasse File te vermijden
// Waar mogelijk en gebruik te maken van de nieuwere klasse Path.

public class MoveFiltoToMapKlasse {

    //TODO: Het lijkt me verstandiger om deze variabelen enkel via de getter en setter beschikbaar te maken.
    // Zo behoud je de controle van deze variabele in eigen klasse dit kan onverwacht gedrag voorkomen.
    public static List<Path> filePaths = new ArrayList<>();


    //TODO: De commentaar voor deze methode geldt voor de andere praktisch identieke methoden.
    public static void moveFileToMapCsv() throws IOException {
        //TODO: Maak van deze lokale variabele een private klasse variabele,
        // aangezien je hem in elke methode gebruikt.
        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        //TODO: Hetzelfde geld voor f1.
        File f1 = new File(test1_Unsorted);
        //TODO: Deze logica kan ondergebracht worden in private helper methode.
        File f2 = new File(test1_sorted + "csv");
        FilenameFilter filter = (dir, name) -> name.endsWith(".csv");


        //TODO: Kan NullPointerException geven
        for (File f : f1.listFiles(filter)) {
            System.out.println(f);  //TODO: Dit stukje code mag na development verwijderd worden.

            //TODO: Was ook een mogelijkheid geweest, maakt code iets meer leesbaar:
            // Path src = f.toPath();
            // Path dest = f2.toPath().resolve(src.getFileName());
            // Files.copy(src, dest);
            // filePaths.add(dest);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapdatabase() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "database");

        FilenameFilter filter = (dir, name) -> name.endsWith(".sqlite3");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapJpg() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "jpg");

        FilenameFilter filter = (dir, name) -> name.endsWith(".jpg");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapExe() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "exe");

        FilenameFilter filter = (dir, name) -> name.endsWith(".exe");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapGif() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "gif");

        FilenameFilter filter = (dir, name) -> name.endsWith(".gif");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapGitignore() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "gitignore");

        FilenameFilter filter = (dir, name) -> name.endsWith(".gitignore");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapJson() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "json");

        FilenameFilter filter = (dir, name) -> name.endsWith(".json");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdf() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2012() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2012 edities\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2013() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2013 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2014() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2014 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2015() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2015 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2016() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2016 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2017() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2017 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPdfMagazine2018() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\magazine's\\2018 edities\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "pdf");

        FilenameFilter filter = (dir, name) -> name.endsWith(".pdf");

        for (File f : f1.listFiles(filter)) {

            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPng() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "png");

        FilenameFilter filter = (dir, name) -> name.endsWith(".png");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapPy() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "py");

        FilenameFilter filter = (dir, name) -> name.endsWith(".py");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    //TODO: Deze methode heeft zeer veel verantwoordelijkheid, probeer deze onderteverdelen in kleinere stukken.
    // Dit zal ook het onderhoud van je programma ten goede komen.

    //TODO: De summary.txt is niet volledig
    public static void moveFileToMapSummary() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        //TODO: Onderstaande variabelen worden nooit gebruikt.
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "summary");

        Path pathOut = Paths.get("C:/data/Sorted/summary/summary.txt");
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(pathOut.toString())))) {

            //TODO: Deze Formatter kan ook gedeclareerd worden in de try-with resources
            Formatter formatter1 = new Formatter();
            String text1 = "%-50s %-4s  %-1s  %-2s %-5s  %-1s  %-8s  %-5s  %n%n";
            //TODO: Vermijd String concatenation zoals die hieronder, dit kan anders opgelost worden.
            formatter1.format("     "+text1, "Name",  "|", "Readable", "|", "Writable", "|", "Hidden", "|");
            out.write(formatter1.toString());

            //TODO: Bij onderstaande code had documentatie gemogen.
            Path p1;
            for(int i = 0; i < filePaths.size(); i++) {

                if ( i > 0) {
                    p1 = filePaths.get(i - 1);
                } else {
                    p1 = filePaths.get(i);
                }
                Path p2 = filePaths.get(i);

                String ext = filePaths.get(i).toFile().getParentFile().toPath().getFileName().toString();
                String name = filePaths.get(i).toFile().getName();
                String read = filePaths.get(i).toFile().canRead() ? "x" : "/";
                String write = filePaths.get(i).toFile().canWrite() ? "x" : "/";
                String hidden = filePaths.get(i).toFile().isHidden() ? "x" : "/";

                if (i == 0 || !(p1.toFile().getParentFile().toPath().getFileName().toString()
                        .equals(p2.toFile().getParentFile().toPath().getFileName().toString()))) {
                    out.println("----------------------------------------------");
                    out.println(ext + ":");
                    out.println("\n ");
                }

                Formatter formatter2 = new Formatter();
                String text2 = "%-50s %-5s   %-5s  %-5s  %-5s  %-5s %-5s  %-5s %n";

                formatter2.format("     "+text2, name,  "|",read, "|", write, "|", hidden, "|");
                out.print(formatter2.toString());

            }
        }

    }

    public static void moveFileToMapTxt() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "txt");

        FilenameFilter filter = (dir, name) -> name.endsWith(".txt");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapWma() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "wma");

        FilenameFilter filter = (dir, name) -> name.endsWith(".wma");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    public static void moveFileToMapZip() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "zip");

        FilenameFilter filter = (dir, name) -> name.endsWith(".zip");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));

        }

    }
}
