# lists.py

def create_list():
    """Create and return a sample list."""
    return [1, 2, 3, 4, 5]

def print_list(lst):
    """Print all elements of the list."""
    for item in lst:
        print(item, end=" ")
    print()

def access_element(lst, index):
    """Access and return an element at a specific index."""
    if 0 <= index < len(lst):
        return lst[index]
    else:
        return "Index out of range"

def modify_element(lst, index, value):
    """Modify an element at a specific index."""
    if 0 <= index < len(lst):
        lst[index] = value
        return True
    else:
        return False

def append_element(lst, value):
    """Append an element to the end of the list."""
    lst.append(value)

def insert_element(lst, index, value):
    """Insert an element at a specific index."""
    lst.insert(index, value)

def remove_element(lst, value):
    """Remove the first occurrence of a specific value."""
    if value in lst:
        lst.remove(value)
        return True
    else:
        return False

def pop_element(lst, index=-1):
    """Remove and return the element at a specific index (default: last element)."""
    if lst:
        return lst.pop(index)
    else:
        return None

def list_length(lst):
    """Return the length of the list."""
    return len(lst)

def list_slice(lst, start, end):
    """Return a slice of the list from start to end (exclusive)."""
    return lst[start:end]

def reverse_list(lst):
    """Reverse the list in-place."""
    lst.reverse()

def sort_list(lst, reverse=False):
    """Sort the list in-place (default: ascending order)."""
    lst.sort(reverse=reverse)

def count_occurrences(lst, value):
    """Count the number of occurrences of a value in the list."""
    return lst.count(value)

def find_index(lst, value):
    """Find the index of the first occurrence of a value."""
    try:
        return lst.index(value)
    except ValueError:
        return -1

def concatenate_lists(lst1, lst2):
    """Concatenate two lists and return the result."""
    return lst1 + lst2

def list_comprehension_example(lst):
    """Demonstrate list comprehension by squaring each element."""
    return [x**2 for x in lst]

# Example usage
if __name__ == "__main__":
    my_list = create_list()
    print("Original list:")
    print_list(my_list)

    print("\nAccess element at index 2:", access_element(my_list, 2))

    modify_element(my_list, 1, 10)
    print("\nAfter modifying element at index 1:")
    print_list(my_list)

    append_element(my_list, 6)
    print("\nAfter appending 6:")
    print_list(my_list)

    insert_element(my_list, 0, 0)
    print("\nAfter inserting 0 at the beginning:")
    print_list(my_list)

    remove_element(my_list, 3)
    print("\nAfter removing 3:")
    print_list(my_list)

    popped = pop_element(my_list)
    print("\nPopped element:", popped)
    print("After popping:")
    print_list(my_list)

    print("\nList length:", list_length(my_list))

    print("\nSlice from index 1 to 3:")
    print_list(list_slice(my_list, 1, 3))

    reverse_list(my_list)
    print("\nReversed list:")
    print_list(my_list)

    sort_list(my_list)
    print("\nSorted list:")
    print_list(my_list)

    print("\nCount of 1:", count_occurrences(my_list, 1))

    print("\nIndex of 4:", find_index(my_list, 4))

    other_list = [7, 8, 9]
    concatenated = concatenate_lists(my_list, other_list)
    print("\nConcatenated list:")
    print_list(concatenated)

    squared = list_comprehension_example(my_list)
    print("\nSquared list:")
    print_list(squared)