import Counter.Counter;
import Parser.Parser;
import Parser.OmSUParser;
import Parser.OmSTUParser;
import Parser.OmSPUParser;
import Parser.AdciParser;
import Parser.ThumbtackParser;
import Parser.LuxoftParser;
import Parser.LiveTypingParser;
import Parser.CrystalnixParser;
import Parser.IssartParser;
import Parser.UpworkParser;
import Parser.HwdTechParser;
import Parser.RaiffeisenParser;
import Parser.BurningButtonsParser;
import Parser.PurrWebParser;
import Parser.SberTechParser;
import Parser.StrongSquirrelParser;
import Parser.SevenbitsParser;
import Parser.FreelanceParser;
import Parser.SchoolParser;
import Parser.EffectiveParser;
import Parser.A2DesignParser;
import Parser.DesoftParser;
import Parser.IqtekParser;
import Parser.SibadiParser;
import Parser.GemsDevelopmentParser;
import Parser.RosberryParser;
import Parser.BytepaceParser;
import Parser.RsConsultParser;
import Parser.SPAMirParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  static private List<Parser> parsers = new ArrayList<>();
  static private Counter counter = new Counter();

  public static void main(String[] args) {
    parsers.add(new SevenbitsParser());
    parsers.add(new LuxoftParser());
    parsers.add(new EffectiveParser());
    parsers.add(new HwdTechParser());
    parsers.add(new IssartParser());
    parsers.add(new CrystalnixParser());
    parsers.add(new LiveTypingParser());
    parsers.add(new ThumbtackParser());
    parsers.add(new AdciParser());
    parsers.add(new BurningButtonsParser());
    parsers.add(new PurrWebParser());
    parsers.add(new RaiffeisenParser());
    parsers.add(new SberTechParser());
    parsers.add(new A2DesignParser());
    parsers.add(new DesoftParser());
    parsers.add(new StrongSquirrelParser());
    parsers.add(new IqtekParser());
    parsers.add(new GemsDevelopmentParser());
    parsers.add(new RosberryParser());
    parsers.add(new BytepaceParser());
    parsers.add(new RsConsultParser());
    parsers.add(new SPAMirParser());
    parsers.add(new UpworkParser());
    parsers.add(new FreelanceParser());
    parsers.add(new OmSUParser());
    parsers.add(new OmSTUParser());
    parsers.add(new OmSPUParser());
    parsers.add(new SibadiParser());
    parsers.add(new SchoolParser());

    for(Parser parser : parsers) {
      counter.init(parser.getCanonicalCompanyName());
    }

    String csvFile = "/tmp/companies.csv";
    String line;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

      while ((line = br.readLine()) != null) {
        String companyName = line.substring(3, line.length() - 3).trim().toLowerCase();

        boolean isCompanyParsed = false;

        for (Parser parser: parsers) {
          if (parser.parse(companyName)) {
            isCompanyParsed = true;
            counter.increment(parser.getCanonicalCompanyName());
            break;
          }
        }
        if (!isCompanyParsed) {
          System.out.println(companyName);
        }
      }

      PrintWriter pw = new PrintWriter(new File("test.csv"));
      pw.write(counter.toString());
      pw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
