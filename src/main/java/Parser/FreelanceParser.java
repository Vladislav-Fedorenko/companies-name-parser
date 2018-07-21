package Parser;

public class FreelanceParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*freelance.*")
      || companyName.matches(".*фриланс.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Freelance";
  }
}
