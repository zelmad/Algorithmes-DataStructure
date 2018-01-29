'''n = int(input())
m = int(input())
print(n//m)
print(n/m)'''

'''n = int(input())
for i in range(n):
    print(i*i)'''

'''def is_leap(year):
    leap = False
    # Write your logic here
    if(year%4 == 0 and year%100 == 0 and year%400 == 0):
        leap = True;
    elif(year%4 == 0 and year%100 == 0 and year%400 != 0):
        leap = False;
    elif(year%4 == 0 and year%100 != 0):
        leap = True;
    else:
        leap = False;
    return leap
    
year = int(input())
print(is_leap(year))'''
n = int(input())
for i in range(1,n+1):
    print(i, end='')

    