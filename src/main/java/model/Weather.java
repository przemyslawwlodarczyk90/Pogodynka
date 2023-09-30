package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    public class Weather {
        private double temperature;
        private double pressure;
        private double humidity;
        private double windDirection;
        private int windSpeed;
        private String locationWeather;
        private LocalDate date;


    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature + "°C" +
                ", pressure=" + pressure + "hPa" +
                ", humidity=" + humidity + "%" +
                ", windSpeed=" + windSpeed + " km/h" +
                ", locationWeather='" + locationWeather + '\'' +
                ", date=" + date +
                '}';
    }
    }
