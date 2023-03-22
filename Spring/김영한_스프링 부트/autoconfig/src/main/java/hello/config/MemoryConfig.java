package hello.config;

import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfig {

    @Bean
    public MemoryController memoryController() {
        return new MemoryController(memoryFinder());
    }

    @Bean
    MemoryFinder memoryFinder() {
        return new MemoryFinder();
    }

}
