package uk.gergely.kiss.isiraprime.iterative;

import uk.gergely.kiss.educationutil.print.method.printable.Printable;

public class CalculationIterative implements Printable<Long, Boolean> {

	private Boolean isItAPrime(Long input) {
		return input < 2 ? false : isDefined(input);

	}

	private boolean isDefined(Long input) {
		if (input == 2)
			return true;
		if (input % 2 == 0)
			return false;
		for (Long i = new Long(3); i * i <= input; i += 2) {
			if (input % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public Boolean execute(Long input) {
		return isItAPrime(input);
	}

}
