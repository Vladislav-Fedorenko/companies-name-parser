package Parser;

public class SchoolParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*школа.*")
      || companyName.matches(".*гимназия.*")
      || companyName.matches(".*лицей.*")
      || companyName.matches(".*сош.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "School";
  }
}
