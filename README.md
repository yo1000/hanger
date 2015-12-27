# hanger
Add the SonarQube widget to summarize each author of technical debt.

## Requirements

* SonarQube has been installed

## Usage

```
$ mvn clean package
$ mv target/hanger-1.0-SNAPSHOT.jar {sonarqube-home}/extensions/plugins/
$ {sonarqube-home}/bin/{your-os}/sonar.sh stop
$ {sonarqube-home}/bin/{your-os}/sonar.sh start
```
