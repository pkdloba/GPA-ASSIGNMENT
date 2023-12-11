package models;
public class GradePointAttained{
    private static double gradePoint = 0;
    private static double totalQualityPoint = 0;
    private static double totalGradeUnit = 0;

    public static double getGradePointAttained(String[][] gradedUnitProfile) {
        for (int i = 0; i < gradedUnitProfile.length; i++) {
            double courseUnit = Double.parseDouble(gradedUnitProfile[i][1]);
            double gradeUnit = Double.parseDouble(gradedUnitProfile[i][3]);
            totalQualityPoint += courseUnit * gradeUnit;
            totalGradeUnit += courseUnit;
        }

        gradePoint = totalQualityPoint / totalGradeUnit;
        return gradePoint;
    }
}