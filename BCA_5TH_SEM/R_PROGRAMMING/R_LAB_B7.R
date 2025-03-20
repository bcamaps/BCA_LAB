before_training <- c(22, 20, 19, 24, 25, 25, 28, 22, 30, 27, 24, 18, 16, 19, 19, 28, 24, 25, 25, 23)
after_training <- c(24, 22, 19, 22, 28, 26, 28, 24, 30, 29, 25, 20, 17, 18, 18, 28, 26, 27, 27, 24)

t_result <- t.test(before_training, after_training, paired = TRUE)
print(t_result)

if (t_result$statistic < -1.729) {
 cat("The training program is helpful to the students.\n")
} else {
 cat("There is no significant evidence to conclude that the training program is helpful to the students.\n")
} 