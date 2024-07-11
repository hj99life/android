# part0-chapter2
코틀린 중급 실습 코드

### Chapter 1. Lambda (람다)

### Chapter 2. Extension Function (확장함수)

### Chapter 3. Scope Function (범위 지정함수)

- 코틀린 표준 라이브러리에서 제공하는 확장함수
- 목적 : 간결성, 명료성, 유지보수 용이성
- 정의 : 객체의 컨텍스트 내에서, 실행 가능한 코드 블럭을 만드는 함수
    
              호출 시, 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근가능
    
    - context : 문맥, 맥락, 전후 사정,
- 수신 객체 (receiver) : 확장 함수가 호출되는 대상이 되는 값(객체)
- 수신 객체 지정 람다 (lambda with receiver) : 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
- 차이점
    - 수신 객체 접근 방법 : this, it
    - Return 값 : 수신객체, 마지막 행 (lambda result)

![Untitled](https://user-images.githubusercontent.com/24618293/201356804-93c1fdeb-81ee-4316-9096-e33d998885bf.png)

- let : null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
- run : 객체를 초기화 하고 리턴 값이 있을 때
- apply : 객체 초기화
- also : 수신객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
- with : 객체 초기화, 람다 리턴 값이 필요 없을 때

### Chapter4. 초기화 지연 lateinit, lazy

- 정의 : 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
- 목적 : 메모리 효율적으로 사용하기 위해서, null safe 한 value 를 사용하기 위해서
- lateinit , var
    - 변수 타입을 지정해줘야함
    - prrimitive 타입은 사용할 수 없음
    - 선언 후, 나중에 초기화 해줘도 됨
- lazy , val
    - 선언과 동시에 초기화를 해야함
    - 호출시점에 초기화가 이루어짐

### Chapter5. Data class

- Data class : 데이터를 담기 위한 클래스
    - `toString(), hashCodde(), equals(), copy()` 메서드를 자동으로 생성
        - override 하면, 직접 구현한 코드를 사용
    - 1개 이상의 프로퍼티가 있어야함
    - 데이터 클래스는 abstract, open, sealed, inner 를 붙일 수 없음
    - 상속이 불가능

### Chapter6. Object, Companion object

- Object : 클래스를 정의함과 동시에 객체를 생성
    - 싱글톤을 쉽게 만들 수 있는 키워드
    - 생성자 사용 불가
    - 프로퍼티, 메서드, 초기화 블록은 사용 가능
    - 다른 클래스나, 인터페이스를 상속받을 수 있음
- Companin Object 동반객체
    - Java 의 static 과 동일한 역할
    - 클래스 내에 하나만 생성할 수 있음
