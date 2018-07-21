package Parser;

public class RsConsultParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*rs-consult.*")
      || companyName.matches(".*рс(\\s+)консалт.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Rs-consult";
  }
}
