package Parser;

public class LiveTypingParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*typing.*")
      || companyName.matches(".*тайпинг.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Live Typing";
  }
}
