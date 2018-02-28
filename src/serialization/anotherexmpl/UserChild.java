package serialization.anotherexmpl;

import serialization.User;

public class UserChild extends User {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private int childLvl;

	/**
	 * @return the childLvl
	 */
	public int getChildLvl() {
		return childLvl;
	}

	/**
	 * @param childLvl
	 *            the childLvl to set
	 */
	public void setChildLvl(int childLvl) {
		this.childLvl = childLvl;
	}

}
