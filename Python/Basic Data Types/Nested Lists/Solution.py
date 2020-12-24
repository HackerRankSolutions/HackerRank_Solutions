if __name__ == '__main__':
    list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        list.append([name, score])
    second_lowest = []
    smallest = 9999 # considering smallest and second_smallest to be very large
    second_smallest = 9999
    for block in list:
        if block[1] < smallest:
            second_smallest = smallest
            smallest = block[1]
        elif block[1] < second_smallest and block[1] != smallest:
            second_smallest = block[1]
    for block in list:
        if block[1] == second_smallest:
            second_lowest.append(block[0])
    second_lowest.sort()
    for value in second_lowest:
        print(value)