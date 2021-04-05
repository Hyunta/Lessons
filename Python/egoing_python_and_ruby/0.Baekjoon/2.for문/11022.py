N = int(input())

for n in range(N):
    a, b = map(int, input().split())
    print('Case #%d: %d + %d = %d' %(n+1, a, b, a+b))
