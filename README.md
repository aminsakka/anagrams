# Anagrams

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
For example, the word binary  can be rearranged into brainy and the word adobe into abode.
The original word or phrase is known as the subject of the anagram. 
Any word or phrase that exactly reproduces the letters in another order is an anagram

The challenge is fairly simple: given a file containing one word per line, print out all the combinations of words that are anagrams; 
each line in the output contains all the words from the input that are anagrams of each other. 

A word is anagram when its having following :

1) should be of same length
2) should contains only alphabets
3) should contains characters exactly same and be used only once
4) should not match null or spaces

The algorithm :
5) Should print all the anagram pairs present in the input
6) Should remove already matched words to avoid check again and improve performance
