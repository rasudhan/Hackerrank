n=int(input())
phoneBook=dict(input().split() for _ in range(n))
#print(phoneBook)

contents = []
while True:
    try:
        line = input()
        if line=="":
            break
    except EOFError:
        break
    contents.append(line)

for k in contents:
    if k in phoneBook:
        print(k+"="+phoneBook[k])
    else:
        print("Not found")
    