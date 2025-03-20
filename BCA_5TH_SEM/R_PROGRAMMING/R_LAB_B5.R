n1 <- 4
p1 <- 0.10
x1 <- 3
prob1 <- dbinom(x1, size = n1, prob = p1)
cat("1. Probability P(x=3) when n=4 and p=0.10 is:", prob1, "\n")
n2 <- 12
p2 <- 0.45
x2_lower <- 5
x2_upper <- 7
prob2 <- sum(dbinom(x2_lower:x2_upper, size = n2, prob = p2))
cat("2. Probability P(5<=x<=7) when n=12 and p=0.45 is:", prob2, "\n") 