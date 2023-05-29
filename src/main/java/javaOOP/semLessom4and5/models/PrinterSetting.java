package javaOOP.semLessom4and5.models;

import javaOOP.semLessom4and5.models.base.Convertable;
import javaOOP.semLessom4and5.models.base.Model;

public class PrinterSetting extends Model implements Convertable {
    private final String name;
    private final String value;

    public String getName() {
        return name;
    }

    public PrinterSetting(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public static  PrinterSetting parseXml(String xml){
//        PrinterSetting printerSetting = new PrinterSetting();
//        var params = xml.split(" ");
//        var name = params[1].split( "=")[1].replaceAll("\"","");
//        printerSetting.setName(name);
//        var value = params[2].split( "=")[1].replaceAll("\"","");
//        printerSetting.setValue(value);
//        String isSelected = params[3].split( "=")[1].replaceAll("\"","");
//        return printerSetting;
//    }
}
