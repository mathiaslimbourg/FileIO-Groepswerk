package be.intecbrussel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class MainApp {
    public static List<Path> filePaths = new ArrayList<>();

    public static void main(String[] args) {

        try {
            makeEveyMap();
            moveFileToMapCsv();
            moveFileToMapdatabase();
            moveFileToMapExe();
            moveFileToMapGif();
            moveFileToMapGitignore();
            moveFileToMapHidden();
            moveFileToMapJpg();
            moveFileToMapJson();
            moveFileToMapPdf();
            moveFileToMapPdfMagazine2012();
            moveFileToMapPdfMagazine2013();
            moveFileToMapPdfMagazine2014();
            moveFileToMapPdfMagazine2015();
            moveFileToMapPdfMagazine2016();
            moveFileToMapPdfMagazine2017();
            moveFileToMapPdfMagazine2018();
            moveFileToMapPng();
            moveFileToMapPy();
            moveFileToMapSummary();
            moveFileToMapTxt();
            moveFileToMapWma();
            moveFileToMapZip();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Path p : filePaths) {
            System.out.println("xx " + p);

        }
        System.out.println("xxx " + filePaths.size());

    }

    private static void makeEveyMap() {
        final String test1_sorted = "C:\\data\\Sorted\\";

        new File(test1_sorted + "csv").mkdirs();
        new File(test1_sorted + "database").mkdirs();
        new File(test1_sorted + "exe").mkdirs();
        new File(test1_sorted + "gif").mkdirs();
        new File(test1_sorted + "gitignore").mkdirs();
        new File(test1_sorted + "jpg").mkdirs();
        new File(test1_sorted + "json").mkdirs();
        new File(test1_sorted + "hidden").mkdirs();
        new File(test1_sorted + "pdf").mkdirs();
        new File(test1_sorted + "png").mkdirs();
        new File(test1_sorted + "py").mkdirs();
        new File(test1_sorted + "summary").mkdirs();
        new File(test1_sorted + "txt").mkdirs();
        new File(test1_sorted + "wma").mkdirs();
        new File(test1_sorted + "zip").mkdirs();

    }

    private static void moveFileToMapCsv() throws IOException {
        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "csv");

        FilenameFilter filter = (dir, name) -> name.endsWith(".csv");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    private static void moveFileToMapdatabase() throws IOException {

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

    private static void moveFileToMapJpg() throws IOException {

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

    private static void moveFileToMapExe() throws IOException {

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

    private static void moveFileToMapGif() throws IOException {

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

    private static void moveFileToMapGitignore() throws IOException {

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

    private static void moveFileToMapHidden() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";

        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "hidden");

        FilenameFilter filter = (dir, name) -> name.endsWith(".hidden");

        for (File f : f1.listFiles(filter)) {
            System.out.println(f);
            Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
            filePaths.add(Paths.get(f2.getAbsolutePath() + "/" + f.getName()));
        }
    }

    private static void moveFileToMapJson() throws IOException {

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

    private static void moveFileToMapPdf() throws IOException {

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

    private static void moveFileToMapPdfMagazine2012() throws IOException {

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

    private static void moveFileToMapPdfMagazine2013() throws IOException {

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

    private static void moveFileToMapPdfMagazine2014() throws IOException {

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

    private static void moveFileToMapPdfMagazine2015() throws IOException {

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

    private static void moveFileToMapPdfMagazine2016() throws IOException {

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

    private static void moveFileToMapPdfMagazine2017() throws IOException {

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

    private static void moveFileToMapPdfMagazine2018() throws IOException {

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

    private static void moveFileToMapPng() throws IOException {

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

    private static void moveFileToMapPy() throws IOException {

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

    private static void moveFileToMapSummary() throws IOException {

        final String test1_sorted = "C:\\data\\Sorted\\";
        final String test1_Unsorted = "C:\\data\\Unsorted\\";
        File f1 = new File(test1_Unsorted);
        File f2 = new File(test1_sorted + "summary");

        // FilenameFilter filter = (dir, name) -> name.endsWith(".txt");

        /*
         * for (File f : f1.listFiles(filter)) { System.out.println(f);
         * Files.copy(Paths.get(f.getAbsolutePath()), Paths.get(f2.getAbsolutePath() +
         * "/" + f.getName())); }
         */

        Path pathOut = Paths.get("C:/data/Sorted/summary/summary.txt");
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(pathOut.toString())))) {

            Formatter formatter1 = new Formatter();
            String text1 = "%-50s %-4s %-50s %-4s %-1s  %-2s %-5s  %-1s  %-8s  %-5s  %n%n";
            formatter1.format(text1, "Name", "|", "Directory", "|", "Readable", "|", "Writable", "|", "Hidden", "|");
            out.write(formatter1.toString());

            for (Path f : filePaths) {

                String ext = f.toFile().getParentFile().toPath().getFileName().toString();
                String name = f.toFile().getName();
                String read = f.toFile().canRead() ? "x" : "/";
                String write = f.toFile().canWrite() ? "x" : "/";
                String hidden = f.toFile().isHidden() ? "x" : "/";


                Formatter formatter2 = new Formatter();
                String text2 = "%-50s %-5s %-49s %-5s  %-5s  %-5s  %-5s  %-5s %-5s  %-5s %n";

                formatter2.format(text2, name, "|", ext, "|",read, "|", write, "|", hidden, "|");
                out.write(formatter2.toString());

            }
        }

    }

    private static void moveFileToMapTxt() throws IOException {

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

    private static void moveFileToMapWma() throws IOException {

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

    private static void moveFileToMapZip() throws IOException {

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
