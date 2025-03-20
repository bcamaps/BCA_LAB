df<-data.frame(
    ItemCode = c(1001,1002,1003,1004,1005),
    ItemCategory = c("Electronics","Desktop Supplies","Offices Supplies","USB","CD Drive"),
    ItemPrice = c(700,300,350,400,800)
)
subset_a <-df[df$ItemPrice >= 350, ]
subset_b <-df[df$ItemCategory %in% c("Office Supplies","USB","CD Drive"),]
subset_c <-df[df$ItemPrice >= 300 & df$ItemPrice <= 700,]
total_price <- sum(df$ItemPrice)
item_details <-data.frame(
    ItemCode = c(1001,1002,1003,1004,1005),
    ItemQtyonHand = c(50,30,40,20,10),
    ItemRcorderLvl = c(10,20,15,30,5)
)
merged_df <- merge(df,item_details, by = "ItemCode")

print("Subset of item with price >=350: ")
print(subset_a)

print("Subset of item in 'Office Supplies' or 'Desktop Supplies' category: ")
print(subset_b)

print("Subset of item with price between 300 and 700 : ")
print(subset_c)

print(paste("Total sum of ItemPrice:",total_price))

print("Merged DataFrame: ")
print(merged_df)