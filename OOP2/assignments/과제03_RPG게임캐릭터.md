# 파일명: 과제03_RPG게임캐릭터.md

# 📝 [과제 03] RPG 게임 캐릭터 만들기
## 주제: 상속(Inheritance), 중복 코드 찾기, 부모 클래스 설계하기

**학번:** [60251803]
**이름:** [김 민 혁]

---

## 🎯 과제 목표
이 과제에서는 RPG 게임 캐릭터를 만들면서,

1. 전사/마법사/궁수처럼 비슷한 클래스가 많아질 때 어떤 문제가 생기는지 확인하고,
2. 중복 코드를 줄이기 위해 부모 클래스와 자식 클래스를 어떻게 나누는지 배우고,
3. AI가 처음에는 쓸데없이 반복적인 코드를 만들 수 있다는 점을 보고,
4. 사람이 구조를 재설계해 더 깔끔한 프로그램으로 개선하는 경험을 합니다.

---

## 📚 이번 과제의 핵심 개념
- 클래스(Class)
- 필드(Field)
- 메서드(Method)
- 상속(Inheritance)
- `extends`
- 부모 클래스 / 자식 클래스
- 중복 코드 제거
- AI 코드 리팩토링 검토

---

## 🧩 과제 시나리오
간단한 RPG 게임에 아래 세 직업이 등장합니다.
- 전사(Warrior)
- 마법사(Mage)
- 궁수(Archer)

세 직업은 공통적으로 아래 정보를 가질 수 있습니다.
- 이름(name)
- 체력(hp)
- 마나(mp)
- 공격력(attackPower)

세 직업은 공통적으로 아래 행동도 할 수 있습니다.
- 걷기(walk)
- 상태 출력(showStatus)

하지만 직업별로 공격 방식은 다를 수 있습니다.
- 전사: 칼로 공격
- 마법사: 마법 공격
- 궁수: 활 공격

---

## ✅ 최종 제출물
1. 공통점/차이점을 정리한 설계 메모
2. AI에게 준 1차 프롬프트(상속 없이)와 2차 프롬프트(상속 도입)
3. AI가 만든 중복 많은 코드
4. 상속을 적용해 정리한 최종 코드
5. 테스트 결과와 회고

---

# 1단계. 공통점과 차이점 정리하기 (Human Design)

## 1-1. 먼저 손으로 분류하기
아래 빈칸을 채우세요.

### 세 직업의 공통 속성
- name
- hp
- mp
- attackPower


### 세 직업의 공통 행동
- getName()
- getHP()
- getMP()
- getAttackPower()
- setName()
- setHP()
- setMP()
- setAttackPower()
- walk()
- toString()

### 직업마다 다른 점
- 전사만의 특징: 공격(attack()함수)에서 검을 사용함.
- 마법사만의 특징: 공격(attack()함수)에서 마법공격을 사용함.
- 궁수만의 특징: 공격(attack()함수)에서 활을 사용함.

---

## 1-2. 부모 클래스로 뺄 수 있는 것 생각하기
아래 질문에 답하세요.

1. 세 클래스에 모두 들어갈 필드는 무엇인가?  
   **답:** 이름, hp, mp, 공격력

2. 세 클래스에 모두 들어갈 메서드는 무엇인가?  
   **답:** [Getter 함수들, setter 함수들, walk함수, toString함수]

3. 각 클래스마다 다르게 구현해야 할 메서드는 무엇인가?  
   **답:** [attack함수]

---

## 1-3. 구조도 작성하기
### 예시 구조도
```text
Character
 ├─ name
 ├─ hp
 ├─ mp
 ├─ attackPower
 ├─ walk()
 └─ showStatus()

Warrior extends Character
 └─ attack()

Mage extends Character
 └─ attack()

Archer extends Character
 └─ attack()
```

### 내가 작성한 구조도
```text
Character
 ├─ name
 ├─ hp
 ├─ mp
 ├─ attackPower
 ├─ walk()
 └─ toString()

Eatable
 └─ eat()

 Warrior
 ├─ attack() - extends Character
 └─ eat()    - implement Eatable

 
 Mage
 ├─ attack() - extends Character
 └─ eat()    - implement Eatable

 Archer
 ├─ attack() - extends Character
 └─ eat()    - implement Eatable
```

---

