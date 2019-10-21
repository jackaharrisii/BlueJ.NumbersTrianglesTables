 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for (int height = 1; height <= tableSize; height++){
            for (int width = 1; width <= tableSize; width++){
                output += String.format("%3d",width * height) + " |";
            }
        output += "\n";
        
        }
        return output;
    }
}
