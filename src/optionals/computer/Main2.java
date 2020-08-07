package optionals.computer;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Processor proc = new Processor(8);
        Memory ram = new Memory(4);

        Computer computer = new Computer("Raspberry PI", proc, ram, null);

        Optional<Soundcard> soundcard = computer.getSoundcard();
        soundcard.ifPresent(System.out::println);
        Soundcard aDefault = computer.getSoundcard().orElse(new Soundcard("DEFAULT"));
        System.out.println(aDefault.getModel());
//        String soundCardModel = computer.getSoundcard().map(Soundcard::getModel).orElse("UNKNOWN");

//        System.out.println("Soundcard model is: " + soundCardModel);
    }
}
