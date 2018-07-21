package Parser;

public class SberTechParser implements Parser {
  @Override
  public boolean parse(String companyName) {
    return companyName.matches(".*сбербанк.*")
      || companyName.matches(".*сбертех.*")
      || companyName.matches(".*сбер(\\s+)тех.*")
      || companyName.matches(".*sberbank.*")
      || companyName.matches(".*sbertech.*")
      || companyName.matches(".*sber-tech.*")
      || companyName.matches(".*sber(\\s+)tech.*");
  }

  @Override
  public String getCanonicalCompanyName() {
    return "Sber-Tech";
  }
}
