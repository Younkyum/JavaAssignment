import java.io.FileNotFoundException;
import java.io.IOException;

public interface nation {
  void printNation();

  void save() throws FileNotFoundException, IOException;
}
