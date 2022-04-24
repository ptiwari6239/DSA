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

    def view(self):

        if self.start == None:
            print("This is empty ")
        else:
            temp = self.start
            while temp != None:
                print(temp.data, end=' ')
                temp = temp.next