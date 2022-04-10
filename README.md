# Coffee-Tea API

Basic Spring boot API that allows full CRUD functionalities on a Coffee/Tea database(local) 

## Routes

All routes return Json

- GET  `http://localhost:8080/[coffees/teas]`: Get a list of available coffees/teas in DB
- GET  `http://localhost:8080/[coffees/teas]/{id}`: Get a single Coffee/Tea Object from the database (if exists)
- POST `http://localhost:8080/[coffees/teas]`: Upload a new Coffee/Tea Object to the database
- PUT    `http://localhost:8080/[coffees/teas]/{id}`: Update an existing Coffee/Tea object (if ID exists and new object is provided)
- DELETE `http://localhost:8080/[coffees/teas]/{id}`: Delete an existing Coffee/Tea object (if ID exists)
