advert_expenses <- c(11, 13, 14, 16, 16, 15, 15, 14, 13, 13)
sales_volume <- c(50, 50, 55, 60, 65, 65, 65, 60, 60, 50)
correlation_coefficient <- cor(advert_expenses, sales_volume, method = "pearson")
if (correlation_coefficient > 0)
{
 correlation_type <- "Positive Correlation"
}else if (correlation_coefficient < 0){
 correlation_type <- "Negative Correlation"
}else {
 correlation_type <- "No Correlation"
}
cat("Pearson Correlation Coefficient:", correlation_coefficient, "\n")
cat("Type of Correlation:", correlation_type, "\n") 