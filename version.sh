#!/usr/bin/env bash

_major_minor="$(cat version.txt | xargs)"
_commits="$(git rev-list --count HEAD)"
_hash="$(git rev-parse --short HEAD)"

if [ "${CIRCLE_PROJECT_USERNAME:-}" = "pico-works" ] && [ "${CIRCLE_BRANCH:-}" = "master" ]; then
    echo "$_major_minor.$_commits"
else
    echo "$_major_minor.$_commits-$_hash"
fi
