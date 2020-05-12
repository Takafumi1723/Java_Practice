package chapter4;

public class Account
{
	String accountNo;

	/*equals()のオーバーライドの定石[何を持ってイコールとするのかをオーバーライドで定める]
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)//引数はObject型にする
	{
		if(obj == this) return true;//自分自身が引数として渡されて来た場合は無条件でtrue
		if(obj == null) return false;//nullが引数として渡されてきた場合は無条件でfalse
		if(!(obj instanceof Account)) return false;//比較し型が異なるのならば、false
		Account r = (Account) obj;//１行上で型が同じであれば、次の行に備え比較のためにキャストする
		//2つのインスタンスが持つフィールド同時を比較して等価か判定する
		if(!this.accountNo.trim().equals(r.accountNo.trim()))
		{
			return false;
		}
		return true;
	}

}
