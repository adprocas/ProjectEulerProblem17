package projecteulerproblem17;

/**
 *
 * @author Adam Leathorn
 */
public class ProjectEulerProblem17 {

    private static String[] numberNames;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numberNames = new String[1001];
        populateArray();

        long count = 0;

        for(int x = 0; x < 1001; x++) {
            count += numberNames[x].length();
        }

        System.out.println("number is: " + count);
    }
    
    public static void populateArray() {
        int x = 0;

        numberNames[x++] = "";
        numberNames[x++] = "one";
        numberNames[x++] = "two";
        numberNames[x++] = "three";
        numberNames[x++] = "four";
        numberNames[x++] = "five";
        numberNames[x++] = "six";
        numberNames[x++] = "seven";
        numberNames[x++] = "eight";
        numberNames[x++] = "nine";
        numberNames[x++] = "ten";

        numberNames[x++] = "eleven";
        numberNames[x++] = "twelve";
        numberNames[x++] = "thirteen";
        numberNames[x++] = "fourteen";
        numberNames[x++] = "fifteen";
        numberNames[x++] = "sixteen";
        numberNames[x++] = "seventeen";
        numberNames[x++] = "eighteen";
        numberNames[x++] = "nineteen";
        numberNames[x++] = "twenty";
        int tmp = x + 9;
        int last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "thirty";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "forty";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "fifty";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "sixty";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "seventy";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "eighty";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        numberNames[x++] = "ninety";
        tmp = x + 9;
        last = x-1;
        x = doNextTenSet(x, tmp, last);

        x = doHundredSets(x);

        numberNames[x++] = "onethousand";
    }

    public static int doNextTenSet(int x, int tmp, int last) {
        while(x < tmp) {
            int minusNum = x / 10;
            int indexNum = x - (minusNum*10);

            numberNames[x++] = numberNames[last] + numberNames[indexNum];
        }

        return x;
    }

    public static int doHundredSets(int x) {
        while(x < 1000) {
            int bigNum = x / 100;
            int littleNum = x - (bigNum*100);

            if(littleNum == 0)
                numberNames[x++] = numberNames[bigNum] + "hundred";
            else
                numberNames[x++] = numberNames[bigNum] + "hundredand" + numberNames[littleNum];
        }

        return x;
    }
}
