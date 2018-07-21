package Parser;

public class OmSUParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*omsu.*")
      || companyName.matches(".*омгу.*")
      || companyName.matches(".*имит.*")
      || companyName.matches(".*imit.*")
      || companyName.matches(".*омский(\\s+)государственный(\\s+)университет.*")
      || companyName.matches(".*достоевского.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "OmSU";
  }
}
