
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача№1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача№2");
        int temperature = 2;
        int normaTemperature = 5;

        if (temperature >= normaTemperature) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задача№3");
        int speed = 61;
        int normalSpeed = 60;
        if (speed >= normalSpeed) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        System.out.println("Задача№4");
        int yearsOld = 25;
        //boolean canNoGotToScool = yearsOld <= 2 && yearsOld <=6;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача№5");
        int yearsOldChild = 15;
        if (yearsOldChild < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOldChild + ", нельзя кататься на аттракционе");
        }
        if (yearsOldChild >= 5 && yearsOldChild <= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOldChild + ", можно кататься на аттракционе в сопровождении взрослого");
        }
        if (yearsOldChild > 14)
        {
            System.out.println("Если возраст ребенка равен " + yearsOldChild + ", можно кататься на аттракционе без сопровождения взрослого");
        }


        System.out.println("Задача№6");
        int passengers = 115;
        int trainCapacity = 102;
        int seating = 60;

 if (passengers <= seating)
     System.out.println("Если количество пассажиров равно "+passengers+ " то в вагоне имеются сидячие места ");
 else if (passengers >= seating && passengers <= trainCapacity )
     System.out.println("Если количество пассажиров равно "+passengers+ " то в вагоне имеются стоячие места ");
 else if (passengers > trainCapacity)
     System.out.println("Если количество пассажиров равно "+passengers+ " то в вагоне отсутствуют места ");

        System.out.println("Задача№7");

 int one = 1;
 int two = 15;
 int three = 3;
        System.out.println("Из чисел " +one+ ", " +two+ ", " +three );
 if (one > two && one > three)
     System.out.println("Число " +one+ " наибольшее");
 if ( one< two && two > three )
     System.out.println("Число " +two+ " наибольшее");
 if (three > two && one < three)
     System.out.println("Число " +three+ " наибольшее");



    }
}