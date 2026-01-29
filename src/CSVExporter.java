import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {
    public static void export(String filePath, double[][] data) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Depth (m),UCS (MPa)\n");
            for (double[] row : data) {
                writer.write(row[0] + "," + row[1] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}