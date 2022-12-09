import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class northAmerica extends continent {

  public String name = "북아메리카";
  public ArrayList<String> nations = new ArrayList<>(Arrays.asList("미국", "캐나다"));
  public String description = "북아메리카는 미디어 한류가 가장 큰 영향을 미치고 있는 지역이다.";

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

    if (innation.equals("미국")) {
      usa Usa = new usa();
      Usa.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Usa.save();
      }
    } else {
      canada Canada = new canada();
      Canada.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Canada.save();
      }
    }
  }
}
