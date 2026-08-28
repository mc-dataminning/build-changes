import io.netty.buffer.ByteBuf;

public interface zc<T extends wb> {
   ze<? extends zc<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zc<?>> yt<B, T> a(yw<B, T> $$0, yu<B, T> $$1) {
      return yt.a($$0, $$1);
   }
}
