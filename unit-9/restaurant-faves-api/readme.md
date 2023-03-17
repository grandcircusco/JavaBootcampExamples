# Restaurant Faves API
This is the backend API for the Restaurant Faves Lab.

## Start the API
First, clone the repository to your computer if you have not already:

`git clone https://github.com/grandcircusco/JavaBootcampExamples.git`

You may start this Spring Boot API from the command line or import and run it in Eclipse. From the command line you will *not* need to set up a MySQL Database because it uses an in-memory H2 database that comes pre-loaded with sample data.

To start the API from the command line:

1. CD into the `bookshelf-api` directory.
2. Run: `./gradlew bootRun --args='--spring.profiles.active=h2'`

Or to import and run it in Eclipse:

1. In Eclipse, select File > Import...
2. Select "Existing Gradle Project"
3. For the project root directory select this folder within the cloned repo. (full-stack-bookshelf/bookshelf-api)
4. Finish the import.
5. Add `src/main/resources/config/application.properties` and add connection info for your own MySQL schema.
6. You should initialize your database with some sample data found in `src/main/resources/init-db.sql`. Copy this code into MySQL Workbench and run it. This will create the table and starting data.
7. Start the project: Select src/main/java >> RestaurantFavesApiApplication.java. Run as Java Application.
8. Test the API at [http://localhost:8080/books](http://localhost:8080/books)
