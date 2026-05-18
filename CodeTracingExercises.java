public class CodeTracingExercises {
    // ===================== BASIC ARITHMETIC =====================

    // 1. Basic Arithmetic
    public int basicArithmetic() {
        int x = 15;
        int y = 4;
        int z = x - y;
        int result = z * 2;
        return result;
    }

    // 2. Speed and Time
    public int speedAndTime() {
        int speed = 60;
        int time = 3;
        int distance = speed * time;
        return distance;
    }

    // 3. Price Calculation
    public int priceCalculation() {
        int price = 25;
        int quantity = 4;
        int discount = 10;
        int total = price * quantity - discount;
        return total;
    }

    // 4. Temperature Conversion
    public int temperatureConversion() {
        int celsius = 20;
        int fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    // 5. Simple Division
    public int simpleDivision() {
        int a = 50;
        int b = 10;
        int c = a / b;
        int result = c + 3;
        return result;
    }

    // 6. Area Calculation
    public int areaCalculation() {
        int length = 12;
        int width = 5;
        int area = length * width;
        int doubled = area * 2;
        return doubled;
    }

    // 7. Wage Calculator
    public int wageCalculator() {
        int hours = 8;
        int rate = 15;
        int pay = hours * rate;
        return pay;
    }

    // 8. Complex Arithmetic
    public int complexArithmetic() {
        int x = 7;
        int y = 3;
        int z = x + y;
        int result = z * z;
        return result;
    }

    // 9. Change Calculator
    public int changeCalculator() {
        int paid = 100;
        int cost = 73;
        int change = paid - cost;
        return change;
    }

    // 10. Points Scored
    public int pointsScored() {
        int touchdowns = 3;
        int fieldGoals = 2;
        int points = touchdowns * 7 + fieldGoals * 3;
        return points;
    }

    // ===================== FOR LOOPS =====================

    // 11. Simple Loop
    public int simpleLoop() {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // 12. Count to Six
    public int countToSix() {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // 13. Even Numbers
    public int evenNumbers() {
        int sum = 0;
        for (int i = 2; i <= 8; i += 2) {
            sum = sum + i;
        }
        return sum;
    }

    // 14. Starting at Five
    public int startingAtFive() {
        int sum = 0;
        for (int i = 5; i <= 9; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // 15. Multiplying Loop
    public int multiplyingLoop() {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = sum + i * 2;
        }
        return sum;
    }

    // 16. Countdown
    public int countdown() {
        int sum = 0;
        for (int i = 5; i >= 1; i--) {
            sum = sum + i;
        }
        return sum;
    } // 15

    // 17. Skip Counting
    public int skipCounting() {
        int sum = 0;
        for (int i = 3; i <= 12; i += 3) {
            sum = sum + i;
        }
        return sum;
    } //30

    // 18. Small Range
    public int smallRange() {
        int sum = 0;
        for (int i = 10; i <= 12; i++) {
            sum = sum + i;
        }
        return sum;
    } //33

    // 19. Zero Start
    public int zeroStart() {
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum = sum + i;
        }
        return sum;
    } //6

    // 20. Large Steps
    public int largeSteps() {
        int sum = 0;
        for (int i = 5; i <= 20; i += 5) {
            sum = sum + i;
        }
        return sum;
    }

    // ===================== CONDITIONALS =====================

    // 21. Conditional
    public int conditional() {
        int age = 16;
        int status;
        if (age >= 18) {
            status = 10;
        } else {
            status = 5;
        }
        return status;
    }

    // 22. Grade Check
    public int gradeCheck() {
        int score = 85;
        int grade;
        if (score >= 90) {
            grade = 1;
        } else {
            grade = 2;
        }
        return grade;
    }

    // 23. Temperature Check
    public int temperatureCheck() {
        int temp = 72;
        int comfort;
        if (temp > 75) {
            comfort = 20;
        } else {
            comfort = 10;
        }
        return comfort;
    }

    // 24. Speed Limit
    public int speedLimit() {
        int speed = 45;
        int ticket;
        if (speed > 55) {
            ticket = 100;
        } else {
            ticket = 0;
        }
        return ticket;
    }

    // 25. Passing Grade
    public int passingGrade() {
        int score = 73;
        int result;
        if (score >= 70) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    // 26. Age Categories
    public int ageCategories() {
        int age = 25;
        int category;
        if (age >= 21) {
            category = 3;
        } else {
            category = 2;
        }
        return category;
    }

    // 27. Balance Check
    public int balanceCheck() {
        int balance = 150;
        int status;
        if (balance < 100) {
            status = 0;
        } else {
            status = 1;
        }
        return status;
    }

    // 28. Simple Comparison
    public int simpleComparison() {
        int x = 12;
        int y;
        if (x == 10) {
            y = 5;
        } else {
            y = 15;
        }
        return y;
    }

    // 29. Discount Eligibility
    public int discountEligibility() {
        int purchase = 75;
        int discount;
        if (purchase >= 100) {
            discount = 20;
        } else {
            discount = 5;
        }
        return discount;
    }

    // 30. Negative Check
    public int negativeCheck() {
        int value = -3;
        int result;
        if (value < 0) {
            result = 0;
        } else {
            result = value;
        }
        return result;
    }

    // ===================== ARRAYS =====================

    // 31. Array Access
    public int arrayAccess() {
        int[] nums = {5, 10, 15, 20};
        int a = nums[1];
        int b = nums[3];
        int total = a + b;
        return total;
    }

    // 32. First and Last
    public int firstAndLast() {
        int[] scores = {100, 85, 92, 78, 95};
        int first = scores[0];
        int last = scores[4];
        int sum = first + last;
        return sum;
    }

    // 33. Middle Elements
    public int middleElements() {
        int[] values = {3, 7, 11, 15};
        int x = values[1];
        int y = values[2];
        int result = x * y;
        return result;
    }

    // 34. Price List
    public int priceList() {
        int[] prices = {25, 30, 15, 40};
        int item1 = prices[0];
        int item2 = prices[2];
        int total = item1 + item2;
        return total;
    }

    // 35. Three Elements
    public int threeElements() {
        int[] data = {8, 12, 6, 10};
        int sum = data[0] + data[1] + data[3];
        return sum;
    }

    // 36. Distance Calculation
    public int distanceCalculation() {
        int[] miles = {50, 75, 100, 25};
        int day1 = miles[1];
        int day2 = miles[2];
        int total = day1 + day2;
        return total;
    }

    // 37. Subtraction Access
    public int subtractionAccess() {
        int[] nums = {100, 40, 60, 20};
        int a = nums[0];
        int b = nums[1];
        int diff = a - b;
        return diff;
    }

    // 38. All Elements
    public int allElements() {
        int[] arr = {2, 4, 6, 8};
        int total = arr[0] + arr[1] + arr[2] + arr[3];
        return total;
    }

    // 39. First Three
    public int firstThree() {
        int[] values = {15, 20, 25, 30, 35};
        int sum = values[0] + values[1] + values[2];
        return sum;
    }

    // 40. Index Calculation
    public int indexCalculation() {
        int[] nums = {5, 15, 25, 35};
        int x = nums[2];
        int y = nums[0];
        int result = x - y;
        return result;
    }

    // ===================== MODULO OPERATOR =====================

    // 41. MOD Operation
    public int modOperation() {
        int n = 17;
        int x = n % 5;
        int y = x + 3;
        return y;
    }

    // 42. Remainder Check
    public int remainderCheck() {
        int num = 23;
        int rem = num % 7;
        int result = rem * 2;
        return result;
    }

    // 43. Division Remainder
    public int divisionRemainder() {
        int a = 50;
        int b = a % 8;
        int c = b + 10;
        return c;
    }

    // 44. Mod and Add
    public int modAndAdd() {
        int x = 29;
        int y = x % 4;
        int z = y + y;
        return z;
    }

    // 45. Large Modulo
    public int largeModulo() {
        int val = 100;
        int mod = val % 9;
        int out = mod + 5;
        return out;
    }

    // 46. Time Calculation
    public int timeCalculation() {
        int minutes = 125;
        int remainder = minutes % 60;
        return remainder;
    }

    // 47. Double Mod
    public int doubleMod() {
        int n = 37;
        int r1 = n % 10;
        int r2 = r1 % 3;
        return r2;
    }

    // 48. Mod Subtraction
    public int modSubtraction() {
        int x = 45;
        int y = x % 7;
        int z = 20 - y;
        return z;
    }

    // 49. Small Divisor
    public int smallDivisor() {
        int num = 14;
        int rem = num % 3;
        int ans = rem * 5;
        return ans;
    }

    // 50. Mod Chain
    public int modChain() {
        int a = 88;
        int b = a % 11;
        int c = b + 15;
        int d = c % 4;
        return d;
    }

    // ===================== WHILE LOOPS =====================

    // 51. While Loop
    public int whileLoop() {
        int x = 2;
        int count = 0;
        while (x < 10) {
            x = x * 2;
            count = count + 1;
        }
        return count; //
    } // In plain English: it counts how many times you need to double 2 before it reaches (or exceeds) 10.; 3

    // 52. Counting Up
    public int countingUp() {
        int x = 1;
        int count = 0;
        while (x < 20) {
            x = x + 4;
            count = count + 1;
        }
        return count;
    } //The method returns 5.In plain English: it counts how many times you can add 4 to 1 before reaching (or exceeding) 20.

    // 53. Tripling
    public int tripling() {
        int x = 1;
        int count = 0;
        while (x < 30) {
            x = x * 3;
            count = count + 1;
        }
        return count;
    }//4

    // 54. Adding Five
    public int addingFive() {
        int x = 0;
        int count = 0;
        while (x < 15) {
            x = x + 5;
            count = count + 1;
        }
        return count;
    }//3

    // 55. Double Plus One
    public int doublePlusOne() {
        int x = 1;
        int count = 0;
        while (x < 25) {
            x = x * 2 + 1;
            count = count + 1;
        }
        return count;
    }// 4

    // 56. Large Threshold
    public int largeThreshold() {
        int x = 5;
        int count = 0;
        while (x < 50) {
            x = x * 2;
            count = count + 1;
        }
        return count;
    }//4

    // 57. Adding Three
    public int addingThree() {
        int x = 2;
        int count = 0;
        while (x < 20) {
            x = x + 3;
            count = count + 1;
        }
        return count;
    }//6

    // 58. Value Accumulator
    public int valueAccumulator() {
        int x = 1;
        int sum = 0;
        while (x <= 5) {
            sum = sum + x;
            x = x + 1;
        }
        return sum;
    }// 15

    // 59. Countdown While
    public int countdownWhile() {
        int x = 20;
        int count = 0;
        while (x > 5) {
            x = x - 3;
            count = count + 1;
        }
        return count;
    }//5

    // 60. Small Increments
    public int smallIncrements() {
        int x = 0;
        int count = 0;
        while (x < 10) {
            x = x + 2;
            count = count + 1;
        }
        return count;
    }//5

    // ===================== LOOPS WITH CONDITIONALS =====================

    // 61. Counting Odds
    public int countingOdds() {
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                count = count + 1;
            }
        }
        return count;
    }//5

    // 62. Counting Evens
    public int countingEvens() {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 63. Multiples of Three
    public int multiplesOfThree() {
        int count = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                count = count + 1;
            }
        }
        return count;
    }//5

    // 64. Greater Than Five
    public int greaterThanFive() {
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            if (i > 5) {
                count = count + 1;
            }
        }
        return count;
    }//7

    // 65. Divisible by Four
    public int divisibleByFour() {
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 66. Less Than Ten
    public int lessThanTen() {
        int count = 0;
        for (int i = 5; i <= 15; i++) {
            if (i < 10) {
                count = count + 1;
            }
        }
        return count;
    }

    // 67. Odds in Range
    public int oddsInRange() {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 1) {
                count = count + 1;
            }
        }
        return count;
    }

    // 68. Multiples of Five
    public int multiplesOfFive() {
        int count = 0;
        for (int i = 1; i <= 25; i++) {
            if (i % 5 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 69. Even Count
    public int evenCount() {
        int count = 0;
        for (int i = 2; i <= 16; i++) {
            if (i % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }// 8 

    // 70. Sum of Odds
    public int sumOfOdds() {
        int sum = 0;
        for (int i = 1; i <= 7; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // ===================== STRING LENGTH =====================

    // 71. String Length
    public int stringLength() {
        String word = "PYTHON";
        int len = word.length();
        int result = len * 2;
        return result;
    }

    // 72. Word Length
    public int wordLength() {
        String word = "JAVA";
        int len = word.length();
        int result = len + 5;
        return result;
    }

    // 73. Name Length
    public int nameLength() {
        String name = "ALGORITHM";
        int len = name.length();
        int result = len * 3;
        return result;
    }

    // 74. Short String
    public int shortString() {
        String text = "CODE";
        int len = text.length();
        int result = len * len;
        return result;
    }

    // 75. String Calculation
    public int stringCalculation() {
        String word = "FUNCTION";
        int len = word.length();
        int result = len - 3;
        return result;
    }

    // 76. Long Word
    public int longWord() {
        String word = "PROGRAMMING";
        int len = word.length();
        int result = len + len;
        return result;
    }

    // 77. Variable Name
    public int variableName() {
        String word = "HELLO";
        int len = word.length();
        int result = len * 4;
        return result;
    }

    // 78. Double Length
    public int doubleLength() {
        String text = "LOOPS";
        int len = text.length();
        int doubled = len * 2;
        int result = doubled + 1;
        return result;
    }

    // 79. Triple Length
    public int tripleLength() {
        String word = "IF";
        int len = word.length();
        int result = len * 3 + 2;
        return result;
    }

    // 80. String Math
    public int stringMath() {
        String text = "ARRAY";
        int len = text.length();
        int result = len + 10;
        return result;
    }

    // ===================== NESTED CONDITIONALS =====================

    // 81. Nested Conditional
    public int nestedConditional() {
        int num = 12;
        int val;
        if (num > 10) {
            if (num % 3 == 0) {
                val = 15;
            } else {
                val = 10;
            }
        } else {
            val = 5;
        }
        return val;
    }

    // 82. Grade Evaluation
    public int gradeEvaluation() {
        int score = 85;
        int grade;
        if (score >= 80) {
            if (score >= 90) {
                grade = 1;
            } else {
                grade = 2;
            }
        } else {
            grade = 3;
        }
        return grade;
    }

    // 83. Age Category
    public int ageCategory() {
        int age = 25;
        int category;
        if (age >= 18) {
            if (age >= 65) {
                category = 30;
            } else {
                category = 20;
            }
        } else {
            category = 10;
        }
        return category;
    }

    // 84. Number Check
    public int numberCheck() {
        int x = 8;
        int result;
        if (x > 5) {
            if (x % 2 == 0) {
                result = 100;
            } else {
                result = 50;
            }
        } else {
            result = 25;
        }
        return result;
    }

    // 85. Temperature Status
    public int temperatureStatus() {
        int temp = 45;
        int status;
        if (temp > 32) {
            if (temp > 70) {
                status = 3;
            } else {
                status = 2;
            }
        } else {
            status = 1;
        }
        return status;
    }

    // 86. Value Range
    public int valueRange() {
        int num = 7;
        int code;
        if (num < 10) {
            if (num < 5) {
                code = 1;
            } else {
                code = 2;
            }
        } else {
            code = 3;
        }
        return code;
    }

    // 87. Score Bracket
    public int scoreBracket() {
        int score = 95;
        int bracket;
        if (score >= 90) {
            if (score >= 95) {
                bracket = 5;
            } else {
                bracket = 4;
            }
        } else {
            bracket = 3;
        }
        return bracket;
    }

    // 88. Divisibility Check
    public int divisibilityCheck() {
        int num = 20;
        int val;
        if (num > 15) {
            if (num % 5 == 0) {
                val = 25;
            } else {
                val = 20;
            }
        } else {
            val = 15;
        }
        return val;
    }

    // 89. Double Threshold
    public int doubleThreshold() {
        int x = 30;
        int result;
        if (x >= 20) {
            if (x >= 40) {
                result = 3;
            } else {
                result = 2;
            }
        } else {
            result = 1;
        }
        return result;
    }

    // 90. Even or Odd Path
    public int evenOrOddPath() {
        int num = 14;
        int path;
        if (num % 2 == 0) {
            if (num > 10) {
                path = 8;
            } else {
                path = 4;
            }
        } else {
            path = 2;
        }
        return path;
    }

    // ===================== ARRAY LOOPS =====================

    // 91. Array Sum
    public int arraySum() {
        int[] data = {2, 4, 6, 8};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }

    // 92. Five Elements
    public int fiveElements() {
        int[] nums = {5, 10, 15, 20, 25};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return total;
    }

    // 93. Small Array
    public int smallArray() {
        int[] values = {3, 7, 11};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        return total;
    }

    // 94. Sales Total
    public int salesTotal() {
        int[] sales = {100, 200, 150, 175};
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    // 95. Score Sum
    public int scoreSum() {
        int[] scores = {88, 92, 85, 90};
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }
        return total;
    }

    // 96. Large Array
    public int largeArray() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }

    // 97. Double Values
    public int doubleValues() {
        int[] nums = {10, 20, 30};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return total;
    }

    // 98. Mixed Values
    public int mixedValues() {
        int[] values = {7, 14, 21, 28};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        return total;
    }

    // 99. Temperature Readings
    public int temperatureReadings() {
        int[] temps = {65, 70, 68, 72, 69};
        int total = 0;
        for (int i = 0; i < temps.length; i++) {
            total = total + temps[i];
        }
        return total;
    }

    // 100. Distance Array
    public int distanceArray() {
        int[] miles = {25, 30, 45, 50};
        int total = 0;
        for (int i = 0; i < miles.length; i++) {
            total = total + miles[i];
        }
        return total;
    }

    // ===================== BREAK STATEMENTS =====================

    // 101. Loop with BREAK
    public int loopWithBreak() {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x = x + i;
            if (x > 15) {
                break;
            }
        }
        return x;
    } // 21

    // 102. Break at Twenty
    public int breakAtTwenty() {
        int x = 0;
        for (int i = 1; i <= 15; i++) {
            x = x + i;
            if (x > 20) {
                break;
            }
        }
        return x;
    }//21

    // 103. Early Exit
    public int earlyExit() {
        int x = 0;
        for (int i = 2; i <= 20; i += 2) {
            x = x + i;
            if (x > 10) {
                break;
            }
        }
        return x;
    }

    // 104. Sum Until Thirty
    public int sumUntilThirty() {
        int x = 0;
        for (int i = 5; i <= 50; i += 5) {
            x = x + i;
            if (x >= 30) {
                break;
            }
        }
        return x;
    }

    // 105. Product Break
    public int productBreak() {
        int x = 1;
        for (int i = 2; i <= 10; i++) {
            x = x * i;
            if (x > 50) {
                break;
            }
        }
        return x;
    }

    // 106. Counter Break
    public int counterBreak() {
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            count = count + 1;
            if (i * i > 50) {
                break;
            }
        }
        return count;
    }

    // 107. Small Threshold
    public int smallThreshold() {
        int x = 0;
        for (int i = 1; i <= 8; i++) {
            x = x + i;
            if (x > 12) {
                break;
            }
        }
        return x;
    }// 15

    // 108. Accumulate and Break
    public int accumulateAndBreak() {
        int x = 5;
        for (int i = 1; i <= 10; i++) {
            x = x + i;
            if (x > 25) {
                break;
            }
        }
        return x;
    }//26

    // 109. Triple Break
    public int tripleBreak() {
        int x = 0;
        for (int i = 3; i <= 30; i += 3) {
            x = x + i;
            if (x >= 18) {
                break;
            }
        }
        return x;
    }

    // 110. Large Loop Break
    public int largeLoopBreak() {
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            x = x + i;
            if (x > 45) {
                break;
            }
        }
        return x;
    }

    // ===================== VARIABLE SWAPS =====================

    // 111. Multiple Variables
    public int multipleVariables() {
        int a = 3;
        int b = 7;
        int temp = a;
        a = b;
        b = temp;
        int result = a + b;
        return result;
    }

    // 112. Simple Swap
    public int simpleSwap() {
        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
        int result = x - y;
        return result;
    }

    // 113. Three Variable Rotation
    public int threeVariableRotation() {
        int a = 5;
        int b = 10;
        int c = 15;
        int temp = a;
        a = b;
        b = c;
        c = temp;
        int result = a + b + c;
        return result;
    }

    // 114. Variable Exchange
    public int variableExchange() {
        int x = 12;
        int y = 8;
        int temp = x;
        x = y;
        y = temp;
        int result = x * y;
        return result;
    }

    // 115. Double Swap
    public int doubleSwap() {
        int a = 4;
        int b = 9;
        int temp = a;
        a = b;
        b = temp;
        temp = a;
        a = b;
        b = temp;
        int result = a + b;
        return result;
    }

    // 116. Increment and Swap
    public int incrementAndSwap() {
        int x = 5;
        int y = 10;
        x = x + 5;
        int temp = x;
        x = y;
        y = temp;
        int result = x + y;
        return result;
    }

    // 117. Chain Assignment
    public int chainAssignment() {
        int a = 8;
        int b = 12;
        int c = a;
        a = b;
        b = c + 2;
        int result = a + b;
        return result;
    }

    // 118. Modified Swap
    public int modifiedSwap() {
        int x = 15;
        int y = 25;
        int temp = x * 2;
        x = y;
        y = temp;
        int result = x + y;
        return result;
    }

    // 119. Complex Exchange
    public int complexExchange() {
        int a = 6;
        int b = 14;
        int temp = a + b;
        a = b;
        b = temp - a;
        int result = a + b;
        return result;
    }

    // 120. Multi-Step Swap
    public int multiStepSwap() {
        int x = 7;
        int y = 13;
        int z = 20;
        int temp = x;
        x = y;
        y = z;
        z = temp;
        int result = x + y + z;
        return result;
    }

    // ===================== ARRAY FILTERING =====================

    // 121. Counting Evens
    public int countingEvensArray() {
        int[] values = {1, 4, 7, 10, 13, 16};
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }// 3

    // 122. Count Larger Values
    public int countLargerValues() {
        int[] nums = {5, 12, 8, 15, 3, 20};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10) {
                count = count + 1;
            }
        }
        return count;
    }//3

    // 123. Multiples of Three Count
    public int multiplesOfThreeCount() {
        int[] data = {3, 7, 9, 11, 12, 15};
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 3 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 124. Count Small Numbers
    public int countSmallNumbers() {
        int[] values = {2, 8, 5, 12, 4, 9};
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 7) {
                count = count + 1;
            }
        }
        return count;
    }

    // 125. Odd Number Count
    public int oddNumberCount() {
        int[] nums = {2, 5, 8, 11, 14, 17};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                count = count + 1;
            }
        }
        return count;
    }

    // 126. Count Divisible by Five
    public int countDivisibleByFive() {
        int[] values = {5, 8, 10, 13, 15, 20};
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 5 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 127. Greater Than Fifteen
    public int greaterThanFifteen() {
        int[] data = {10, 18, 12, 20, 14, 22};
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 15) {
                count = count + 1;
            }
        }
        return count;
    }

    // 128. Even Count Small Array
    public int evenCountSmallArray() {
        int[] nums = {3, 6, 9, 12};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // 129. Less Than Twenty
    public int lessThanTwenty() {
        int[] values = {15, 22, 18, 25, 12, 30};
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 20) {
                count = count + 1;
            }
        }
        return count;
    }

    // 130. Sum of Evens
    public int sumOfEvens() {
        int[] nums = {2, 5, 8, 11, 14};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    // ===================== CHARACTER COUNTING =====================

    // 131. Character Count
    public int characterCount() {
        String text = "HELLO";
        String target = "L";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 132. Count A's
    public int countAs() {
        String text = "BANANA";
        String target = "A";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 133. Count M's
    public int countMs() {
        String text = "PROGRAMMING";
        String target = "M";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 134. Count S's
    public int countSs() {
        String text = "MISSISSIPPI";
        String target = "S";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 135. Count E's
    public int countEs() {
        String text = "EXERCISE";
        String target = "E";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 136. Count T's
    public int countTs() {
        String text = "ATTRIBUTE";
        String target = "T";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 137. Count R's
    public int countRs() {
        String text = "ARRAY";
        String target = "R";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 138. Count O's in LOOP
    public int countOs() {
        String text = "LOOP";
        String target = "O";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 139. Count I's
    public int countIs() {
        String text = "INITIATIVE";
        String target = "I";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // 140. Count N's
    public int countNs() {
        String text = "IGNON";
        String target = "N";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target.charAt(0)) {
                count = count + 1;
            }
        }
        return count;
    }

    // ===================== LOOP PRODUCTS =====================

    // 141. Loop Product
    public int loopProduct() {
        int product = 1;
        for (int i = 2; i <= 4; i++) {
            product = product * i;
        }
        return product;
    }

    // 142. Multiply to Five
    public int multiplyToFive() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product = product * i;
        }
        return product;
    }

    // 143. Small Product
    public int smallProduct() {
        int product = 1;
        for (int i = 3; i <= 5; i++) {
            product = product * i;
        }
        return product;
    }

    // 144. Product of Three
    public int productOfThree() {
        int product = 2;
        for (int i = 2; i <= 4; i++) {
            product = product * i;
        }
        return product;
    }

    // 145. Even Product
    public int evenProduct() {
        int product = 1;
        for (int i = 2; i <= 6; i += 2) {
            product = product * i;
        }
        return product;
    }

    // 146. Range Product
    public int rangeProduct() {
        int product = 1;
        for (int i = 4; i <= 6; i++) {
            product = product * i;
        }
        return product;
    }

    // 147. Large Product
    public int largeProduct() {
        int product = 1;
        for (int i = 1; i <= 6; i++) {
            product = product * i;
        }
        return product;
    }

    // 148. Starting Product
    public int startingProduct() {
        int product = 5;
        for (int i = 2; i <= 3; i++) {
            product = product * i;
        }
        return product;
    }

    // 149. Triple Product
    public int tripleProduct() {
        int product = 1;
        for (int i = 3; i <= 9; i += 3) {
            product = product * i;
        }
        return product;
    }

    // 150. Two Numbers
    public int twoNumbers() {
        int product = 1;
        for (int i = 7; i <= 8; i++) {
            product = product * i;
        }
        return product;
    }

    // ===================== MIN AND MAX =====================

    // 151. Find Minimum
    public int findMinimum() {
        int[] nums = {8, 3, 12, 5, 9};
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    // 152. Find Maximum
    public int findMaximum() {
        int[] nums = {8, 3, 12, 5, 9};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // 153. Small Array Min
    public int smallArrayMin() {
        int[] values = {15, 7, 22};
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    // 154. Score Minimum
    public int scoreMinimum() {
        int[] scores = {92, 85, 78, 88, 95};
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    // 155. Temperature Minimum
    public int temperatureMinimum() {
        int[] temps = {72, 68, 75, 65, 70};
        int min = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
            }
        }
        return min;
    }

    // 156. Price Maximum
    public int priceMaximum() {
        int[] prices = {25, 40, 15, 35, 30};
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        return max;
    }

    // 157. Large Array Min
    public int largeArrayMin() {
        int[] data = {45, 32, 67, 21, 54, 19};
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    // 158. Four Elements Max
    public int fourElementsMax() {
        int[] nums = {10, 25, 18, 30};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // 159. Distance Minimum
    public int distanceMinimum() {
        int[] miles = {50, 35, 60, 40, 45};
        int min = miles[0];
        for (int i = 1; i < miles.length; i++) {
            if (miles[i] < min) {
                min = miles[i];
            }
        }
        return min;
    }

    // 160. Age Maximum
    public int ageMaximum() {
        int[] ages = {25, 42, 31, 55, 38};
        int max = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > max) {
                max = ages[i];
            }
        }
        return max;
    }

    // ===================== BOOLEAN LOGIC =====================

    // 161. Boolean Logic
    public int booleanLogic() {
        int x = 7;
        int y = 14;
        int result;
        if (x < 10 && y > 10) {
            result = x + y;
        } else {
            result = x * 2;
        }
        return result;
    }

    // 162. OR Logic
    public int orLogic() {
        int x = 5;
        int y = 8;
        int result;
        if (x > 10 || y > 5) {
            result = x + y;
        } else {
            result = 0;
        }
        return result;
    }

    // 163. Double AND
    public int doubleAnd() {
        int a = 12;
        int b = 20;
        int result;
        if (a > 10 && b > 15) {
            result = a * b;
        } else {
            result = a + b;
        }
        return result;
    }

    // 164. Mixed Logic
    public int mixedLogic() {
        int x = 15;
        int y = 5;
        int result;
        if (x > 10 && y < 10) {
            result = x - y;
        } else {
            result = x + y;
        }
        return result;
    }

    // 165. OR with Small Values
    public int orWithSmallValues() {
        int x = 3;
        int y = 4;
        int result;
        if (x > 5 || y > 5) {
            result = 100;
        } else {
            result = 50;
        }
        return result;
    }

    // 166. Complex AND
    public int complexAnd() {
        int a = 25;
        int b = 30;
        int result;
        if (a >= 20 && b >= 25) {
            result = a + b;
        } else {
            result = 0;
        }
        return result;
    }

    // 167. Both Conditions False
    public int bothConditionsFalse() {
        int x = 8;
        int y = 12;
        int result;
        if (x > 10 && y > 15) {
            result = 20;
        } else {
            result = 10;
        }
        return result;
    }

    // 168. OR True Path
    public int orTruePath() {
        int x = 15;
        int y = 3;
        int result;
        if (x > 10 || y > 10) {
            result = x * 2;
        } else {
            result = y * 2;
        }
        return result;
    }

    // 169. Equal Comparisons
    public int equalComparisons() {
        int x = 10;
        int y = 10;
        int result;
        if (x == 10 && y == 10) {
            result = x + y;
        } else {
            result = 0;
        }
        return result;
    }

    // 170. Less Than AND
    public int lessThanAnd() {
        int x = 6;
        int y = 9;
        int result;
        if (x < 10 && y < 10) {
            result = x * y;
        } else {
            result = x + y;
        }
        return result;
    }

    // ===================== NESTED LOOPS =====================

    // 171. Nested Loop
    public int nestedLoop() {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                count = count + 1;
            }
        }
        return count;
    }

    // 172. Sum Nested Loop
    public int sumNestedLoop() {
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // 173. Product Nested
    public int productNested() {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                count = count + 1;
            }
        }
        return count;
    }

    // 174. Small Nested Loop
    public int smallNestedLoop() {
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                sum = sum + i + j;
            }
        }
        return sum;
    }

    // 175. Adding i and j
    public int addingIAndJ() {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                sum = sum + i + j;
            }
        }
        return sum;
    }

    // 176. Multiplication Table
    public int multiplicationTable() {
        int sum = 0;
        for (int i = 2; i <= 3; i++) {
            for (int j = 2; j <= 3; j++) {
                sum = sum + i * j;
            }
        }
        return sum;
    }

    // 177. Large Nested Count
    public int largeNestedCount() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                count = count + 1;
            }
        }
        return count;
    }

    // 178. Accumulate j
    public int accumulateJ() {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                sum = sum + j;
            }
        }
        return sum;
    }

    // 179. Nested Addition
    public int nestedAddition() {
        int total = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 5; j++) {
                total = total + 1;
            }
        }
        return total;
    }

    // 180. Complex Nested
    public int complexNested() {
        int sum = 0;
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // ===================== ARRAY MODIFICATION =====================

    // 181. Array Modification
    public int arrayModification() {
        int[] scores = {10, 20, 30};
        scores[1] = scores[1] + 5;
        scores[2] = scores[0] * 2;
        int sum = scores[0] + scores[1];
        sum = sum + scores[2];
        return sum;
    }

    // 182. Double Element
    public int doubleElement() {
        int[] nums = {5, 10, 15};
        nums[0] = nums[0] * 2;
        nums[2] = nums[1] + 5;
        int total = nums[0] + nums[1] + nums[2];
        return total;
    }

    // 183. Increment Array
    public int incrementArray() {
        int[] values = {8, 12, 16};
        values[0] = values[0] + 2;
        values[1] = values[1] + 3;
        values[2] = values[2] + 4;
        int sum = values[0] + values[1] + values[2];
        return sum;
    }

    // 184. Swap Array Elements
    public int swapArrayElements() {
        int[] data = {10, 20, 30};
        int temp = data[0];
        data[0] = data[2];
        data[2] = temp;
        int result = data[0] + data[2];
        return result;
    }

    // 185. Multiply and Add
    public int multiplyAndAdd() {
        int[] nums = {3, 6, 9};
        nums[1] = nums[0] * 3;
        nums[2] = nums[1] + nums[0];
        int total = nums[0] + nums[1] + nums[2];
        return total;
    }

    // 186. Array Reset
    public int arrayReset() {
        int[] arr = {15, 25, 35};
        arr[0] = arr[1] - 10;
        arr[2] = arr[0] + arr[1];
        int sum = arr[0] + arr[1] + arr[2];
        return sum;
    }

    // 187. Four Element Modification
    public int fourElementModification() {
        int[] values = {2, 4, 6, 8};
        values[1] = values[0] * 3;
        values[3] = values[2] + 2;
        int total = values[1] + values[3];
        return total;
    }

    // 188. Subtract and Store
    public int subtractAndStore() {
        int[] nums = {50, 30, 20};
        nums[2] = nums[0] - nums[1];
        nums[1] = nums[2] + 10;
        int result = nums[0] + nums[1] + nums[2];
        return result;
    }

    // 189. Chain Modifications
    public int chainModifications() {
        int[] data = {5, 10, 15};
        data[0] = data[1];
        data[1] = data[2];
        data[2] = data[0] + 5;
        int sum = data[0] + data[1] + data[2];
        return sum;
    }

    // 190. Complex Update
    public int complexUpdate() {
        int[] arr = {12, 18, 24};
        arr[0] = arr[0] / 2;
        arr[2] = arr[1] * 2;
        int total = arr[0] + arr[1] + arr[2];
        return total;
    }

    // ===================== ACCUMULATOR PATTERN =====================

    // 191. Accumulator Pattern
    public int accumulatorPattern() {
        int[] values = {3, 6, 9, 12};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 3 == 0) {
                total = total + values[i];
            }
        }
        return total;
    }

    // 192. Sum Even Values
    public int sumEvenValues() {
        int[] nums = {2, 5, 8, 11, 14};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                total = total + nums[i];
            }
        }
        return total;
    }

    // 193. Sum Large Numbers
    public int sumLargeNumbers() {
        int[] data = {5, 12, 8, 15, 3, 20};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 10) {
                total = total + data[i];
            }
        }
        return total;
    }

    // 194. Sum Divisible by Five
    public int sumDivisibleByFive() {
        int[] values = {5, 8, 10, 13, 15, 20};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 5 == 0) {
                total = total + values[i];
            }
        }
        return total;
    }

    // 195. Sum Odd Values
    public int sumOddValues() {
        int[] nums = {1, 4, 7, 10, 13, 16};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                total = total + nums[i];
            }
        }
        return total;
    }

    // 196. Sum Small Values
    public int sumSmallValues() {
        int[] data = {3, 15, 6, 20, 4, 18};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 10) {
                total = total + data[i];
            }
        }
        return total;
    }

    // 197. Sum Multiples of Four
    public int sumMultiplesOfFour() {
        int[] values = {4, 7, 8, 11, 12, 16};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 4 == 0) {
                total = total + values[i];
            }
        }
        return total;
    }

    // 198. Sum Greater Than Fifteen
    public int sumGreaterThanFifteen() {
        int[] nums = {10, 18, 12, 22, 14, 25};
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 15) {
                total = total + nums[i];
            }
        }
        return total;
    }

    // 199. Sum Even Positions
    public int sumEvenPositions() {
        int[] data = {5, 10, 15, 20, 25, 30};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                total = total + data[i];
            }
        }
        return total;
    }

    // 200. Conditional Product
    public int conditionalProduct() {
        int[] values = {2, 5, 4, 7, 6};
        int product = 1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                product = product * values[i];
            }
        }
        return product;
    }
}
