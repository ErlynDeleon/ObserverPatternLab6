public class Main {
  public static void main(String[] args) {
      NewsAgency newsAgency = new NewsAgency();

      Subscriber sub1 = new Subscriber("Lyrine");
      Subscriber sub2 = new Subscriber("Richmond");
      Subscriber sub3 = new Subscriber("Angelica");

      newsAgency.subscribe(sub1);
      System.out.println();

      newsAgency.publishNews("Breaking News: VP Sara Duterte says remark vs Marcos 'maliciously taken out of logical context.");
      System.out.println();

      newsAgency.subscribe(sub2);
      System.out.println();

      newsAgency.publishNews("Breaking News: PH may get break from storms until end of November.");
      System.out.println();

      newsAgency.subscribe(sub3);
      System.out.println();
      newsAgency.unsubscribe(sub2);
      System.out.println();

      newsAgency.publishNews("Breaking News: 75-anyos na lolo, patay matapos ma-hit and run nang dalawang beses.");
      System.out.println();
  }
}