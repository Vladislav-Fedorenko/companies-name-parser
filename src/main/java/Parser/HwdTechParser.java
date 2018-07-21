package Parser;

public class HwdTechParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*hwdtech.*")
      || companyName.matches(".*hwd.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "HwdTech";
  }
}
