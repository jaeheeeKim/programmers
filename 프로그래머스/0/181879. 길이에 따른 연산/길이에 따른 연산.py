def solution(num_list):
    answer = 0
    
    # 리스트의 길이가 11 이상이면
    if len(num_list) >= 11:
        answer = sum(num_list)
    # 리스트의 길이가 10 이하이면    
    else:     
        answer = 1
        for num in num_list:
            answer *= num
    
    return answer