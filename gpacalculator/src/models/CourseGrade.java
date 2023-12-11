package models;

public class CourseGrade {
    public static String[][] getGrade(String[][] profile) {
        String[][] gradedProfile = new String[profile.length][3];
        for (int i = 0; i < profile.length; i++) {
            String[] newProfile = new String[3];

            newProfile[0] = profile[i][0];
            newProfile[1] = profile[i][1];

            int score = Integer.parseInt(profile[i][2]);
            if (score >= 70) {
                newProfile[2] = "A";
            } else if (score >= 60 && score <= 69) {
                newProfile[2] = "B";
            } else if (score >= 50 && score <= 59) {
                newProfile[2] = "C";
            } else if (score >= 45 && score <= 49) {
                newProfile[2] = "D";
            } else if (score >= 40 && score <= 45) {
                newProfile[2] = "E";
            } else {
                newProfile[2] = "F";
            }
            
            gradedProfile[i] = newProfile;

        }

        return gradedProfile;
    }
}