package utils;

public class Spacing{
    public static int generateSpacing(int length, int index) {
        int totalLength = length + 3;
        int space = 0;
        switch (index) {
            case 0:
                space = 30 - totalLength;
                break;
            case 1:
                space = 18 - totalLength;
                break;
            case 2:
                space = 12 - totalLength;
                break;
            case 3:
                space = 18 - totalLength;
                break;
            default:
                break;
        }
        return space;
    }
}