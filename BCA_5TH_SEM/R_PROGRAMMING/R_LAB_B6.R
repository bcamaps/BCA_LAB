a <- 200
b <- 240
prob1 <- 1 - punif(230, min = a, max = b)
cat("1. Probability P(x > 230):", prob1, "\n")
prob2 <- punif(220, min = a, max = b) - punif(205, min = a, max = b)
cat("2. Probability P(205 ≤ x ≤ 220):", prob2, "\n") 