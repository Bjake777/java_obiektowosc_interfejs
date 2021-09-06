public class RadioApp {
    public static void main(String[] args) {
        BlaupunktBB12BKX blaupunktBB12BKX = new BlaupunktBB12BKX();
        blaupunktBB12BKX.turnOn();
        blaupunktBB12BKX.switchChanel();
        blaupunktBB12BKX.useFeature();
        blaupunktBB12BKX.turnOff();
        System.out.println();

        LencoSCD650X lencoSCD650X = new LencoSCD650X();
        lencoSCD650X.turnOn();
        lencoSCD650X.switchChanel();
        lencoSCD650X.turnOff();
        lencoSCD650X.useFeature();
        System.out.println();

        SonyZSPS50X sonyZSPS50X = new SonyZSPS50X();
        sonyZSPS50X.turnOn();
        sonyZSPS50X.switchChanel();
        sonyZSPS50X.useFeature();
        sonyZSPS50X.turnOff();

    }
}
