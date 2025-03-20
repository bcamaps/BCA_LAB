mean_time <- 57
std_deviation <- 6.5
z_score60 <- (60 - mean_time) / std_deviation
z_score50 <- (50 - mean_time) / std_deviation
z_score80 <- (80 - mean_time) / std_deviation
prob1 <- pnorm(z_score60)
cat("a) Probability that time is less than 60 minutes:", prob1, "\n")
prob2 <- pnorm(z_score80) - pnorm(z_score50)
cat("b) Probability that time is between 50 and 80 minutes:", prob2, "\n") 