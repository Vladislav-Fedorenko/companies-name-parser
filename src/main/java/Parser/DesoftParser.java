package Parser;

public class DesoftParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*desoft.*")
      || companyName.matches(".*десофт.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Desoft";
  }
}
