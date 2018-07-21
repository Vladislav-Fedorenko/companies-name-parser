package Parser;

public class IssartParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*issart.*")
      || companyName.matches(".*iss(\\s+)art.*")
      || companyName.matches(".*исс(\\s+)арт.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Issart";
  }
}
