import java.io.FileWriter;
import java.io.IOException;

public class china implements nation {
  String name = "중국";
  int population = 1425887337;
  int likePopulation = 4010000;

  enum mainStream {
    KPOP, Drama, Entertainment, Cosmetics
  };

  String description = "중국은 한류라는 단어를 탄생시킨 한류의 진앙지다. H.O.T.나 NRG 같이 이전까지 중화권에서 보기 힘들었던 '파워풀한 랩과 역동적인 댄스'를 선보인 댄스 아이돌이 중화권의 젊은층에게 신선한 충격을 주었고, 사회적 현상으로 대두되었다. H.O.T.의 해체 소식을 듣고 중국 각지에서 중국 청소년들이 대규모 집회를 벌인 것은 유명하다.";

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
