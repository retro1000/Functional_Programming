class Account(private val newAccNo:Int, private var startAmount:Float){
    private val accNo:Int=newAccNo
    private var amount:Float=startAmount

    def Deposit(count:Float):String = if(count>0){
                                            amount=count+amount;
                                            s"$count succesfully deposited.\nAccount amount: $amount \n\n";
                                        }else "Invalid input!!!"

    def Withdraw(count:Float):String = if(amount-count>0 && count>0){
                                            amount=amount-count;
                                            s"$count succesfully withdrawed\nAccount amount: $amount \n\n";
                                        }else "Account balance insufficient or invalid input!!!"

    def Transfer(count:Float, account:Account):String = if(count>0 && amount-count>0 && account != null){
                                                            amount=amount-count;
                                                            account.amount=account.amount+count;
                                                            s"$count succesfully transfered\nAccount amount: $amount \n\n";
                                                        }else "Account balance insufficient or invalid input!!!"
}

def main(args: Array[String]):Unit={
    val account_1 = new Account(1001, 45000.00)
    val account_2 = new Account(19001, 31000.00)

    println(account_1.Deposit(5000.00))
    println(account_1.Withdraw(20000.00))
    println(account_1.Transfer(10000.00, account_2))
}