package Parser;

public class SevenbitsParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*7bits.*")
      || companyName.matches(".*sevenbits.*")
      || companyName.matches(".*seven(\\s+)bits.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "7bits";
  }
}
