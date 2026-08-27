import io.netty.buffer.ByteBuf;

public interface xz<T extends uy> {
   yb<? extends xz<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends xz<?>> xq<B, T> a(xt<B, T> $$0, xr<B, T> $$1) {
      return xq.a($$0, $$1);
   }
}
