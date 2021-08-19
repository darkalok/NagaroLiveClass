package Session17;

public class Jumbles_wo_comments {

    private static boolean sol(String s1, String s2) {
        // TODO Auto-generated method stub

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freqArr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char cc1 = s1.charAt(i); //'h'
            int index1 = cc1 - 'a';

            freqArr[index1]++;

            char cc2 = s2.charAt(i);
            int index2 = cc2 - 'a';
            freqArr[index2]--;
        }

        for (int e : freqArr) {
            if (e != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1 = "hello";
        String s2 = "holle";

        System.out.println(sol(s1, s2));
    }

}
