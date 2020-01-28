import java.util.Scanner;

class Filip {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int inp1 = reverse(inp.nextInt());
    int inp2 = reverse(inp.nextInt());
    
    System.out.print((inp1 > inp2 ? inp1 : inp2));

  }
  public static int reverse(int inp) {
    int reversed = 0; 
    reversed += (inp % 10) * 100;
    inp = inp / 10;
    reversed += (inp % 10) * 10;
    reversed += (inp / 10);

    return reversed; 
  }
}