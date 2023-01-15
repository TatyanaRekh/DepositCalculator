import java.util.Scanner; //После команд import следует делать пустую строчку
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepositCalculation depositCalculation = new DepositCalculation ();

        System.out.println ("Введите сумму вклада в рублях:");
        double amount = scanner.nextInt();

        System.out.println ("Введите срок вклада в годах:") ;
        int depositPeriod = scanner.nextInt( );

        System.out.println ("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        int typeOfDeposit = scanner.nextInt();

        System.out.println("Результат вклада: " + amount + " за " + depositPeriod
                + " лет превратятся в " + depositCalculation.getFinalAmount (amount, depositPeriod, typeOfDeposit)); 
        //Отлично сделанный перенос! Я даже понял, что сам сделал здесь ошибку :)
    }
}
