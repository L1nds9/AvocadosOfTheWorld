/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit {
	private int weight;
	private float cost;
	public Fruit(int weight, float cost)	{
		setWeight(weight);
		setCost(cost);
	}
	
	public int getWeight()	{
		return weight;
	}
	
	public void setWeight(int weight)	{
		this.weight = weight;
	}
	
	public float getCost()	{
		return cost;
	}
	
	public void setCost(float cost)	{
		this.cost = cost;
	}
	
	public String  toString()	{
		return 
	}
}
