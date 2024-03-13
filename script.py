import os

def get_workflow_files(folder_path):
    """
    Get a list of workflow files in the specified folder.
    """
    workflow_files = []
    for file in os.listdir(folder_path):
        if file.endswith(".yml") or file.endswith(".yaml"):
            workflow_files.append(os.path.join(folder_path, file))
    return workflow_files

def execute_workflows(workflow_files):
    """
    Execute workflow files in sequence.
    """
    for file in workflow_files:
        print(f"Executing workflow file: {file}")
        # Add your code to execute the workflow file here
        # You can use subprocess.run(), os.system(), or any other method to execute the workflow

def main():
    folder_path = ".github/workflows"  # Specify the path to the folder containing workflow files
    workflow_files = get_workflow_files(folder_path)
    if workflow_files:
        execute_workflows(workflow_files)
    else:
        print("No workflow files found in the specified folder.")

if __name__ == "__main__":
    main()
