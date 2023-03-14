package UebungenExtraJandl;

public class WinterTires {
    public static void main(String[] args) {

        needWinterTires(9, true);
       needWinterTires(9, false) ;
        needWinterTires(4, true);
        needWinterTires(3, false);
        needWinterTires(5, false);

    }

    public static boolean needWinterTires (int temperature, boolean slipperyRoad) {

        if (temperature <10 && slipperyRoad ==true) {
            System.out.println("Please use winter tires");
        }
        else if (temperature <4) {
            System.out.println("Please use winter tires");
        }
        else {
            System.out.println("Winter tires are not required");
        }

    return slipperyRoad;
    }
}
