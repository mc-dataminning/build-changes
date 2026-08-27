import io.netty.buffer.ByteBuf;

public class yf<B extends ByteBuf, L extends va> {
   private final xr.a<B, yb<? super L>, yd<? extends yb<? super L>>> a = xr.a(yb::a);
   private final yc b;

   public yf(yc $$0) {
      this.b = $$0;
   }

   public <T extends yb<? super L>> yf<B, L> a(yd<T> $$0, xs<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public xs<B, yb<? super L>> a() {
      return this.a.a();
   }
}
