# Postgres version 15 is the base image for this container
FROM postgres:15

# Postgres has a few environment variables that it needs
# to be able to configure a connection with a database.
# These vars are POSTGRES_USER, POSTGRES_PASSWORD, POSTGRES_DB
ENV POSTGRES_USER=admin

# Copy init.sql to the location /docker-entrypoint-initdb.d/ in the
# container. By convention, docker will look here for a database
# initialization script.
COPY init.sql /docker-entrypoint-initdb.d/