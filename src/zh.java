import io.netty.buffer.ByteBuf;

public interface zh<T extends wg> {
   zj<? extends zh<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zh<?>> yy<B, T> a(zb<B, T> $$0, yz<B, T> $$1) {
      return yy.a($$0, $$1);
   }
}
