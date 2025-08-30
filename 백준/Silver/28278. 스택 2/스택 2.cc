#include <iostream>
#include <stack>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    stack<int> s;
    int n = 0, a = 0, b = 0;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> a;
        if (a == 1) {
            cin >> b;
            s.push(b);
        }
        else if (a == 2) {
            if (!s.empty()) {
                cout << s.top() << "\n";
                s.pop();
            } else {
                cout << "-1\n";
            }
        }
        else if (a == 3) {
            cout << s.size() << "\n";
        }
        else if (a == 4) {
            if (s.empty()) {
                cout<<"1\n";
            }
            else {
                cout<<"0\n";
            }
        }
        else if (a == 5) {
            if (!s.empty()) {
                cout << s.top() << "\n";
            } else {
                cout << "-1\n";
            }
        }
    }
    return 0;
}