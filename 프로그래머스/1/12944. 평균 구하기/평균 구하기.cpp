#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    int j = 0;  
    for (int i : arr) {
        answer += i;
        j += 1;
    }
    answer /= j;  
    return answer;
}