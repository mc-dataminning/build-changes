import io.netty.buffer.ByteBuf;

public interface zl<T extends wk> {
   zn<? extends zl<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zl<?>> zc<B, T> a(zf<B, T> $$0, zd<B, T> $$1) {
      return zc.a($$0, $$1);
   }
}
