if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    high = -100
    second_high = -100
    for value in arr:
        if value > high:
            second_high = high
            high = value
        elif value > second_high and value != high:
            second_high = value
    print(second_high)