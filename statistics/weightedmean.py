from functools import reduce
n=int(input())
x=[int(x) for x in input().split()]
w=[int(x) for x in input().split()]
w_sum=reduce((lambda x,y:x+y),w)
print(w_sum)
sum=list(map(lambda x,y:x*y,x,w))
sum_value=reduce((lambda x,y:x+y),sum)
print(sum_value)

weighted_mean=sum_value/w_sum

print('{:.1f}'.format(weighted_mean))
