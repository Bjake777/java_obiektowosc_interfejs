public class LencoSCD650X implements Feature, RadioOperation {
    private String name = "Lenco SCD-650X";

    @Override
    public void useFeature() {
        System.out.println("czytaj CD/DVD");
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
