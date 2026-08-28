import io.netty.buffer.ByteBuf;

public interface zg<T extends wf> {
   zi<? extends zg<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zg<?>> yx<B, T> a(za<B, T> $$0, yy<B, T> $$1) {
      return yx.a($$0, $$1);
   }
}
