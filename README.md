# Student CRUD – Spring Boot (Swagger UI, no Lombok)

## Quick start
1. Edit `src/main/resources/application.properties` and set your MySQL username/password (default user is `root`).  
   DB `studentdb` will be created automatically on first run.
2. Start MySQL locally (port 3306).
3. Run from the project root:
   ```bash
   mvn -U clean spring-boot:run
   ```
4. Test in browser (no Postman needed):
   - Swagger UI: http://localhost:8080/swagger-ui/index.html
   - API:
     - GET  `/api/students`
     - GET  `/api/students/{id}`
     - POST `/api/students`
     - PUT  `/api/students/{id}`
     - DELETE `/api/students/{id}`

## Push to GitHub (first time)
1. Configure your Git identity (do it once globally):
   ```bash
   git config --global user.name "sulaiman"
   git config --global user.email "su3laimanshaat@gmail.com"
   ```
2. Init & push this repo:
   ```bash
   git init
   git add .
   git commit -m "Initial commit: Spring Boot CRUD + Swagger"
   git branch -M main
   git remote add origin https://github.com/<YOUR-ACCOUNT>/studentapp.git
   git push -u origin main
   ```
