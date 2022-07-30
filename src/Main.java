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
        System.out.println("Общий вес боксеров " + totalWeightOfBoxer + " килограмм");
        float differentWeightOfBoxer = boxerB - boxerA;
        System.out.println("Разница в весе боксеров " + differentWeightOfBoxer + " килограмм");

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
        System.out.println("Общий вес смеси " + totalWeight + " грамм");
        double totalWeightKG = totalWeight / 1000;
        System.out.println("Общий вес смеси = " +totalWeightKG + " килограмм");

        // Задание 4
        int targetedWeightLoss = 7_000;
        int minimalWeightLossPerDay = 250;
        int maximumWeightLossPerDay = 500;
        int amountOfDayMin = targetedWeightLoss / maximumWeightLossPerDay;
        int amountOfDayMax = targetedWeightLoss / minimalWeightLossPerDay;
        System.out.println("Минимальный срок похудения = " + amountOfDayMin + " дней");
        System.out.println("Максимальный срок похудения = " + amountOfDayMax + " дней" );
        int averageWeightLoss = (amountOfDayMax + amountOfDayMin) / 2;
        System.out.println("Средний срок похудения = " + averageWeightLoss + " день" );

        // Задание 5
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        double summaZPDoPovisheniya = masha + denis + kristina;
        double zpMashaPlus = ( masha * 0.1 ) + masha;
        double zpDenisPlus = (denis * 0.1) + denis;
        double zpKristinaPlus = (kristina * 0.1 ) + kristina;
        double  summaZPPoslePovisheniya = zpMashaPlus + zpDenisPlus + zpKristinaPlus;
        double raznica = summaZPPoslePovisheniya - summaZPDoPovisheniya;
        System.out.println("разница между годовым доходом до и после повышения " + raznica + " рублей ");
        System.out.println(" Маша теперь получает " + zpMashaPlus + " рублей. " + " Годовой доход вырос на " + (double)masha * 0.1 + " рублей"  );
        System.out.println(" Денис теперь получает " + zpDenisPlus + " рублей. " + " Годовой доход вырос на " + (double)denis * 0.1 + " рублей" );
        System.out.println(" Кристина теперь получает " + zpKristinaPlus + " рублей. " + " Годовой доход вырос на " + (double)kristina * 0.1 + " рублей");




    }
    }