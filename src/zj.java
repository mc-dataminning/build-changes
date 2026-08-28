import io.netty.buffer.ByteBuf;

public interface zj<T extends wi> {
   zl<? extends zj<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zj<?>> za<B, T> a(zd<B, T> $$0, zb<B, T> $$1) {
      return za.a($$0, $$1);
   }
}
