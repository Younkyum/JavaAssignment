import java.io.FileWriter;
import java.io.IOException;

public class brazil implements nation {
  String name = "브라질";
  int population = 215353588;
  int likePopulation = 3000000;

  enum mainStream {
    KPOP
  };

  String description = "아직까지는 지극히 소수에 불과하지만 상파울루에서 한국 가수들이 공연을 가졌다. 주로 K-POP의 인기가 높은 편이고 드라마는 진출이 많이 미진하다. 최근 들어 한류 유행이 강해지고 있는 추세다";

  @Override
  public void printNation() {
    // TODO Auto-generated method stub
    System.out.println(name);
    System.out.println("=====================");
    System.out.println("나라: " + name);
    System.out.println("인구: " + population);
    int ratio = likePopulation / population * 100;
    System.out.println("한류 선호 인원: " + likePopulation + "|| 비율: " + ratio);
    mainStream[] streams = mainStream.values();
    for (mainStream stream : streams) {
      System.out.println(stream);
    }
    System.out.println("=====================");
    System.out.println(description);
    System.out.println("=====================");
  }

  @Override
  public void save() throws IOException {
    // TODO Auto-generated method stub
    FileWriter pw = new FileWriter("savefile.txt", true);
    pw.write(name);
    pw.write(description);
    pw.write(Integer.toString(population));
    pw.write(Integer.toString(likePopulation));
    pw.close();
  }
}
