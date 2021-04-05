members =['egoing', 'leezche', 'graphittie','k8805']
i = 0
while i< len(members):
    print(members[i])
    i= i+1
# while을 사용하게 되면 오류가 날 가능성이 높아진다.
for member in members :
    print(member)
