https://github.com/iRepulze/test.git
reposting because john is stupid and just deleted everything

so i am writing this in vim which is a text editor that was included in gitbash
you can code in here but compiling and running is a bit more advanced and so im not entirely sure how to do that yet

anyway
the repository on github is already set up, thank you andrew (john thinks otherwise)
when you first start up gitbash, find locate your directory by using cd (cd .. moves you up one location) then use cd /actual directory/ in order to locate the place
use ls in order to see all of the files/directories in your current directory
on first time setup
use git init in order to initialize a git repository in the current directory
then use git add /filename/ in order to add the file to the "index'
run git commit -m "and then a message" - the message will be posted on github
on first time setup, you want to run git remote add origin /server/ and the server will look like a url and you can find it on github
then you just need to run git push origin master in order to upload your files to github
editing and resubmitting files is a bit more complicated but try to be able to send a regular file to github first

and if you get into vim know that in order to get out, press esc, then type :wq, w writes (saves) the changes and q quits vim.
