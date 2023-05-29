//package javaOOP.semLessom4and5.models;
//
//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//
//public class ConfigStorage {
//    private final ArrayList<Option> options = new ArrayList<>();
//    private final ArrayList<PrinterSetting> settings = new ArrayList<>();
//
//    public void addOption(Option option){
//        options.add(option);
//    }
//
//    public void addPrinterSetting(PrinterSetting printerSetting){
//        settings.add(printerSetting);
//    }
//
//    public ArrayList<Option> getOptions() {
//        return options;
//    }
//
//    public ArrayList<PrinterSetting> getSettings() {
//        return settings;
//    }
//    public void saveXml() throws  Exception{
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("config.xml")));
//        writer.write("<?xml version='1.0' ?>");
//        writer.write("<options>");
//        for(Option option : options)
//            writer.write(Option.toXml(option));
//        writer.write("</options>");
//        writer.write("<printers>");
//        for(PrinterSetting printerSetting : settings)
//            writer.write(PrinterSetting.toXml(printerSetting));
//        writer.write("</printers>");
//
//
//
//    }
//}
