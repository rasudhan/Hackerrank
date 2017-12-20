#!/bin/python3

import sys

n = int(input().strip())
x=[]
x=bin(n)[2:]
x=[int(i) for i in x]
print(x)
count=0
result=0

for i in x:
    #reset count when 0 is found
    if(i==0):
        count=0
    else:
        count=count+1
        result=max(result,count)

#Counting max number of consecutive one's   
print(result)