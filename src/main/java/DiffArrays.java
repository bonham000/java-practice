
public class DiffArrays {
    public static boolean arrayHasItem(long[] array, long target) {
        for (long item:array) {
            if (item == target) {
                return true;
            }
        }
        return false;
    }
    // return items not shared between both arrays
    public static long[] diffArrays(long[] array1, long[] array2) {
        long resultSize = 0;
        for (long item:array1) if (!arrayHasItem(array2, item)) resultSize++;
        for (long item:array2) if (!arrayHasItem(array1, item)) resultSize++;
        long[] result = new long[(int)resultSize];

        int index = 0;
        for (long item:array1) {
            if (!arrayHasItem(array2, item)) {
                result[index] = item;
                index++;
            }
        }
        for (long item:array2) {
            if (!arrayHasItem(array1, item)) {
                result[index] = item;
                index++;
            }
        }
        return result;
    }
}
