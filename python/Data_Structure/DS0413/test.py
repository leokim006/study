import sys

while True:
    char = sys.stdin.read(1) # 딱 1바이트(한 글자)만 읽음
    
    if not char: # 더 이상 입력이 없으면(EOF) 종료
        break
        
    if char == '\n':
        print("엔터를 입력했습니다.")
    else:
        print(f"입력한 문자: {char}")

