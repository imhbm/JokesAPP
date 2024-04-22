# Logback Configuration for Spring Boot Application

This README details the Logback configuration set up for a Spring Boot application to handle logging through console and file outputs with daily rollovers and size limits.

## Configuration Overview

This Logback configuration contains setups for two file appenders (`SERVER` and `CONSOLE`) and a console appender (`STDOUT`). Each configuration is designed to rotate logs daily with an additional check on file size, ensuring performance and manageability.

### Appenders

- **SERVER**: Logs server-related information.
- **CONSOLE**: Logs general output for the console.
- **STDOUT**: Outputs logs directly to the system console.

### Features

1. **Daily File Rollover**: Logs are rolled over daily.
2. **Size-based Rollover**: If a log file exceeds 10KB before the day ends, a new file will be started.
3. **Compression**: Older logs are maintained for seven days before deletion, without compression.
4. **Logging Levels**:
   - The server logger is set to `INFO` level.
   - The console logger is set to `DEBUG` level.
5. **Log Format**: Logs are formatted to include timestamps, thread information, logging level, logger name, and the message.

### File Paths and Patterns

- Log files for both `SERVER` and `CONSOLE` are initially created in `c:/Tools/logs`.
- Archived logs are moved to `c:/Tools/logs/archived` with the naming convention of `name_%d{yyyy-MM-dd}.%i.log`, where `%i` is an incrementing index used if multiple files are created in the same day.

## Usage

- Place the `logback-spring.xml` file under `src/main/resources` in your Spring Boot project.
- Ensure that the directories used for log files are present and writable.

## Customization

You can customize logging levels, file size thresholds, and retention policies by modifying the respective tags in the XML configuration. This allows flexibility depending on the operational requirements or environmental constraints.


