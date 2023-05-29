package javaOOP.semLessom4and5.models;

import javaOOP.semLessom4and5.models.base.Convertable;
import javaOOP.semLessom4and5.models.base.Model;

public class Option extends Model implements Convertable {
    private final String name;
    private final String value;
    private final boolean isSelected;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public Option(String name, String value, boolean isSelected) {
        this.name = name;
        this.value = value;
        this.isSelected = isSelected;
    }

//    public static  Option parseXml(String xml){
//        Option option = new Option();
//        var params = xml.split(" ");
//        var name = params[1].split( "=")[1].replaceAll("\"","");
//        option.setName(name);
//        var value = params[2].split( "=")[1].replaceAll("\"","");
//        option.setValue(value);
//        String isSelected = params[3].split( "=")[1].replaceAll("\"","");
//        option.setSelected(Boolean.parseBoolean(isSelected));
//        return option;
//    }
}