# 2단계. AI에게 일부러 비효율적인 초안 받기 (Prompting)

이 과제에서는 먼저 **상속 없이** 중복이 많은 코드를 받습니다. 그래야 왜 상속이 필요한지 눈으로 확인할 수 있습니다.

## 2-1. 1차 프롬프트 입력하기
아래 문장을 AI에게 그대로 입력하세요.

> **AI에게 입력할 프롬프트**  
> "Java로 RPG 게임의 전사(Warrior), 마법사(Mage), 궁수(Archer) 클래스를 각각 만들어 줘. 각 클래스에는 이름, 체력, 마나, 공격력 변수가 있어야 하고, 걷기, 상태 출력, 공격 기능도 있어야 해. **단, 상속(`extends`)은 절대 사용하지 말고 세 클래스를 각각 따로 작성해 줘.** 초보자가 이해하기 쉽게 주석도 달아 줘."

---

## 2-2. AI가 만든 중복 코드 붙여 넣기
```java
public class Warrior {
    // 1. 변수 (전사의 정보)
    String name;      // 이름
    int hp;           // 체력
    int mp;           // 마나
    int attackPower;  // 공격력

    // 2. 생성자 (전사를 처음 만들 때 기본 정보를 설정하는 곳)
    public Warrior(String name, int hp, int mp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }

    // 3. 기능 (메서드)
    // 걷기 기능
    public void walk() {
        System.out.println(this.name + "이(가) 뚜벅뚜벅 걸어갑니다.");
    }

    // 상태 출력 기능
    public void printStatus() {
        System.out.println("=== 전사 상태 ===");
        System.out.println("이름: " + this.name);
        System.out.println("체력: " + this.hp);
        System.out.println("마나: " + this.mp);
        System.out.println("공격력: " + this.attackPower);
        System.out.println("================");
    }

    // 공격 기능
    public void attack() {
        System.out.println(this.name + "이(가) 검을 휘두릅니다! (피해량: " + this.attackPower + ")");
    }
}
public class Mage {
    // 1. 변수 (마법사의 정보)
    String name;      // 이름
    int hp;           // 체력
    int mp;           // 마나
    int attackPower;  // 공격력 (마법 공격력)

    // 2. 생성자 (마법사를 처음 만들 때 기본 정보를 설정하는 곳)
    public Mage(String name, int hp, int mp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }

    // 3. 기능 (메서드)
    // 걷기 기능
    public void walk() {
        System.out.println(this.name + "이(가) 신비롭게 사뿐사뿐 걸어갑니다.");
    }

    // 상태 출력 기능
    public void printStatus() {
        System.out.println("=== 마법사 상태 ===");
        System.out.println("이름: " + this.name);
        System.out.println("체력: " + this.hp);
        System.out.println("마나: " + this.mp);
        System.out.println("공격력: " + this.attackPower);
        System.out.println("=================");
    }

    // 공격 기능
    public void attack() {
        System.out.println(this.name + "이(가) 마법 화염구를 발사합니다! (피해량: " + this.attackPower + ")");
    }
}
public class Archer {
    // 1. 변수 (궁수의 정보)
    String name;      // 이름
    int hp;           // 체력
    int mp;           // 마나
    int attackPower;  // 공격력

    // 2. 생성자 (궁수를 처음 만들 때 기본 정보를 설정하는 곳)
    public Archer(String name, int hp, int mp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }

    // 3. 기능 (메서드)
    // 걷기 기능
    public void walk() {
        System.out.println(this.name + "이(가) 발소리를 죽이고 은밀하게 이동합니다.");
    }

    // 상태 출력 기능
    public void printStatus() {
        System.out.println("=== 궁수 상태 ===");
        System.out.println("이름: " + this.name);
        System.out.println("체력: " + this.hp);
        System.out.println("마나: " + this.mp);
        System.out.println("공격력: " + this.attackPower);
        System.out.println("================");
    }

    // 공격 기능
    public void attack() {
        System.out.println(this.name + "이(가) 날카로운 화살을 쏩니다! (피해량: " + this.attackPower + ")");
    }
}
```

---

## 2-3. AI 코드의 문제점 찾기
아래 질문에 답하세요.

1. 세 클래스에서 똑같이 반복된 필드는 무엇인가?  
   **답:** [name, hp, mp, attackPower]

