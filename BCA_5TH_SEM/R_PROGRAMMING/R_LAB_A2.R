find_roots <- function(a, b, c) {
  discriminant <- b^2 - 4 * a * c
  
  if (discriminant > 0) {
    cat("Two real and distinct roots\n")
    root1 <- (-b + sqrt(discriminant)) / (2 * a)
    root2 <- (-b - sqrt(discriminant)) / (2 * a)
    cat("Root 1:", root1, "\n")
    cat("Root 2:", root2, "\n")
    
  } else if (discriminant == 0) {  # Use '==' for comparison, not '='
    cat("Equal Roots\n")
    root <- -b / (2 * a)
    cat("Root:", root, "\n")
    
  } else {
    cat("Complex roots\n")
    real_part <- -b / (2 * a)
    imaginary_part <- sqrt(-discriminant) / (2 * a)
    cat("Root 1:", real_part, "+", imaginary_part, "i\n")
    cat("Root 2:", real_part, "-", imaginary_part, "i\n")
  }
}

# Get user input for the coefficients a, b, and c
a <- as.numeric(readline(prompt = "Enter the value of 'a': "))
b <- as.numeric(readline(prompt = "Enter the value of 'b': "))
c <- as.numeric(readline(prompt = "Enter the value of 'c': "))

# Call the function to find the roots
find_roots(a, b, c)
