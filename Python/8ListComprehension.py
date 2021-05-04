#question link---https://www.hackerrank.com/challenges/list-comprehensions/problem


if __name__ == '__main__':
    x = int(raw_input())
    y = int(raw_input())
    z = int(raw_input())
    n = int(raw_input())
    output=[]
    a=[]
    for X in range(x+1):
        for Y in range(y+1):
                for Z in range(z+1):
                        if(X+Y+Z!=n):
                                a=[X, Y, Z]
                                output.append(a)
print(output)
