import java.io.FileWriter;
import java.io.IOException;

public class japan implements nation {
  String name = "일본";
  int population = 125700000;
  int likePopulation = 130000;

  enum mainStream {
    KPOP, Drama, Entertainment, Cosmetics
  };

  String description = "일본의 한류가 갖는 특징은 아이돌과 드라마가 주된 콘텐츠이고 여성 팬덤이 많다는 것이다. 1차 한류 당시에는 중장년 여성들이 주축이 되었고, 3차에서는 젊은층이 선호하는 K-POP으로 한류 열풍이 전이된 이후에도 보이그룹, 걸그룹 가리지 않고 여성 팬덤들이 많다. 다만, 상대적으로 여성 팬덤의 움직임이 두드러진다는 것이지 남성 팬덤이 없는 것은 아니다.";

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
