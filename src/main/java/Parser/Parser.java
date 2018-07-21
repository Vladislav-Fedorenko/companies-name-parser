package Parser;

public interface Parser {
  boolean parse(final String companyName);

  String getCanonicalCompanyName();
}
