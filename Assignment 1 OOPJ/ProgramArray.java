public class ProgramArray {
 private static void printRecord(int[] arr) {
 if (arr != null) {
 for( int element : arr )
 System.out.print(element+" ");
 }
 System.out.println();
 }
 public static void main(String[] args) {
 int[] arr = new int[] { 10, 20, 30 };
 Program.printRecord(arr);
 }
}
