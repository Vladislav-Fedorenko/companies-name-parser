package Parser;

public class EffectiveParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*effective.*")
      || companyName.matches(".*efective.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Effective";
  }
}
