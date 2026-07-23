# Job Application Management System

A full-stack Job Application Management System built with **Java 21**, **Spring Boot**, **Spring Data JPA**, **Hibernate**, **Thymeleaf**, **Bootstrap 5**, and **MySQL**.

This application helps users organize and manage job applications by allowing them to create, update, view, and delete applications through a clean and responsive web interface.

---

## Live Demo

🔗 https://YOUR_RENDER_URL.onrender.com

> **Note:** The application is deployed on Render's free tier. If the application has been inactive, the first request may take **30–60 seconds** while the server wakes up.

---

## Features

- Add new job applications
- View all job applications
- Update existing applications
- Delete applications with confirmation
- Server-side validation
- Global exception handling
- Responsive Bootstrap UI
- Cloud MySQL database (Aiven)
- Dockerized deployment
- Live deployment on Render

---

## Screenshots

### Home Page

<img width="940" height="416" alt="Home Page" src="https://github.com/user-attachments/assets/4afe6903-7341-45c9-99c0-52b64778f8d6" />

---

### Empty State

<img width="944" height="355" alt="Empty State" src="https://github.com/user-attachments/assets/58ce48c5-2eff-45d0-8d4d-e26ee9e5494b" />

---

### Add Job

<img width="1524" height="1032" alt="Add Job Page" src="https://github.com/user-attachments/assets/56821568-9772-4746-980e-fa44d06d4ada" />

---

### Edit Job

<img width="1786" height="880" alt="Edit Job Page" src="https://github.com/user-attachments/assets/c4e5e08b-a44d-458a-9136-473b9f3a29a1" />

---

### Validation

<img width="1536" height="1024" alt="Validation Page" src="https://github.com/user-attachments/assets/685db1aa-47a2-450c-9c36-fd3c4e1a71f7" />

---

### Delete Confirmation

<img width="948" height="444" alt="Delete Confirmation" src="https://github.com/user-attachments/assets/dbfa9c8f-bccd-4c1f-ac60-b7b81276198d" />

---

## Tech Stack

### Backend

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- Hibernate

### Frontend

- Thymeleaf
- HTML5
- CSS3
- Bootstrap 5

### Database

- MySQL
- Aiven Cloud MySQL

### Tools

- Maven
- IntelliJ IDEA
- Git
- GitHub
- Docker
- Render
- Postman

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.jobtracker
│   │       ├── controller
│   │       ├── entity
│   │       ├── exception
│   │       ├── repository
│   │       ├── service
│   │       └── JobTrackerApplication.java
│   │
│   └── resources
│       ├── static
│       ├── templates
│       └── application.properties
```

---

## How It Works

The application follows a layered Spring Boot architecture.

- Controller handles HTTP requests.
- Service contains the business logic.
- Repository interacts with the MySQL database using Spring Data JPA.
- Entity represents the database table.
- Thymeleaf renders dynamic HTML pages.
- Validation ensures valid user input.
- Exception handling provides user-friendly error responses.

---

## Validation

The application validates user input before saving data.

Examples include:

- Company name is required
- Position is required
- Platform is required
- Location is required
- Applied Date is required
- Notes length validation

---

## Database

The application uses **MySQL** with **Spring Data JPA** and **Hibernate**.

For deployment, the database is hosted on **Aiven Cloud**.

---

## Running the Project Locally

### Clone the repository

```bash
git clone https://github.com/Tandrita100/job-application-management-system.git

cd job-application-management-system
```

---

### Configure Environment Variables

Create the following environment variables:

```
DB_URL=YOUR_DATABASE_URL

DB_USERNAME=YOUR_DATABASE_USERNAME

DB_PASSWORD=YOUR_DATABASE_PASSWORD
```

---

### Build the project

```bash
./mvnw clean install
```

---

### Run the application

```bash
./mvnw spring-boot:run
```

---

Open your browser:

```
http://localhost:8080
```

---

## Future Improvements

- User Authentication
- Search functionality
- Filter by Job Status
- Pagination
- Dashboard with statistics
- Email reminders
- Resume upload
- Export applications to Excel/PDF

---

## Learning Outcomes

This project helped me gain practical experience with:

- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- CRUD Operations
- Thymeleaf
- Bootstrap
- MySQL
- Validation
- Exception Handling
- Docker
- Cloud Database Deployment
- Application Deployment

---

## Author

**Tandrita**

GitHub:
https://github.com/Tandrita100
