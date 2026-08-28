import io.netty.buffer.ByteBuf;

public interface zo<T extends wn> {
   zq<? extends zo<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zo<?>> zf<B, T> a(zi<B, T> $$0, zg<B, T> $$1) {
      return zf.a($$0, $$1);
   }
}
