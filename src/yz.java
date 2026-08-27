import io.netty.buffer.ByteBuf;

public interface yz<T extends vy> {
   zb<? extends yz<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends yz<?>> yq<B, T> a(yt<B, T> $$0, yr<B, T> $$1) {
      return yq.a($$0, $$1);
   }
}
