#!/bin/python3

import sys


arr = []
for arr_i in range(6):
   arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
   arr.append(arr_t)

max=-81 #because -9 max value * 7(elements) = -63 (-81 just for safety)
sum=0
for r in range(0,4):
    for c in range(0,4):
        sum=arr[r][c]+arr[r][c+1]+arr[r][c+2]+arr[r+1][c+1]+arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2]
          
        if(max<sum):
            max=sum
       
    
print(max)  