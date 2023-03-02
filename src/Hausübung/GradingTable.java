package Hausübung;

public class GradingTable {

    public static void main(String[] args) {

        System.out.println(gradingTable(92));
        System.out.println(gradingTable(65));
        System.out.println(gradingTable(88));


    }

    public static String gradingTable(int points) {

        return switch (points) {
//            case 90:
//            case 91:
//            case 92:
//            case 93:
//            case 94:
//            case 95:
//            case 96:
//            case 97:
//            case 98:
//            case 99:
            case 100 -90  ->"Outstanding";
                case 89 - 78 -> "Excellent";
                case 65 - 77 -> "Acceptable";
                case 51 - 64 -> "Passing";
                default -> "Fail";


        };

//        int 1 = <=90;
//        int 2 = 78 .. 89;
//        int 3 = 65 .. 77;
//        int 4 = 51 .. 64;
//        int 5 = <= 50;

//
//        return switch (points){
//        case  100 || 99 || 98 || 97 || 96 || 95 || 94 || 93 || 92 || 91 || 90 -> "Outstanding";
//        case  89 || 88 || 87 || 86 || 85 || 84 || 83 || 82 || 81 || 80 || 79 || 78-> "Excellent";
//        case   65 || 66 || 67 || 68 || 69 || 70 || 71 || 72 || 73 || 74 || 75 || 76 || 77 -> "Acceptable";
//        case  51 || 52 || 53 || 54 || 55 || 56 || 57 || 58 || 59 || 60 || 61 || 62 || 63 || 64 -> "Passing";
//
//        default -> "Fail";
//    };

//

    }


}
