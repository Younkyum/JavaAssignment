import java.io.FileWriter;
import java.io.IOException;

public class peru implements nation {
  String name = "페루";
  int population = 34294231;
  int likePopulation = 2200000;

  enum mainStream {
    KPOP
  };

  String description = "중남미에서 가장 한류의 바람이 강한 곳이며, 이에 대해 페루가 다른 중남미 국가들보다 아시아계 국민들이 많다는 점이 원인으로 꼽히기도 한다.";

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
