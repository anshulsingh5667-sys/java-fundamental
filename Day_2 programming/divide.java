package cscorner;
public class divide{
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = totalPens / totalStudents;       // Division operator
        int remainingPens = totalPens % totalStudents;         // Modulus operator

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}

