package Parser;

public class BurningButtonsParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*burningbuttons.*")
      || companyName.matches(".*burning(\\s+)buttons.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Burning Buttons";
  }
}
