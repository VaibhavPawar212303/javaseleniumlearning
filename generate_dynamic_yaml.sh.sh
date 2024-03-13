#!/bin/bash

# Check if count argument is provided, default to 5 if not
count=${1:-5}

# Loop through the specified count
for ((i=1; i<=$count; i++)); do
  cat <<EOF > dynamic_workflow_$i.yml
name: Dynamic Workflow $i
on:
  push:
    branches:
      - branch-$i

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - name: Say Hello
        run: echo "Hello from branch $i"
      - name: Checkout code
        uses: actions/checkout@v2
      # Add your test steps here
EOF
done
