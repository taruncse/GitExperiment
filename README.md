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

push an existing repository from the command line 

```
git remote add origin https://github.com/taruncse/GitExperiment.git 
git push -u origin master
```
Incase of Android studio command line if you writ only ```git commit``` and you want to exit from editor, then you have to follow the following steps, 

press "esc"(switch edit from insert mode) then ":" (Command mode) then "q" (quit command) then enter (as it is a VIM Editor)
