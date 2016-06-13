package model;

import model.Builder;
import model.Type;
import model.Wood;

public class GuitarSpec {
 
  private String builder; 
  private String model;
  private String type;
  private int numStrings;
  private String backWood;
  private String topWood;
public String getBuilder() {
	return builder;
}
public void setBuilder(String builder) {
	this.builder = builder;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getNumStrings() {
	return numStrings;
}
public void setNumStrings(int numStrings) {
	this.numStrings = numStrings;
}
public String getBackWood() {
	return backWood;
}
public void setBackWood(String backWood) {
	this.backWood = backWood;
}
public String getTopWood() {
	return topWood;
}
public void setTopWood(String topWood) {
	this.topWood = topWood;
}

  public GuitarSpec(String builder, String model, String type,
                    int numStrings, String backWood, String topWood) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.numStrings = numStrings;
    this.backWood = backWood;
    this.topWood = topWood;
  }



  public boolean matches(GuitarSpec otherSpec) {
    if (builder != otherSpec.builder)
      return false;
    if ((model != null) && (!model.equals("")) &&
        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
      return false;
    if (type != otherSpec.type)
      return false;
    if (numStrings != otherSpec.numStrings)
      return false;
    if (backWood != otherSpec.backWood)
      return false;
    if (topWood != otherSpec.topWood)
      return false;
    return true;
  }
}
