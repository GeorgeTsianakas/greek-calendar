# Greek Calendar

A small Java library that calculates all official Greek public holidays for a given year. It includes both fixed-date holidays and moveable feasts based on Orthodox Easter.

![codecov](https://codecov.io/gh/GeorgeTsianakas/greek-calendar/branch/master/graph/badge.svg)
![Build Status](https://travis-ci.org/GeorgeTsianakas/greek-calendar.png)

## Features
- Compute all Greek public holidays for any year (Gregorian calendar)
- Fixed-date holidays are calculated from `java.time.LocalDate`
- Moveable feasts are derived from Orthodox Easter using an algorithmic calculation
- Convenience method to return all holidays as a list, with de-duplication when dates overlap

## Requirements
- Java 8 or newer (uses `java.time`)
- Maven 3.6+ (for building from source)

## Installation
This project is a standard Maven project. You can build and install it locally and then use it as a dependency in other projects.

1) Clone and build:
```bash
mvn clean install
```

2) Use it from another Maven project (after local install):
```xml
<dependency>
  <groupId>org.example</groupId>
  <artifactId>greek-calendar</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

If you prefer, you can also add this project as a module or include the compiled JAR directly in your classpath.

## Quick Start
```java
import calendar.HolidayCalculator;
import calendar.Holidays;

public class Demo {
    public static void main(String[] args) {
        int year = 2025;
        Holidays holidays = HolidayCalculator.CreateHolidays(year);

        // Access specific holidays
        System.out.println("New Year: " + holidays.getNewYearDay());
        System.out.println("Orthodox Easter Sunday: " + holidays.getOrthodoxEasterDay());

        // Or get them all at once (no duplicates if dates overlap that year)
        holidays.getAllGreekPublicHolidays().forEach(System.out::println);
    }
}
```

## API Overview
Core types live in the `calendar` package.

- `HolidayCalculator`
  - `static Holidays CreateHolidays(int year)`: Builds and returns a `Holidays` object populated for the given year.

- `Holidays` (data object with getters)
  - Year: `getYear()`
  - Fixed-date holidays:
    - `getNewYearDay()` — January 1
    - `getEpiphany()` — January 6
    - `getMarch25()` — March 25 (Greek Independence Day)
    - `getMayDay()` — May 1 (Labor Day)
    - `getTheAssumption()` — August 15
    - `getOctober28()` — October 28 (Ohi Day)
    - `getChristmasDay()` — December 25
    - `getChristmasNextDay()` — December 26
  - Moveable feasts (relative to Orthodox Easter):
    - `getGreenMonday()` — 48 days before Easter Sunday
    - `getOrthodoxEasterFriday()` — 2 days before Easter Sunday (Good Friday)
    - `getOrthodoxEasterDay()` — Easter Sunday
    - `getOrthodoxEasterMonday()` — day after Easter Sunday
  - All holidays:
    - `getAllGreekPublicHolidays()` — `List<LocalDate>` of all supported holidays with duplicates removed.

Note: Setters are intentionally protected (via Lombok) — construct via `HolidayCalculator`.

## How Orthodox Easter is calculated
An algorithm computes Orthodox Easter for the given year, then related holidays are derived by adding/subtracting days. See `HolidayCalculator` for the exact implementation.

## Examples
- Count holidays for a year:
```java
int count = HolidayCalculator.CreateHolidays(2021)
    .getAllGreekPublicHolidays().size();
```

- Check if a date is a public holiday:
```java
import java.time.LocalDate;

boolean isHoliday(LocalDate date) {
    return HolidayCalculator.CreateHolidays(date.getYear())
        .getAllGreekPublicHolidays()
        .contains(date);
}
```

## Testing
Run the unit tests with:
```bash
mvn test
```
Tests cover each holiday and verify no duplicates when multiple holidays fall on the same date for specific years.

## Notes and Limitations
- Calendar system: Gregorian calendar via `java.time.LocalDate`.
- Duplicates: `getAllGreekPublicHolidays()` ensures unique dates (e.g., if Labor Day coincides with Easter period adjustments).
- Time zones: Dates are local-date only (no time zone handling involved).
- Extensibility: Add more holidays by extending `HolidayCalculator` and `Holidays` as needed.

## Branches and Alternative Implementations
This README describes the mainline implementation present in this branch. Other branches in the repository may experiment with different algorithms or data models. If you are exploring alternatives, check the repository’s other branches and their READMEs or commit messages for details.

## Contributing
- Open issues or pull requests with clear descriptions and tests.
- Keep styling consistent and include unit tests for any new holiday logic.
