package com.springcloud.order;

/**
 * @author huogongchen
 * @since 2024.6.21
 */
public class CandyCrushLetter {
    public void example(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        if (input.length() < 3) {
            System.out.println(input);
            return;
        }
        if (lengthEquals3(input)) {
            return;
        }
        int leftPointer = 0;
        int rightPointer = leftPointer + 1;
        while (leftPointer < input.length() - 1) {
            if (lengthEquals3(input)) {
                return;
            }
            while (input.charAt(leftPointer) == input.charAt(rightPointer)) {
                rightPointer++;
            }
            if (rightPointer - leftPointer >= 3) {
                String temp = input;
                input = temp.substring(0, leftPointer).concat(temp.substring(rightPointer, input.length()));
                System.out.println(input);
                leftPointer = 0;
            } else {
                leftPointer++;
            }
            rightPointer = leftPointer + 1;
        }
    }

    private boolean lengthEquals3(String input) {
        if (input.length() == 3) {
            if (input.charAt(0) == input.charAt(1) && input.charAt(1) == input.charAt(2)) {
                System.out.println();
            } else {
                System.out.println(input);
            }
            return true;
        }
        return false;
    }
}