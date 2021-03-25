package general;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/resources/features", //onde estão as features
        glue =      "steps",                       //onde estão os passos
        plugin = {
                    "pretty",                            // formatador padrão do runner
                    "html:target/relatorioSimples",      //pasta que será criada de html
                    "json:target/relatorioSimples.json", // saida json
                    "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)

public class Runner {
}
