# PART-A

## 1. Matrix Operations
Write a program to create two 3x3 matrices, A and B, and perform the following operations:
   - \( A^T B \)
   - \( B^T (A \cdot A^T) \)
   - \( (A \cdot A^T) \cdot B^T \)
   - \( [(B \cdot B^T) + (A \cdot A^T) - 100I_{3}]^{-1} \)

## 2. Quadratic Equation Solver
Write an R program to find the roots of a quadratic equation using a user-defined function. Test the program with user-supplied values for all possible cases.

## 3. Prime Numbers Generator
Write an R script to generate prime numbers between two numbers using loops.

## 4. List Manipulations in R
Write an R program to create a list containing strings, numbers, vectors, and logical values. Perform the following manipulations on the list:
   - Access the first element in the list.
   - Assign names to the elements in the list.
   - Add elements at specific positions in the list.
   - Remove elements from the list.
   - Print the first and third elements.
   - Update the third element.

## 5. Frequency Distribution
The following table shows the time taken (in minutes) by 100 students to travel to school on a particular day:

| Time (minutes)   | 0-5 | 5-10 | 10-15 | 15-20 | 20-25 |
|------------------|-----|------|-------|-------|-------|
| No. of Students  | 5   | 25   | 40    | 17    | 13    |

### Tasks
   - Draw the histogram.
   - Draw the frequency polygon.

## 6. Data Frame Operations in R
Write an R program to create a Data Frame with the following details and perform the specified operations:

| ItemCode | itemCategory       | ItemPrice |
|----------|---------------------|-----------|
| 1001     | Electronics         | 700       |
| 1002     | Desktop Supplies    | 300       |
| 1003     | Office Supplies     | 350       |
| 1004     | USB                 | 400       |
| 1005     | CD Drive            | 800       |

### Tasks
   - Subset the Data Frame to display items with a price of 350 or higher.
   - Subset the Data Frame to display items where the category is either "Office Supplies" or "Desktop Supplies."
   - Subset the Data Frame to display items with a price between 300 and 700.
   - Compute the total sum of all `ItemPrice`.
   - Create another Data Frame named `item-details` with fields `itemCode`, `ItemQtyOnHand`, and `ItemReorderLvl`. Merge the two frames.

## 7. Factor Operations in R
Create a factor `marital_status` with levels "Married", "single", "divorced". Perform the following operations on this factor:
   - Check if the variable is a factor.
   - Access the 2nd and 4th elements in the factor.
   - Remove the 3rd element from the factor.
   - Modify the 2nd element of the factor.
   - Add a new level "widowed" to the factor and add the same level to the factor `marital_status`.

## 8. Iris Data Set Operations
Write an R script for the following operations on the Iris dataset:
   1. Load the Iris Dataset.
   2. View the first six rows of the Iris dataset.
   3. Summarize the Iris dataset.
   4. Display the number of rows and columns.
   5. Display column names of the dataset.
   6. Create a histogram of values for sepal length.
   7. Create a scatterplot of sepal width vs. sepal length.
   8. Create a boxplot of sepal width vs. sepal length.
   9. Find the Pearson correlation between `Sepal.Length` and `Petal.Length`.
   10. Create a correlation matrix for the dataset.

---

# PART-B

## 1. Vector Statistics
Write an R program to create a vector containing the following 8 values and perform the following operations: `4, 3, 0, 5, 2, 9, 4, 5`
   - Find the mean, median, and mode.
   - Find the range.
   - Find the 35th and 78th percentile.
   - Find the variance and standard deviation.
   - Find the interquartile range.
   - Find the z-score for each value.

## 2. Correlation Coefficient
Write an R script to find the correlation coefficient and type of correlation between advertisement expenses and sales volume using Karl Pearson's coefficient of correlation (Direct Method).

| Firm | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 |
|------|----|----|----|----|----|----|----|----|----|----|
| Advertisement Exp. (Rs. In Lakhs) | 11 | 13 | 14 | 16 | 16 | 15 | 15 | 14 | 13 | 13 |
| Sales Volume (Rs. In Lakhs)       | 50 | 50 | 55 | 60 | 65 | 65 | 65 | 60 | 60 | 50 |

## 3. Linear Regression
Write an R script to compute the regression equation of `y` on `x` from the following data. Predict the value of `y` when `x=7`.

| X | 2  | 4  | 5  | 6  | 8  | 11 |
|---|----|----|----|----|----|----|
| Y | 18 | 12 | 10 | 8  | 7  | 5  |

## 4. Probability with Normal Distribution
The times taken by a large group of students to complete a piece of homework, \( T \) minutes, are normally distributed with a mean of 57 minutes and standard deviation of 6.5. Write an R script to:
   - Find the probability that the time taken by a random student to complete this homework will be less than 60 minutes.
   - Find the probability that the time taken by a random student to complete this homework will be between 50 and 80 minutes.

## 5. Binomial Distribution
Write an R script to perform the following using binomial distribution:
   - If \( n=4 \) and \( p=0.10 \), find \( P(x=3) \).
   - If \( n=12 \) and \( p=0.45 \), find \( P(5 \leq x \leq 7) \).

# Statistical Analysis Tasks

## 6. Uniform Distribution
Perform the following calculations using a uniform distribution between 200 and 240.

1. \( P(X > 230) \)
2. \( P(205 \leq X \leq 220) \)

**[R Script: 6 Marks]**  
**Solution: 6 Marks**

---

## 7. Paired T-Test on Vertical Jump Scores
The following table shows the maximum vertical jump scores of students before and after a training program. Test whether the training program is helpful to the students by performing a paired t-test.

| Player   | Max Vertical Jump Before Training Program | Max Vertical Jump After Training Program |
|----------|------------------------------------------|-----------------------------------------|
| Player 1 | 22                                       | 24                                      |
| Player 2 | 20                                       | 22                                      |
| Player 3 | 19                                       | 19                                      |
| Player 4 | 24                                       | 22                                      |
| Player 5 | 25                                       | 28                                      |
| Player 6 | 25                                       | 26                                      |
| Player 7 | 28                                       | 28                                      |
| Player 8 | 22                                       | 24                                      |
| Player 9 | 30                                       | 30                                      |
| Player 10| 27                                       | 29                                      |
| Player 11| 24                                       | 25                                      |
| Player 12| 18                                       | 20                                      |
| Player 13| 16                                       | 17                                      |
| Player 14| 19                                       | 18                                      |
| Player 15| 19                                       | 18                                      |
| Player 16| 28                                       | 28                                      |
| Player 17| 24                                       | 26                                      |
| Player 18| 25                                       | 27                                      |
| Player 19| 25                                       | 27                                      |
| Player 20| 23                                       | 24                                      |

**[R Script: 4 Marks]**  
**Solution: 8 Marks**

---

##  8. One-Way ANOVA on Employee Ages
A company has three manufacturing plants. Officials want to determine if there is a difference in the average age of workers at the three locations. The table below provides the ages of five randomly selected workers at each plant. Perform a one-way ANOVA to test whether there is a significant difference in the mean ages of workers across the three plants. Use a significance level of \( \alpha = 0.01 \).

| Plant 1 | Plant 2 | Plant 3 |
|---------|---------|---------|
| 29      | 32      | 25      |
| 27      | 33      | 24      |
| 30      | 31      | 24      |
| 27      | 34      | 25      |
| 28      | 30      | 25      |

**[R Script: 4 Marks]**  
**Solution: 8 Marks**

---
