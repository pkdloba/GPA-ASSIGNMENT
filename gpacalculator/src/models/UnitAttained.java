package models;

public class UnitAttained {
    public static String[][] getUnitAttained(String[][] gradedProfile) {
        String[][] unitGradedProfile = new String[gradedProfile.length][4];
        for (int i = 0; i < gradedProfile.length; i++) {
            String[] unitProfile = new String[4];

            unitProfile[0] = gradedProfile[i][0];
            unitProfile[1] = gradedProfile[i][1];
            unitProfile[2] = gradedProfile[i][2];

            String grade = gradedProfile[i][2];

            switch (grade) {
                case "A":
                    unitProfile[3] = "5";
                    break;
                case "B":
                    unitProfile[3] = "4";
                    break;
                case "C":
                    unitProfile[3] = "3";
                    break;
                case "D":
                    unitProfile[3] = "2";
                    break;
                case "E":
                    unitProfile[3] = "1";
                    break;
                default:
                    unitProfile[3] = "0";
                    break;
            }

            unitGradedProfile[i] = unitProfile;
        }

        return unitGradedProfile;
    }
}