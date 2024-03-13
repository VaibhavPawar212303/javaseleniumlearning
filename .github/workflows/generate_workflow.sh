# Check if count argument is provided, default to 5 if not
count=${1:-5}

cat <<EOF > dynamic_workflow.yml
name: Dynamic Workflow
on:
  push:
    branches:
EOF

# Loop through the specified count
for ((i=1; i<=$count; i++)); do
  echo "      - branch-$i" >> dynamic_workflow.yml
done

cat <<EOF >> dynamic_workflow.yml
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout code
        uses: actions/checkout@v2
      # Add your test steps here
EOF