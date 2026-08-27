import io.netty.buffer.ByteBuf;

public class yb<B extends ByteBuf, L extends uw> {
   private final xn.a<B, xx<? super L>, xz<? extends xx<? super L>>> a = xn.a(xx::a);
   private final xy b;

   public yb(xy $$0) {
      this.b = $$0;
   }

   public <T extends xx<? super L>> yb<B, L> a(xz<T> $$0, xo<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public xo<B, xx<? super L>> a() {
      return this.a.a();
   }
}
