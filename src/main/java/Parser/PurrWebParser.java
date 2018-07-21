package Parser;

public class PurrWebParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*purrweb.*")
      || companyName.matches(".*purr(\\s+)web.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "PurrWeb";
  }
}
