xlp<-c(0,5,10,15,20)
xup<-c(5,10,15,20,25)
NumStudents = c(5, 25, 40, 17, 30)
midpoints <- c(2.5, 7.5, 12.5, 17.5, 22.5)
barplot(NumStudents,width=xup-xlp,space=0,
 col = "blue",
 xlab = "Time Interval (minutes)",
 ylab = "Number of Students",
 main = "Histogram of Time Taken by Students")
lbls <- sort(union(xlp, xup))
axis(1, labels = lbls, at = lbls, las = 2)
plot(midpoints, NumStudents, type = "b", pch = 19,
 col = "red",
 xlab = "Time Interval (minutes)",
 ylab = "Number of Students",
 main = "Frequency Polygon of Time Taken by Students")