package optionals.computer;

import java.util.Optional;

public class Computer {

    private String name;
    private Processor processor;
    private Memory ram;
    private Soundcard soundcard;

    public Computer(String name, Processor processor, Memory ram, Soundcard soundcard) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.soundcard = soundcard;
    }

    public Optional<Soundcard> getSoundcard() {
        return Optional.ofNullable(soundcard);
    }
}
