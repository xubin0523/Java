package go.concurrent.Fibonacci;

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
    
    Matrix matrix2by2(Matrix matrixL, Matrix matrixR) {
        Matrix matrix = new Matrix(0, 0, 0, 0);
        matrix.m_00 = matrixL.m_00 * matrixR.m_00 + matrixL.m_01 * matrixR.m_10;
        matrix.m_01 = matrixL.m_00 * matrixR.m_01 + matrixL.m_01 * matrixR.m_11;
        matrix.m_10 = matrixL.m_10 * matrixR.m_00 + matrixL.m_11 * matrixR.m_10;
        matrix.m_11 = matrixL.m_10 * matrixR.m_01 + matrixL.m_11 * matrixR.m_11;
        return matrix;
    }

    Matrix matrixMod(Matrix matrix, int mod) {
        if (matrix.m_00 > mod) matrix.m_00 %= mod;
        if (matrix.m_01 > mod) matrix.m_01 %= mod;
        if (matrix.m_10 > mod) matrix.m_10 %= mod;
        if (matrix.m_11 > mod) matrix.m_11 %= mod;
        return  matrix;
    }

    Matrix matrixPower(int n) {
        Matrix matrix = new Matrix(1, 1, 1, 0);
        if (n == 1) {
            matrix = new Matrix(1, 1, 1, 0);
        }
        else if ((n & 1) == 0) {
            Matrix matrix1 = matrixPower(n/2);
            matrix = matrix2by2(matrix1,matrix1);
        }
        else {
            Matrix matrix1 = matrixPower((n - 1) / 2);
            matrix = matrix2by2(matrix2by2(matrix1, matrix1), matrix);
        }
        return matrix;
    }
}
