# string.py

def create_string():
    """Create and return a sample string."""
    return "Hello, World!"

def print_string(s):
    """Print the string."""
    print(s)

def string_length(s):
    """Return the length of the string."""
    return len(s)

def access_character(s, index):
    """Access and return a character at a specific index."""
    if 0 <= index < len(s):
        return s[index]
    else:
        return "Index out of range"

def string_slice(s, start, end):
    """Return a slice of the string from start to end (exclusive)."""
    return s[start:end]

def string_concatenation(s1, s2):
    """Concatenate two strings and return the result."""
    return s1 + s2

def string_repetition(s, n):
    """Repeat the string n times and return the result."""
    return s * n

def string_to_uppercase(s):
    """Convert the string to uppercase."""
    return s.upper()

def string_to_lowercase(s):
    """Convert the string to lowercase."""
    return s.lower()

def string_capitalize(s):
    """Capitalize the first character of the string."""
    return s.capitalize()

def string_strip(s):
    """Remove leading and trailing whitespace from the string."""
    return s.strip()

def string_split(s, delimiter=' '):
    """Split the string into a list of substrings."""
    return s.split(delimiter)

def string_join(lst, delimiter=''):
    """Join a list of strings into a single string."""
    return delimiter.join(lst)

def string_replace(s, old, new):
    """Replace all occurrences of 'old' with 'new' in the string."""
    return s.replace(old, new)

def string_find(s, substring):
    """Find the index of the first occurrence of substring."""
    return s.find(substring)

def string_count(s, substring):
    """Count the number of non-overlapping occurrences of substring."""
    return s.count(substring)

def string_startswith(s, prefix):
    """Check if the string starts with the given prefix."""
    return s.startswith(prefix)

def string_endswith(s, suffix):
    """Check if the string ends with the given suffix."""
    return s.endswith(suffix)

def string_isalpha(s):
    """Check if all characters in the string are alphabetic."""
    return s.isalpha()

def string_isdigit(s):
    """Check if all characters in the string are digits."""
    return s.isdigit()

def string_isalnum(s):
    """Check if all characters in the string are alphanumeric."""
    return s.isalnum()

def string_format(template, *args, **kwargs):
    """Format the string with the given arguments."""
    return template.format(*args, **kwargs)

# Example usage
if __name__ == "__main__":
    # Create a sample string
    my_string = create_string()
    print("Original string:")
    print_string(my_string)

    # String length
    print("\nString length:", string_length(my_string))

    # Accessing characters
    print("\nCharacter at index 0:", access_character(my_string, 0))
    print("Character at index 7:", access_character(my_string, 7))

    # String slicing
    print("\nSlice from index 0 to 5:", string_slice(my_string, 0, 5))

    # String concatenation
    print("\nConcatenation:", string_concatenation("Hello", " World"))

    # String repetition
    print("\nRepetition:", string_repetition("Hi ", 3))

    # Case conversion
    print("\nUppercase:", string_to_uppercase(my_string))
    print("Lowercase:", string_to_lowercase(my_string))
    print("Capitalized:", string_capitalize("hello world"))

    # Stripping whitespace
    print("\nStripped:", string_strip("  Hello, World!  "))

    # Splitting and joining
    words = string_split("Hello World Python")
    print("\nSplit string:", words)
    print("Joined string:", string_join(words, "-"))

    # Replacing substrings
    print("\nReplaced 'Hello' with 'Hi':", string_replace(my_string, "Hello", "Hi"))

    # Finding substrings
    print("\nIndex of 'World':", string_find(my_string, "World"))

    # Counting substrings
    print("\nCount of 'l':", string_count(my_string, "l"))

    # Checking prefixes and suffixes
    print("\nStarts with 'Hello':", string_startswith(my_string, "Hello"))
    print("Ends with '!':", string_endswith(my_string, "!"))

    # Checking string contents
    print("\nIs 'ABC' alphabetic?", string_isalpha("ABC"))
    print("Is '123' digit?", string_isdigit("123"))
    print("Is 'ABC123' alphanumeric?", string_isalnum("ABC123"))

    # String formatting
    print("\nFormatted string:", string_format("My name is {} and I'm {} years old", "Alice", 30))