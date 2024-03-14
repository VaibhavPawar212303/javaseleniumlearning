import os

# Function to generate a dynamic YAML file
def generate_yaml_file(index):
    content = f"""
name: Dynamic Workflow {index}
on:
  push:
    branches:
      - branch-{index}

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - name: Say Hello
        run: echo "Hello from branch {index}"
      - name: Checkout code
        uses: actions/checkout@v2
      # Add your test steps here
"""
    with open(f"dynamic_workflow_{index}.yml", "w") as file:
        file.write(content)

# Generate dynamic YAML files
count = 10  # Number of dynamic YAML files to generate
for i in range(1, count + 1):
    generate_yaml_file(i)

# Execute the dynamically generated YAML files in sequence
for i in range(1, count + 1):
    print(f"Executing dynamic_workflow_{i}.yml...")
    os.system(f"gh workflow run dynamic_workflow_{i}.yml")

