package Parser;

public class GemsDevelopmentParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*gems.*")
      || companyName.matches(".*джемс.*")
      || companyName.matches(".*жемс.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Gems Development";
  }
}
