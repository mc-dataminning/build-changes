import io.netty.buffer.ByteBuf;

public interface zp<T extends wo> {
   zr<? extends zp<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zp<?>> zg<B, T> a(zj<B, T> $$0, zh<B, T> $$1) {
      return zg.a($$0, $$1);
   }
}
