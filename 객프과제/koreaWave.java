import java.io.IOException;
import java.util.Scanner;

public class koreaWave {
  public static void main(String[] args) throws IOException {
    eastAsia EastAsia = new eastAsia();
    europe Europe = new europe();
    northAmerica NorthAmerica = new northAmerica();
    southAmerica SouthAmerica = new southAmerica();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("대륙을 입력하세요(동아시아, 유럽, 북아메리카, 남아메리카): ");
      String ic = scanner.next();
      if (ic.equals("종료")) {
        scanner.close();
        break;
      }
      if (ic.equals("동아시아")) {
        EastAsia.printContinent();
      } else if (ic.equals("유럽")) {
        Europe.printContinent();
      } else if (ic.equals("북아메리카")) {
        NorthAmerica.printContinent();
      } else if (ic.equals("남아메리카")) {
        SouthAmerica.printContinent();
      } else {
        System.out.println(ic + "(은)는 잘못된 입력입니다. 다시 입력해주세요.");
      }
    }

  }
}