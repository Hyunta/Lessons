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
public class JobExecutionConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job executionJob() {
        return jobBuilderFactory.get("jobExecutionJob")
                .start(executionStep1())
                .next(executionStep2())
                .build();
    }

    @Bean
    public Step executionStep1() {
        return stepBuilderFactory.get("jobExecutionStep1")
                .tasklet((contribution, chunkContext) -> {
                    log.info("jobParameter step1 was executed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step executionStep2() {
        return stepBuilderFactory.get("jobExecutionStep2")
                .tasklet((contribution, chunkContext) -> {
                    log.info("jobParameter step2 was executed");
//                    throw new RuntimeException("step2 has failed");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }
}
