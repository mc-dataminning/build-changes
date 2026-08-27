import io.netty.buffer.ByteBuf;

public interface yp<T extends vo> {
   yr<? extends yp<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends yp<?>> yg<B, T> a(yj<B, T> $$0, yh<B, T> $$1) {
      return yg.a($$0, $$1);
   }
}
