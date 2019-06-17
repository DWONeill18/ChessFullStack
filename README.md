# ChessFullStack

MyChessGameViewer
##################################################################################################
1. To run this application
##################################################################################################
1.1 Run a local h2 database
###########################
To run a h2 database, download the h2-1.4.197.jar file from the Maven repository.
Open up a terminal in the same directory as the jar file and run the command

> java -jar h2-1.4.197.jar

The server is now viewable on your localhost:8082
The username is 'sa' and password is 'sa'
############################
1.2 Create a war file for the project
############################
Using maven, run on the project

> mvn install

This creates a .war file which needs to be moved to your deployments folder of your wildfly server.
#########################################################
1.3 Add a new datasource to your wildfly project
#########################################################
In your wildfly folder go to standalone/configurations/standalone.xml

Inside the xml add the following code to the datasource section.

<datasource jta="true" jndi-name="java:jboss/datasources/MyApplicationDS" pool-name="MyApplicationDS" enabled="true" use-ccm="true">
    <connection-url>jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url> 
    <driver-class>org.h2.Driver</driver-class>
    <driver>h2</driver>
    <security>
        <user-name>sa</user-name>
        <password>sa</password>
    </security>
    <validation>
        <background-validation>false</background-validation>
    </validation> 
</datasource> 

The persistence.xml will now connect to this datasource.
##########################
1.4 Running the project
###########################
To run the project make sure the following have been met:
1)h2database is running
2).war file is in deployments folder
3)standalone.xml is saved and closed
4)Run the standalone.bat file on a windwos machine
###################################
1.5 MyChessGame Viewer Application
###################################
MyChessGame Viewer is an interactive online chessgame database viewer which 
allows the User to add and view their own games so they can play through them on a board.

It can accessed from anywhere using the IP address: http://35.242.174.17:8080/ChessDatabaseAPI-1.0/index.html

The create function allows the user to add a game to the MyChessGame Viewer Database.
The read function allows the user to view games from the MyChessGame Viewer Database.
The update function allows the user to edit games from the MyChessGame Viewer Database.
The delete function allows the user to remove games from the MyChessGame Viewer Database.
Information on how to do each of the previous is given on each individual page.
