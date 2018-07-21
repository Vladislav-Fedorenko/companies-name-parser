package Parser;

public class SPAMirParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*нпо(\\s+)мир.*")
      || companyName.matches(".*нпо(\\s+)(\"*)мир.*")
      || companyName.matches(".*нпо.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "SPA mir";
  }
}
