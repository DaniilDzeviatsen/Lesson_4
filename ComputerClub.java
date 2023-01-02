public class ComputerClub {
    public static void main(String[] args) {
        Computer comp1=new Computer(1000, "hp");
HDD hdd1=new HDD();

RAM ram1=new RAM();

        comp1.inf();
        hdd1.ifo();
        ram1.inf();
                Computer comp2=new Computer (1200, "apple", ram1,hdd1);
RAM ram=new RAM("toshiba", 16);
HDD hdd=new HDD("sandisk", "inner", 1000);
comp2.inf();
hdd.ifo();
ram.inf();

    }

        }
