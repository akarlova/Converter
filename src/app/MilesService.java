package app;

public class MilesService {

    public String milesToKilometers(double value) {

        double res = value * Constants.KILOMETERS_ON_MILE;

        return Rounder.roundValue(res);
    }
}
