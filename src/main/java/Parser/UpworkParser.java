package Parser;

public class UpworkParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*upwork.*")
      || companyName.matches(".*up(\\s+)work.*")
      || companyName.matches(".*апвокр.*")
      || companyName.matches(".*опвокр.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Upwork";
  }
}
