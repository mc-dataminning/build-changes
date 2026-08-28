import io.netty.buffer.ByteBuf;

public interface zo<T extends wk> {
   zq<? extends zo<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zo<?>> ze<B, T> a(zh<B, T> $$0, zf<B, T> $$1) {
      return ze.a($$0, $$1);
   }
}
