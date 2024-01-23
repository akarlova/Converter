package app;

public class KilometersService {

    public String kilometersToMile(double value) {

        double res = value / Constants.KILOMETERS_ON_MILE;

        return Rounder.roundValue(res);
    }
}
