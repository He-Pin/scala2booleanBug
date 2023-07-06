public class ServerBootstrap {
    public static class ChannelOption<T> {
        public static final ChannelOption<Boolean> TCP_NODELAY = new ChannelOption<>();
    }

    public <T> ServerBootstrap option(ChannelOption<T> option, T value) {
        return null;
    }

}
