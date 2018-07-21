package Parser;

public class IqtekParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*айтек.*")
      || companyName.matches(".*iqtek.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Iqtek";
  }
}
