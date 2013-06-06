#!/bin/sh

mvn clean install

calabash-android run target/LirenLibrary.apk
