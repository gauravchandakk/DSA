class Solution {
    public int clumsy(int n) {
        int sum;
        Boolean a = true;
        Stack<Integer> s = new Stack<>();
        while (n > 0) {
            if (a == true) {
                sum = 0;
                sum = sum + n;
                n--;
                if (n == 0) {
                    s.push(sum);
                    break;
                }
                sum *= n;
                n--;
                if (n == 0) {
                    s.push(sum);
                    break;
                }
                sum /= n;
                n--;
                if (n == 0) {
                    s.push(sum);
                    break;
                }
                sum += n;
                s.push(sum);
                a = false;
                n--;
            }

            else {
                sum = 0;
                sum = sum + n;
                n--;
                if (n == 0) {
                    sum -= (2 * sum);
                    s.push(sum);
                    break;
                }
                sum *= n;
                n--;
                if (n == 0) {
                    sum -= (2 * sum);
                    s.push(sum);
                    break;
                }
                sum /= n;
                n--;
                sum -= (2 * sum);
                if (n == 0) {
                    s.push(sum);
                    break;
                }

                sum += n;
                s.push(sum);
                n--;
            }

        }
        sum = 0;
        while (!s.empty()) {
            sum += s.pop();
        }
        return sum;
    }
}