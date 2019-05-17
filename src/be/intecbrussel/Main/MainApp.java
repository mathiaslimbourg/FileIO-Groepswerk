package be.intecbrussel.Main;

import be.intecbrussel.FileManipulation.MakeEveryMapKlasse;
import be.intecbrussel.FileManipulation.MoveFiltoToMapKlasse;

import java.io.IOException;
import java.nio.file.Path;

import static be.intecbrussel.FileManipulation.MoveFiltoToMapKlasse.filePaths;

public class MainApp {

    public static void main(String[] args) {

        try {

            //TODO Je had hier ook een init methode voor kunnen maken in de MoveFiltoToMapKlasse
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
