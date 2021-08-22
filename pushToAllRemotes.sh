#!/usr/bin/env bash

git remote | xargs -L1 git push --all
