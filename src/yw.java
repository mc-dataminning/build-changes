import io.netty.buffer.ByteBuf;

public interface yw<T extends vv> {
   yy<? extends yw<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends yw<?>> yn<B, T> a(yq<B, T> $$0, yo<B, T> $$1) {
      return yn.a($$0, $$1);
   }
}
