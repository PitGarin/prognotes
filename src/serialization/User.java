package serialization;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	transient private int lifilevel;
	private static int staticField;
	protected Sword sword;

	/**
	 * @return the staticField
	 */
	public int getStaticField() {
		return staticField;
	}

	/**
	 * @param staticField
	 *            the staticField to set
	 */
	public void setStaticField(int staticField) {
		User.staticField = staticField;
	}

	/**
	 * @return the lifilevel
	 */
	public int getLifilevel() {
		return lifilevel;
	}

	/**
	 * @param lifilevel
	 *            the lifilevel to set
	 */
	public void setLifilevel(int lifilevel) {
		this.lifilevel = lifilevel;
	}

}
