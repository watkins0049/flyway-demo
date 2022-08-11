# Flyway Demo
This application is a high-level overview of Flyway and how it can be used in a Spring Boot application to refactor
(aka migrate) a database.

## Requirements
- Java 17
- Postgres Server
- Basic Java and SQL knowledge
- Basic knowledge of Spring Boot

## Setup Guide
1. Clone this repository to your local machine and import in IntelliJ (or other similar IDE). Dependencies should be
automatically downloaded. If not, run `./gradlew clean build`.
2. Download and install Java 17 and set as the default JDK if not already done
3. Start up your Postgres server
    1. Mac users can download the [Postgres.app](https://postgresapp.com/)
    2. All other systems can [follow this guide](https://www.postgresql.org/download/)
4. Launch the Spring Boot application
   1. Note: you may need to adjust the datasource URL in `application.yml`

## How it Works
On application launch, Flyway will connect to the database and run any SQL script in the `resources/db/migration`
directory. The Flyway migration scripts should be named `VX.Y__descriptive_name_here` where `X.Y` is a numerical
version (note: this can be overridden with `spring.flyway.sql-migration-prefix` and
`spring.flyway.sql-migration-separator`). Flyway will create a table on first runtime (`flyway_schema_history` by
default, override with the property `sping.flyway.table`) that will track the versions already migrated and will skip
migrations already successfully deployed.

A list of Flyway properties can be found on [the Spring Website](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.data-migration)


## Demo Branches
- `master` - Contains the denormalized database structure
- `flyway-normalization` - Contains the database migration to further normalize the database
