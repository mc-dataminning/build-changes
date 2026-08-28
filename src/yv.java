import io.netty.buffer.ByteBuf;

public interface yv<T extends vu> {
   yx<? extends yv<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends yv<?>> ym<B, T> a(yp<B, T> $$0, yn<B, T> $$1) {
      return ym.a($$0, $$1);
   }
}
