## Start the API

The Spring Boot API for this lab can be conveniently started from the command line.

1. cd into `bookshelf-api`
2. (on Windows) run `gradlew.bat bootRun` 
3. (on Mac) run `./gradlew bootRun`
4. When you're finished, stop the API using the keyboard combination: CTRL+C.

To start with in-memory database, run `./gradlew bootRun -Dspring.profiles.active=h2`

Alternatively, you can import the `bookshelf-api` folder as a Gradle project in Eclipse and run it as you typically do by running `BookshelfApiApplication.java`.

NOTE: This API stores its data in an in-memory database called H2, not in MySQL like most of our own projects. This saves some setup, but it means that the data will reset when you restart the API.

## Create the Angular App

Create your Angular app here in the main folder. Name it bookshelf-frontend.

```bash
ng new bookshelf-frontend
cd bookshelf-frontend
```