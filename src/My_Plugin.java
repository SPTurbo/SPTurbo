import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

public class My_Plugin implements PlugIn {
    public static void main(String[] args) {
        new ImageJ();
        new My_Plugin().run("");
    }

    @Override
    public void run(String arg) {
        IJ.showMessage("Hello ImageJ", "This is the simplest ImageJ plugin.");
    }
}
