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
   
