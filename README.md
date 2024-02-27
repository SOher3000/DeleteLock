This small utility Java project is designed to remove lock (.lock) files created by some JetBrains products on Linux (in my case, it was Ubuntu), which can cause errors when running applications.

I understand that not everyone wants to clone and build this small repository, so it will be released as a pre-compiled JAR file.

### Usage Instructions

1. **Clone the Repository**:

   You can clone the repository by executing the following command:

   ```bash
   git clone https://github.com/SOher3000/DeleteLock
   ```

2. **Building the Project**:

   Navigate to the project directory and build it with Maven:

   ```bash
   cd DeleteLock
   mvn package
   ```

   This will create a JAR file in the target folder.

3. **Execution**:

   After building, navigate to the target directory and execute the JAR file, specifying the paths to the lock files:

   ```bash
   cd target
   java -jar DeleteLock.jar
   ```

   Note: Ensure that the paths to the lock files (`paths`) according to your configuration are the ones you need to delete. If they are default, you don't need to worry about changing anything.
