import io.netty.buffer.ByteBuf;

public class yt<B extends ByteBuf, L extends vo> {
   private final yf.a<B, yp<? super L>, yr<? extends yp<? super L>>> a = yf.a(yp::a);
   private final yq b;

   public yt(yq $$0) {
      this.b = $$0;
   }

   public <T extends yp<? super L>> yt<B, L> a(yr<T> $$0, yg<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yg<B, yp<? super L>> a() {
      return this.a.a();
   }
}
