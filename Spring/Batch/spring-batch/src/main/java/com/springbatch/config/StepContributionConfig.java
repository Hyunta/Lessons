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
@Configuration
@RequiredArgsConstructor
public class StepContributionConfig {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job executionJob() {
        return jobBuilderFactory.get("stepContributionJob")
                .start(step1())
                .next(step2())
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("stepContributionStep1")
                .tasklet(((stepContribution, chunkContext) -> {
                    log.info("stepContribution step1 was executed");
                    return RepeatStatus.FINISHED;
                }))
                .build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("stepContributionStep2")
                .tasklet((contribution, chunkContext) -> {
                    log.info("stepContribution step2 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

}
