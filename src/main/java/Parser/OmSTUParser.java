package Parser;

public class OmSTUParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*omstu.*")
      || companyName.matches(".*омгту.*")
      || companyName.matches(".*политех.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "OmSTU";
  }
}
