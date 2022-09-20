package hw_StepProject;
import java.io.File;

public class FlightService {
    private File f;
    public File getF() {return f;}
    public void setF(File f) {this.f = f;}
    public FlightCollectionDao acd = new FlightCollectionDao(getF());
    public FlightService(FlightCollectionDao acd) {
        this.acd = acd;
    }

}
