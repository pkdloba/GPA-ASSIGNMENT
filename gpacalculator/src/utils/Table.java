package utils;

public class Table {
    public static void printTable(String[][] valArr) {
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
        System.out.printf("|" + " ".repeat(3) + "COURSE & CODE" + " ".repeat(14) + "|" + " ".repeat(3) + "COURSE UNIT"
                + " ".repeat(4) + "|" + " ".repeat(3) + "GRADE" + " ".repeat(4) + "|" + " ".repeat(3) + "GRADE UNIT"
                + " ".repeat(5) + "|" + "\n");
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
        for (int i = 0; i < valArr.length; i++) {
            int courseCodeSpacing = Spacing.generateSpacing(valArr[i][0].length(), 0);
            int courseUnitSpacing = Spacing.generateSpacing(valArr[i][1].length(), 1);
            int gradeSpacing = Spacing.generateSpacing(valArr[i][2].length(), 2);
            int gradeUnitSpacing = Spacing.generateSpacing(valArr[i][3].length(), 3);
            System.out.printf("|" + " ".repeat(3) + valArr[i][0] + " ".repeat(courseCodeSpacing) + "|" + " ".repeat(3)
                    + valArr[i][1]
                    + " ".repeat(courseUnitSpacing) + "|" + " ".repeat(3) + valArr[i][2] + " ".repeat(gradeSpacing)
                    + "|" + " ".repeat(3) + valArr[i][3]
                    + " ".repeat(gradeUnitSpacing) + "|" + "\n");
        }
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
    }
}