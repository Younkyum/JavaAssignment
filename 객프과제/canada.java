import java.io.FileWriter;
import java.io.IOException;

public class canada implements nation {
  String name = "캐나다";
  int population = 38388416;
  int likePopulation = 198210;

  enum mainStream {
    KPOP, Drama
  };

  String description = "CBC 방송국에서 2016년 시트콤 김씨네 편의점이 캐나다에서 드라마 1위를 한다. 토론토를 배경으로 교포사회에서 볼 수 있는 한인 이민자 가족의 이야기를 재미있게 담았다. 흥행에 힘입어 2018년 시즌2와 함께 넷플릭스에 올려졌고, 2019년 시즌3, 2020년 시즌4가 방영되었다. 이 드라마로 인해 캐나다 한인들의 위상이 정말 크게 신장되었으며, 작중에서 아들 역할을 맡은 배우 시무 리우는 마블 영화[7]의 히어로로까지 캐스팅된다.";

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
