import io.netty.buffer.ByteBuf;

public interface ze<T extends wd> {
   zg<? extends ze<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends ze<?>> yv<B, T> a(yy<B, T> $$0, yw<B, T> $$1) {
      return yv.a($$0, $$1);
   }
}
