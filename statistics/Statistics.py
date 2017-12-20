from collections import Counter
def main():
    n=int(input())
    myList=[]

    myList=[int(x) for x in input().split()]
    
    print("Unsorted List")
    print(myList)
    
    #mean calculation
    sum=0
    for num in myList:
        sum+=int(num)
    mean=sum/n
    print("mean="+f'{mean:.1f}')

    #median calculation
    myList.sort()
    print("Sorted List")
    print(myList)
    if(n%2==0):
        median=(myList[n//2-1]+myList[(n//2)])/2
    else:
        median=(myList[n//2]/2-1)
    print("median="+f'{median:.1f}')

    #mode calculation
    max_count=max(myList.count(y) for y in myList)
    max_value=str([z for z in myList if myList.count(z)==max_count][0])
    print("mode="+max_value)

if __name__=="__main__":
    main()
