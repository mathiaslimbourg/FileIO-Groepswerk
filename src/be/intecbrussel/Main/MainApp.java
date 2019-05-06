package be.intecbrussel;

import java.io.IOException;
import java.nio.file.Path;

import static be.intecbrussel.MoveFiltoToMapKlasse.filePaths;

public class MainApp {

    public static void main(String[] args) {

        try {
            MakeEveryMapKlasse.makeEveyMap();
            MoveFiltoToMapKlasse.moveFileToMapCsv();
            MoveFiltoToMapKlasse.moveFileToMapdatabase();
            MoveFiltoToMapKlasse.moveFileToMapExe();
            MoveFiltoToMapKlasse.moveFileToMapGif();
            MoveFiltoToMapKlasse.moveFileToMapGitignore();
            MoveFiltoToMapKlasse.moveFileToMapJpg();
            MoveFiltoToMapKlasse.moveFileToMapJson();
            MoveFiltoToMapKlasse.moveFileToMapPdf();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2012();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2013();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2014();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2015();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2016();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2017();
            MoveFiltoToMapKlasse.moveFileToMapPdfMagazine2018();
            MoveFiltoToMapKlasse.moveFileToMapPng();
            MoveFiltoToMapKlasse.moveFileToMapPy();
            MoveFiltoToMapKlasse.moveFileToMapSummary();
            MoveFiltoToMapKlasse.moveFileToMapTxt();
            MoveFiltoToMapKlasse.moveFileToMapWma();
            MoveFiltoToMapKlasse.moveFileToMapZip();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Path p : filePaths) {
            System.out.println("xx " + p);

        }
        System.out.println("xxx " + filePaths.size());

    }




}