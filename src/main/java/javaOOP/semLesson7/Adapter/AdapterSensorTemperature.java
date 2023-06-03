package javaOOP.semLesson7.Adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor {
    private SensorTemperature sT;

    public AdapterSensorTemperature(SensorTemperature sT) {
        this.sT = sT;
    }

    @Override
    public int getId() {
        return sT.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sT.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        int year = sT.year();
        int day = sT.day();
        int second = sT.second();
        LocalDateTime dateTime = LocalDateTime.of(year, 1, 1, 0, 0);
        dateTime = dateTime.plusDays(day - 1);
        dateTime = dateTime.plusSeconds(second);
        return dateTime;
    }
}
