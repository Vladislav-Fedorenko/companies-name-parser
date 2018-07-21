package Parser;

public class AdciParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*adci.*")
      || companyName.matches(".*эйдисиай.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Adci Solitions";
  }
}
