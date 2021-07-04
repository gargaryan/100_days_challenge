inp="{[]{()}}"
stack=[]
for i in inp:
    if(i in ["{","[","("]):
        stack.append(i)
    elif(i =="}" and stack[-1]=="{"):
        stack.pop()
    elif (i=="]" and stack[-1]=="["):
        stack.pop()
    elif (i==")" and stack[-1]=="("):
        stack.pop()
    else:
        print("Not Balanced")
        break
if(len(stack)==0):
    print("Balanced")
