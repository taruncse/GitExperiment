# GitExperiment
Just for git practise
create a new repository on the command line

```
echo "# GitExperiment" >> README.md
git init 
git add README.md 
git commit -m "first commit" 
git remote add origin https://github.com/taruncse/GitExperiment.git 
git push -u origin master 
```

* push an existing repository from the command line 

```
git remote add origin https://github.com/taruncse/GitExperiment.git 
git push -u origin master
```
* Incase of Android studio command line if you writ only ```git commit``` and you want to exit from editor, 
  then you have to follow the following steps, 

  press "esc"(switch edit from insert mode) then ":" (Command mode) then "q" (quit command) then enter 
  (as it is a VIM Editor)

* Create the branch on your local machine and switch in this branch :

   ```git checkout -b [name_of_your_new_branch]```
    
* Only create a branch 
   ```git branch branch_name```
   
* Switch to a branch 
   ```git checkout branch_name```
* You can see all branches created by using 
   ```git branch```
* Update your branch when the original branch from official repository has been updated :
   ```git fetch [name_of_your_remote]```
   
* To remove a file from git stage (if only a file then remove -r) 
    ```git rm -r --cached <NAME_OF_THE_DIRECTORY>```
* Change your remote's URL ```git remote set-url origin your_remote_url```
* Verify that the remote URL has changed. ```git remote -v```
* If you just inited it, you can just delete .git. ```rm -rf .git```
* Add git tag on your last commit ```git tag -a GIVE_A_VERSION GIT_COMMIT_ID -m "Message here" ```

    Push a tag ```git push --tags origin master```
    
    Show all tags ```git tag```
    
    Delete tag from local ```git tag -d TAG_VERSION/ID```
    
    OR
     ``` tag --delete Tag_Name```
     
    Delete tag from remote ```git push --delete origin tagName```
* To unstage the file which is added by git add command 

    ```git reset <filePath>``` (For a specific file)
    
    ```git reset``` (For all file)

* Checkout and create a branch from a existing tag:

   ```git checkout tags/<tag_name> -b <branch_name> ```
   
* Show all tags
   ```git tag```
    Show all remote tags
   ```git ls-remote --tags origin```
* Create tag
    ```git tag -a Tag_Name -m "Message"```    
* Push all tags 
    ```git push --tags```
* Remove git ignore cache.
   ```git rm -r --cached ```  
* If you want to add your missing file with your last commit without modifying your commit message.   
  ```git commit --amend --no-edit ```
  
* But if you want to change the commit message too.  
   ```git commit --amend -m "New commit message" ```
   
* If you want to change the commit message manually.    
  ``` git commit --amend```
* Tag using a specific commit id
  ```git tag -a Tag_name Tag_ID -m "Message here"```
* Delete a local commit. (Here 1 is numbr of commit we want to delete)

  ```git reset --hard HEAD~1```

* Ignore files that have already been committed to the repo

    ``` git rm -r --cached . ```

    ``` git add . ```

    ``` git commit -m "Clean up ignored files" ```
    
* Delete a git commit but keep the changes

    ``` git reset HEAD^  ```

* Remove any versioned file from git track

  *Firstly add that file to .gitignore file , then write following command*

  *Remove file from version controll*

    ```
    git rm --cached -r fileNameWithExtension(Or Use dot(.) to remove all)

    ```
    ```
    git add .
    ```
    ```
    git commit -m "message"

    ```
* To get all the commit history

    ```
    git log

    ```
* Change user name for a specific folder / project / whole computer

To set your account's default identity globally run below commands

```
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
git config --global user.password "your password"
```

For local :

```
git config user.email "you@example.com"
git config user.name "Your Name"
git config user.password "your password"
```
Check Configuration:

```
git config --list
```

Show all the available commit in a branch:
```
git log --reflog
```
