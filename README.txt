1--To run the initial build
docker build -f Dockerfile -t demo/oracle-java:8 .
### make sure to put "." at end of command, to tell docker you want the current directory

2--Verify the image creation
docker images | head -n5

3--Compile your java code, referencing the Main.java file, **javac must be run first
docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 javac Main.java

4--To run your Main.class file, --rm this immediately removes the container after running.
docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 java Main

If it gets compiled with no errors, you should see "Hello, Hydromax Users!!!"

5--Commit your Image, this time unstead of using the -rm flag, bash into the container, and exit it while it is still running. **-i -t are flags for interactive terminal, we're also giving it our own name, "myJava8container"
docker run -it --name myJava8container -v $PWD:/app -w /app demo/oracle-java:8
--do some work inside of the container, then run exit to terminate current session.

6--running docker ps -all , you should see all containers, alive or dead inside of the system docker repo, then to build and tag the new image, adhere to the following syntax: docker commit [ContainerID] [Repository[:Tag]
ex. docker commit 1a6fc3f5c1b6 hydromax/java8app   your container id will be different

7--after running the commit, you should see your new image by running: $ docker images | head -n5


