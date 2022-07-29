public class Main {
    public static void main(String[] args) {

        // задание 1
        byte cat = 10;
        short dog = 30_000;
        int birdEat = 145_125_352;
        long spiderWeight = 148_353_455_456_875L;
        float people = 2.5F;
        double money = 123.567;
        boolean namberOfCats = cat >= 8;
        System.out.println(namberOfCats);
        char a = 64;
        char b = '@';
        System.out.println(a+"="+b);
        System.out.println(a);

        // Задание 2
        float boxerA = 78.2F;
        float boxerB = 82.7F;
        float totalWeightOfBoxer = boxerA + boxerB;
        System.out.println("Общий вес боксеров " + totalWeightOfBoxer);
        float differentWeightOfBoxer = boxerB - boxerA;
        System.out.println("Разница в весе боксеров " + differentWeightOfBoxer);

        // Задание 3
        byte banana = 5;
        short milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte weightBanana = 80;
        byte milkWeight100Ml = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        double totalWeight = banana * weightBanana + milk * milkWeight100Ml + iceCream * weightIceCream + eggs * weightEggs;
        System.out.println("Общий вес смеси в граммах " + totalWeight);
        double totalWeightKG = totalWeight / 1000;
        System.out.println("Общий вес смеси в килограммах = " +totalWeightKG);




    }
    }