package Parser;

public class A2DesignParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*a2design.*")
      || companyName.matches(".*a2(\\s+)design.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "A2 Design";
  }
}
