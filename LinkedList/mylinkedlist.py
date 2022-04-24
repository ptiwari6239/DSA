class node:

    def __init__(self, data):
        self.data = data
        self.next = None


class ll:

    def __init__(self):
        self.start = None

    def insertion(self, value):
        nwnode = node(value)
        if self.start == None:
            self.start = nwnode
        else:
            temp = self.start
            while temp.next != None:
                temp = temp.next
            temp.next = nwnode

    def insertfirst(self, value):
        nn = node(value)
        if self.start == None:
            self.start = nn
        else:
            temp = self.start
            self.start = nn
            nn.next = temp

    def insertLast(self, value):
        newnode = node(value)
        if self.start == None:
            self.start = newnode
        else:
            temp = self.start
            while temp.next != None:
                temp = temp.next
            temp.next = newnode

    def deletelast(self):

        if self.start == None:
            print(' this is empty ')

        else:
            temp = self.start
            while temp.next.next != None:
                temp = temp.next
            temp.next = temp.next.next

    def deletefirst(self):
        if self.start == None:
            print("this is empty list ")
        else:
            self.start = self.start.next

    def view(self):

        if self.start == None:
            print("This is empty ")
        else:
            temp = self.start
            while temp != None:
                print(temp.data, end=' ')
                temp = temp.next

    def Length(self):
        temp = self.start
        lencount = 1
        while temp.next != None:
            lencount = lencount + 1
            temp = temp.next

        print(lencount)

    def viewele(self, pos):
        if self.start == None:
            print(" this is empty ")

        else:
            temp = self.start
            lencount = 1
            while temp.next != None:
                lencount = lencount + 1
                temp = temp.next

            if pos > lencount:
                print(" Invalid Length ")

            else:
                counter = 1
                temp = self.start
                while counter != pos:
                    temp = temp.next
                    counter = counter + 1
                print(temp.data, end=' ')

    def deleteEle(self, element):
        temp = self.start
        while temp.next.data != element:
            temp = temp.next
        temp.next = temp.next.next


