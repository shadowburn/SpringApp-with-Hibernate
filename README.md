# SpringApp-with-Hibernate
Ongoing project based on previous 'giflib' work.


To run this app, start your server, in the terminal type:
java -cp h2*.jar org.h2.tools.Server

Make sure your database url matches the file location, 
to change this go to app.properties

Then open your browser go to localhost:8080.

You can upload gifs or pics to the database, the file size was limited to 1M.

Data validation has not been implemented yet, unhandled execptions also need to be taken care of.

