#include <iostream>
using namespace std;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n,count=0;
    long long k;
    cin>>n>>k;
    long long *arr = new long long[n];
    for (int i=0; i<n; ++i) {
        cin>>arr[i];
    }
    for (int i=n-1; i>=0; --i) {
        if (k==0) {
            break;
        }
        if (k/arr[i] >= 1) {
            count += (k/arr[i]);
            k %= arr[i];
        }
    }
    cout<<count;
    return 0;
}