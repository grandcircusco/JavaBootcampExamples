# Spring MVC Demo With Database

### To use this app
1. Clone the repository to your computer if you have not already:
   
   `git clone https://github.com/grandcircusco/JavaBootcampExamples.git`
   
2. In Eclipse, select File > Import...
3. Select "Existing Gradle Project"
4. For the project root directory select this folder within the cloned repo. (unit-7/database-example)
5. Finish the import.
6. Add `src/main/resources/config/application.properties` and add connection info for your own MySQL schema.
7. You should initialize your database with some sample data found in `src/main/resources/init-db.sql`. Copy this code into MySQL Workbench and run it. This will create the table and starting data.
8. Start the project: Select src/main/java >> RoomsApplication.java. Run as Java Application.
9. Browse to [http://localhost:8080](http://localhost:8080)