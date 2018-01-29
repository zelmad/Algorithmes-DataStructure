testCase = int(input())
for i in range(0, testCase):
    (a, b) = tuple(map(int, input().split(' ')))
    choses_Nbrs = input().split(' ')
    state = 0
    Tanya = []
    Manya = []
    for k in range(1, a+1):
            if(k not in choses_Nbrs):
                if(state % 2 == 0):
                    Tanya.append(k)
                else:
                    Manya.append(k)
                state +=1
    for g in Tanya:
        print(g , end=' ')
    print()
    for h in Manya:
        print(h, end = ' ')
    print()


        