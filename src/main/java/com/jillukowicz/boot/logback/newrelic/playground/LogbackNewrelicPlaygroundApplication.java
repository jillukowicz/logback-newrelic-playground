package com.jillukowicz.boot.logback.newrelic.playground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LogbackNewrelicPlaygroundApplication {

  private static final Logger LOG = LoggerFactory.getLogger(LogbackNewrelicPlaygroundApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(LogbackNewrelicPlaygroundApplication.class, args);
  }

  @PostConstruct
  public void logSomething() {
    LOG.error("error...");
    LOG.warn("warn...");
    LOG.debug("debug...");
    LOG.info("info...");
  }
}
