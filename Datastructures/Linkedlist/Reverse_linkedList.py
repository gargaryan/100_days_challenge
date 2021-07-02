#reverse of  llinked list using  stack
class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
class linkedlist:
    def __init__(self):
        self.head=None
    def makingll(self,data):
        newnode =Node(data)
        if(self.head==None):
            self.head=newnode
        else:
            current=self.head
            while(current.next):
                current=current.next
            current.next=newnode
    def printll(self):
        
        if(self.head==None):
            print("Empty linkedlist")
        else:
            current=self.head
            while(current):
                print(current.data)
                current=current.next
    def reverse(self):
        if(self.head==None):
            print("Empty")
        else:
            stack=[]
            current=self.head
            while(current.next!=None):
                stack.append(current)
                current=current.next
            self.head=current
            print(self.head.data)
            while(len(stack)!=0):
                current.next=stack.pop()
                current=current.next
            current.next=None
            
        
            
                
            
                
                
            
ll=linkedlist()            
ll.makingll(1)
ll.makingll(2)
ll.makingll(3)
ll.makingll(4)
ll.makingll(5)
ll.reverse()
ll.printll()
