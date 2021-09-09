import java.util.ArrayList;
import java.util.Arrays;

public class CameraExperiment {
    public static void main(String[] args) {
        ArrayList<String> canonLenses = new ArrayList<>();
        canonLenses.addAll(Arrays.asList("70-200 f2.8", "100 f2.8", "100-400 f4.5"));

        Camera camera1 = new Camera("Canon","5D Mark IV", canonLenses,
                30, 3099.985453223556, true, false);
        Camera camera2 = new Camera("Nikon", "D7500", canonLenses, 24,
                1599.99, true, false);

        System.out.println(camera1);
        System.out.println(camera2);

    }
}
