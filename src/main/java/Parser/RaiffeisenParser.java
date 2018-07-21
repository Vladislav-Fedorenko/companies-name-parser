package Parser;

public class RaiffeisenParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*raiffeisen.*")
      || companyName.matches(".*raiffaisen.*")
      || companyName.matches(".*райфайзен.*")
      || companyName.matches(".*райффайзен.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Raiffeisen";
  }
}
