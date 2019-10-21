 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        for (int i = 0; i < numberOfStars; i++){
            output += "*";
        }
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
        String output = "";
        for (int i = 1; i <= numberOfRows; i++){
            output += getRow(i) + "\n";
        }
        return output;
    }


    public static String getSmallTriangle() {
        String output = "";
        for (int i = 1; i <= 4; i++){
            output += getRow(i) + "\n";
        }
        return output;
    }

    public static String getLargeTriangle() {
        String output = "";
        for (int i = 1; i <= 9; i++){
            output += getRow(i) + "\n";
        }
        return output;
    }
}
