package anonymous.examples;

public class WarningClass {
    void showWarning() {
        WeatherWarning weatherWarning = new WeatherWarning();
        weatherWarning.warn();
    }

    void anonymousWarning() {
        Warning weatherWarning = new Warning() {
            @Override
            public void warn() {
                System.out.println("Jest goraco z klasy anonimowej");
            }
        };
        weatherWarning.warn();
    }
}
