# part0-chapter4
실습 코드


### ktlint
- lint : 코드를 분석하여, 프로그램 오류, 버그, 스타일 오류, 구조적 문제점을 확인하는 도구
    - 코딩 컨벤션에 따라 코드를 작성했는지 확인해주는 도구
    - [ktlint](https://pinterest.github.io/ktlint/) : kotlin 개발 환경에서 사용되는 lint 로, 공식 코틀린 코딩 컨벤션과 안드로이드 코틀린 스타일 가이드에 따라 만들어짐
    - [Android lint](https://developer.android.com/studio/write/lint?hl=ko) : 폴더 선택 > 마우스 오른쪽 버튼 > Analyaze > Inspect


build.gradle (app) 설정
```
...
configurations {
    ktlint
}

depeendencies {
    ktlint("com.pinterest:ktlint:0.47.1") {
        attributes {
            attribute(Bundling.BUNDLING_ATTRIBUTE, getObjects().named(Bundling, Bundling.EXTERNAL))
        }
    }    
    ...
}

...

task ktlint(type: JavaExec, group: "verification") {
    description = "Check Kotlin code style."
    classpath = configurations.ktlint
    mainClass.set("com.pinterest.ktlint.Main")
    args "src/**/*.kt"
    // see https://pinterest.github.io/ktlint/install/cli/#command-line-usage for more information
}
check.dependsOn ktlint

task ktlintFormat(type: JavaExec, group: "formatting") {
    description = "Fix Kotlin code style deviations."
    classpath = configurations.ktlint
    mainClass.set("com.pinterest.ktlint.Main")
    args "-F", "src/**/*.kt"
    // see https://pinterest.github.io/ktlint/install/cli/#command-line-usage for more information
}
```

### detekt
- 정적 프로그램 분석 (static program analysis) : 프로그램을 실행하지 않고, 소프트웨어를 분석하는 것
- ktlint VS detekt
    - ktlint 는 코딩 컨벤션을 중점적으로 본고, detekt 는 코드의 전체적인 퀄리티를 높이기 위한 분석을 수행 예를 들면, 메서드 길이가 너무 길다거나, 메서드의 depth 가 너무 깊다거나 등의 분석을 수행함
- [https://detekt.dev/](https://detekt.dev/)
- [설치](https://detekt.dev/docs/gettingstarted/gradletask) 및 [설정](https://detekt.dev/docs/introduction/configurations)


build.gradle (app) 설정
```
...
configurations {
    detekt
}

depeendencies {
    detekt 'io.gitlab.arturbosch.detekt:detekt-cli:1.22.0-RC3'
    ...
}

...
task detekt(type: JavaExec) {
    mainClass.set("io.gitlab.arturbosch.detekt.cli.Main")
    classpath = configurations.detekt

    def input = "$projectDir"
    def exclude = ".*/build/.*,.*/resources/.*"
    def config = "$rootDir/detekt.yml"
    def params = [ '-i', input, '-ex', exclude, '-c', config]

    args(params)
}
