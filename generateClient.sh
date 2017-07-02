#!/bin/sh
rm -r androidClient
java -jar swagger-codegen-cli.jar generate -i swagger.yaml -o androidClient -c config.json -l java --library=okhttp-gson
