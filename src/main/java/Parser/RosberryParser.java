package Parser;

public class RosberryParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*rosberry.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Rosberry";
  }
}
