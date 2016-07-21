#!/bin/bash

DIR="$(dirname "${BASH_SOURCE[0]}")"

function install() {
mvn org.apache.maven.plugins:maven-install-plugin:2.3.1:install-file \
    -Dfile="$1" \
    -DgroupId="$2" \
    -DartifactId="$3" \
    -Dversion="$4" \
    -Dpackaging=jar \
    -DlocalRepositoryPath="$DIR"
}

install "$DIR/dex-javafx.jar" "dex" "dex.javafx" "1.0.0"
install "$DIR/Prefuse.jar" "ca.utoronto" "prefuse" "1.0.0"
install "$DIR/xdb.jar" "oracle" "oracle.xdb" "1.0.0"
