public class BlaupunktBB12BKX implements Feature, RadioOperation {
    private String name = "Blaupunkt BB12BKX";

    @Override
    public void useFeature() {
        System.out.println("czytaj USB");
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
