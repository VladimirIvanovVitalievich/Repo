package Lesson_6;

public class Computer {
    String model;
    int price;
    String name;
    int volume;


    public Computer(int personPrice, String personModel){
        price = personPrice;
        model = personModel;
    }

    public Computer(int personPrice1, String personModel1, boolean HDDIsInterior1, String personNameOfHDD, int volumeOfHDD, String nameOfRAM,
                    int volumeOfRAM) {
        price = personPrice1;
        model = personModel1;
        HDDIsInterior1 = true;
        name = personNameOfHDD;
        volume = volumeOfHDD;
        name = nameOfRAM;
        volume = volumeOfRAM;
    }

    void printAllAboutComputer(){
        System.out.println("The model - " + model);
        System.out.println("The price - " + price);
    }
}

class RAM{
    String name;
    int volume;

    public RAM(){

    }

    public RAM(String userName, int userVolume){
        name = userName;
        volume = userVolume;
    }

    void printAllInfoAboutRAM(){
        System.out.println("Name of RAM - " + name);
        System.out.println("Volume of RAM- " + volume);
    }
}

class HDD {
    String name;
    int volume;

    boolean typeIsInterior;
    boolean typeIsEternal;

    public HDD(){

    }

    public HDD(String personName, int personVolume) {
        name = personName;
        volume = personVolume;
    }

    void printAllInfoAboutHDD(){
        System.out.println("Name of HDD - " + name);
        System.out.println("Volume of HDD- " + volume);


        if (typeIsInterior = true)
        {
            System.out.println("The type is interior");
        }
        else if(typeIsInterior = false)
        {
            System.out.println("The type Is eternal");
        }
    }

}