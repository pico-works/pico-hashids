#!/bin/bash

declare -a vars=(\
"AWS_ACCESS_KEY_ID      Access key for publishing to S3" \
"AWS_SECRET_ACCESS_KEY  Secret key for publishing to S3" \
)

for var in "${vars[@]}"; do
  v=${var%% *}
  if [ "${!v-x}" = "x" -a "${!v-y}" = "y" ]; then
    printf 'NOT FOUND: $%s\n' "$var"
    _not_found=true
  else
    printf 'found: $%s\n' "$v"
  fi
done

[ -z "${_not_found}" ] && exit 0

echo "*****************************"
echo "MISSING ENVIRONMENT VARIABLES"
echo "*****************************"
exit 1
