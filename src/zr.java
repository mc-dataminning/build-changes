import io.netty.buffer.ByteBuf;

public interface zr<T extends wq> {
   zt<? extends zr<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zr<?>> zi<B, T> a(zl<B, T> $$0, zj<B, T> $$1) {
      return zi.a($$0, $$1);
   }
}
