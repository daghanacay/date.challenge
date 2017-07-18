#Description:

Create an application that can read in pairs of dates in the following format -

DD MM YYYY, DD MM YYYY

Validate the input data, and compute the difference between the two dates in days.

Output of the application should be of the form -

DD MM YYYY, DD MM YYYY, difference

Where the first date is the earliest, the second date is the latest and the difference is the number of

days.

Input can be from a file, or from standard input, as the developer chooses.

Provide test data to exercise the application.

# How to run
Build application

 - mvn clean install

go to target folder and run the application

 - java -jar date.challenge-0.0.1-SNAPSHOT-jar-with-dependencies.jar '11 11 2000, 10 10 2000'
 
output should be

  - 10 10 2000, 11 11 2000, 32 days


#Explanation

- CodeDateParser parses a given string into internal date structure called PersonalDate
- JulianDayCalculatorFactory returns an algorithm to calculate Julian Day based on the input date type (Gregorian or Julian)
- date input and printing is done in the Main class
- Corresponding unit tests can be found under the src/test/java 
