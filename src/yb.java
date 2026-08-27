import io.netty.buffer.ByteBuf;

public interface yb<T extends va> {
   yd<? extends yb<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends yb<?>> xs<B, T> a(xv<B, T> $$0, xt<B, T> $$1) {
      return xs.a($$0, $$1);
   }
}
