package chapter4;

import java.util.Date;
public class Book implements Comparable<Book>, Cloneable
{
	private String title;
	private Date publishDate;
	private String comment;

	//①
	public boolean equals( Object obj)
	{
		if( obj == this) return true;
		if( obj == null) return false;
		if(!(obj instanceof Book)) return false;
		Book b = (Book) obj;

		if(!this.title.equals(b.title))
		{
			return false;
		}

		if(!publishDate.equals(b.publishDate))
		{
			return false;
		}
		return true;
	}
	//②
	public int compareTo(Book obj)
	{
		return this.publishDate.compareTo(obj.publishDate);
	}

	//③
	public Book clone()
	{
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date) this.publishDate.clone();
		return b;
	}
}
