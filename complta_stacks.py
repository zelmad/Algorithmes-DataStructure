'''def is_Array_Perfect(l, n):
	con = False;
	dec = False;
	for u in range(1, n):
		if(con and int(l[u]) > int(l[u-1])):
			return False
		elif(dec and int(l[u]) >= int(l[u-1])):
			return False
		else:
			if(int(l[u]) == int(l[u-1])):
				con = True
				dec = False
			elif(int(l[u-1]) > int(l[u])):
				con = False
				dec = True
	return True'''
	
n = int(input())
l = []
for i in range(0, n):
    
    m = int(input())
    s = input().split()
    l = list(map(int, s))
    
    for j in range(0, m-1):
        state = 0 
        if(int(l[j])>int(l[j+1]) and state == 0):
            state = 0
        elif(int(l[j])==int(l[j+1]) and (state == 1 or state == 0)):
            state = 1
        elif(int(l[j])<int(l[j+1]) or (state == 2 or state == 1)):
            state = 2
        else:
            state = -1
    if(state == -1):
        print("No")
    else:
        print("Yes")
