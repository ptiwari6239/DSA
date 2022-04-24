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
