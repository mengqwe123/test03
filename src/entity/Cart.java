package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import entity.Items;
//���ﳵ��
public class Cart {

	//������Ʒ�ļ���
	private HashMap<Items,Integer> goods;
	
	//���ﳵ���ܽ��
	private double totalPrice;

	//���췽��
	public Cart()
	{
		goods = new HashMap<Items,Integer>();
		totalPrice = 0.0;
	}
	
	
	public HashMap<Items, Integer> getGoods() {
		return goods;
	}

	public void setGoods(HashMap<Items, Integer> goods) {
		this.goods = goods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double calTotalPrice()
	{
	double sum = 0.0;
		Set<Items> keyss = goods.keySet(); //��ü��ļ���
		Iterator<Items> it = keyss.iterator(); //��õ���������
	    while(it.hasNext())
	    {
	    	Items i =  it.next();
	    	sum += i.getPrice()*goods.get(i);
	    }
	    this.setTotalPrice(sum); //���ù��ﳵ���ܽ��
	    
		return this.getTotalPrice();
	}
	//�����Ʒ�����ﳵ�ķ���
	public boolean addGoodsInCart(Items item ,int number)
	{
		if(goods.containsKey(item))
		{
			goods.put(item, goods.get(item)+number);
		}
		else
		{
			goods.put(item, number);	
		}
		calTotalPrice(); //���¼��㹺�ﳵ���ܽ��
		return true;
	}
	
	//ɾ����Ʒ�ķ���
	public boolean removeGoodsFromCart(Items item)
	{
		goods.remove(item);
		calTotalPrice(); //���¼��㹺�ﳵ���ܽ��
		return true;
	}

	
	
	
	
}
