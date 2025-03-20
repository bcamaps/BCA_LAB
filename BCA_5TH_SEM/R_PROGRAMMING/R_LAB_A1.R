A <- rbind (c(1,2,3),c(1,2,3), c(1,3,2))
B <- rbind (c(1,2,3),c(2,3,4), c(1,3,2))
print(A)
print(B)
t(A)%*%B
S <- A%*%t(A)
print(S)
t(B)%*%S
S%*%t(B)
P<- B%*% t(B)
print(P)
C <- diag(x = 3)
print(C)
D <- 100*C
print(D)
E <- (P+S-D)
print(E)
H <- solve(E)
print(H)