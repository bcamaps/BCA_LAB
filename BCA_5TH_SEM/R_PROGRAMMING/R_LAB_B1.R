values <- c(4, 3, 0, 5, 2, 9, 4, 5)

meanvalue <- mean(values)
medianvalue <- median(values)
modevalue <- as.numeric(names(sort(table(values), decreasing = TRUE)[1]))

cat("Mean: ", meanvalue, "\n")
cat("Median: ", medianvalue, "\n")
cat("Mode: ", modevalue, "\n")

rangevalue <- range(values)
cat("Range: ", rangevalue[2] - rangevalue[1], "\n")

percentile35 <- quantile(values, 0.35)
percentile78 <- quantile(values, 0.78)

cat("35th Percentile: ", percentile35, "\n")
cat("78th Percentile: ", percentile78, "\n")

var_pop <- function(values) {
  mean((values - mean(values))^2)
}
std_deviation_value <- sqrt(var_pop(values))
cat("Variance: ", var_pop(values), "\n")
cat("Standard Deviation: ", std_deviation_value, "\n")

Q1 <- quantile(values, 0.25)
print(Q1)
Q3 <- quantile(values, 0.75)
print(Q3)
iqr_value <- Q3 - Q1
cat("Interquartile Range: ", iqr_value, "\n")

z_scores <- (values - meanvalue) / std_deviation_value
cat("Z-Scores: ", z_scores, "\n")
