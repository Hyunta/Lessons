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
public class DbJobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job dbJob() {
        return jobBuilderFactory.get("dbJob")
                .start(dbStep1())
                .next(dbStep2())
                .build();
    }

    @Bean
    public Step dbStep1() {
        return stepBuilderFactory.get("dbStep1")
                .tasklet((contribution, chunkContext) -> {
                    log.info("db Step1 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step dbStep2() {
        return stepBuilderFactory.get("dbStep2")
                .tasklet((contribution, chunkContext) -> {
                    log.info("db Step2 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }
}