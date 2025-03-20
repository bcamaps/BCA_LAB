marital_status <- factor(c("Married", "single", "Divorced", "Married", "Single"))
print(marital_status)
element_2nd <- marital_status[2]
element_4th <- marital_status[4]
print(paste("2nd element: ", element_2nd))
print(paste("4th element: ", element_4th))
marital_status <- marital_status[-3]
print(marital_status)
marital_status[2] <- "Divorced"
marital_status
marital_status1 <- factor(marital_status, levels = c(levels(marital_status), "widowed"))
marital_status1
marital_status <- factor(marital_status, levels = c(levels(marital_status), "widowed"))
marital_status