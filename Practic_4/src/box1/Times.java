package box1;

import java.sql.Time;

public enum Times {
    Summer(34.8){
        @Override
        public String getDescription(){
            return "Тёплое время года";
        }
    },
    Winter(-17.2),
    Autumn(15.6){
        @Override
        public String getDescription(){
            return "Дождливое время года";
        }
    },
    Spring(25.9){
        @Override
        public String getDescription(){
            return "Светлое время года";
        }
    };

    private double temp;

    Times(double averageTemperature){
        this.temp = averageTemperature;
    };

    public String getDescription(){
        return "Холодное время года";
    }

    public double getTemperature(){
        return temp;
    }
}
