## memo

```
serverless create -t aws-scala-sbt -p path
```

で生成したコードでは、 `502 Bad Gateway` エラーレスポンスが返される。

[プロキシ統合のための Lambda 関数の出力形式](https://docs.aws.amazon.com/ja_jp/apigateway/latest/developerguide/api-gateway-set-up-simple-proxy.html#api-gateway-simple-proxy-for-lambda-output-format) を参考にレスポンスを整形した。
