"""

LIFO ---> Last in First Out

"""


class Stack:

    def __init__(self):
        self.items = []

    def push(self, value):
        """
        Add items to top most index 

        """
        self.items.append(value)

    def pop(self):
        """
            Remove items from top most index

        """
        while self.items[-1]:
            self.items.pop()
            break

    def isEmpty(self):
        """
        Check weather list is empty or not  

        """
        if self.items == []:
            return True
        else:
            return False

    def size(self):

        if self.items:

            return len(self.items)

        else:

            return None

    def peek(self):
        """
        Let us peek into the stack 

        """
        if self.items:
            return self.items[-1]

        else:
            return None


