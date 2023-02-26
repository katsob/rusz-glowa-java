/*This exercise's code was baed on:
 https://javastart.pl/baza-wiedzy/java-zadania/zadanie-operatory-arytmetyczno-logiczne
 with minior changes
 */

class someNumbers {
    double a = 0;
    double b = 0;
    double c = 0;
    double Answer = 0;
}

class calc {
    public static void main(String[] args) {
        someNumbers n = new someNumbers();
        n.a = 5;
        n.b = 5;
        n.c = 5;
        System.out.println("Numbers selected for exercise:");
        System.out.println("A:" + n.a + " " + "B:" + n.b + " " + "C:" + n.c);

        System.out.println("Question 1");
        System.out.println("(A + B) * C = ?");
        n.Answer = (n.a + n.b) * n.c;
        System.out.println("Answer: " + n.Answer);

        System.out.println("Question 2");
        System.out.println("A - B / C = ?");
        n.Answer = (n.a - n.b) / n.c;
        System.out.println("Answer: " + n.Answer);
        n.a++;
        n.b++;
        n.c++;
        System.out.println("Question 3");
        System.out.println("After adding one to A,B and C, is it true that (A + B) > C?");
        System.out.println("After adding 1 to each A,B and C, we have:");
        System.out.println("A: " + n.a);
        System.out.println("B: " + n.b);
        System.out.println("C: " + n.c);
        n.Answer = n.a + n.b;
        if (n.Answer > n.c) {
            System.out.println("A+B equals " + n.Answer + ", therefore its bigger than C.");
        } else {
            System.out.println("A+B equals " + n.Answer + ", therefore its smaller than C.");
        }
        System.out.println("Question 4");
        System.out.println("Knowing all of this, is A equal B?");
        if (n.a == n.b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
