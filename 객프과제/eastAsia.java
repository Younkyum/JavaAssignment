import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class eastAsia extends continent {

  public String name = "동아시아";
  public ArrayList<String> nations = new ArrayList<>(Arrays.asList("중국", "일본", "대한민국"));
  public String description = "동아시아는 한국과의 지리적 가까움과 문화적 유사성으로 인해 한류가 사회 전반적으로 강세를 보이는 지역이다.";

  @Override
  void printContinent() throws IOException {
    // TODO Auto-generated method stub
    System.out.println(name + ": " + description);
    System.out.println("----------");
    System.out.println(name + "의 국가 중 문서가 존재하는 나라");
    System.out.println("----------");
    for (String nation : nations) {
      System.out.println(nation);
    }
    System.out.println("----------");

    Scanner scanner = new Scanner(System.in);
    String innation = "";
    System.out.print("나라를 입력하세요: ");
    innation = scanner.next();

    if (innation.equals("중국")) {
      china China = new china();
      China.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        China.save();
      }
    } else if (innation.equals("일본")) {
      japan Japan = new japan();
      Japan.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Japan.save();
      }
    } else {
      korea Korea = new korea();
      Korea.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Korea.save();
      }
    }
  }

}