2. 세 클래스에서 똑같이 반복된 메서드는 무엇인가?  
   **답:** [Getter, Setter, walk, toString]

3. 이런 코드가 왜 불편한가?  
   **답:** [중복되는 함수나 값을 추가, 삭제, 수정하려면 모든 클래스를 돌면서 값을 수정해 넣어야 한다.]

---

# 3단계. AI에게 "부모 클래스"를 만들라고 시키기

## 3-1. 2차 프롬프트 템플릿
아래 문장을 복사해 AI에게 입력하세요.

> **AI에게 입력할 프롬프트**  
> "방금 코드는 중복이 너무 많아. 이제 나는 설계 책임자이고 너는 코딩 인턴이야. `Character`라는 부모 클래스를 하나 만들고, 공통 필드와 공통 메서드는 그 안으로 옮겨 줘. `Warrior`, `Mage`, `Archer`는 `extends Character`를 사용해서 부모를 상속받게 만들어 줘. 각 직업의 `attack()`은 직업에 맞는 문장이 출력되도록 다르게 작성해 줘. 그리고 코드 아래에 '어떤 부분을 부모 클래스로 옮겼는지' 설명해 줘."

---

## 3-2. AI가 설명한 리팩토링 내용 요약
- 부모 클래스로 옮긴 필드: name(이름), hp(체력), mp(마나), attackPower(공격력)
- 부모 클래스로 옮긴 메서드: walk()(걷기), printStatus()(상태 출력), 기본 attack()(공격)
- 자식 클래스에 남긴 메서드: attack() (각 직업의 특성에 맞게 오버라이딩하여 재정의)

---

## 3-3. 상속 적용 후 최종 코드 붙여 넣기
```java
// 여기에 상속을 적용한 최종 코드를 붙여 넣으세요.
public class Character {
    // 1. 공통 변수 (모든 캐릭터가 가지는 정보)
    String name;
    int hp;
    int mp;
    int attackPower;

    // 2. 공통 생성자
    public Character(String name, int hp, int mp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }

    // 3. 공통 메서드 (모든 캐릭터가 똑같이 하는 행동)
    public void walk() {
        System.out.println(this.name + "이(가) 걸어갑니다.");
    }

    public void printStatus() {
        System.out.println("=== " + this.name + " 상태 ===");
        System.out.println("체력: " + this.hp);
        System.out.println("마나: " + this.mp);
        System.out.println("공격력: " + this.attackPower);
        System.out.println("======================");
    }

    // 공격 기능 (자식 클래스에서 각각 다르게 바꿀 예정)
    public void attack() {
        System.out.println(this.name + "이(가) 기본 공격을 합니다.");
    }
}
// 전사 클래스
public class Warrior extends Character {
    // 생성자: super()를 이용해 부모(Character)의 생성자에게 정보를 넘겨줌
    public Warrior(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    // 전사만의 공격 방식으로 덮어쓰기 (Override)
    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 묵직한 대검을 휘두릅니다! (피해량: " + this.attackPower + ")");
    }
}

// 마법사 클래스
public class Mage extends Character {
    public Mage(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    // 마법사만의 공격 방식으로 덮어쓰기
    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 뜨거운 화염구를 발사합니다! (피해량: " + this.attackPower + ")");
    }
}

// 궁수 클래스
public class Archer extends Character {
    public Archer(String name, int hp, int mp, int attackPower) {
        super(name, hp, mp, attackPower);
    }

    // 궁수만의 공격 방식으로 덮어쓰기
    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 날카로운 화살을 쏩니다! (피해량: " + this.attackPower + ")");
    }
}
```

---

# 4단계. 직접 실행하고 비교하기 (Code Review)

## 4-1. 비교 질문
아래 질문에 답하세요.

1. 상속 전 코드와 상속 후 코드 중 어느 쪽이 더 짧고 읽기 쉬운가?  
   **답:** [상속 후 코드]

2. 공통 기능을 고쳐야 할 때 어느 쪽이 수정하기 쉬운가?  
   **답:** [상속 후 코드]

3. 상속이 "코드를 마법처럼 짧게 만드는 것"인지, 아니면 "공통 구조를 한곳에 모으는 것"인지 설명해 보세요.  
   **답:** [공통 구조를 한 곳에 모으는 것]

---

