package org.example;

import org.example.solutions.PlusOneSol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*IsPalindromeSol isPalindrome = new IsPalindromeSol();
        System.out.println(isPalindrome.isPalindromeInt(121));
        System.out.println(isPalindrome.isPalindromeString(125));*/

        /*RomanToIntSol romanToInt = new RomanToIntSol();
        System.out.println(romanToInt.RomanToInt("LVIII"));*/

        /*LongestCommonPrefixSol longestCommonPrefix = new LongestCommonPrefixSol();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));*/

        /*IsValidToSol isValidTo = new IsValidToSol();
        System.out.println(isValidTo.isValidTo("{{{{{{"));*/

        /*IsValidToSol2 isValidTo2 = new IsValidToSol2();
        System.out.println(isValidTo2.isValidTo2("{}"));*/

        /*IsValidToStackSol isValidToStack = new IsValidToStackSol();
        System.out.println(isValidToStack.isValidToStack("{}}"));*/

        /*MergeTwoListsSol mergeTwoLists = new MergeTwoListsSol();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        mergeTwoLists.mergeTwoLists(list1, list2);*/

        /*RemoveDuplicatesSol removeDuplicates = new RemoveDuplicatesSol();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1,2,2,3,4,4,5,6}));
        System.out.println(removeDuplicates.removeDuplicates2(new int[]{1,2,2,3,4,4,5,6}));*/

        /*RemoveElementSol removeElement = new RemoveElementSol();
        System.out.println(removeElement.removeElement(new int[]{1, 2, 3, 3, 5, 7, 3}, 3));*/

        /*FirstOccureInHaystackSol firstOccurInHaystack = new FirstOccureInHaystackSol();
        System.out.println(firstOccurInHaystack.strStr("bsabutsad", "sad"));*/

        /*SearchInsertSol searchInsert = new SearchInsertSol();
        System.out.println(searchInsert.searchInsert(new int[]{1, 2, 3, 6, 7}, 0));*/

        /*LengthOfLastWordSol lengthOfWord = new LengthOfLastWordSol();
        System.out.println(lengthOfWord.lengthOfLastWord("   fly me   to   the moon   "));  //last
        System.out.println(lengthOfWord.lengthOfLongestWord("alev narcin      sa id addadas"));  //long
        System.out.println(lengthOfWord.lengthOfLongestWord2("alev narcin      sa id addadas"));  //long
        System.out.println(lengthOfWord.lengthOfLongestWord3("alev narcin      sa id addadas"));  //long*/

        PlusOneSol plusOne = new PlusOneSol();
//        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne.plusOne2(new int[]{9, 9, 9, 9})));

    }


}