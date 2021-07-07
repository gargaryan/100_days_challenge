arr=[1,2,1,3,1,2,1]
l=0
d={}
r=len(arr)-1
while(l<r):
    if(arr[l] in d.keys()):
        d[arr[l]]+=1
        l+=1
    else:
        d[arr[l]]=1
        l+=1
    if(arr[r] in d.keys()):
        d[arr[r]]+=1
        r-=1
    else:
        d[arr[r]]=1
        r-=1
if(len(arr)%2==1):
    if(arr[l] in d.keys()):
        d[arr[l]]+=1
    else:
        d[arr[l]]=1
print(d)
        
    

    
    
