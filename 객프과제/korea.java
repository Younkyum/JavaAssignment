import java.io.FileWriter;
import java.io.IOException;

public class korea implements nation {
  String name = "대한민국";
  int population = 51740000;
  int likePopulation = 40000000;

  enum mainStream {
    KPOP, Drama, Entertainment, Cosmetics
  };

  String description = "한류는 좁게는 음악, 영화, 드라마 같은 대중문화부터 시작하여 넓게는 패션, 화장품, 음식, 관광, 무술, 산업 등 대한민국의 문화가 세계에 알려지는 현상을 뜻한다. 한류라는 용어는 중화권에서 1990년대 후반 H.O.T. 신드롬이 일어나고, 한국의 아이돌 댄스 그룹과 한국 드라마가 중화권에서 청소년층에게 인기를 끌면서 생겨난 신조어다. 이 용어가 직접적으로 만들어진 계기는 모 기사에 따르면 1997년 대만 미디어를 통해서라고 한다. 대만에선 한파주의보를 한류(寒流)라고 부르는데, 그해 선풍적인 인기를 끈 한국 드라마들의 경쟁력을 경계해야 한다는 의미에서 한류(韓流)로 바꾸어 불렀다고 한다.";

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
