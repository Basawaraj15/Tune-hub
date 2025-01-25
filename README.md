TuneHub Application 

TuneHub is a online music streaming web application. This application is developed using Spring Boot for 
Backend, Thymeleaf module for the frontend.Impelemented MySQL as the database for the efficient data managgement, the users need register
and login to access the functionalities.

Technologies Used
Backend: Spring Boot
Provides a powerful and scalable backend framework to handle business logic and API integration.
Supports RESTful APIs for efficient communication between the frontend and the server.

Frontend: Thymeleaf
A server-side Java template engine for rendering dynamic HTML pages.
Ensures smooth integration with Spring Boot, enabling the creation of user-friendly and responsive interfaces.

Database: MySQL
Handles all data storage and management tasks, ensuring reliability and efficiency.
Used for storing user credentials, music metadata, playlists, and streaming history.

Features
User Registration and Authentication
Users must register using a unique email and password.
Login functionality is implemented using Spring Security for secure access.
Passwords are encrypted for safety using hashing mechanisms like BCrypt.

Music Catalog
Displays a categorized collection of songs (genres, artists, albums).
Users can search and filter songs based on their preferences.

Personalized Playlists
Users can create, edit, and delete their playlists.
Playlists are saved in the database for future access.
Favorites

Role-Based Access
Implemented role-based access to manage admin and user privileges.
Admins can manage the song catalog, approve user accounts, and oversee platform usage.

Architecture
Model-View-Controller (MVC) Pattern:

Model: Represents the application's data (e.g., User, Song, Playlist) and defines business logic.
View: Thymeleaf templates render the user interface dynamically.
Controller: Handles user requests, processes them, and sends the appropriate responses.
Data Flow:

Frontend: Sends requests (e.g., login, fetch songs) to the backend.
Backend: Processes the request, interacts with the database, and sends responses back to the frontend.
