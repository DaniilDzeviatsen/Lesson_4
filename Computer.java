public class Computer {
int value;
String model;

RAM ram1;
HDD hdd1;
public Computer(int value, String model){
    this.value=value;
    this.model=model;
}
public Computer(int value, String model, RAM ram1, HDD hdd1){
    this.model=model;
    this.value=value;
    this.hdd1=hdd1;
    this.ram1=ram1;
}
public void inf(){
    System.out.println("Информация о компьютере "+model+":");
    System.out.println("price: "+value+" $");

}
}
class RAM{
    int volume;
    String name;
    public RAM(String name, int volume){
        this.name=name;
        this.volume=volume;
    }
    public RAM(){
        this.name="sony";
        this.volume=8;
    }
public void inf(){
    System.out.println("RAM: " +name+" - "+volume+" GB");
}

}
class HDD{
    int volume;
    String type;

    String name;
    public HDD(String name, String type, int volume){
        this.name=name;
        this.volume=volume;
        this.type=type;
    }
    public HDD(){
        this.type="inner";
        this.name="samsung";
        this.volume=500;
    }
public void ifo(){
    System.out.println("HDD: "+name+" - "+"type: "+type+", volume: "+volume+" GB");
}

}