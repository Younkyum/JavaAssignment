import java.io.FileWriter;
import java.io.IOException;

public class usa implements nation {
  String name = "미합중국";
  int population = 338289857;
  int likePopulation = 16692272;

  enum mainStream {
    KPOP, Drama, Movie
  };

  String description = "방탄소년단이 2018년 빌보드 1위를 하며 북미 포함 세계적 인기를 끌면서 K팝의 위상은 상당히 달라진다. 각종 메이저 TV 쇼와 시상식에 초청될 정도이다. 그리고 강남스타일만이 빅 히트를 친 싸이와는 달리 방탄소년단은 자체 팬덤이 상당히 형성되어 일시적인 유행이나 트렌드와는 다소 거리가 있어 보인다. 노래도 연속해서 골고루 인기가 있다는 점에서 의의가 크다. 또 한국 특유의 아이돌 댄스+팝 스타일의 성공 사례로 인식되고, 체계적이고도 활발한 팬덤 문화가 동시에 수출되어 이목을 집중시키고 있다. BTS를 제외하면 BLACKPINK가 꽤 유의미한 인지도를 쌓고 있다.";

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
