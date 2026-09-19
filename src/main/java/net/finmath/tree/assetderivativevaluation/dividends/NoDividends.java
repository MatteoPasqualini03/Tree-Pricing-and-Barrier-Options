package net.finmath.tree.assetderivativevaluation.dividends;

/**
 * This is a trivial class representing an empty dividend model, with no dividends.
 * The cumulative factor is always 1.0.
 */
public class NoDividends implements MultiplicativeDividendModel {

	@Override
	public double getCumulativeDividendFactor(double time) {
		return 1.0;
	}

	@Override
	public double getForwardDividendFactor(double time1, double time2) {
		return 1.0;
	}
}
