import io.netty.buffer.ByteBuf;

public interface zk<T extends wj> {
   zm<? extends zk<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zk<?>> zb<B, T> a(ze<B, T> $$0, zc<B, T> $$1) {
      return zb.a($$0, $$1);
   }
}
