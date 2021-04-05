class C1():
    def c1_m(self):
        print("c1_m")
    def m(self):
        print("C1 m")

class C2():
    def c2_m(self):
        print("c2_m")
    def m(self):
        print("C2 m")
        
class C3(C1, C2):
    def m(self):
        print("C3 m")
c = C3()
c.c1_m()
c.c2_m()
c.m()
print(C3.__mro__)

# 다중상속의 문제점, 부모가 같은 메소드를 가지고 있으면 중복발생
