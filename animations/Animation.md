https://developer.android.com/develop/ui/compose/animation/quick-guide

Compose는 많은 내장 애니메이션이 있어 어떤것을 선택해야하는지 어려울 수 있다.
아래는 일반적인 애니메이션의 케이스에 대해 설명한다.

[Animate common composable properties](https://developer.android.com/develop/ui/compose/animation/quick-guide#animate-common-properties)

Compose는 많이 사용되는 일반적인 애니메이션 API를 제공한다. 

[Animate appearing / disappearing](https://developer.android.com/develop/ui/compose/animation/quick-guide#animate-appearing-disappearing)

AnimatedVisibility는 composable를 보여주고 숨기는 animation을 제공

```
@Preview
@Composable
fun Test() {
    var visible by remember { mutableStateOf(true) }
    Column(modifier = Modifier.height(200.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        AnimatedVisibility(visible) {
            Box(modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Cyan))
        }
        Spacer(Modifier.height(10.dp))
        Box(Modifier.fillMaxWidth().height(100.dp).background(Color.Magenta).clickable(onClick = { visible = !visible }))
    }
}
```

다른 옵션은 alpha

알파는 투명하게 하면 공간이 숨겨지지 않고 계속 차지하고 있음.


[Animate background color](https://developer.android.com/develop/ui/compose/animation/quick-guide#animate-background)

```
@Preview
@Composable
fun AnimationBackground() {
    var animateBackgroundColor by remember { mutableStateOf(false) }
    val animatedColor by animateColorAsState(if (animateBackgroundColor) Color.Green else Color.Blue, label = "color", animationSpec = tween(durationMillis = 500))
    Column(modifier = Modifier.fillMaxWidth().height(400.dp).drawBehind { drawRect(animatedColor) }) {
        Button({animateBackgroundColor = !animateBackgroundColor}) { Text("Change")}
    }
}
```

