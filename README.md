# task-1-kaiburr



![Screenshot (8)](https://github.com/rohith9876/task-1-kaiburr/assets/62980822/adf7239a-7409-4c19-980c-2c986475c93a)

![Screenshot (9)](https://github.com/rohith9876/task-1-kaiburr/assets/62980822/3ee1fad0-173b-419d-8b34-af45b44ec12c)

![Screenshot (10)](https://github.com/rohith9876/task-1-kaiburr/assets/62980822/116f7de9-5f77-4a2c-b9be-6257ab3ef0dd)

![Screenshot (11)](https://github.com/rohith9876/task-1-kaiburr/assets/62980822/e733f4ee-0ded-4d19-8ed3-9047eb71c0f8)



The task involved developing a Java application that provides a RESTful API for managing "server" objects. The application supports various endpoints for searching, creating, and deleting server objects, with data storage handled by MongoDB.

The first endpoint is a GET request to "/servers," which retrieves all server objects when called without any parameters. When a server ID is provided as a parameter, the endpoint returns a single server if it exists, or a 404 error if not found. This endpoint allows users to fetch a list of all servers or retrieve a specific server by its ID.

The second endpoint, a PUT request to "/servers," enables users to create a new server by sending a JSON-encoded message body containing server details. The application parses the JSON data and adds the server to the MongoDB database. This endpoint supports the creation of server objects with attributes like name, ID, language, and framework.

The third endpoint is a DELETE request to "/servers/{id}," where users can delete a server by specifying its ID as a parameter. The application checks if the server exists and, if found, removes it from the database.

The fourth endpoint is a GET request to "/servers/findByName/{name}," which searches for servers by name. Users provide a search string as a parameter, and the application looks for server names containing that string. It returns one or more matching servers or a 404 error if no matches are found.

The entire application utilizes MongoDB as its database for storing and managing server objects, ensuring efficient data storage and retrieval.

To demonstrate the functionality and test the API, tools like Postman, curl, or any other HTTP client can be used to send requests to the respective endpoints. These requests will interact with the Java application, allowing users to search, create, and delete server objects while receiving appropriate responses based on the operations performed.
