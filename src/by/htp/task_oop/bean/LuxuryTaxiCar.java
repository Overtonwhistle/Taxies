package by.htp.task_oop.bean;

public class LuxuryTaxiCar extends TaxiCar implements java.io.Serializable {

	public LuxuryTaxiCar() {
		super();
	}

	private static final long serialVersionUID = 1L;
	private boolean hasTV;
	private boolean hasWiFi;
	private boolean hasHeatedSeats;

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWiFi() {
		return hasWiFi;
	}

	public void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	public boolean isHasHeatedSeats() {
		return hasHeatedSeats;
	}

	public void setHasHeatedSeats(boolean hasHeatedSeats) {
		this.hasHeatedSeats = hasHeatedSeats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasHeatedSeats ? 1231 : 1237);
		result = prime * result + (hasTV ? 1231 : 1237);
		result = prime * result + (hasWiFi ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LuxuryTaxiCar other = (LuxuryTaxiCar) obj;
		if (hasHeatedSeats != other.hasHeatedSeats)
			return false;
		if (hasTV != other.hasTV)
			return false;
		if (hasWiFi != other.hasWiFi)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"LuxuryTaxiCar [hasTV=" + hasTV + ", hasWiFi=" + hasWiFi + ", hasHeatedSeats=" + hasHeatedSeats + "]";
	}

}
