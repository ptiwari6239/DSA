class node:

    def __init__(self, data):
        self.next = None
        self.data = data


class LLStack:

    def __init__(self):
        self.head = None

    def isEmpty(self):
        if self.head:
            return False
        else:
            return True

    def push(self, value):
        nwnode = node(value)
        temp = self.head
        if self.head == None:
            self.head = nwnode

        else:
            self.head = nwnode
            nwnode.next = temp

    def pop(self):
        if self.head.data == None:
            print(" List is empty ")
        else:
            self.head = self.head.next

    def peek(self):
        if self.head == None:
            print(" Empty Stack ")

        else:
            print(self.head.data)
