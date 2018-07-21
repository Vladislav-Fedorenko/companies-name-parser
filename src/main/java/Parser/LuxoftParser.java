package Parser;

public class LuxoftParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*luxoft.*")
      || companyName.matches(".*люксофт.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Luxoft";
  }
}
