public abstract class AbstractBankAccount {
  //Instance Fields
  public final String BANK= "JavaBank";
  protected String accountName;
  protected int accountNum;
  protected int balance;


  //constructor for AbstractBankAccount
  public AbstractBankAccount(String name, int num, int amt)
  {
    accountName=name;
    accountNum=num;
    balance=amt;
  }//end constructor method


  //modifier to set the accountname
  public void setAccountName(String name)
  {
    accountName = name;
  }
  //modifier to set the accountnumber
  public void setAccountNum(int num)
  {
    accountNum = num;
  }
  //modifier to set the balance
  public void setBalance(int num)
  {
    balance = num;
  }
  //accessor to get the accountname
  public String getAccountName() {

    return accountName;
  }


  //accessor to get the accountnumber
  public int getAccountNum () {

    return accountNum;
  }


  //make a deposit to the balance
  public void deposit(int amt)
  {
    balance=balance+amt;
  }
  //make a withdrawal from the balance
  public void withdraw(int amt)
  {
    balance=balance-amt;
  }



  //accessor to get the account balance
  public int getBalance() {
    return balance;
  }


  public String getBankName() {
    return InterfaceBankAccount.BANK;
  }


  @Override
  public String toString()
  {
    return "\n\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance;
  }//end method toString



}//end class AbstractBankAccount