package javaOOP.semLessom4and5.converters;

import javaOOP.semLessom4and5.converters.base.ModelToTextFormatConverter;
import javaOOP.semLessom4and5.models.Option;
import javaOOP.semLessom4and5.models.PrinterSetting;
import javaOOP.semLessom4and5.models.base.Convertable;

public class ModelToXmlConverter<E extends Convertable> implements ModelToTextFormatConverter {
    @Override
    public String convert(Convertable model) {
        if(model instanceof Option option) {
            return "<item name=\"" +
                option.getName() +
                "\" value=\"" +
                option.getValue() +
                "\" isselected=\"" +
                option.isSelected() +
                "\" />";
        } else if (model instanceof PrinterSetting printerSetting) {
            return "<printer name =\""+printerSetting.getName()+"\" value=\""+printerSetting.getValue()+"\" />";
        }
        return  null;
    }

    @Override
    public Object parse(String str) {
        return null;
    }
}
