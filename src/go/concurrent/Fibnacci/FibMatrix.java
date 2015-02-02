package go.concurrent.Fibnacci;

/**
 * Description
 * Created by xubin on 2015-02-01.
 */
public class FibMatrix {
    class Matrix {
        int m_00;
        int m_01;
        int m_10;
        int m_11;
        public Matrix(int m_00, int m_01, int m_10, int m_11) {
            this.m_00 = m_00;
            this.m_01 = m_01;
            this.m_10 = m_10;
            this.m_11 = m_11;
        }
    }

    Matrix MatrixPower(int n) {
        Matrix matrix = new Matrix(1, 1, 1, 0);
        if (n == 1) {
            matrix = new Matrix(1, 1, 1, 0);
        }
        else if ((n & 1) == 0) {

        }

    }
}
