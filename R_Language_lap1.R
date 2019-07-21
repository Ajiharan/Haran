#creating variables
a <- 2 
print(a)

x <-1:10
x[x < 5] #display values that are lesser than 5

#or statement
x[x < 9 | x > 5]

#and statement
x[x < 9 & x > 5]


y <-c(1,2,3,4)
y #out put

y1->y[y > 2]
y1 #out put

y2 <-c(4,2,3,1,7,0)
y3 <-y2[-3] #remove 3 from y2 and display

class(X) #out put "Integer"
class(Y) #out put "Numeric"

seq(1,15)#output 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
seq(1:15)#output 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

#factor

f <-c(1,2,4,"sd",20,4,2)
factor(f);

l <-list(name="A",age="23",marks = c(50,60,70))
l$name
l[["name"]]
l["name"]

l$marks
l[["marks"]]

l["marks"]


