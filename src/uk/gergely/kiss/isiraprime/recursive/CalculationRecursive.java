package uk.gergely.kiss.isiraprime.recursive;

import uk.gergely.kiss.educationutil.print.method.printable.Printable;

public class CalculationRecursive implements Printable<Long, Boolean> {
	private Boolean isItAPrime(Long input) {
		if (input < 2) {
			return false;
		} else if (input == 2) {
			return true;
		} else if (input % 2 == 0) {
			return false;
		} else
			return isDefined(input, new Long(3));

	}

	private boolean isDefined(Long input, Long index) {

		if (input % index == 0) {
			return false;
		} else if (index * index >= input) {
			return true;
		} else {
			return isDefined(input, index + 2);
		}

	}

	@Override
	public Boolean execute(Long input) {
		return isItAPrime(input);
	}
}
