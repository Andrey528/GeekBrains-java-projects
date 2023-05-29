package javaOOP.semLesson6.Solid7Dip;

import javaOOP.semLesson6.Solid7Dip.dip.PrintReport;
import javaOOP.semLesson6.Solid7Dip.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
    }
}
