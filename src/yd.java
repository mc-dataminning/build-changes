import io.netty.buffer.ByteBuf;

public class yd<B extends ByteBuf, L extends uy> {
   private final xp.a<B, xz<? super L>, yb<? extends xz<? super L>>> a = xp.a(xz::a);
   private final ya b;

   public yd(ya $$0) {
      this.b = $$0;
   }

   public <T extends xz<? super L>> yd<B, L> a(yb<T> $$0, xq<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public xq<B, xz<? super L>> a() {
      return this.a.a();
   }
}
