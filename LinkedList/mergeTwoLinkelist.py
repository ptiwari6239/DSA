class node:

    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:

    def __init__(self):
        self.head = None

    def Insert(self, value):
        nn = node(value)
        if self.head == None:
            self.head = nn
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = nn


def view(head):
    if head == None:
        print(" This is empty ")
    else:
        temp = head
        while temp != None:
            print(temp.data, end=' ')
            temp = temp.next


def merge(head1, head2):
    temp = head1
    while temp.next != None:
        temp = temp.next
    temp.next = head2

    return head1
