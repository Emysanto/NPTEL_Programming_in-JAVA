//Dynamic memory allocation matrix multiplication

#include <iostream>

using namespace std;

int main() {
    int a_r, a_c, b_r, b_c;

    while (true) {
        cout << "Enter rows and columns for matrix one: ";
        cin >> a_r >> a_c;

        cout << "Enter rows and columns for matrix two: ";
        cin >> b_r >> b_c;

        if (a_c != b_r) {
            cout << "Cannot multiply matrices. Number of columns in first matrix must equal number of rows in second matrix." << endl;
            continue;
        }
        break;
    }

    // Allocate memory for matrices using raw pointers
    int **a = new int*[a_r];
    for (int i = 0; i < a_r; ++i) {
        a[i] = new int[a_c];
    }

    int **b = new int*[b_r];
    for (int i = 0; i < b_r; ++i) {
        b[i] = new int[b_c];
    }

    int **c = new int*[a_r];
    for (int i = 0; i < a_r; ++i) {
        c[i] = new int[b_c]();
    }

    // Input matrix one
    cout << "Enter matrix one (" << a_r << "x" << a_c << "):" << endl;
    for (int i = 0; i < a_r; ++i) {
        for (int j = 0; j < a_c; ++j) {
            cin >> a[i][j];
        }
    }

    // Input matrix two
    cout << "Enter matrix two (" << b_r << "x" << b_c << "):" << endl;
    for (int i = 0; i < b_r; ++i) {
        for (int j = 0; j < b_c; ++j) {
            cin >> b[i][j];
        }
    }

    // Multiply matrices
    for (int i = 0; i < a_r; ++i) {
        for (int j = 0; j < b_c; ++j) {
            for (int k = 0; k < a_c; ++k) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    // Display result
    cout << "Product of matrix one and two is:" << endl;
    for (int i = 0; i < a_r; ++i) {
        for (int j = 0; j < b_c; ++j) {
            cout << c[i][j] << "\t";
        }
        cout << endl;
    }

    // Free allocated memory
    for (int i = 0; i < a_r; ++i) {
        delete[] a[i];
    }
    delete[] a;

    for (int i = 0; i < b_r; ++i) {
        delete[] b[i];
    }
    delete[] b;

    for (int i = 0; i < a_r; ++i) {
        delete[] c[i];
    }
    delete[] c;

    return 0;
}
