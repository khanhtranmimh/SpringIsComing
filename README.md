# SpringIsComing
You have learned .NET or other platforms in a long time. Maybe, You've never known anything else. But now Spring is truly coming. In the Spring, we must teach each other or prepare by ourselves.

# CLI:
   ```bash
   ./gradlew clean build --refresh-dependencies
   ```

   ```bash
   ./gradlew build --info
   ```

   ```bash
   ./gradlew bootRun
   ```

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
