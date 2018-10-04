#!/bin/sh
java -jar openapi-generator-cli.jar generate -i musicbot.yaml -o gen -c config.json -g java --library=okhttp-gson
