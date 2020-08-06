package optionals.computer;

public class Main2 {
    public static void main(String[] args) {
        Processor proc = new Processor(8);
        Memory gpu = new Memory(4);

        Computer computer = new Computer("Raspberry PI", proc, gpu, null);

        String soundCardModel = computer.getSoundcard().map(Soundcard::getModel).orElse("UNKNOWN");

        System.out.println("Soundcard model is: " + soundCardModel);
    }
}
