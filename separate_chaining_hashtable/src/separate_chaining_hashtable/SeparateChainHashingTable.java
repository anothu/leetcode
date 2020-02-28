package separate_chaining_hashtable;

import java.util.LinkedList;
import java.util.List;

public class SeparateChainHashingTable<AnyType> {
	private static final int DEFAULT_TABLE_SIZE = 101;
	private List<AnyType>[] theLists;
	private int currentSize;

	public SeparateChainHashingTable() {
		this(DEFAULT_TABLE_SIZE);
	}

	public SeparateChainHashingTable(int size) {
		theLists = new LinkedList[nextPrime(size)];
		for (int i = 0; i < theLists.length; i++)
			theLists[i] = new LinkedList<AnyType>();
	}

	public void insert(AnyType x) {
		List<AnyType> whichList = theLists[myhash(x)];
		if (!whichList.contains(x)) {
			whichList.add(x);
			if (++currentSize > theLists.length)
				rehash();
		}
	}

	public void remove(AnyType x) {
		List<AnyType> whichList = theLists[myhash(x)];
		if (whichList.contains(x)) {
			whichList.remove(x);
			currentSize--;
		}
	}

	public boolean contains(AnyType x) {
		List<AnyType> whichList = theLists[myhash(x)];
		return whichList.contains(x);
	}

	public void makeEmpty() {
		for (int i = 0; i < theLists.length; i++)
			theLists[i].clear();
		// theSize=0;
		currentSize = 0;
	}

	//
	private int rehash() {
		List<AnyType>[] oldLists = theLists;
		theLists = new List[nextPrime(2 * theLists.length)];
		for (int j = 0; j < theLists.length; j++)
			theLists[j] = new LinkedList<AnyType>();
		currentSize = 0;
		for (int i = 0; i < oldLists.length; i++) {
			for (AnyType item : oldLists[i])
				insert(item);
		}

		return 0;
	}

	private int myhash(AnyType x) {
		int hashVal = x.hashCode();
		hashVal %= theLists.length;
		if (hashVal < 0)
			hashVal += theLists.length;
		return hashVal;
	}

	private static int nextPrime(int n) {
		if (n % 2 == 0)
			n++;

		for (; !isPrime(n); n += 2)
			;

		return n;
	}

	private static boolean isPrime(int n) {
		if (n == 2 || n == 3)
			return true;

		if (n == 1 || n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;

		return true;
	}

}
