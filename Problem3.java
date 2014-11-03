import java.util.*;
import java.math.*;
import java.lang.*;

public class Problem3 {

	public static void main(String[] args) {
	
		long givenNumber = 600851475143L;
		long halfGivenNumber = givenNumber/2;
		List<Long> primes = new ArrayList();
		List accepted = new ArrayList();
		boolean isPrime = false;
		/*for (BigInteger i = BigInteger.valueOf(1); i.compareTo(givenNumber) <= 0; i = i.add(BigInteger.ONE)) {
		
			
			for (BigInteger j = BigInteger.valueOf(2); j.compareTo(i) < 0; j = j.add(BigInteger.ONE)) {
			
				if(!i.mod(j).equals(BigInteger.ZERO)) {
					
					isPrime = true;
				
				} else {
					isPrime = false;
					break;
				}
			}
			if (isPrime) primes.add(i);
			
			isPrime = false;
			
		}
		System.out.println(primes.get(primes.size()-1));

		//for (BigInteger i = BigInteger.valueOf(1); i.compareTo(givenNumber) < 0; i = i.add(BigInteger.ONE))
		for (int i = primes.size()-1; i>=0; i--) {
			
			BigInteger b = primes.get(i);
			if (givenNumber.mod(b).equals(BigInteger.ZERO)) {
				System.out.println("Highest factor: " + b);
				break;
			}*/

			//Code for counting Primes from the highest prime
		/*for (BigInteger i = halfGivenNumber; i.compareTo(BigInteger.ZERO) >= 0; i = i.subtract(BigInteger.ONE)) {
		counter = counter.add(counter);
		System.out.println(counter);
			
			for (BigInteger j = BigInteger.valueOf(2); j.compareTo(i) < 0; j = j.add(BigInteger.ONE)) {
			
				if(!i.mod(j).equals(BigInteger.ZERO)) {
					
		
					isPrime = true;
				
				} 
				else if (i.equals(j)) isPrime =  true;
				else {
					isPrime = false;
			
					break;
				}
			}
			
				BigInteger b = i;
			if (isPrime && givenNumber.mod(b).equals(BigInteger.ZERO)) {
				System.out.println("Highest factor: " + b);
				break;
			}				
				
			isPrime = false;
			
		}*/

		

		//for (BigInteger i = BigInteger.valueOf(1); i.compareTo(givenNumber) < 0; i = i.add(BigInteger.ONE))
	
		
		for (long i = halfGivenNumber; i >= 0; i--) {
		
			for (long j = 2; j < i; j++) {
			
				if(!(i % j == 0)) {
					
		
					isPrime = true;
				
				} 
				else if (i == j) isPrime =  true;
				else {
					isPrime = false;
			
					break;
				}
			}
			
				long b = i;
			if (isPrime && (givenNumber % b == 0)) {
				System.out.println("Highest factor: " + b);
				System.out.println("halfGivenNumber : " + halfGivenNumber);
				break;
			}

				
				
			isPrime = false;
			
		}

	}
}