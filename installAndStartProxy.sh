#!/usr/bin/env bash

if ! command -v npm &> /dev/null
then
    echo "npm is not installed. Please install node for your environment:"
    echo "===> Windows: Install via https://nodejs.org/en/"
    echo "===> Mac: brew install node"
    echo "===> Linux: sudo apt install nodejs npm"
    exit
fi

npm install http-simple-proxy
node proxy.js
