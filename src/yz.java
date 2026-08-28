import io.netty.buffer.ByteBuf;

public class yz<B extends ByteBuf, L extends vu> {
   private final yl.a<B, yv<? super L>, yx<? extends yv<? super L>>> a = yl.a(yv::a);
   private final yw b;

   public yz(yw $$0) {
      this.b = $$0;
   }

   public <T extends yv<? super L>> yz<B, L> a(yx<T> $$0, ym<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public ym<B, yv<? super L>> a() {
      return this.a.a();
   }
}
