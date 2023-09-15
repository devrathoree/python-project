#!/bin/bash

# Check if there are running containers
if [ "$(docker ps -q)" ]; then
    echo "Stopping and removing running containers..."
    docker stop $(docker ps -q)
    docker rm $(docker ps -q -a)
else
    echo "No running containers found."
fi
