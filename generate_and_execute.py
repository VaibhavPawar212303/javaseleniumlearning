import os

# Function to generate a dynamic YAML file
def generate_yaml_file(index, folder):
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
    # Ensure the specified folder exists
    if not os.path.exists(folder):
        os.makedirs(folder)

    # Generate the dynamic YAML file in the specified folder
    file_path = os.path.join(folder, f"dynamic_workflow_{index}.yml")
    with open(file_path, "w") as file:
        file.write(content)

# Specify the folder where dynamic YAML files will be generated
folder = "dynamic_workflows"

# Generate dynamic YAML files
count = 10  # Number of dynamic YAML files to generate
for i in range(1, count + 1):
    generate_yaml_file(i, folder)
