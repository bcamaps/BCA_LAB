mylist <- list(c("bus","car","bike"), 42, 21, c(1,2,3), c(5,8,9), c(T,F))
mylist
first_element <- mylist[[1]]
first_element
names(mylist) <- c("String","Number","Numb","Vector1","Vector2","Logical")
mylist
mylist[[7]] <- c(10,20,30)
mylist
mylist <- mylist[-7]
mylist
mylist1 <- mylist[c(1,3)]
mylist1
mylist[[3]] <- 65
mylist