public class SonyZSPS50X implements Feature, RadioOperation{
    private String name = "Sony ZS-PS50X";

    @Override
    public void useFeature() {
        System.out.println("użyj pilota");
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz " + name);
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłącz " + name);
    }

    @Override
    public void switchChanel() {
        System.out.println("zmieniono kanał");
    }
}
