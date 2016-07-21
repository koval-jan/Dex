#!/bin/bash

DIR="$(dirname "${BASH_SOURCE[0]}")"

# JAVA needs to be version 1.8 or better.

java -Xmx1024m -Xms1024m -jar $DIR/Dex.jar