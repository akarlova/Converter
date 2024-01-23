package app;

public class CalcController {

    CalcView view = new CalcView();

    public void getRes() {
        double value = view.getData();
        view.getOutput(getOptRes(value));

    }

    private String getOptRes(double value) {
        return new MilesService().milesToKilometers(value);
    }
}
