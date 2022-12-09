import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class southAmerica extends continent {

  public String name = "남아메리카";
  public ArrayList<String> nations = new ArrayList<>(Arrays.asList("브라질", "아르헨티나", "페루"));
  public String description = "남아메리카는 한류의 세가 강한 지역 중 하나로, 아시아계 국민들이 주요 소비층이다.";

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

    if (innation.equals("브라질")) {
      brazil Brazil = new brazil();
      Brazil.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Brazil.save();
      }
    } else if (innation.equals("아르헨티나")) {
      arhentina Arhentina = new arhentina();
      Arhentina.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Arhentina.save();
      }
    } else {
      peru Peru = new peru();
      Peru.printNation();
      System.out.print("저장하시겠습니까?(Y/N): ");
      innation = scanner.next();
      if (innation.equals("Y")) {
        Peru.save();
      }
    }
  }
}
