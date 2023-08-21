class Account(private val newAccNo:Int, private var startAmount:Double){
    private val accNo:Int = newAccNo
    private var amount:Double = startAmount

    val getAmount = ()=>amount
    val getAccNo = ()=>accNo
    val setAmount = (x:Double)=>amount=x
}

val negativeList = (accList:List[Account])=>accList.filter(account => account.getAmount() < 0.00)
val balance = (accList:List[Account])=>accList.map(account=>account.getAmount()).reduce((acc1, acc2)=>acc1+acc2)
val interest = (accList:List[Account])=>accList.map(account=>if(account.getAmount()>0) account.setAmount(account.getAmount()*(1.05)) else account.setAmount(account.getAmount()*(1.1)))

def main(args: Array[String]):Unit={
    val accountList:List[Account] = List(new Account(100, 20000.00), new Account(101, 10000.00), new Account(102, 50000.00), new Account(103, -100.00), new Account(104, -20000.00))

    negativeList(accountList).map(account=>println(account.getAccNo()+" - "+account.getAmount()))
    println("\n"+balance(accountList)+"\n")
    interest(accountList)
    accountList.map(account=>println(account.getAccNo()+" - "+account.getAmount()))
}