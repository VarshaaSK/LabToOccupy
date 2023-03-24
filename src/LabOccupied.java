import java.util.Scanner;

public class LabOccupied {

    public static String LabBeingOccupied(int Lab1Capacity, int Lab2Capacity, int Lab3Capacity, int NumberOfStudents){

        int Lab1Occupied = Lab1Capacity - NumberOfStudents;
        int Lab2Occupied = Lab2Capacity - NumberOfStudents;
        int Lab3Occupied = Lab3Capacity - NumberOfStudents;

        int[] LabOccupied = new int[]{Lab1Occupied , Lab2Occupied, Lab3Occupied};
        int maximumCapacity = Integer.MAX_VALUE;
        for(int LabIterator = 0 ; LabIterator < LabOccupied.length ; LabIterator++){
            if(LabOccupied[LabIterator] < maximumCapacity && LabOccupied[LabIterator] > 0){
                maximumCapacity = LabOccupied[LabIterator];
            }
        }
        if(maximumCapacity == Lab1Occupied){
            return "L1";
        }
        if(maximumCapacity == Lab2Occupied){
            return "L2";
        }
        return "L3";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Lab1 Capacity : ");
        int lab1 = scan.nextInt();

        System.out.println("Enter Lab2 Capacity : ");
        int lab2 = scan.nextInt();

        System.out.println("Enter Lab3 Capacity : ");
        int lab3 = scan.nextInt();

        System.out.println("Enter the number of Students : ");
        int numberOfStudents = scan.nextInt();

        System.out.println(LabBeingOccupied(lab1,lab2,lab3,numberOfStudents));
    }
}