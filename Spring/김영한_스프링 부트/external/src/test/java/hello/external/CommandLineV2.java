package hello.external;

import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

@Slf4j
public class CommandLineV2 {

    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg = {}", arg);
        }

        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("getSourceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("getNonOptionArgs = {}", appArgs.getNonOptionArgs());
        log.info("optionNames = {}", appArgs.getOptionNames());

        Set<String> optionNames = appArgs.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option arg {} = {}", optionName, appArgs.getOptionValues(optionName));
        }
    }

}
