import java.io.FileWriter;
import java.io.IOException;

public class france implements nation {
  String name = "프랑스";
  int population = 68305148;
  int likePopulation = 43000;

  enum mainStream {
    KPOP
  };

  String description = "2011년 6월 9일, 10일, 르몽드와 르피가로는 'SM타운 라이브 월드투어 인 파리'에 대한 기사를 실었다. 르몽드는 '유럽을 덮친 한류'란 제목의 기사를 실었다. 르피가로는 '한류가 프랑스의 르 제니스를 강타하다'란 타이틀의 기사를 실었다.";

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
