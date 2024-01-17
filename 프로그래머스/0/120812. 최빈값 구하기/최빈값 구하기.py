import statistics # 수학 통계함수

def solution(array):
    # 최빈값은 통계학 용어로, 가장 많이 관측되는 수, 즉 주어진 값 중에서 가장 자주 나오는 값
    answer = []
    
    answer = statistics.multimode(array)
    if(len(answer) == 1):
        return answer[0]
    else:
        return -1