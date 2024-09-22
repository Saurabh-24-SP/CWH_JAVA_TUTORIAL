/**
 * CWH_2_C
 */
public class CWH_2_CGPA {
    public static void main(String[] args) {
        float total = 300;
        float CGPA;
        float percentage;
        float sub1 = 34;
        float sub2 = 43;
        float sub3 = 76;
        float sum = (sub1 + sub2 + sub3);

        System.out.println(sum);
        percentage = (sub1 + sub2 + sub3) / total * 100;
        System.out.println(percentage);
        CGPA = percentage / 10;
        System.out.println(CGPA);

    }

}