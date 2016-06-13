package model;

public class Guitar {

  private String serialNumber;
  private double price;
  GuitarSpec spec;

  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }

  public Guitar() {
	// TODO Auto-generated constructor stub
}

public String getSerialNumber() {
    return serialNumber;
  }
public void setPrice(double price){
	this.price = price;
}
  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public GuitarSpec getSpec() {
    return spec;
  }

public String getbuilder() {
	// TODO Auto-generated method stub
	return null;
}

public String getmodel() {
	// TODO Auto-generated method stub
	return null;
}

public String gettype() {
	// TODO Auto-generated method stub
	return null;
}

public String getnumStrings() {
	// TODO Auto-generated method stub
	return null;
}

public String gettopwood() {
	// TODO Auto-generated method stub
	return null;
}

public String getbackwood() {
	// TODO Auto-generated method stub
	return null;
}
}
