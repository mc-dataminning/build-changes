import io.netty.buffer.ByteBuf;

public interface zb<T extends wa> {
   zd<? extends zb<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zb<?>> ys<B, T> a(yv<B, T> $$0, yt<B, T> $$1) {
      return ys.a($$0, $$1);
   }
}
