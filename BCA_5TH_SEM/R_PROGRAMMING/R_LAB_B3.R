x <- c(2, 4, 5, 6, 8, 11)
y <- c(18, 12, 10, 8, 7, 5)
#linear regression
regression <- lm(y ~ x)
#when x is 7
data <- data.frame(x = 7)
y_value<- predict(regression, newdata = data)
cat("The value of y when x = 7 is:", y_value) 