#!/bin/python3

import sys
import re
lst=[]
N = int(input().strip())
for a0 in range(N):
    firstName,emailID = input().strip().split(' ')
    firstName,emailID = [str(firstName),str(emailID)]
    if re.search('@gmail\.com$',emailID):
        lst.append(firstName)
print(*sorted(lst),sep='\n')

#6 input
#riya riya@gmail.com
#julia julia@julia.me
#julia sjulia@gmail.com
#julia julia@gmail.com
#samantha samantha@gmail.com
#tanya tanya@gmail.com
