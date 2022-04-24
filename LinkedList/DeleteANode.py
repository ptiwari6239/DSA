class node:

    def __init__(self, data):
        self.data = data
        self.next = None


class linkedlist:

    def __init__(self):
        self.head = None

    def insertion(self, value):
        nn = node(value)
        if self.head == None:
            self.head = nn
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = nn

    def view(self):

        if self.head == None:
            print("This is empty ")
        else:
            temp = self.head
            while temp != None:
                print(temp.data, end=' ')
                temp = temp.next

    def deletenode(self, data):
        temp = self.head
        if self.head.data == data:
            self.head = temp.next
        else:
            while temp.next.data != data:
                temp = temp.next
            temp.next = temp.next.next
