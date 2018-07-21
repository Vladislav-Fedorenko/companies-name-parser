package Parser;

public class BytepaceParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*bytepace.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Bytepace";
  }
}
