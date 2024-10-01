# SpringIsComing
You have learned .NET or other platforms in a long time. Maybe, You've never known anything else. But now Spring is truly coming. In the Spring, we must teach each other or prepare by ourselves.

# Rewrite from some conversation from the "GOT" series film:
"You were born in the long summer. You've never known anything else. But now winter is truly coming. And in the winter, we must protect ourselves, look after one another".

# Note: For beginners, these are some steps to manage your project on GitHub:
To push your project into GitHub, You can do below tutorial. This tutorial is for anyone who already have an account on GitHub and installed Git on the local machine.

### Step 1: Create a repository on GitHub
1.  Login to your account GitHub.
2. Click button “+” on the upper right conner and chose “New repository”.
3. Fill in the name of your repository, and description (optional), and choose between public or private.
4. Click “Create repository”.

### Step 2: Init Git in your project.
1. Open the terminal or the command prompt.
2. Change the directory to your folder containing your project:
   ```bash
   cd path-to-your-project
   ```
3. Init Git:
   ```bash
   git init
   ```

### Step 3: Add files to Git
1. Add all files in your project into Git:
   ```bash
   git add .
   ```
   (`.` means add all files in the current folder.)

### Step 4: commit changed
1.   Commit changed with messages:
   ```bash
   git commit -m "messages"
   ```

### Step 5: add a remote repository
1. Get URL of your repository already created on GitHub (in the "Quick setup" or button "Code").
2.  Add a remote repository:
   ```bash
   git remote add origin https://github.com/your_name_account/your_repository.git
   ```

### Step 6: push your repository into GitHub
1.  Push any changes on the main branch ( `main` or `master`):
   ```bash
   git push -u origin main
   ```
   (change `main` to `master` if you want to use the master branch.)

### Step 7: Authorize
- If requested, fill in your logging information on GitHub (username and password or your personal token if you enable 2-factor authentication).

# Cấu trúc Project 
Nếu bạn muốn xây dựng một dự án microservices với Spring Boot sử dụng Gradle, dưới đây là cấu trúc thư mục tương ứng và một số file cấu hình mẫu cho từng dịch vụ.

### Cấu trúc thư mục dự án với Gradle

```plaintext
my-microservices-project/
├── service-a/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── servicea/
│   │   │   │               ├── ServiceAApplication.java
│   │   │   │               ├── controller/
│   │   │   │               ├── service/
│   │   │   │               └── repository/
│   │   │   └── resources/
│   │   │       ├── application.yml
│   │   │       └── static/
│   │   └── test/
│   ├── build.gradle
│   └── settings.gradle
├── service-b/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── serviceb/
│   │   │   │               ├── ServiceBApplication.java
│   │   │   │               ├── controller/
│   │   │   │               ├── service/
│   │   │   │               └── repository/
│   │   │   └── resources/
│   │   │       ├── application.yml
│   │   │       └── static/
│   │   └── test/
│   ├── build.gradle
│   └── settings.gradle
└── common-library/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── common/
    │   │   │               └── utils/
    │   │   └── resources/
    │   └── test/
    └── build.gradle
```

### Ví dụ file `build.gradle` cho từng dịch vụ

#### 1. `service-a/build.gradle`

```groovy
plugins {
    id 'org.springframework.boot' version '3.0.0'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
    id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'mysql:mysql-connector-java'
    implementation 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}

test {
    useJUnitPlatform()
}
```

#### 2. `service-b/build.gradle`

```groovy
plugins {
    id 'org.springframework.boot' version '3.0.0'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
    id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'postgresql:postgresql'
    implementation 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}

test {
    useJUnitPlatform()
}
```

#### 3. `common-library/build.gradle`

```groovy
plugins {
    id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.projectlombok:lombok'
}

tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}
```

### File `settings.gradle` cho từng dịch vụ

Mỗi dịch vụ có thể có file `settings.gradle` đơn giản như sau:

```groovy
rootProject.name = 'service-a'  // Hoặc service-b
```

### Cách xây dựng và chạy ứng dụng

1. **Chạy từng dịch vụ**: Bạn có thể di chuyển vào thư mục của từng dịch vụ và chạy lệnh Gradle để xây dựng và chạy ứng dụng:

   ```bash
   cd service-a
   ./gradlew bootRun
   ```

   ```bash
   cd service-b
   ./gradlew bootRun
   ```

2. **Chạy các test case**: Để chạy các test case, bạn cũng có thể sử dụng lệnh:

   ```bash
   ./gradlew test
   ```

### Tóm lại

Cấu trúc này cho phép bạn quản lý nhiều dịch vụ microservices một cách dễ dàng, mỗi dịch vụ có thể độc lập phát triển và triển khai. Bạn cũng có thể chia sẻ mã nguồn chung thông qua thư viện chung (`common-library`) để giảm thiểu mã lặp lại. Nếu bạn cần thêm thông tin hoặc có câu hỏi cụ thể hơn, hãy cho mình biết nhé!
