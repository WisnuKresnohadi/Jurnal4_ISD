import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<Data> listTugas = new LinkedList<>();

    public static void main(String[] args) {
        int pilihMenu = 0;
        while (pilihMenu != 4) {
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");
            pilihMenu = sc.nextInt();
            pilihMenu(pilihMenu);
        }
    }

    private static void pilihMenu(int pilihMenu) {
        int pilihMenu1 = 0;
        switch (pilihMenu) {
            case 1:
                System.out.println("1. Input Depan");
                System.out.println("2. Input Belakang");
                pilihMenu1 = sc.nextInt();
                pilihMenuInput(pilihMenu1);
                break;

            case 2:
                System.out.println("1. Delete Depan");
                System.out.println("2. Delete Belakang");
                System.out.println("3. Delete Tugas");
                pilihMenu1 = sc.nextInt();
                pilihMenuDelete(pilihMenu1);
                break;
            case 3:
                System.out.println("1. Print Depan");
                System.out.println("2. Print Belakang");
                pilihMenu1 = sc.nextInt();
                pilihMenuPrint(pilihMenu1);
                break;
        }
    }

    private static void pilihMenuInput(int pilihMenu) {
        String matkul, tugas, deadline;
        sc.nextLine();
        switch (pilihMenu) {
            case 1:
                System.out.print("Mata Kuliah : ");
                matkul = sc.nextLine();
                System.out.print("Tugas : ");
                tugas = sc.nextLine();
                System.out.print("Deadline : ");
                deadline = sc.nextLine();
                listTugas.addFirst(new Data(matkul, tugas, deadline));
                break;

            case 2:
                System.out.print("Mata Kuliah : ");
                matkul = sc.nextLine();
                System.out.print("Tugas : ");
                tugas = sc.nextLine();
                System.out.print("Deadline : ");
                deadline = sc.nextLine();
                listTugas.addLast(new Data(matkul, tugas, deadline));
                break;
        }
    }

    private static void pilihMenuDelete(int pilihMenu) {
        String matkul, tugas;
        switch (pilihMenu) {
            case 1:
                listTugas.removeFirst();
                break;

            case 2:
                listTugas.removeLast();
                break;
            case 3:
                sc.nextLine();
                System.out.print("Mata Kuliah : ");
                matkul = sc.nextLine();
                System.out.print("Tugas : ");
                tugas = sc.nextLine();
                ListIterator<Data> iterator = listTugas.listIterator();
                while (iterator.hasNext()) {
                    Data currentTugas = iterator.next();
                    
                    if (currentTugas.getMataKuliah().equalsIgnoreCase(matkul)
                            && currentTugas.getTugas().equalsIgnoreCase(tugas)) {
                        iterator.remove();
                        break;
                    }
                }
                break;
        }
    }

    private static void pilihMenuPrint(int MenuPrint) {
        ListIterator<Data> iterator = listTugas.listIterator();
        switch (MenuPrint) {
            case 1:
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                break;

            case 2:
                while (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                }
                break;
        }
    }
}
