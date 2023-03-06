import java.sql.Date;
import java.util.ArrayList;

public class Invoice {
	private int invoiceNo;
	private Date date;
	private String customerName;
	private ArrayList<Product> items;
	private double total;

	public Invoice(int invoiceNo, Date date, String customerName) {
		this.invoiceNo = invoiceNo;
		this.date = date;
		this.customerName = customerName;
		this.items = new ArrayList<Product>();
		this.total = 0;
	}

	public void addItem(Product item) {
		this.items.add(item);
		this.total += item.getPrice();
	}

	public int getInvoiceNo() {
		return this.invoiceNo;
	}

	public Date getDate() {
		return this.date;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public ArrayList<Product> getItems() {
		return this.items;
	}

	public double getTotal() {
		return this.total;
	}
}
