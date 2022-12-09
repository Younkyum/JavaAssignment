import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class europe extends continent {

  public String name = "유럽";
  public ArrayList<String> nations = new ArrayList<>(Arrays.asList("프랑스", "독일"));
  public String description = "유럽은 아시아에 비해 규모는 작지만, 확실한 팬층이 존재하는 지속적 성장세를 보이고 있는 지역이다.";

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

    if (innation.equals("프랑스")) {
      france France = new france();
      France.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        France.save();
      }
    } else {
      dokil Dokil = new dokil();
      Dokil.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Dokil.save();
      }
    }
  }
}
