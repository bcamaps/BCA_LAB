plant1 <- c(29, 27, 30, 27, 28)
plant2 <- c(32, 33, 31, 34, 30)
plant3 <- c(25, 24, 24, 25, 25)

data <- data.frame(Plant = factor(rep(1:3, each = 5)), Age = c(plant1, plant2, plant3))

result <- aov(Age ~ Plant, data = data)

summary(result)

F_value <- summary(result)[[1]]$`F value`[1]
print(F_value)

if (F_value > 6.93) {
 cat("There is a significant difference in the mean ages of workers at the three plants.\n")
} else {
 cat("There is no significant difference in the mean ages of workers at the three plants.\n")
} 