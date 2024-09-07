# emails_scheduler
Microservice that sends an email from carl@gbtec.es every day at 10 a.m

Execute these steps to run this Microservice
1. mvn clean package -DskipTests
2. Make sure you have RabbitMQ server running on localhost:15672
3. Create a new run configuration -> maven + spring-boot:run
4. Run the application
