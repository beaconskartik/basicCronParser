# BasicCronParser

## How to run it
- Build this project using following command (Prerequisite - you need a gradle support)
`./gradlew clean build`
- It will create the jar in $Project/build/libs/ directory by the name `basicronparser-1.0.jar`
- To run the the jar use the below command
 `java -jar ./build/libs/basicronparser-1.0.jar <CRON EXPRESSION>`

## Sample command and corresponding output
### Command
`java -jar ./build/libs/basicronparser-1.0.jar "*/15 0 1,15 * 1-5 /usr/bin/find"`

### Output
minutes       0 15 30 45
hours         0
dayofMonth    1 15
month         1 2 3 4 5 6 7 8 9 10 11 12
dayOfWeek     1 2 3 4 5
command       /usr/bin/find

## Test Cases
Check following Test Cases
- https://github.com/beaconskartik/basicCronParser/blob/main/src/test/java/CronParserTest.java
- https://github.com/beaconskartik/basicCronParser/blob/main/src/test/java/CronFieldTest.java

### Test Cases Set
- https://github.com/beaconskartik/basicCronParser/tree/main/src/test/java/testcases
