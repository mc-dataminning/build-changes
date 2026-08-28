import io.netty.buffer.ByteBuf;

public interface zd<T extends wc> {
   zf<? extends zd<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zd<?>> yu<B, T> a(yx<B, T> $$0, yv<B, T> $$1) {
      return yu.a($$0, $$1);
   }
}
