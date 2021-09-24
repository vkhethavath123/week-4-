package tissuefactory.iteratordesignpattern;

public class TissueFactory {

	public static void main(String[] args) {
		TissueCollectionImplementation tissueFactory=new TissueCollectionImplementation();
		Iterator itr=tissueFactory.getIterator();
		while(itr.hasNext())
		{
			System.out.println((String)itr.next());
		}

	}

}
