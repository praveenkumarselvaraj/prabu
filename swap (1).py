x=input()
y=input()
x=int(x)
y=int(y)
x = x ^ y; 
y = x ^ y;
x = x ^ y;
print(x,end=" ")
print(y)


