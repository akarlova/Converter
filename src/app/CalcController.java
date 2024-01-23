package app;

public class CalcController {

    CalcView view = new CalcView();

    public void getRes() {
        int option = view.getOpt();
        double value = view.getData();
        view.getOutput(getOptRes(option, value));

    }

    private String getOptRes(int option, double value) {
        String res = "";
        switch (option) {
            case 1 -> res = new MilesService().milesToKilometers(value);
            case 2 -> res = new KilometersService().kilometersToMile(value);
            case 0 -> res = Constants.APP_CLOSE_MSG;
        }
        return res;
    }
}
