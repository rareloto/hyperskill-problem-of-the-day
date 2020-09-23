# https://hyperskill.org/learn/step/6487
# Operations with dictionary - Frequency Dictionary

# Read text input
text = input().split()

# Convert text to lower case and store in a new list
text_lower = [word.lower() for word in text]

# Count occurences per word
words_count = {word: text_lower.count(word) for word in text_lower}

# Print count per word
for word, count in words_count.items():
    print(word, count)
