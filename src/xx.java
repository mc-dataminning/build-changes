import io.netty.buffer.ByteBuf;

public interface xx<T extends uw> {
   xz<? extends xx<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends xx<?>> xo<B, T> a(xr<B, T> $$0, xp<B, T> $$1) {
      return xo.a($$0, $$1);
   }
}
