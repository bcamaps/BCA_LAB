data(iris)
head(iris)
summary(iris)
cat("Number of rows:", nrow(iris), "\n")
cat("Number of columns:", ncol(iris), "\n")
colnames(iris)
hist(iris$Sepal.Length, main = "Histogram of Sepal Length", xlab = "Sepal Length")
plot(iris$Sepal.Length, iris$Sepal.Width, main = "Scatterplot of Sepal Width vs. Sepal Length",
 xlab = "Sepal Length", ylab = "Sepal Width")
boxplot(iris$Sepal.Width ~ iris$Sepal.Length, main = "Boxplot of Sepal Width vs. Sepal
Length", xlab = "Sepal Length", ylab = "Sepal Width")
cor(iris$Sepal.Length, iris$Petal.Length, method = "pearson")
cor_matrix <- cor(iris[, 1:4], method = "pearson")
print(cor_matrix) 