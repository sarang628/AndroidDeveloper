# [3 Build a simple app with text composables](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#0)

## [1. Before you begin](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#0)
```
생일을 표시한는 간단한 앱 만들기.

선수 조건
 - 안드로이드 프로젝트 생성방법
 - 안드로이드 앱을 에뮬레이터나 물리 기기에 실행
 
무엇을 빌드 할 것인가?
 - Text, Column, Row
 - 무엇을 빌드 할 것인가?
 - 생일 축하 메세지
 
필요
 - 컴퓨터와 안드로이드 스튜디오
```

## [2. Set up a Happy Birthday app](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#1)
```
Create an Empty Activity project
생략..

What is a user interface (UI)?

UI란 사용자가 보는것 : 텍스트, 이미지, 버튼 등 요소들

UI란 앱을 어떻게 보여주고 사용자와 상호작용 하는 것.

화면에 보이는 모든것은 'UI 요소' 라고 볼 수 있다. 이것들 클릭, 입력, 수정 그리고 화면을 꾸밀 수 있다.

이 장에선 텍스트를 표시하는 Text를 다룸.

```

## [3. What is Jetpack Compose?](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#2)
```
Jetpack Compose은 UI를 빌드 하는 모던 툴킷이다.

Compose는 적은 코드, 강력한 툴, 코틀린의 직관 등으로 UI 개발을 빠르고 단순하게 해준다.

데이터를 가져다 UI를 그리는 Composable 함수를 사용하게 된다.

Composable funcations
Compose의 Basic building block
- UI를 describe 해줌.
- return이 없음
- 입력을 가져다 화면에 그림.

Annotations
extra information을 코드에 추가하는 것. 
Jetpack Compose 컴파일러와 같은 툴을 돕고, 개발자들이 앱의 코드를 알 수 있게 한다.
@를 붙임.


Annotations with parameters
annotations 은 파라미터를 받을 수 있다.

@Preview에 이름이나 배경 등을 지정할 수 있음.

Jetpack Compose 많은 annotation 옵션을 가지고 있다.


Example of a composable function
모든 Composable 함수는 @composable annotation을 넣어야 한다.

이 annotation은 Compose compiler 데이터를 UI로 바꿔야 한다고 알린다.

컴파일러는 코드를 한줄 씩 컴퓨터가 이해할 수 있게 변환하는 특별한 프로그램이다.


composable 함수에 대해 알아야 할 것.
- 앱의 UI를 '만드는 과정'에 대해 초점을 맞추는 것보다, '어떻게 보여줄지' 설명하게 프로그래밍으로 정의하게 해준다. 
함수명 위에 @Composable만 붙이면 된다.
- Composable 함수는 (앱의 로직을 UI에 설명하고 수정하는) arguments를 가질 수 있다.
예를들어 UI 요소는 이름을 표시하는데 사용할 string을 받을 수 있다.


Notice the composable functions in code

Composable 함수는 다른 Composable 함수를 호출할 수 있다.

다른 함수도 @Preview와 같은 annotation을 또 갖을 수 있다.


Composable function names
composable 함수는 return 이 없으며, Pascal case를 사용한다.

명사로 짓기 O : DoneButton()
동사 동사구 X : DrawTextField()
명사와 전치사 X : TextFieldWithLink()
형용사 X: Bright()
부사 X : Outside()
형용사 + 명사 O : RoundIcon()
```

## 4. Design pane(창, 패널) in Android Studio(https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#3)
```
preview는 기본 파라미터를 설정해야 한다.

split 아이콘을 클릭하여 코드와 디자인을 볼 수 있다.

파라미터를 변경하면 preview에 바로 반영되는것을 볼 수 있다.

이 장의 preview에 보이는 설정한 것은 앱이 반영되지 않는다.
앱에 반영되게 설정하는 방법은 다른장에서 배운다. 
```

## [5. Add a new text element](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#4)
```
이 장에선 Hello $name! 대신 생일 축하 메세지를 넣어보자.

생략
```

## [6. Change font size](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#5)
```
텍스트 색상, 크기, 다른 속성을 바꾸는 방법 배우기

Scalable pixels SP는 폰트 크기를 위한 단위이다. 레이아웃을 위한 DP와 폰트를 위한 SP 두 가지 단위가 있다.

위 단위 사용 시, 사용자가 선호하는 스타일에 따라 바뀔 수 있음.

AndroidX (Android Extension) 라이브러리는 핵심 함수들을 제공하여 앱을 빠르게 개발 할 수 있도록 도와준다.

나머지 생략
```

## [7. Add another text element](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#6)

```
친구의 이름으로 생일 매세지를 만들었다면, 내 이름을 보내는 사람으로 넣어보자.

함수는 파라미터 이름을 쓰면 입력 순서 상관 없음.

생략..

GreetingText(message = "Happy Birthday Sam!", from = "From Emma")

```

composable는 UI를 만드는 절차보단 어떻게 UI가 보여지는지에 대해 초점을 맞춘다고 했는데

위 함수를 보면 어떤 것을 화면에 보여주는지에 대해 설명하기 좋아 보인다.

## [8. Arrange the text elements in a row and column](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#7)
```
UI hierarchy 는 (컴포넌트에 다른 컴포넌트를 넣는) '가두기'에 기반을 둠. 
부모와 자식이라는 용어가 사용되기도 함.
부모 안에 자식이 포함되고 자식 안에 자식이 포함될 수도 있음.
부모의 요소 역할을 하는 Column, Row, Box에 대해 알아본다.

Trailing lambda syntax
함수의 마지막 파라미터를 함수로 설정하면, 중괄호로 처리할 수 있는 방법
 
Trailing lambda syntax 는
Layout component에서 쓰기 적합한 방법 인 것 같다. 마치 이것을 위해 만들어진 것 처럼..


Arrange the text elements in a row

예제 생략.

```

## [9. Add greeting to the app](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#8)
```
생략
```

## [10. Get the solution code](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#9)
```
생략
```

## [11. Conclusion](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#10)
```
요약
- Jetpack Compose는 안드로이드 UI 빌드를 위한 모던 툴킷. 적은 코드, 강력한 도구, 직관적 코틀린 API로 UI 개발을 단순 가속화 해줌.    
- UI는 화면에 보이는 것. 텍스트, 이미지, 버튼 그외 요소들
- Composable functions 은 compose의 building block. UI의 일부를 설명하는 함수. 
- @Composable annotation을 붙임. compose compiler에게 data를 UI로 바꿔야 한다고 알려준다.  
- Column, Row, Box는 표준 레이아웃 요소. 
```