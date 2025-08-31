#include <iostream>
#include <string>

using namespace std;
int solution(int n)
{
    string s = to_string(n);
    int answer = 0;

    for (char c : s) {
        answer += c - '0'; 
    }
    return answer;
}