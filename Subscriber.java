public class Subscriber implements SubscriberObserver {
  private String name;

  public Subscriber(String name) {
      this.name = name;
  }

  @Override
  public void update(String news) {
      System.out.println("" + name + " received news: " + news);
  }

  public String getName() {
      return name;
  }
}