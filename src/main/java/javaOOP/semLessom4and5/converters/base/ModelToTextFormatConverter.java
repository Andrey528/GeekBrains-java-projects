package javaOOP.semLessom4and5.converters.base;

import javaOOP.semLessom4and5.models.base.Convertable;

public interface ModelToTextFormatConverter<E extends Convertable> {
    String convert(E model);
    Object parse(String str);
}
