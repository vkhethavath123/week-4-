package tissuefactory.iteratordesignpattern;

public class TissueCollectionImplementation implements TissueCollection 
{
 private String tissue[]= {"Tissue Categories: Tissue Napkin, Toilet Roll Paper,PaperNapkin,Facial Tissues etc..",
		 "issue thicknes varies from 0.1mm to 1mm","Cost varies from $5 to $20"};	 
	@Override
	public Iterator getIterator() {
		return new TissueIteratorImplementation();
	}

	private class TissueIteratorImplementation implements Iterator
	{
		int subscript = 0;
		@Override
		public boolean hasNext() {
			if(subscript<tissue.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return tissue[subscript++];
			else
				return null;
		}
		
	}
}
