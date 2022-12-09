import java.io.FileWriter;
import java.io.IOException;

public class arhentina implements nation {
  String name = "아르헨티나";
  int population = 46245668;
  int likePopulation = 2450000;

  enum mainStream {
    KPOP
  };

  String description = "아르헨티나에서도 한류가 이어져 수도 부에노스아이레스에서 한국 가수들이 공연을 갖게 되었다. 대체로 브라질보다는 한류의 세가 강한 편";

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
