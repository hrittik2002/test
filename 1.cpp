#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main()
{
    int t = 1;
    cin >> t;
    while (t--)
    {
        ll n;
        cin >> n;
        ll l[n], r[n];
        map<pair<ll, ll>, ll> mp;

        for (int i = 0; i < n; i++)
        {
            cin >> l[i] >> r[i];
            mp[{l[i], r[i]}] = 1;
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = l[i]; j <= r[i]; j++)
            {
                if (l[i] == r[i])
                {
                    cout << l[i] << " " << r[i] << " " << j << "\n";
                }
                else if (mp[{l[i], j - 1}] == 1 && mp[{j + 1, r[i]}] == 1)
                {
                    cout << l[i] << " " << r[i] << " " << j << "\n";
                }
                else if (j == l[i] && mp[{j + 1, r[i]}] == 1 || j == r[i] && mp[{l[i], j - 1}] == 1)
                {
                    cout << l[i] << " " << r[i] << " " << j << "\n";
                }
            }
        }
        cout << "\n";
    }
}