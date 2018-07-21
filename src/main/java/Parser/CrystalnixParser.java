package Parser;

public class CrystalnixParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*crystalnix.*")
      || companyName.matches(".*кристаллникс.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Crystalnix";
  }
}
