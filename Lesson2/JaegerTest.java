public class JaegerTest {

    private static Jaeger atlasDestroyer = new Jaeger();
    private static Jaeger matadorFury = new Jaeger();

    public static void main(String[] args) {
        String COMMONMARK = "Mark-3";

        atlasDestroyer.setModelName("Atlas Destroyer");
        atlasDestroyer.setMark(COMMONMARK);
        atlasDestroyer.setOrigin("Japan");
        atlasDestroyer.setHeight(70.1f);
        atlasDestroyer.setWeight(2.3f);
        atlasDestroyer.setStrength(12);
        atlasDestroyer.setArmor(2);

        matadorFury.setModelName("Matador Fury");
        matadorFury.setMark(COMMONMARK);
        matadorFury.setOrigin("Mexico");
        matadorFury.setHeight(69.9f);
        matadorFury.setWeight(2.2f);
        matadorFury.setStrength(10);
        matadorFury.setArmor(4);
    }


}