#Next Greater Element
arr=[1,2,3,5]
stack=[]
d={}
for i in arr:
    if len(stack)==0:
        stack.append(i)
    else:
        while stack[-1]<i:
            ele=stack.pop()
            d[ele]=i
            if(len(stack)==0):
                stack.append(i)
                break
        else:
            stack.append(i)
if(len(stack)!=0):
    while(len(stack)>0):
        d[stack.pop()]=-1
        
print(d)
        
