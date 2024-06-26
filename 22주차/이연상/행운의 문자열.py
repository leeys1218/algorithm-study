# [BOJ] 행운의 문자열

N = int(input())
dice_list = [list(map(int, input().split())) for _ in range(N)]


across_dict = {
  0 : 5,
  1 : 3,
  2 : 4,
  3 : 1,
  4 : 2,
  5 : 0
}

def cal_tot_cnt(num) :
  result = 0
  
  for i in range(N) :
    for j in range(6) :
      if dice_list[i][j] == num :
        across_num = dice_list[i][across_dict[j]]
        if 6 in [num, across_num] :
          result += 4 if 5 in [num, across_num] else 5
