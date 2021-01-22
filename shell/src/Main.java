import java.util.Scanner;

class Main {
  public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);
    boolean end = false;

    while(!end){
      System.out.println("Digite um comando:");
      String line = sc.nextLine();
      String[] cmd = line.split(" ");
      String comando = cmd[0];
     
      switch(comando){
        case "add":
					
        	break;
        case "show":
          
        	break;
        case "end":
        	break;
      }
    }
  }
}