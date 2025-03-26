#!/bin/bash

# Function to commit files in a folder with a specific date
commit_folder() {
    local folder=$1
    local commit_date=$2
    
    if [ -d "$folder" ]; then
        echo "Processing folder: $folder"
        
        # Find all files in the folder
        files=$(find "$folder" -type f)
        
        if [ -n "$files" ]; then
            # Add all files in the folder
            git add "$folder"
            
            # Set the commit date
            export GIT_AUTHOR_DATE="$commit_date"
            export GIT_COMMITTER_DATE="$commit_date"
            
            # Commit with the specified date
            git commit -m "Change in $folder on $commit_date"
            echo "Committed files from $folder with date $commit_date"
        else
            echo "No files found in $folder"
        fi
    else
        echo "Folder $folder does not exist"
    fi
}

# Define folders and their corresponding dates
# Format is: folder name followed by commit date
#commit_folder "LE_3" "2025-02-05T15:00:00"
commit_folder "LE_4" "2025-03-26T15:30:00"
commit_folder "LE_5" "2025-03-26T15:45:00"
commit_folder "LE_6" "2025-04-16T15:34:00"

# Add more folders as needed by duplicating the line above
# commit_folder "Folder_Name" "YYYY-MM-DDTHH:MM:SS"

# Push changes to the repository
git push --force