package oo;



public class UeberladenTest {

  public static void main(String[] args) {
    Console con = new Console();
    con.print("Hallo");
    con.print("PrÃ¤sentation","Themen");
    con.print("Obstliste","Apfel","Banane","Kiwi","Birne");
    con.print('*', 80);
    
    ModernConsole mCon = new ModernConsole();
    mCon.print(3, 5);
    mCon.print("Hallo");
    
  }

}

class Console {
  public Console() {
  }
  public Console(int counter) {
  }
  
  
  public void print(String message) {
    System.out.println("- " + message);
  }
  
  public void print(char zeichen, int anzahl) {
    for (int i = 0; i < anzahl; i++) {
      System.out.print(zeichen);
    }
    System.out.println();
  }
  
  public void print(String titel, String message) {
    System.out.println("############# " + titel + " #############");
    print(message);
  }
  
  public void print(String titel, String... themen) {
    System.out.println("############# " + titel + " #############");
    for (int i = 0; i < themen.length; i++) {
      print(themen[i]);
    }
  }
}
class ModernConsole extends Console {
  // eine Ãberladung (overload) von einer super-Methode
  public void print(int zahl1, int zahl2) {
  }
  
  // eine Ãberschreibung (override) von einer super-Methode
  public void print(String message) {

  }
}
