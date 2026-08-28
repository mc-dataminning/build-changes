import io.netty.buffer.ByteBuf;

public interface zq<T extends wp> {
   zs<? extends zq<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zq<?>> zh<B, T> a(zk<B, T> $$0, zi<B, T> $$1) {
      return zh.a($$0, $$1);
   }
}
