package Parser;

public class SibadiParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*sibadi.*")
      || companyName.matches(".*sibada.*")
      || companyName.matches(".*sibadu.*")
      || companyName.matches(".*сибади.*")
      || companyName.matches(".*сибада.*")
      || companyName.matches(".*сибаду.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Sibadi";
  }
}
