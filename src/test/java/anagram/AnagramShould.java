package anagram;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramShould {

private static  Anagram anagram;

@BeforeAll
public static void setUp() {
        anagram = new Anagram();
}


@Test
public void should_return_true_when_inputs_are_of_same_length() {
final boolean isLengthMatch = anagrams("kata", "kata");

        assertTrue(isLengthMatch);
}

@Test
public void should_return_false_when_any_input_null() {
final boolean isAnagram = anagrams(null, "kata");

        assertFalse(isAnagram);
}

@Test
public void should_return_false_when_all_input_null() {
final boolean isAnagram = anagrams(null, null);

        assertFalse(isAnagram);
}

@Test
public void should_return_false_when_input_does_not_have_alphabets_only() {
final boolean isAnagram = anagrams("kata", "449");

        assertFalse(isAnagram);
}

@Test
public void should_return_false_when_input_is_alphanumeric() {
final boolean isAnagram = anagrams("kata", "923E");

        assertFalse(isAnagram);
}

@Test
public void should_return_false_when_characters_are_not_same_in_inputs() {
        boolean isAnagram = anagrams("kata", "kaza");

        assertFalse(isAnagram);
}

@Test
public void return_true_when_characters_frequency__matches() {
        boolean isAnagram = anagrams("William Shakespeare", "I am a weakish speller");

        assertTrue(isAnagram);
}

private boolean anagrams(final String input1, final String input2) {
        return anagram.isAnagram(input1, input2);
        }
}