public class JaegerTest {

    public static void main(String[] args) {
        Jaeger atlasDestroyer = new Jaeger();
        Jaeger matadorFury = new Jaeger();
        String commonMark = "Mark-3";

        atlasDestroyer.setModelName("Atlas Destroyer");
        atlasDestroyer.setMark(commonMark);
        atlasDestroyer.setOrigin("Japan");
        atlasDestroyer.setHeight(70.1f);
        atlasDestroyer.setWeight(2.3f);
        atlasDestroyer.setStrength(12);
        atlasDestroyer.setArmor(2);
        atlasDestroyer.move();
        System.out.println(atlasDestroyer.getStrength());

        matadorFury.setModelName("Matador Fury");
        matadorFury.setMark(commonMark);
        matadorFury.setOrigin("Mexico");
        matadorFury.setHeight(69.9f);
        matadorFury.setWeight(2.2f);
        matadorFury.setStrength(10);
        matadorFury.setArmor(4);
        matadorFury.useVortexCannon();
        System.out.println(matadorFury.getWeight());
    }
}