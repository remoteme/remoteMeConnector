rm bin/remoteme-api-client-0.0.1-SNAPSHOT.jar
rm bin/remoteme-api-client-0.0.1-SNAPSHOT-tests.jar
cd remoteme-api-client
start /w /b mvn install
SLEEP 10
cd ..
cpy.bat