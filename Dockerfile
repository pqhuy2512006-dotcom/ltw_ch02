# Bước 1: Build mã nguồn bằng Maven
FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Bước 2: Khởi chạy trên Tomcat 10
FROM tomcat:10.1-jdk21
# Xóa ứng dụng mặc định của Tomcat
RUN rm -rf /usr/local/tomcat/webapps/ROOT
# Lấy file WAR vừa build đổi tên thành ROOT.war để web chạy ở đường dẫn gốc "/"
COPY --from=builder /app/target/ch02project-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]