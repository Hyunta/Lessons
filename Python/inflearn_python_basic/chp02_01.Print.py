#Chapter 02-1
#파이썬 완전 기초
#Print 사용법


#Separator 옵션
print('Python Start')
print('P','Y','T','H','O','N', sep='')
print('010','7777','1234',sep='-')
print('mohai','google.com',sep='@')

#End 옵션
print('Welcome to', end=' ')
print('IT News', end=' ')
print('Web Site ')

#file 옵션
import sys
print('Learn Python', file=sys.stdout)
print()

#format 사용(d : 3, s : 'python', f : 3.141592)
print('%s %s' %('one', 'two'))
print('{} {}'.format('one', 'two'))
print('{1} {0}'.format('one', 'two'))

print( )

# %s
#10자리에서 제일 오른쪽에 위치
print('%10s' % ('nice'))
print('{:>10}'.format('nice'))
#10자리에서 제일 왼쪽에 위치
print('%-10s' % ('nice'))
print('{:10}'.format('nice'))
#10자리에서 앞에 빈칸은 $로 채워짐
print('{:$>10}'.format('nice'))
#^는 중앙정렬
print('{:^10}'.format('nice'))
#.은 원하는 숫자만큼 절삭
print('%.5s' % ('nice'))
#.5s는 자리도 사라지는데 format은  자리는 유지
print('%.5s' % ('pythonstudy'))
print('{:10.5}'.format('pythonstudy'))

# %d
print('%d %d' % (1,2))
print('{} {}'.format(1,2))

print('%4d' %(42))
print('{:4d}'.format(42))

# %f
print('%f' %(3.1415921231231231232131))
print('{:f}'.format(3.123124124))

print('%0 6.2f' % (3.141592653589793))
