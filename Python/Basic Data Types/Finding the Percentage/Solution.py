if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    avg = 0
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    for marks in student_marks[query_name]:
        avg = avg + marks
    avg = "{:.2f}".format(avg/3)
    print(avg)