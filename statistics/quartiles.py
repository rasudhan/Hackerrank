def median(myList):
     n=len(myList)
     if(n%2==0):
        median=(myList[n//2-1]+myList[(n//2)])/2
     else:
        median=(myList[n//2])
     result=print(f'{median:.1f}')
     return median


def main():
    #n=int(input())
    y=[int(x) for x in input().split()]
    y.sort()
    if(len(y)%2==0):
        lower_half=y[:int(len(y)/2)]
        upper_half=y[int(len(y)/2):]
        q2=median(y)        
    else:
        lower_half=y[:int(len(y)/2)]
        upper_half=y[int(len(y)/2)+1:]
        q2=y[int(len(y)/2)]

    q1=median(lower_half)
    q3=median(upper_half)
    print(lower_half)
    print(upper_half)
    
    print("q2=",q2)
    print(int(q1))
    print(int(q2))
    print(int(q3))

if __name__=="__main__":
    main()