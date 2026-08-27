import io.netty.buffer.ByteBuf;

public class zf<B extends ByteBuf, L extends wa> {
   private final yr.a<B, zb<? super L>, zd<? extends zb<? super L>>> a = yr.a(zb::a);
   private final zc b;

   public zf(zc $$0) {
      this.b = $$0;
   }

   public <T extends zb<? super L>> zf<B, L> a(zd<T> $$0, ys<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public ys<B, zb<? super L>> a() {
      return this.a.a();
   }
}
