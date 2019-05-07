
public class Matrix<T> {
	private int n_row;
	private int n_col;
	private T[][] _values;
	
	public int getRowLen() {
		return n_row;
	}
	public int getColLen() {
		return n_col;
	}
	
	public int getSize() {
		return n_row * n_col;
	}

	public void setValue(int row, int col, T value) {
		_values[col][row] = value;
	}
}
