string = 'edinho'

def returnVowel(string):
    for letter in string:
        if letter in 'aeiou':
            print(letter)

returnVowel(string)