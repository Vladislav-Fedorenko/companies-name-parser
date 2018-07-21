package Parser;

public class OmSPUParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*омгпу.*")
      || companyName.matches(".*omspu.*")
      || companyName.matches(".*omgpu.*")
      || companyName.matches(".*пед.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "OmSPU";
  }
}
