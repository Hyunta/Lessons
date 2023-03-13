package com.springbatch.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
//@Configuration
@RequiredArgsConstructor
public class JobInstanceConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job jobInstance() {
        return jobBuilderFactory.get("jobInstanceJob")
                .start(jobInstanceStep1())
                .next(jobInstanceStep2())
                .build();
    }

    @Bean
    public Step jobInstanceStep1() {
        return stepBuilderFactory.get("jobInstanceStep1")
                .tasklet((contribution, chunkContext) -> {
                    log.info("jobInstance step1 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step jobInstanceStep2() {
        return stepBuilderFactory.get("jobInstanceStep2")
                .tasklet((contribution, chunkContext) -> {
                    log.info("jobInstance step2 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }
}
