class Marathon {
    private static int findMinTime(int[] times) {
        int minTime = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < minTime) {
                index = i;
                minTime = times[i];
            }
        }

        return index;
    }

    private static int findSecondMinTime(int[] times) {
        int minIndex = findMinTime(times);

        int secondIndex = -1;
        int secondTime = Integer.MAX_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (i == minIndex) {
                continue;
            }
            if (times[i] < secondTime) {
                secondIndex = i;
                secondTime = times[i];
            }
        }

        return secondIndex;
    }

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        int fastestRunnerIndex = findMinTime(times);
        int secondFastestRunnerIndex = findSecondMinTime(times);

        System.out.println("The fastest runner is: " + names[fastestRunnerIndex] + ": " + times[fastestRunnerIndex]);
        System.out.println("The second fastest runner is: " + names[secondFastestRunnerIndex] + ": " + times[secondFastestRunnerIndex]);
    }
} 