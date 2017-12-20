
n=int(input())
inpStr=[]
for i in range(n):
    inpStr.append(input())
for str in inpStr:
    count=0
    oddStr=""
    evenStr=""
    for count,char in enumerate(str):
        if ((count)%2==0):
            evenStr+=char
        else:
            oddStr+=char
    newStr=evenStr+" "+oddStr        
    print(newStr)