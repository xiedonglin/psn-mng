javac -d . cn/edu/psn/management01/*.java
jar cvf test.jar .\cn\edu\psn\management01\*.class
java -Dfile.encoding=UTF-8 -cp ..\lib\mysql-connector-java-5.1.47-bin.jar;test.jar cn.edu.psn.management01.Application