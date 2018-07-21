package Parser;

public class StrongSquirrelParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*strongsquirrel.*")
      || companyName.matches(".*strong(\\s+)squirrel.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "StrongSquirrel";
  }
}
