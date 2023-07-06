import ServerBootstrap.ChannelOption

class Main extends App {
  val bootstrap = new ServerBootstrap()
  bootstrap.option(ChannelOption.TCP_NODELAY, true)
}
