package Parser;

public class ThumbtackParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*тамтэк.*")
      || companyName.matches(".*тамтек.*")
      || companyName.matches(".*lineate.*")
      || companyName.matches(".*thumbtack.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Thumbtack";
  }
}
