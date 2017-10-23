# GitExperiment
Just for git practise
create a new repository on the command line
1.
```
echo "# GitExperiment" >> README.md
git init 
git add README.md 
git commit -m "first commit" 
git remote add origin https://github.com/taruncse/GitExperiment.git 
git push -u origin master 
```

2. push an existing repository from the command line 

```
git remote add origin https://github.com/taruncse/GitExperiment.git 
git push -u origin master
```
3. Incase of Android studio command line if you writ only ```git commit``` and you want to exit from editor, then you have to follow the following steps, 

press "esc"(switch edit from insert mode) then ":" (Command mode) then "q" (quit command) then enter (as it is a VIM Editor)

4. Create the branch on your local machine and switch in this branch :

   ```git checkout -b [name_of_your_new_branch]```
    
5. only create a branch 
   ```git branch branch_name```
   
6. Switch to a branch 
   ```git checkout branch_name```
7. You can see all branches created by using 
   ```git branch```
8. Update your branch when the original branch from official repository has been updated :
   ```git fetch [name_of_your_remote]```
   
9. To remove a file from git stage (if only a file then remove -r) 
    ```git rm -r --cached <NAME_OF_THE_DIRECTORY>```
10. Change your remote's URL ```git remote set-url origin your_remote_url```
11. Verify that the remote URL has changed. ```git remote -v```
12. If you just inited it, you can just delete .git. ```rm -rf .git```
13. Add git tag on your last commit ```git tag -a GIVE_A_VERSION GIT_COMMIT_ID -m "Message here" ```

    Push a tag ```git push --tags origin master```
    
    Show all tags ```git tag```
    
    Delete tag from local ```git tag -d TAG_VERSION/ID```
    
    Delete tag from remote ```git push --delete origin tagName```
14. To unstage the file which is added by git add command 

    ```git reset <filePath>``` (For a specific file)
    
    ```git reset``` (For all file)

15. Checkout and create a branch from a existing tag:

   ```git checkout tags/<tag_name> -b <branch_name> ```
   
16. Get all tags
   ```git tag```