## 4-2. 테스트 표 작성
| 테스트 항목 | 예상 결과 | 실제 결과 | 통과 여부 |
|---|---|---|---|
| Warrior 객체 생성 | 이름/체력/마나 정상 보유 | [부모 생성자를 통해 필드가 정상적으로 할당됨] | [O] |
| Mage 객체 생성 | 이름/체력/마나 정상 보유 | [부모 생성자를 통해 필드가 정상적으로 할당됨] | [O] |
| Archer 객체 생성 | 이름/체력/마나 정상 보유 | [부모 생성자를 통해 필드가 정상적으로 할당됨] | [O] |
| walk() 호출 | 공통 기능 정상 동작 | [부모 클래스의 공통 걷기 문장이 정상 출력됨] | [O] |
| attack() 호출 | 직업별로 다른 문장 출력 | [각 자식 클래스에서 오버라이딩한 전용 공격 문장이 출력됨] | [O] |
| showStatus() 호출 | 공통 상태 출력 | [부모 클래스의 상태 출력 기능이 정상 작동함] | [O] |

---

## 4-3. 수정이 쉬워졌는지 확인하기
상속의 장점을 느끼기 위해 아래 실험 중 하나를 해 보세요.

### 실험 A
모든 캐릭터가 공통으로 갖는 필드 하나를 추가해 보세요. 예: `level`
- 상속 전: 몇 군데를 수정해야 했는가? [3군데]
- 상속 후: 몇 군데를 수정하면 되는가? [1군데]

### 실험 B
모든 캐릭터가 공통으로 출력하는 상태 문장을 바꿔 보세요.
- 상속 전: 몇 개 클래스 수정? [3개 클래스 수정]
- 상속 후: 몇 개 클래스 수정? [1개 클래스 수정]

---

# 5단계. 내가 이해한 내용 정리하기
아래 질문에 답하세요.

1. 상속을 쓰지 않았을 때 가장 큰 불편함은 무엇이었는가?  
    **답:** [변수(이름, 체력 등)와 기능(걷기, 상태 출력 등)이 똑같은데도 직업을 만들 때마다 매번 코드를 중복해서 작성해야 했다. 
         게다가 공통 기능 하나를 수정하려면 모든 클래스를 일일이 찾아가서 고쳐야 하는 게 가장 큰 불편함이다.]

2. 부모 클래스는 어떤 기준으로 만들어야 하는가?  
    **답:** [자식 클래스들이 공통적으로 가지고 있는 속성(필드)과 행동(메서드)을 추출해서, 그 교집합을 묶어내는 기준으로 만들어야 한다.]

3. 모든 것을 부모 클래스로 올리면 항상 좋은가? 아니면 자식마다 달라야 하는 것도 있는가?  
    **답:** [항상 좋은 것은 아니다. 공격(attack()) 방식이나 각 직업 고유의 스킬처럼 직업(자식)마다 개성 있게 달라져야 하는 기능은 부모에 기본 틀만 두거나 추상화하고,
             자식 클래스에서 직접 재정의(Overriding)해서 다르게 구현해야 한다.]

4. AI가 처음부터 상속 구조를 스스로 잘 제안하지 못한 이유는 무엇이라고 생각하는가?  
    **답:** [사용자가 처음 프롬프트에서 "단, 상속(extends)은 절대 사용하지 말고 세 클래스를 각각 따로 작성해 줘"라고 상속 금지 조건을 명확하게 지시했기 때문이다.]

---

# 6단계. 제출 체크리스트
- [O] 공통점과 차이점을 먼저 정리했다.
- [O] 상속 없는 코드와 상속 적용 코드를 둘 다 제출했다.
- [O] 중복되는 필드와 메서드를 직접 찾아 적었다.
- [O] 테스트를 통해 상속 후 구조가 더 관리하기 쉬운지 확인했다.
- [O] 회고 질문에 답했다.

---

## 🌱 도전 과제 (선택)
아래 중 하나를 추가해 보세요.
- `Character`를 `abstract class`로 바꿔 보기
- 직업별 특수 스킬 메서드 추가하기
- `takeDamage(int damage)` 공통 메서드 만들기
- 레벨업 기능 추가하기

---

## 한 줄 정리
상속의 핵심은 "짧게 쓰기"가 아니라, **여러 클래스의 공통 구조를 부모 클래스에 모아 중복과 수정 비용을 줄이는 것**입니다.
