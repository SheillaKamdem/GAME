package model;
/**
 * <h1>The  Model class</h1>
 * 
 * 
 * @version 1.0
 */
public class Model implements ITronModel{
	private IGrid grid;
	/**
	 * 
	 *
	 * @see model.ITronModel#getGrid()
	 */
	public IGrid getGrid() {
		return grid;
	}
	/**
	 * 
	 * @see model.ITronModel#setGrid(model.IGrid)
	 */
	public void setGrid(IGrid grid) {
		this.grid = grid;
	}

	
	
	
}
