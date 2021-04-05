N, X =map(int, input().split())
A = list(map(int,input().split()))

for a in range(N):
    if X > A[a]:
        print(A[a])
