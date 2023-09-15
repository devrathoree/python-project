#!/bin/bash

# Declare and initialize the containerid variable
containerid=$(docker ps -q)

# Check if the variable is empty (no running containers)
if [ -z "$containerid" ]; then
    echo "No running containers found."
else
    # Stop and remove the running container
    docker stop "$containerid"
    docker rm "$containerid"
    echo "Container $containerid stopped and removed."
fi
