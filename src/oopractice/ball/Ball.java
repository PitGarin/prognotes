package oopractice.ball;

public class Ball {

	private double x;
	private double y;
	private double xStep;
	private double yStep;

	public Ball(double x, double y, double xStep, double yStep) {
		this.x = x;
		this.y = y;
		this.xStep = xStep;
		this.yStep = yStep;
	}

	public void setXYStep(double xStep, double yStep) {
		this.xStep = xStep;
		this.yStep = yStep;

	}

	public double[] getXYStep() {
		double[] result = new double[2];
		result[0] = this.xStep;
		result[1] = this.yStep;
		return result;

	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double[] getXY() {
		double[] result = new double[2];
		result[0] = this.x;
		result[1] = this.y;
		return result;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the xStep
	 */
	public double getXStep() {
		return xStep;
	}

	/**
	 * @param xStep
	 *            the xStep to set
	 */
	public void setXStep(double xStep) {
		this.xStep = xStep;
	}

	/**
	 * @return the yStep
	 */
	public double getYStep() {
		return yStep;
	}

	/**
	 * @param yStep
	 *            the yStep to set
	 */
	public void setYStep(double yStep) {
		this.yStep = yStep;
	}

	@Override
	public String toString() {
		return "Ball@(" + x + "," + y + "),speed=(" + xStep + "," + yStep + ")";

	}

	public Ball move() {
		x += xStep;
		y += yStep;

		return this;

	}

}
