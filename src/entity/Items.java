package entity;

public class Items {
private int id;
private String city;
private int price;
private int number;
private String picture;
private String name;
public Items() 
{
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}

public Items(int id,String name,String city,int price,int number,String picture) {
	this.id=id;
	this.name=name;
	this.city=city;
	this.picture=picture;
	this.number=number;
	}


@Override
public boolean equals(Object arg0) {
	if(this==arg0) {
		return true;
	}
	if(arg0 instanceof Items)
	{
	Items i=(Items) arg0;
			if(this.getId()==i.getId()&&this.getName().equals(i.getName()))
			{
				return true;
			}else {
				return false;
			}
	}else
	{
		return false;
	}
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.getId()+this.getName().hashCode();
}
public String toString()
{
	return "商品编号："+this.getId()+",商品名称："+this.getName();
	}
}

